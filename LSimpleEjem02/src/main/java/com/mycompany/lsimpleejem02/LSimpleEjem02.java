/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lsimpleejem02;

/**
 *
 * @author rodri
 */
public class LSimpleEjem02 {

    public static void main(String[] args) {
        LSimpleP A=new LSimpleP();
        A.adifinal(new Producto("azucar",1,5,100));
        A.adifinal(new Producto("fideo",3,7,55));
        A.adifinal(new Producto("arroz",7,2,45));
        A.adifinal(new Producto("pan",2,1,250));
        A.adifinal(new Producto("aceite",8,15,30));
        System.out.println("LISTA DE PRODUCTOS");
        A.mostrar();
        //1. CREAR Y MOSTRAR LA LISTA DE VENTAS
        LSimpleV B=new LSimpleV();
        B.adifinal(1, "1/1/2024", "Lucy", 2);
        B.adifinal(1, "2/1/2024", "Pedro", 1);
        B.adifinal(3, "1/1/2024", "Maria", 4);
        B.adifinal(8, "5/1/2024", "Lucy", 1);
        B.adifinal(3, "3/1/2024", "Maria", 2);
        B.adifinal(3, "4/1/2024", "Luis", 5);
        B.adifinal(1, "5/1/2024", "Lucy", 2);
        B.adifinal(8, "5/1/2024", "Maria", 3);
        B.adifinal(3, "6/1/2024", "Pedro", 2);
        System.out.println("LISTA DE VENTAS");
        B.mostrar();
        System.out.println("2. MOSTRAR LAS VENTAS DEL PRODUCTO CON NOMBRE x");
        ejer2(A,B,"aceite");
        
        
        System.out.println("--------PROCUDUCTOS QUE NO SE VENDIERON --------------");
        NoVendidos(A,B);
    }
    public static void ejer2(LSimpleP l1, LSimpleV l2, String x)
    {
        NodoP r=l1.getP();
        while(r!=null)
        {
            if(r.getA().getNom().equals(x))
                susVentas(r.getA().getIdProd(),l2);
            r=r.getSig();
        }
        
    }
    public static void susVentas(int id, LSimpleV b)
    {
        NodoV r=b.getP();
        while(r!=null)
        {
            if(r.getIdProd()==id)
                System.out.println(r.getFecha()+" "+r.getCliente()+" "+r.getCantidad());
            r=r.getSig();
        }
    }
    
    //3, cantidad total vedidas producto
    //4, productos no  vendidos 
    //5,Mostrar los nombres de productos en la fecha x
    
    
   public static void  ejer3(LSimpleP A,LSimpleV B){
      
   }
  
   
   
   
   
   
   
   
   

   
   
   
   
   public static  boolean Verifica(int id,LSimpleV A){
       NodoV r=A.getP();
       while(r!=null){
           if(r.getIdProd()==id)
               return true ;
           r=r.getSig();
       }
       return false;
   }
   
   public static void NoVendidos(LSimpleP A,LSimpleV B){
       NodoP r=A.getP();
       while(r!=null){
           if(!Verifica(r.getA().getIdProd(),B))
               System.out.print(r.getA().getNom());
           r=r.getSig();
       }
   }
   
   
}
