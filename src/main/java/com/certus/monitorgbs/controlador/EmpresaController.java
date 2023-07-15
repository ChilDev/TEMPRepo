package com.certus.monitorgbs.controlador;

import com.certus.monitorgbs.modelo.Empresa;
import com.certus.monitorgbs.repositorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/lista")
    public List<Empresa> getAllAdmins() {
        return empresaRepository.findAll();
    }
}
