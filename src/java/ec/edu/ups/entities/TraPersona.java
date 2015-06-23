/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusan
 */
@Entity
@Table(name = "tra_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraPersona.findAll", query = "SELECT t FROM TraPersona t"),
    @NamedQuery(name = "TraPersona.findByPerIdPk", query = "SELECT t FROM TraPersona t WHERE t.perIdPk = :perIdPk"),
    @NamedQuery(name = "TraPersona.findByAudEliminado", query = "SELECT t FROM TraPersona t WHERE t.audEliminado = :audEliminado"),
    @NamedQuery(name = "TraPersona.findByAudFechaInsercion", query = "SELECT t FROM TraPersona t WHERE t.audFechaInsercion = :audFechaInsercion"),
    @NamedQuery(name = "TraPersona.findByAudFechaModificacion", query = "SELECT t FROM TraPersona t WHERE t.audFechaModificacion = :audFechaModificacion"),
    @NamedQuery(name = "TraPersona.findByAudUsuarioInserto", query = "SELECT t FROM TraPersona t WHERE t.audUsuarioInserto = :audUsuarioInserto"),
    @NamedQuery(name = "TraPersona.findByAudUsuarioModifico", query = "SELECT t FROM TraPersona t WHERE t.audUsuarioModifico = :audUsuarioModifico"),
    @NamedQuery(name = "TraPersona.findByPerApellido", query = "SELECT t FROM TraPersona t WHERE t.perApellido = :perApellido"),
    @NamedQuery(name = "TraPersona.findByPerCedula", query = "SELECT t FROM TraPersona t WHERE t.perCedula = :perCedula"),
    @NamedQuery(name = "TraPersona.findByPerCelular", query = "SELECT t FROM TraPersona t WHERE t.perCelular = :perCelular"),
    @NamedQuery(name = "TraPersona.findByPerDireccion", query = "SELECT t FROM TraPersona t WHERE t.perDireccion = :perDireccion"),
    @NamedQuery(name = "TraPersona.findByPerFechaNacimiento", query = "SELECT t FROM TraPersona t WHERE t.perFechaNacimiento = :perFechaNacimiento"),
    @NamedQuery(name = "TraPersona.findByPerNombre", query = "SELECT t FROM TraPersona t WHERE t.perNombre = :perNombre"),
    @NamedQuery(name = "TraPersona.findByPerTelefono", query = "SELECT t FROM TraPersona t WHERE t.perTelefono = :perTelefono")})
public class TraPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "per_id_pk")
    private Long perIdPk;
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
    @Size(max = 200)
    @Column(name = "per_apellido")
    private String perApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "per_cedula")
    private String perCedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "per_celular")
    private String perCelular;
    @Size(max = 400)
    @Column(name = "per_direccion")
    private String perDireccion;
    @Column(name = "per_fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date perFechaNacimiento;
    @Size(max = 200)
    @Column(name = "per_nombre")
    private String perNombre;
    @Size(max = 10)
    @Column(name = "per_telefono")
    private String perTelefono;
    @OneToMany(mappedBy = "tpeGrcFk")
    private List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList;
    @OneToMany(mappedBy = "perHrcFk")
    private List<TraHojaRutaCabecera> traHojaRutaCabeceraList;

    public TraPersona() {
    }

    public TraPersona(Long perIdPk) {
        this.perIdPk = perIdPk;
    }

    public TraPersona(Long perIdPk, String perCedula, String perCelular) {
        this.perIdPk = perIdPk;
        this.perCedula = perCedula;
        this.perCelular = perCelular;
    }

    public Long getPerIdPk() {
        return perIdPk;
    }

    public void setPerIdPk(Long perIdPk) {
        this.perIdPk = perIdPk;
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

    public String getPerApellido() {
        return perApellido;
    }

    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }

    public String getPerCedula() {
        return perCedula;
    }

    public void setPerCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    public String getPerCelular() {
        return perCelular;
    }

    public void setPerCelular(String perCelular) {
        this.perCelular = perCelular;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public Date getPerFechaNacimiento() {
        return perFechaNacimiento;
    }

    public void setPerFechaNacimiento(Date perFechaNacimiento) {
        this.perFechaNacimiento = perFechaNacimiento;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerTelefono() {
        return perTelefono;
    }

    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    @XmlTransient
    public List<TraGuiaRemisionCabecera> getTraGuiaRemisionCabeceraList() {
        return traGuiaRemisionCabeceraList;
    }

    public void setTraGuiaRemisionCabeceraList(List<TraGuiaRemisionCabecera> traGuiaRemisionCabeceraList) {
        this.traGuiaRemisionCabeceraList = traGuiaRemisionCabeceraList;
    }

    @XmlTransient
    public List<TraHojaRutaCabecera> getTraHojaRutaCabeceraList() {
        return traHojaRutaCabeceraList;
    }

    public void setTraHojaRutaCabeceraList(List<TraHojaRutaCabecera> traHojaRutaCabeceraList) {
        this.traHojaRutaCabeceraList = traHojaRutaCabeceraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perIdPk != null ? perIdPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraPersona)) {
            return false;
        }
        TraPersona other = (TraPersona) object;
        if ((this.perIdPk == null && other.perIdPk != null) || (this.perIdPk != null && !this.perIdPk.equals(other.perIdPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.entities.TraPersona[ perIdPk=" + perIdPk + " ]";
    }
    
}
