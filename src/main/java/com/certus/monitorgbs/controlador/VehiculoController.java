package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Vehiculo;
import com.certus.monitorgbs.repositorio.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping("/lista")
    public List<Vehiculo> getAllAdmins() {
        return vehiculoRepository.findAll();
    }
}
