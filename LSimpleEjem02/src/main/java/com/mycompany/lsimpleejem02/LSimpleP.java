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
public class LSimpleP {
    private NodoP p;
    
    LSimpleP()
    {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adifinal(Producto x)
    {
        NodoP nue=new NodoP();
        nue.setA(x);
        
        if(getP()==null)
            setP(nue);
        else{
            NodoP w=getP();
            while(w.getSig()!=null)
                w=w.getSig();
            w.setSig(nue);
        }
    }
    public void mostrar(){
        NodoP w=getP();
        while(w!=null)
        {
            w.getA().mostrar();
            w=w.getSig();
        }
    }
    
    
    
}

/*
* ESTUDENT COMENTS
*
*
*/
