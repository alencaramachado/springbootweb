/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boot.springbootweb.dao;

import br.boot.springbootweb.model.Cliente;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alencarmachado
 */
public class ClienteDAO {
    Map<Integer, Cliente> CLIENTES = new LinkedHashMap<>();
    private Integer key = 0;
    public ClienteDAO(){
        key++;
        CLIENTES.put(key, new Cliente(key,"Lia","Rua André Marques, 301","-29.680958","-53.806067",""));key++;
        CLIENTES.put(key, new Cliente(key,"Ana Carolina","R. Vale Machado, 1523","-29.681561","-53.806314",""));key++;          
        CLIENTES.put(key, new Cliente(key,"Paola","R. Vale Machado, 1638","-29.681780","-53.807293",""));key++;        
        CLIENTES.put(key, new Cliente(key,"Claudia","Av. Rio Branco, 554","-29.682169","-53.808235",""));key++;        
        CLIENTES.put(key, new Cliente(key,"Joseane","Av. Rio Branco, 642","-29.682505","-53.808119",""));key++;        
        CLIENTES.put(key, new Cliente(key,"Daniela","Av. Rio Branco, 678","-29.683868","-53.807650",""));        
    }
    
    public List<Cliente> getClientes(){
        return new ArrayList<Cliente>(CLIENTES.values());
    }
    
    public boolean inserir(Cliente cliente){
        key++;
        CLIENTES.put(key, cliente);
        return true;
    }
    
}
 