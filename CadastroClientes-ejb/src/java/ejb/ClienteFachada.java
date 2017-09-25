/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 07508231945
 */
@Stateless
@LocalBean
public class ClienteFachada {

    @PersistenceContext(unitName = "CadastroClientes-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    // Metodo que retorna a lista de clientes armazenada na tabela Clientes
    public List<ejb.Clientes> getListaClientes() {
        Query query = em.createNamedQuery("Clientes.findAll");
        return query.getResultList();
    }
}
