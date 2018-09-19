/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boot.springbootweb.controller;

import br.boot.springbootweb.dao.ClienteDAO;
import br.boot.springbootweb.model.Cliente;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alencarmachado
 */
@RestController
@ResponseBody
@RequestMapping("/cliente")
public class ApiController {
    
    @GetMapping
    public List<Cliente> getCliente(){
        return new ClienteDAO().getClientes();
    }
    
    @PostMapping
    public boolean inserirCliente(@RequestBody Cliente cliente){
        return new ClienteDAO().inserir(cliente);
    }
    
}

