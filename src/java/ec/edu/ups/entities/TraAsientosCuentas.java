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
@Table(name = "tra_asientos_cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraAsientosCuentas.findAll", query = "SELECT t FROM TraAsientosCuentas t"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscId", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascId = :ascId"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscCtaElegidaAsientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascCtaElegidaAsientocuenta = :ascCtaElegidaAsientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscDebeAsientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascDebeAsientocuenta = :ascDebeAsientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscHaberAsientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascHaberAsientocuenta = :ascHaberAsientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscFechaSientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascFechaSientocuenta = :ascFechaSientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscIdCuentaAuxAsientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascIdCuentaAuxAsientocuenta = :ascIdCuentaAuxAsientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAscNotasAsientocuenta", query = "SELECT t FROM TraAsientosCuentas t WHERE t.ascNotasAsientocuenta = :ascNotasAsientocuenta"),
    @NamedQuery(name = "TraAsientosCuentas.findByAudEliminado", query = "SELECT t FROM TraAsientosCuentas t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraAsientosCuentas.findByAudFechaInsercion", query = "SELECT t FROM TraAsientosCuentas t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraAsientosCuentas.findByAudFechaModificacion", query = "SELECT t FROM TraAsientosCuentas t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraAsientosCuentas.findByAudUsuarioInserto", query = "SELECT t FROM TraAsientosCuentas t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraAsientosCuentas.findByAudUsuarioModifico", query = "SELECT t FROM TraAsientosCuentas t WHERE t.audUsuarioModifico = :audUsuarioModifico")})
public class TraAsientosCuentas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "asc_id")
    private Long ascId;
    @Column(name = "asc_cta_elegida_asientocuenta")
    private BigInteger ascCtaElegidaAsientocuenta;
    @Column(name = "asc_debe_asientocuenta")
    private BigInteger ascDebeAsientocuenta;
    @Column(name = "asc_haber_asientocuenta")
    private BigInteger ascHaberAsientocuenta;
    @Column(name = "asc_fecha_sientocuenta")
    @Temporal(TemporalType.DATE)
    private Date ascFechaSientocuenta;
    @Column(name = "asc_id_cuenta_aux_asientocuenta")
    private BigInteger ascIdCuentaAuxAsientocuenta;
    @Size(max = 100)
    @Column(name = "asc_notas_asientocuenta")
    private String ascNotasAsientocuenta;
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

    public TraAsientosCuentas() {
    }

    public TraAsientosCuentas(Long ascId) {
        this.ascId = ascId;
    }

    public Long getAscId() {
        return ascId;
    }

    public void setAscId(Long ascId) {
        this.ascId = ascId;
    }

    public BigInteger getAscCtaElegidaAsientocuenta() {
        return ascCtaElegidaAsientocuenta;
    }

    public void setAscCtaElegidaAsientocuenta(BigInteger ascCtaElegidaAsientocuenta) {
        this.ascCtaElegidaAsientocuenta = ascCtaElegidaAsientocuenta;
    }

    public BigInteger getAscDebeAsientocuenta() {
        return ascDebeAsientocuenta;
    }

    public void setAscDebeAsientocuenta(BigInteger ascDebeAsientocuenta) {
        this.ascDebeAsientocuenta = ascDebeAsientocuenta;
    }

    public BigInteger getAscHaberAsientocuenta() {
        return ascHaberAsientocuenta;
    }

    public void setAscHaberAsientocuenta(BigInteger ascHaberAsientocuenta) {
        this.ascHaberAsientocuenta = ascHaberAsientocuenta;
    }

    public Date getAscFechaSientocuenta() {
        return ascFechaSientocuenta;
    }

    public void setAscFechaSientocuenta(Date ascFechaSientocuenta) {
        this.ascFechaSientocuenta = ascFechaSientocuenta;
    }

    public BigInteger getAscIdCuentaAuxAsientocuenta() {
        return ascIdCuentaAuxAsientocuenta;
    }

    public void setAscIdCuentaAuxAsientocuenta(BigInteger ascIdCuentaAuxAsientocuenta) {
        this.ascIdCuentaAuxAsientocuenta = ascIdCuentaAuxAsientocuenta;
    }

    public String getAscNotasAsientocuenta() {
        return ascNotasAsientocuenta;
    }

    public void setAscNotasAsientocuenta(String ascNotasAsientocuenta) {
        this.ascNotasAsientocuenta = ascNotasAsientocuenta;
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
        hash += (ascId != null ? ascId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraAsientosCuentas)) {
            return false;
        }
        TraAsientosCuentas other = (TraAsientosCuentas) object;
        if ((this.ascId == null && other.ascId != null) || (this.ascId != null && !this.ascId.equals(other.ascId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraAsientosCuentas[ ascId=" + ascId + " ]";
    }
    
}
