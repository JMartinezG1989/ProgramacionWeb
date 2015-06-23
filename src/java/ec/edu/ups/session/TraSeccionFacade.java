/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.session;

import ec.edu.ups.entities.TraSeccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jusan
 */
@Stateless
public class TraSeccionFacade extends AbstractFacade<TraSeccion> {
    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TraSeccionFacade() {
        super(TraSeccion.class);
    }
    
}
