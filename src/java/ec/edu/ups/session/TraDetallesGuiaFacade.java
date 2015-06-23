/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.session;

import ec.edu.ups.entities.TraDetallesGuia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jusan
 */
@Stateless
public class TraDetallesGuiaFacade extends AbstractFacade<TraDetallesGuia> {
    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TraDetallesGuiaFacade() {
        super(TraDetallesGuia.class);
    }
    
}
