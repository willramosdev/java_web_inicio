/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.ClienteFachada;
import ejb.Clientes;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 07508231945
 */
@Named(value = "clienteMBean")
@RequestScoped
public class ClienteMBean {

    @EJB
    private ClienteFachada clienteFachada;
    public List<Clientes> getListaClientes() {
        return clienteFachada.getListaClientes();
    }
    /**
     * Creates a new instance of ClienteMBean
     */
    public ClienteMBean() {
    }
    
}
