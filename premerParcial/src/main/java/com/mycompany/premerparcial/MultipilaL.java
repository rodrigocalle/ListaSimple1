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
public class MultipilaL {
        private int n;
    private PilaL v[]=new PilaL[50];
    
    MultipilaL()
    {
        for(int i=1;i<50;i++)
            v[i]=new PilaL();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    boolean esvacia( int i )
    {
             return  v[i].esvacia();
     }
    boolean esllena( int i )
   { 
            return  v[i].esllena();
    }
    
   int nroelem(int i )
   {
         return v[i].nroelem();
   }
   void adicionar( int i, Inscrito elem)
   {
         v[i].adicionar(elem);
   }
   Inscrito eliminar(int i)
   {
            return  v[i].eliminar();
   }
  
   void mostrar( int i )
   {
        v[i].mostrar();
   }
   void mostrar()
   {
       for(int i=1;i<= n;i++)
       {
           System.out.println("\nPila : "+i);
            mostrar(i);
       }
   } 
   void vaciar( int i, PilaL Z)
   {
       v[i].vaciar(Z);
   }
   void vaciar(int i, int j)
   {
       v[i].vaciar(v[j]);
   }
}

/*
* ESTUDENT COMENTS
*
*
*/
