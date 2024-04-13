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
public class Estudiante {
    private int ci;
    private String nom,pat,mat;
    Estudiante(int a,String b, String c,String d){
        ci=a;
        nom=b;
        pat=c;
        mat=d;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
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
    public void mostrar(){
        System.out.println("\t<"+ci+" "+nom+" "+pat+" "+mat+">");
    }
}

/*
* ESTUDENT COMENTS
*
*
*/
