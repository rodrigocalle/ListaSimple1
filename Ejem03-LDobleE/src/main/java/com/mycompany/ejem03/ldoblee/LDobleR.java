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
public class LDobleR {
    NodoR p;
    
    LDobleR(){
        p=null;
    }

    public NodoR getP() {
        return p;
    }

    public void setP(NodoR p) {
        this.p = p;
    }
    
public void Adifinal(int a, String b, String c) 
     {     
         NodoR nue=new NodoR(); 
         nue.setCi(a); 
         nue.setFecha(b); 
         nue.setTema(c); 
         if(getP()==null) 
                  setP(nue); 
          else{ 
               NodoR r=getP(); 
               while(r.getSig()!=null) 
                       r=r.getSig(); 
               r.setSig(nue); 
               nue.setAnt(r); 
          } 
     }

public void mostrar() 
     {   
         NodoR r=getP(); 
         while(r!=null) 
          {    
              System.out.println("\t"+r.getCi()+" "+r.getFecha()+" "+r.getTema()); 
              r=r.getSig(); 
          } 
     }
}

/*
* ESTUDENT COMENTS
*
*
*/
