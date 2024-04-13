/*
* Rdrigo Calle
* Proffesor Derek Peterson 
*
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.premerparcial;

/**
 *
 * @author rodri
 */
public class Facultad {
    private String nombre;
    private CSimpleC m;
    
   Facultad(String a, CSimpleC c){
       nombre= a;
       m=c;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CSimpleC getM() {
        return m;
    }

    public void setM(CSimpleC m) {
        this.m = m;
    }
   
 
    public  void mostrar(){
        System.out.print(nombre);
        m.mostrar();
    }
   
}

/*
* ESTUDENT COMENTS
*
*
*/
