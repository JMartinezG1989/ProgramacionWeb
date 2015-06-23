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
@Table(name = "tra_liquidacion_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraLiquidacionDetalle.findAll", query = "SELECT t FROM TraLiquidacionDetalle t"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByLdeIdPk", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.ldeIdPk = :ldeIdPk"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByAudEliminado", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByAudFechaInsercion", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByAudFechaModificacion", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByAudUsuarioInserto", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByAudUsuarioModifico", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByLdeSubtotal", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.ldeSubtotal = :ldeSubtotal"),
    @NamedQuery(name = "TraLiquidacionDetalle.findByLdeTotal", query = "SELECT t FROM TraLiquidacionDetalle t WHERE t.ldeTotal = :ldeTotal")})
public class TraLiquidacionDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lde_id_pk")
    private Long ldeIdPk;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lde_subtotal")
    private Double ldeSubtotal;
    @Column(name = "lde_total")
    private Double ldeTotal;

    public TraLiquidacionDetalle() {
    }

    public TraLiquidacionDetalle(Long ldeIdPk) {
        this.ldeIdPk = ldeIdPk;
    }

    public Long getLdeIdPk() {
        return ldeIdPk;
    }

    public void setLdeIdPk(Long ldeIdPk) {
        this.ldeIdPk = ldeIdPk;
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

    public Double getLdeSubtotal() {
        return ldeSubtotal;
    }

    public void setLdeSubtotal(Double ldeSubtotal) {
        this.ldeSubtotal = ldeSubtotal;
    }

    public Double getLdeTotal() {
        return ldeTotal;
    }

    public void setLdeTotal(Double ldeTotal) {
        this.ldeTotal = ldeTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ldeIdPk != null ? ldeIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLiquidacionDetalle)) {
            return false;
        }
        TraLiquidacionDetalle other = (TraLiquidacionDetalle) object;
        if ((this.ldeIdPk == null && other.ldeIdPk != null) || (this.ldeIdPk != null && !this.ldeIdPk.equals(other.ldeIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraLiquidacionDetalle[ ldeIdPk=" + ldeIdPk + " ]";
    }
    
}
