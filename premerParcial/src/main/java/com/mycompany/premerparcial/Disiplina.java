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
public class Disiplina {
    private String  nombre;
    private MultipilaL b;
    
    Disiplina(String a, MultipilaL m){
        nombre= a;
        b =m;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MultipilaL getB() {
        return b;
    }

    public void setB(MultipilaL b) {
        this.b = b;
    }
    
    public  void mostrar(){
        System.out.print(nombre);
        b.mostrar();
    }
}

/*
* ESTUDENT COMENTS
*
*
*/
