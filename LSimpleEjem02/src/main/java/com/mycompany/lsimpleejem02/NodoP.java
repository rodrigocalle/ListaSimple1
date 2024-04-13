/*
* Rdrigo Calle
* Proffesor Derek Peterson 
*
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lsimpleejem02;

/**
 *
 * @author rodri
 */
public class NodoP {
    private Producto a;
    private NodoP sig;
    
    NodoP()
    {
        sig=null;
    }

    public Producto getA() {
        return a;
    }

    public void setA(Producto a) {
        this.a = a;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
}

/*
* ESTUDENT COMENTS
*
*
*/
