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
public class Inscrito {
    private String nom,pat,mat,tipo;
    private int ci,idCarr;
    
    Inscrito(String a,String b, String c, String d, int e,int f){
        nom=a;
        pat=b;
        mat=c;
        tipo=d;
        ci=e;
        idCarr=f;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getIdCarr() {
        return idCarr;
    }

    public void setIdCarr(int idCarr) {
        this.idCarr = idCarr;
    }
    public void mostrar(){
        System.out.println(nom+" "+pat+" "+" "+mat+" "+idCarr+" "+tipo+" "+ci);
    }
    
}

/*
* ESTUDENT COMENTS
*
*
*/
