
package com.pablo.pse5.client;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class OfertaBackingBean implements Serializable{
    private int ofertaId;
    private String ofertaNombre;
    private String ofertaDescripcion; 
    private Date ofertaFecha; 
    private String ofertaPuesto; 
    private String ofertaRequisitosMinimos;
    private String ofertaEmailEmpresa;

    public int getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(int ofertaId) {
        this.ofertaId = ofertaId;
    }

    public String getOfertaNombre() {
        return ofertaNombre;
    }

    public void setOfertaNombre(String ofertaNombre) {
        this.ofertaNombre = ofertaNombre;
    }

    public String getOfertaDescripcion() {
        return ofertaDescripcion;
    }

    public void setOfertaDescripcion(String ofertaDescripcion) {
        this.ofertaDescripcion = ofertaDescripcion;
    }

    public Date getOfertaFecha() {
        return ofertaFecha;
    }

    public void setOfertaFecha(Date ofertaFecha) {
        this.ofertaFecha = ofertaFecha;
    }

    public String getOfertaPuesto() {
        return ofertaPuesto;
    }

    public void setOfertaPuesto(String ofertaPuesto) {
        this.ofertaPuesto = ofertaPuesto;
    }

    public String getOfertaRequisitosMinimos() {
        return ofertaRequisitosMinimos;
    }

    public void setOfertaRequisitosMinimos(String ofertaRequisitosMinimos) {
        this.ofertaRequisitosMinimos = ofertaRequisitosMinimos;
    }

    public String getOfertaEmailEmpresa() {
        return ofertaEmailEmpresa;
    }

    public void setOfertaEmailEmpresa(String ofertaEmailEmpresa) {
        this.ofertaEmailEmpresa = ofertaEmailEmpresa;
    }
    
    
}