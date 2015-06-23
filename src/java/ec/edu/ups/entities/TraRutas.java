/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_rutas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraRutas.findAll", query = "SELECT t FROM TraRutas t"),
    @NamedQuery(name = "TraRutas.findByTraIdPk", query = "SELECT t FROM TraRutas t WHERE t.traIdPk = :traIdPk"),
    @NamedQuery(name = "TraRutas.findByTraTiempo", query = "SELECT t FROM TraRutas t WHERE t.traTiempo = :traTiempo"),
    @NamedQuery(name = "TraRutas.findByTraDescripcion", query = "SELECT t FROM TraRutas t WHERE t.traDescripcion = :traDescripcion")})
public class TraRutas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tra_id_pk")
    private Long traIdPk;
    @Size(max = 50)
    @Column(name = "tra_tiempo")
    private String traTiempo;
    @Size(max = 200)
    @Column(name = "tra_descripcion")
    private String traDescripcion;

    public TraRutas() {
    }

    public TraRutas(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public Long getTraIdPk() {
        return traIdPk;
    }

    public void setTraIdPk(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public String getTraTiempo() {
        return traTiempo;
    }

    public void setTraTiempo(String traTiempo) {
        this.traTiempo = traTiempo;
    }

    public String getTraDescripcion() {
        return traDescripcion;
    }

    public void setTraDescripcion(String traDescripcion) {
        this.traDescripcion = traDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traIdPk != null ? traIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraRutas)) {
            return false;
        }
        TraRutas other = (TraRutas) object;
        if ((this.traIdPk == null && other.traIdPk != null) || (this.traIdPk != null && !this.traIdPk.equals(other.traIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraRutas[ traIdPk=" + traIdPk + " ]";
    }
    
}
