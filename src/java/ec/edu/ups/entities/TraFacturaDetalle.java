/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tra_factura_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraFacturaDetalle.findAll", query = "SELECT t FROM TraFacturaDetalle t"),
    @NamedQuery(name = "TraFacturaDetalle.findByFdeId", query = "SELECT t FROM TraFacturaDetalle t WHERE t.fdeId = :fdeId"),
    @NamedQuery(name = "TraFacturaDetalle.findByAudEliminado", query = "SELECT t FROM TraFacturaDetalle t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraFacturaDetalle.findByAudFechaInsercion", query = "SELECT t FROM TraFacturaDetalle t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraFacturaDetalle.findByAudFechaModificacion", query = "SELECT t FROM TraFacturaDetalle t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraFacturaDetalle.findByAudUsuarioInserto", query = "SELECT t FROM TraFacturaDetalle t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraFacturaDetalle.findByAudUsuarioModifico", query = "SELECT t FROM TraFacturaDetalle t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraFacturaDetalle.findByFdeCantidad", query = "SELECT t FROM TraFacturaDetalle t WHERE t.fdeCantidad = :fdeCantidad"),
    @NamedQuery(name = "TraFacturaDetalle.findByFdeDescripcion", query = "SELECT t FROM TraFacturaDetalle t WHERE t.fdeDescripcion = :fdeDescripcion"),
    @NamedQuery(name = "TraFacturaDetalle.findByFdeValTotal", query = "SELECT t FROM TraFacturaDetalle t WHERE t.fdeValTotal = :fdeValTotal"),
    @NamedQuery(name = "TraFacturaDetalle.findByFdeValUnitario", query = "SELECT t FROM TraFacturaDetalle t WHERE t.fdeValUnitario = :fdeValUnitario")})
public class TraFacturaDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fde_id")
    private Long fdeId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fde_cantidad")
    private int fdeCantidad;
    @Size(max = 200)
    @Column(name = "fde_descripcion")
    private String fdeDescripcion;
    @Column(name = "fde_val_total")
    private BigInteger fdeValTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fde_val_unitario")
    private long fdeValUnitario;
    @JoinColumn(name = "fca_id_pk", referencedColumnName = "fca_id_pk")
    @ManyToOne
    private TraFacturaCabecera fcaIdPk;

    public TraFacturaDetalle() {
    }

    public TraFacturaDetalle(Long fdeId) {
        this.fdeId = fdeId;
    }

    public TraFacturaDetalle(Long fdeId, int fdeCantidad, long fdeValUnitario) {
        this.fdeId = fdeId;
        this.fdeCantidad = fdeCantidad;
        this.fdeValUnitario = fdeValUnitario;
    }

    public Long getFdeId() {
        return fdeId;
    }

    public void setFdeId(Long fdeId) {
        this.fdeId = fdeId;
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

    public int getFdeCantidad() {
        return fdeCantidad;
    }

    public void setFdeCantidad(int fdeCantidad) {
        this.fdeCantidad = fdeCantidad;
    }

    public String getFdeDescripcion() {
        return fdeDescripcion;
    }

    public void setFdeDescripcion(String fdeDescripcion) {
        this.fdeDescripcion = fdeDescripcion;
    }

    public BigInteger getFdeValTotal() {
        return fdeValTotal;
    }

    public void setFdeValTotal(BigInteger fdeValTotal) {
        this.fdeValTotal = fdeValTotal;
    }

    public long getFdeValUnitario() {
        return fdeValUnitario;
    }

    public void setFdeValUnitario(long fdeValUnitario) {
        this.fdeValUnitario = fdeValUnitario;
    }

    public TraFacturaCabecera getFcaIdPk() {
        return fcaIdPk;
    }

    public void setFcaIdPk(TraFacturaCabecera fcaIdPk) {
        this.fcaIdPk = fcaIdPk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fdeId != null ? fdeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraFacturaDetalle)) {
            return false;
        }
        TraFacturaDetalle other = (TraFacturaDetalle) object;
        if ((this.fdeId == null && other.fdeId != null) || (this.fdeId != null && !this.fdeId.equals(other.fdeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraFacturaDetalle[ fdeId=" + fdeId + " ]";
    }
    
}
