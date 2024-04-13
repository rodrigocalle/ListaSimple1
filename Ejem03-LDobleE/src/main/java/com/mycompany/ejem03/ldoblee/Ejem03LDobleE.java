/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejem03.ldoblee;

/**
 *
 * @author rodri
 */
public class Ejem03LDobleE {

    public static void main(String[] args) {
        LDobleE A=new LDobleE();
        A.adiprinciopio(new Estudiante(11,"Luci","Perez","Lima"));
        A.adiprinciopio(new Estudiante(22,"Rodrigo","Calle","Daza"));
        A.adiprinciopio(new Estudiante(33,"Javier","Perez","Lima"));
        A.adiprinciopio(new Estudiante(44,"Esmeralda","Quispe","Angeles"));
     
        System.out.print("-----------LISTA DE ETUDIANTES-------------");
        A.mostrar();
        
        
        LDobleR B=new LDobleR();
        B.Adifinal(22, "2/3/2024", "Pilas");
        B.Adifinal(11, "2/3/2024", "Colas");
        B.Adifinal(33, "2/3/2024", "Listas");
        B.Adifinal(22, "2/3/2024", "Colas");
        B.Adifinal(22, "2/3/2024", "Listas");
        B.Adifinal(11, "2/3/2024", "Grafos");
        B.Adifinal(22, "2/3/2024", "Arboles");
       
        System.out.print("-----------LISTA DE REPASOS-------------");
        B.mostrar();
        
        //prblemas
        //1. mostrar los   reapasos de cada estudiante
        //2. mostrar  los nombres de los estudiantes que presetaron  repasos
        System.out.println("-----------EJER1 ----Mostrar los  repasos de cada estudiante---------");
        repasos(A,B);
        System.out.println("-----------EJER2-----mostrar los nombres delos estudiantes que presentaron repasos--------");
        temaX(A,B,"Listas");
        //1.Mostrar los repasos de i- estudiante
        System.out.println("--------ejer 3---REPASOS DE IESIMO ESTUDIANTE-----");
        mostrarElIesimo(A,B,3);
        //2. ver si el estudiante de ci x tiene un repaso de tema "colas"
        System.out.println("--------ejer 4 -----");
        ejer2(A,B,22,"Colas");
        
    }
    //1. mostrar los   reapasos de cada estudiante
        public static void repasos(LDobleE a, LDobleR b)
    {
        NodoE r1=a.getP();
        while(r1!=null)
        {   System.out.println(r1.getE().getNom()); 
            NodoR r2=b.getP();
            while(r2!=null)
            {
                if(r1.getE().getCi()==r2.getCi())
                    System.out.println("\t"+r2.getFecha()+" "+r2.getTema());
                r2=r2.getSig();
            }
            r1=r1.getSig();
        }
    }
    
    
 //2. mostrar  los nombres de los estudiantes que presetaron  repaso x
    public static void temaX(LDobleE A,LDobleR B,String x)
    {
        NodoR r=B.getP();
        while(r!=null)
        {
            if(r.getTema().equals(x))
                System.out.println(busca(A,r.getCi()));
            r=r.getSig();
        }
        
    }
    public static String busca(LDobleE a,int b)
    {
        NodoE r=a.getP();
        while(r!=null)
        {
            if(r.getE().getCi()==b)
                return r.getE().getNom();
            r=r.getSig();
        }
        return "";
    }
    
    //1.Mostrar los repasos de i- estudiante 
    public static void mostrarElIesimo(LDobleE a,LDobleR b, int x){
        
        NodoE r=a.getP();
        NodoR r2=b.getP();
        int c=1;
        while (r!=null){
             c=c+1;
            if(c==x){
                while(r2!=null){
                    if(r.getE().getCi()==r2.getCi()){
                        System.out.println(r.getE().getNom()+" "+ "\t "+r2.getTema());
                    }
                    r2=r2.getSig();
                }
            }
           
            r=r.getSig();
            
        }
    
     }
    //2. ver si el estudiante de ci x tiene un repaso de tema "colas"
   
    public static void ejer2(LDobleE a,LDobleR b, int x,String x2){
        NodoE r =a.getP();
        NodoR r2=b.getP();
        while(r!=null){
            if(r.getE().getCi()==x){
                while(r2!=null){
                    if(r2.getTema().equals(x2)){
                        System.out.println("El estudiante de de ci: "+r.getE().getCi()+" "+"tiene el repaso : "+r2.getTema());
                    }
                    r2=r2.getSig();
                }
                
               
            }
            r=r.getSig();
        }
    }
    
 

}
