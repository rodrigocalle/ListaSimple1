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
public class LSimpleV {
    private NodoV p;
    
    LSimpleV()
    {
        p=null;
    }

    public NodoV getP() {
        return p;
    }

    public void setP(NodoV p) {
        this.p = p;
    }
    public void adifinal(int id, String fe, String cl, int ca)
    {
        NodoV nue=new NodoV();
        nue.setIdProd(id);
        nue.setFecha(fe);
        nue.setCliente(cl);
        nue.setCantidad(ca);
        
        if(getP()==null)
            setP(nue);
        else{
            NodoV w=getP();
            while(w.getSig()!=null)
                w=w.getSig();
            w.setSig(nue);
        }
    }
    public void mostrar(){
        NodoV w=getP();
        while(w!=null)
        {
            System.out.println("\t"+w.getIdProd()+" "+w.getFecha()+" "+w.getCliente()+" "+w.getCantidad());
            w=w.getSig();
        }
    }     
}    

/*
* ESTUDENT COMENTS
*
*
*/
