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
public class NodoE {
    private Estudiante e;
    private NodoE ant,sig;
    
    NodoE(){
        ant=sig=null;
    }

    public Estudiante getE() {
        return e;
    }

    public void setE(Estudiante e) {
        this.e = e;
    }

    public NodoE getAnt() {
        return ant;
    }

    public void setAnt(NodoE ant) {
        this.ant = ant;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }
    
}

/*
* ESTUDENT COMENTS
*
*
*/
