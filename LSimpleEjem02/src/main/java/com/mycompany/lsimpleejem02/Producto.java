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
public class Producto {
    private  String nom;
    private int idProd,precio,stock;
    
    Producto( String a, int b, int c, int d){
        nom=a;
        idProd=b;
        precio=c;
        stock=d;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void mostrar(){
        System.out.println("< "+nom+" "+idProd+" "+precio+" "+stock+" > ");
    }
}

/*
* ESTUDENT COMENTS
*
*
*/
