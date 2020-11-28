/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.Modelo;

import java.util.Date;



/**
 * 
 *
 */
public class Matrimonio {
    
    private int codigo;
    private Date fechaCelebracion;
    private String lugarCelebracion;
    private Persona contrayente_N1;
    private Persona contrayente_N2;
    private Persona testigo1;
    private Persona testigo2;
    private Autoridad autoridad;

    public Matrimonio(int codigo, Date fechaCelebracion, String lugarCelebracion,
            Persona contrayente_N1, Persona contrayente_N2,
            Persona testigo1, Persona testigo2, Autoridad autoridad) {
        this.codigo = codigo;
        this.fechaCelebracion = fechaCelebracion;
        this.lugarCelebracion = lugarCelebracion;
        this.contrayente_N1 = contrayente_N1;
        this.contrayente_N2 = contrayente_N2;
        this.testigo1 = testigo1;
        this.testigo2 = testigo2;
        this.autoridad = autoridad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaCelebracion() {
        return fechaCelebracion;
    }

    public void setFechaCelebracion(Date fechaCelebracion) {
        this.fechaCelebracion = fechaCelebracion;
    }

    public String getLugarCelebracion() {
        return lugarCelebracion;
    }

    public void setLugarCelebracion(String lugarCelebracion) {
        this.lugarCelebracion = lugarCelebracion;
    }

    public Persona getContrayente_N1() {
        return contrayente_N1;
    }

    public void setContrayente_N1(Persona contrayente_N1) {
        this.contrayente_N1 = contrayente_N1;
    }

    public Persona getContrayente_N2() {
        return contrayente_N2;
    }

    public void setContrayente_N2(Persona contrayente_N2) {
        this.contrayente_N2 = contrayente_N2;
    }

    public Persona getTestigo1() {
        return testigo1;
    }

    public void setTestigo1(Persona testigo1) {
        this.testigo1 = testigo1;
    }

    public Persona getTestigo2() {
        return testigo2;
    }

    public void setTestigo2(Persona testigo2) {
        this.testigo2 = testigo2;
    }

    public Autoridad getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Autoridad autoridad) {
        this.autoridad = autoridad;
    }
}
