/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_asiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraAsiento.findAll", query = "SELECT t FROM TraAsiento t"),
    @NamedQuery(name = "TraAsiento.findByAsiId", query = "SELECT t FROM TraAsiento t WHERE t.asiId = :asiId"),
    @NamedQuery(name = "TraAsiento.findByAsiConceptoAsiento", query = "SELECT t FROM TraAsiento t WHERE t.asiConceptoAsiento = :asiConceptoAsiento"),
    @NamedQuery(name = "TraAsiento.findByAsiEstadoAsiento", query = "SELECT t FROM TraAsiento t WHERE t.asiEstadoAsiento = :asiEstadoAsiento"),
    @NamedQuery(name = "TraAsiento.findByAsiFechaAsiento", query = "SELECT t FROM TraAsiento t WHERE t.asiFechaAsiento = :asiFechaAsiento"),
    @NamedQuery(name = "TraAsiento.findByAsiNumeroAsiento", query = "SELECT t FROM TraAsiento t WHERE t.asiNumeroAsiento = :asiNumeroAsiento"),
    @NamedQuery(name = "TraAsiento.findByAudEliminado", query = "SELECT t FROM TraAsiento t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraAsiento.findByAudFechaInsercion", query = "SELECT t FROM TraAsiento t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraAsiento.findByAudFechaModificacion", query = "SELECT t FROM TraAsiento t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraAsiento.findByAudUsuarioInserto", query = "SELECT t FROM TraAsiento t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraAsiento.findByAudUsuarioModifico", query = "SELECT t FROM TraAsiento t WHERE t.audUsuarioModifico = :audUsuarioModifico")})
public class TraAsiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "asi_id")
    private Long asiId;
    @Size(max = 300)
    @Column(name = "asi_concepto_asiento")
    private String asiConceptoAsiento;
    @Column(name = "asi_estado_asiento")
    private Integer asiEstadoAsiento;
    @Column(name = "asi_fecha_asiento")
    @Temporal(TemporalType.DATE)
    private Date asiFechaAsiento;
    @Column(name = "asi_numero_asiento")
    private Integer asiNumeroAsiento;
    @Size(max = 1)
    @Column(name = "aud_eliminado")
    private String audEliminado;
    @Column(name = "aud_fecha_insercion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaInsercion;
    @Column(name = "aud_fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaModificacion;
    @Size(max = 255)
    @Column(name = "aud_usuario_inserto")
    private String audUsuarioInserto;
    @Size(max = 255)
    @Column(name = "aud_usuario_modifico")
    private String audUsuarioModifico;

    public TraAsiento() {
    }

    public TraAsiento(Long asiId) {
        this.asiId = asiId;
    }

    public Long getAsiId() {
        return asiId;
    }

    public void setAsiId(Long asiId) {
        this.asiId = asiId;
    }

    public String getAsiConceptoAsiento() {
        return asiConceptoAsiento;
    }

    public void setAsiConceptoAsiento(String asiConceptoAsiento) {
        this.asiConceptoAsiento = asiConceptoAsiento;
    }

    public Integer getAsiEstadoAsiento() {
        return asiEstadoAsiento;
    }

    public void setAsiEstadoAsiento(Integer asiEstadoAsiento) {
        this.asiEstadoAsiento = asiEstadoAsiento;
    }

    public Date getAsiFechaAsiento() {
        return asiFechaAsiento;
    }

    public void setAsiFechaAsiento(Date asiFechaAsiento) {
        this.asiFechaAsiento = asiFechaAsiento;
    }

    public Integer getAsiNumeroAsiento() {
        return asiNumeroAsiento;
    }

    public void setAsiNumeroAsiento(Integer asiNumeroAsiento) {
        this.asiNumeroAsiento = asiNumeroAsiento;
    }

    public String getAudEliminado() {
        return audEliminado;
    }

    public void setAudEliminado(String audEliminado) {
        this.audEliminado = audEliminado;
    }

    public Date getAudFechaInsercion() {
        return audFechaInsercion;
    }

    public void setAudFechaInsercion(Date audFechaInsercion) {
        this.audFechaInsercion = audFechaInsercion;
    }

    public Date getAudFechaModificacion() {
        return audFechaModificacion;
    }

    public void setAudFechaModificacion(Date audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }

    public String getAudUsuarioInserto() {
        return audUsuarioInserto;
    }

    public void setAudUsuarioInserto(String audUsuarioInserto) {
        this.audUsuarioInserto = audUsuarioInserto;
    }

    public String getAudUsuarioModifico() {
        return audUsuarioModifico;
    }

    public void setAudUsuarioModifico(String audUsuarioModifico) {
        this.audUsuarioModifico = audUsuarioModifico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asiId != null ? asiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraAsiento)) {
            return false;
        }
        TraAsiento other = (TraAsiento) object;
        if ((this.asiId == null && other.asiId != null) || (this.asiId != null && !this.asiId.equals(other.asiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraAsiento[ asiId=" + asiId + " ]";
    }
    
}
