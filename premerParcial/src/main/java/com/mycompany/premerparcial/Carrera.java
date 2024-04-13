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
public class Carrera {
    private  int idCarr;
    private String nombre;
    
    public Carrera(int a, String b){
        idCarr=a;
        nombre=b;
    }

    public int getIdCarr() {
        return idCarr;
    }

    public void setIdCarr(int idCarr) {
        this.idCarr = idCarr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void mostrar(){
        System.out.print(idCarr+" "+" "+nombre);
    }
}

/*
* ESTUDENT COMENTS
*
*
*/
