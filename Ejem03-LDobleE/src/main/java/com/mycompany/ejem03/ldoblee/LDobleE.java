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
public class LDobleE {
    NodoE p;
    
   LDobleE(){
       p=null;
   }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
   
    public void  adiprinciopio(Estudiante x){
        NodoE nue =new NodoE();
        nue.setE(x);
        if(getP()==null)
            setP(nue);
        else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }

        }
    
        public void mostrar(){
            NodoE r=getP();
            while(r!=null){
                r.getE().mostrar();
                r=r.getSig();
            }
        }
        
    
}


/*
* ESTUDENT COMENTS
*
*
*/
