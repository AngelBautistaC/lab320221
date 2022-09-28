package com.example.lab320221.controller;


import com.example.lab320221.entity.Cuenta;
import com.example.lab320221.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value={"/cuenta"})
public class CuentaController {


    @Autowired
    CuentaRepository cuentaRepository;

    @RequestMapping(value = {"/lista"})
    public String listaCuenta(Model model){

        List<Cuenta> listaCuenta=cuentaRepository.findAll();
        model.addAttribute("listaCuenta",listaCuenta);

        return "listaduenos";
    }

}
