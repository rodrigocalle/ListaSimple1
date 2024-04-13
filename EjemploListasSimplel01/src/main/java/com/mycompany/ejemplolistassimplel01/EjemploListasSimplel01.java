/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplolistassimplel01;

/**
 *
 * @author rodri
 */
public class EjemploListasSimplel01 {

    public static void main(String[] args) {
        
        LSimpleE A=new LSimpleE();
        A.adiprincipio(11,"maria", "Perez", "Loza", 2);
        A.adiprincipio(244,"Pedro", "Calle", "Martines", 32);
        A.adiprincipio(345,"Ana", "Quispe", "Mamani", 51);
        A.adiprincipio(345,"Carlos", "LOza", "Mamani", 56);
        A.adiprincipio(345,"Rodrigo", "Calle", "Daza", 75);
        A.adiprincipio(345,"Alfredo", "Calle", "Daza", 54);
        
        A.mostrar();
        //1
        System.out.println(A.getP().getNom());            //getP direcion del primer nodo
        System.out.println(Ultimo(A));
        //2
        A.adifinal(2423, "Daniela", "choque", "callo", 54);
        A.adifinal(2423, "Martin", "Chuquimia", "amarillo", 34);
        
        System.out.println("//////////ejer 2 ////////////");
        A.mostrar();
        //3contar aprovados
        System.out.println("//////////ejer 3 ////////////");
        contar(A);
        //4 mostrar la mayor nota
        Mayornota(A);   
        //5 mostrar los nombres con la menor nota
    }
    public static void contar(LSimpleE b){
        NodoE z=b.getP();
        int c=0;
        while(z!=null){
            if(z.getNota()>=51)
                c++;
            z=z.getSig();
        }
    }
    
    public static String Ultimo(LSimpleE a){
        NodoE r=a.getP();
        while(r.getSig()!=null){
            r=r.getSig();
        }
        return r.getNom();
    }
    
    //4 mostrar la mayor nota
    public static void Mayornota(LSimpleE a){
        NodoE r=a.getP();
        int may =r.getNota();
        while(r.getSig()!=null){
            if(r.getNota()>may){
                may=r.getNota();
            }
            r=r.getSig();
 
        }
        System.out.print("La  mayor nota es : "+may);
    }
    
    //5 mostrar los nombres con la menor nota
    
    public static void menorNota(LSimpleE a){
        NodoE r=a.getP();
        int may =r.getNota();
        while(r.getSig()!=null){
            if(r.getNota()>may){
                may=r.getNota();
            }
            r=r.getSig();
 
        }
        System.out.print("La  mayor nota es : "+may);
    }
    
    
    
    
}
