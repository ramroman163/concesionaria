package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AutomovilJpaController autoJpaControl = new AutomovilJpaController();

    public void guardar(Automovil auto) {
        autoJpaControl.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpaControl.findAutomovilEntities();
    }

    public void eliminar(int num_auto) {
        try {
            autoJpaControl.destroy(num_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil obtenerAuto(int id_auto) {
        return autoJpaControl.findAutomovil(id_auto);
    }

    public void editar(Automovil auto) {
        try {
            autoJpaControl.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
