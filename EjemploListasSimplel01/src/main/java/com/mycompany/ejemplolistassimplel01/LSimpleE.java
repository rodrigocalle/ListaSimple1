/*
* Rdrigo Calle
* Proffesor Derek Peterson 
*
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejemplolistassimplel01;

/**
 *
 * @author rodri
 */
public class LSimpleE {
    private NodoE p;    //direccion  del primer nodo
    
    LSimpleE(){
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    
    //metodos
    
    public void adifinal(int a, String b,String c,String d, int e){
        NodoE nue =new NodoE();
        nue.setCi(a);
        nue.setNom(b);
        nue.setPat(c);
        nue.setMat(d);
        nue.setNota(e);
        
        if(getP()==null)
            setP(nue);
        else{
            NodoE r=getP();
            
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);

        }
    }
    
    public void adiprincipio(int a, String b,String c,String d, int e){ ///parametros que  ba almacenar la lista
        NodoE nue =new NodoE();
        nue.setCi(a);
        nue.setNom(b);
        nue.setPat(c);
        nue.setMat(d);
        nue.setNota(e);
        
        nue.setSig(getP());
        setP(nue);
        
        
    }
    public void mostrar(){
        NodoE q=getP();
        while(q!=null){
            System.out.println(q.getCi()+" "+q.getNom()+" "+q.getPat()+" "+q.getMat()+" "+q.getNota());
            q=q.getSig();
        }
    }
    
    
    
}

/*
* ESTUDENT COMENTS
*
*
*/
