/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.premerparcial;

/**
 *
 * @author rodri
 */
public class PremerParcial {

    public static void main(String[] args) {
        CSimpleC c1=new CSimpleC();
        c1.adicionar(new Carrera(1,"Informatica"));
        c1.adicionar(new Carrera(2,"Quimica"));
        c1.adicionar(new Carrera(23,"Matematica"));
        
        ///////////////
        CSimpleC c2=new CSimpleC(); 
        c2.adicionar(new Carrera(23,"Derecho"));
        c2.adicionar(new Carrera(54,"Comunicasion"));
        c2.adicionar(new Carrera(34,"Economia"));
        
        /////////////////
        
        Facultad f1=new Facultad("Ciencias puras",c1); 
        Facultad f2=new Facultad("Ciencias economicas",c2);
        ///////COLA   DE FACULTADES //////
        CSimpleF cf=new CSimpleF();
        cf.adicionar(f1);
        cf.adicionar(f2);
        ///////////////////////
        

        Inscrito i1=new Inscrito("Roxana","Quispe","Daza","Estudiante",243453,1);
        Inscrito i2=new Inscrito("Rodrigo","Calle","Daza","Estudiante",245453,2);
        Inscrito i3=new Inscrito("Vanessa","Calle","Gimenes","Docente",3443,34);
        
        Inscrito i4=new Inscrito("Alvaro","Calle","Gimenes","Estudiante",324534,23);
        Inscrito i5=new Inscrito("Rosa","Quispe","Condori","Estudiante",3453,54);
        Inscrito i6=new Inscrito("Paola","Choque","Callo","Docente",5546,34);
        
        
        
        
        MultipilaL m=new MultipilaL();
        m.adicionar(1, i1);
        m.adicionar(2, i2);
        m.adicionar(3, i3);
        m.setN(3);
        
        //m.mostrar();
        
        
        MultipilaL m2=new  MultipilaL();
        m2.adicionar(1, i4);
        m2.adicionar(2, i5);
        m2.adicionar(2, i5);
        m2.adicionar(3, i6);
        m2.setN(3);
        //m2.mostrar();
        
        Disiplina d1=new Disiplina("Atletismo",m);
        Disiplina d2=new Disiplina("Futbool",m2);
        System.out.println("////////////MULTIPILA 1////////////");
        d1.mostrar();
        System.out.println("////////////MULTIPILA 2////////////");
        d2.mostrar();
        
        PilaD d=new PilaD();
        d.adicionar(d1);
        d.adicionar(d2);
        //d.mostrar();
        
        
       System.out.println("-----------------Buscar INSCRITOD DE LA CARRERA-------------------");
       
      
    }
    
    public static void insisob(CSimpleF a){
       
    }
    
    
    
    
    
    
    
    
    
    /*
   //verivicar si existe inscritos de carrera de "informatica" en la disiplina x
    public static void verificar(CSimpleF a, String x, PilaD b, String z){
       CSimpleF aux=new  CSimpleF();
       //PilaD aux2=new PilaD();
       while(!a.esvacia()){
           Facultad f=a.eliminar();
           if(f.getNombre().equals("Ciencias puras")){
               ingresarC(f.getM(),x, b, z);
           }
           
           aux.adicionar(f);
       }
       a.vaciar(aux);
    }
    public static void ingresarC(CSimpleC a, String x, PilaD b, String z){
       CSimpleC aux=new  CSimpleC();
       while(!a.esvacia()){
           Carrera ce=a.eliminar();
           if(ce.getNombre().equals(x)){
               buscarD(ce.getIdCarr(),b, z);
           }
           aux.adicionar(ce);
       }
       a.vaciar(aux);
    }
    public static void buscarD(int id, PilaD a, String z){
       PilaD aux =new PilaD();
       while(!a.esvacia()){
           Disiplina d=a.eliminar();
           if(d.getNombre().equals(z)){
               buscarI(id, d.getB());
           }
           aux.adicionar(d);
       }
       a.vaciar(aux);
    }
    public static void buscarI(int id, MultipilaL a){
       PilaL aux=new PilaL();
       for(int i =1; i<a.getN();i++){
           Inscrito n=a.eliminar(i);
           if(n.getIdCarr()==id){
               System.out.println(n.getNom());
           }
           a.vaciar(i, aux);
       }
       
    }
    
    
    public static void buscadisiplina(){
        
    }  

    
    */
}

