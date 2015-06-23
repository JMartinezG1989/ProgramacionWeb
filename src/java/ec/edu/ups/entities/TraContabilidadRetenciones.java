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
@Table(name = "tra_contabilidad_retenciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraContabilidadRetenciones.findAll", query = "SELECT t FROM TraContabilidadRetenciones t"),
    @NamedQuery(name = "TraContabilidadRetenciones.findByTraIdPk", query = "SELECT t FROM TraContabilidadRetenciones t WHERE t.traIdPk = :traIdPk"),
    @NamedQuery(name = "TraContabilidadRetenciones.findByTraDescripcion", query = "SELECT t FROM TraContabilidadRetenciones t WHERE t.traDescripcion = :traDescripcion"),
    @NamedQuery(name = "TraContabilidadRetenciones.findByTraValor", query = "SELECT t FROM TraContabilidadRetenciones t WHERE t.traValor = :traValor")})
public class TraContabilidadRetenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tra_id_pk")
    private Long traIdPk;
    @Size(max = 200)
    @Column(name = "tra_descripcion")
    private String traDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tra_valor")
    private Double traValor;

    public TraContabilidadRetenciones() {
    }

    public TraContabilidadRetenciones(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public Long getTraIdPk() {
        return traIdPk;
    }

    public void setTraIdPk(Long traIdPk) {
        this.traIdPk = traIdPk;
    }

    public String getTraDescripcion() {
        return traDescripcion;
    }

    public void setTraDescripcion(String traDescripcion) {
        this.traDescripcion = traDescripcion;
    }

    public Double getTraValor() {
        return traValor;
    }

    public void setTraValor(Double traValor) {
        this.traValor = traValor;
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
        if (!(object instanceof TraContabilidadRetenciones)) {
            return false;
        }
        TraContabilidadRetenciones other = (TraContabilidadRetenciones) object;
        if ((this.traIdPk == null && other.traIdPk != null) || (this.traIdPk != null && !this.traIdPk.equals(other.traIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraContabilidadRetenciones[ traIdPk=" + traIdPk + " ]";
    }
    
}
