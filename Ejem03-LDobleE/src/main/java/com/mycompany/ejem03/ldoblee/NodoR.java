/*
* Rdrigo Calle
* Proffesor Derek Peterson 
*
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejem03.ldoblee;

/**
 *
 * @author rodri
 */
public class NodoR {
    private int ci;
    private String fecha,tema;
    private NodoR ant,sig;
    
    NodoR(){
        ant=sig=null;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public NodoR getAnt() {
        return ant;
    }

    public void setAnt(NodoR ant) {
        this.ant = ant;
    }

    public NodoR getSig() {
        return sig;
    }

    public void setSig(NodoR sig) {
        this.sig = sig;
    }
    
}

/*
* ESTUDENT COMENTS
*
*
*/
