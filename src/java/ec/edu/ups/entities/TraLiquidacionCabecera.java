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
@Table(name = "tra_liquidacion_cabecera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraLiquidacionCabecera.findAll", query = "SELECT t FROM TraLiquidacionCabecera t"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaIdPk", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaIdPk = :lcaIdPk"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByAudEliminado", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByAudFechaInsercion", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByAudFechaModificacion", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByAudUsuarioInserto", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByAudUsuarioModifico", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaDireccion", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaDireccion = :lcaDireccion"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaEstaddo", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaEstaddo = :lcaEstaddo"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaFecha", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaFecha = :lcaFecha"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaFechaEmision", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaFechaEmision = :lcaFechaEmision"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaSenores", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaSenores = :lcaSenores"),
    @NamedQuery(name = "TraLiquidacionCabecera.findByLcaUsuario", query = "SELECT t FROM TraLiquidacionCabecera t WHERE t.lcaUsuario = :lcaUsuario")})
public class TraLiquidacionCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "lca_id_pk")
    private Long lcaIdPk;
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
    @Size(max = 400)
    @Column(name = "lca_direccion")
    private String lcaDireccion;
    @Size(max = 10)
    @Column(name = "lca_estaddo")
    private String lcaEstaddo;
    @Column(name = "lca_fecha")
    @Temporal(TemporalType.DATE)
    private Date lcaFecha;
    @Column(name = "lca_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date lcaFechaEmision;
    @Size(max = 200)
    @Column(name = "lca_senores")
    private String lcaSenores;
    @Size(max = 200)
    @Column(name = "lca_usuario")
    private String lcaUsuario;

    public TraLiquidacionCabecera() {
    }

    public TraLiquidacionCabecera(Long lcaIdPk) {
        this.lcaIdPk = lcaIdPk;
    }

    public Long getLcaIdPk() {
        return lcaIdPk;
    }

    public void setLcaIdPk(Long lcaIdPk) {
        this.lcaIdPk = lcaIdPk;
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

    public String getLcaDireccion() {
        return lcaDireccion;
    }

    public void setLcaDireccion(String lcaDireccion) {
        this.lcaDireccion = lcaDireccion;
    }

    public String getLcaEstaddo() {
        return lcaEstaddo;
    }

    public void setLcaEstaddo(String lcaEstaddo) {
        this.lcaEstaddo = lcaEstaddo;
    }

    public Date getLcaFecha() {
        return lcaFecha;
    }

    public void setLcaFecha(Date lcaFecha) {
        this.lcaFecha = lcaFecha;
    }

    public Date getLcaFechaEmision() {
        return lcaFechaEmision;
    }

    public void setLcaFechaEmision(Date lcaFechaEmision) {
        this.lcaFechaEmision = lcaFechaEmision;
    }

    public String getLcaSenores() {
        return lcaSenores;
    }

    public void setLcaSenores(String lcaSenores) {
        this.lcaSenores = lcaSenores;
    }

    public String getLcaUsuario() {
        return lcaUsuario;
    }

    public void setLcaUsuario(String lcaUsuario) {
        this.lcaUsuario = lcaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lcaIdPk != null ? lcaIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLiquidacionCabecera)) {
            return false;
        }
        TraLiquidacionCabecera other = (TraLiquidacionCabecera) object;
        if ((this.lcaIdPk == null && other.lcaIdPk != null) || (this.lcaIdPk != null && !this.lcaIdPk.equals(other.lcaIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraLiquidacionCabecera[ lcaIdPk=" + lcaIdPk + " ]";
    }
    
}
