package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String color, String marca, String modelo, String patente, int puertas, String motor) {
        Automovil auto = new Automovil();
        
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        auto.setModelo(modelo);
        
        controlPersis.guardar(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void eliminar(int num_auto) {
        controlPersis.eliminar(num_auto);
    }

    public Automovil obtenerAuto(int id_auto) {
        return controlPersis.obtenerAuto(id_auto);
    }

    public void editar(Automovil auto, String color, String marca, String modelo, String patente, int puertas, String motor) {
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        auto.setMotor(motor);
        
        controlPersis.editar(auto);
    }
    
}
