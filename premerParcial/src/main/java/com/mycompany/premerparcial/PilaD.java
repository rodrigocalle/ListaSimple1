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
public class PilaD {
   private int max=20;
    private Disiplina v[]=new Disiplina[max+1];
    private int tope;
    
    PilaD()
    {
        tope=0;
    }
    boolean esvacia ()
    {
        if (tope == 0)
            return (true);
        return (false);
    }


    boolean esllena ()
    {
        if (tope == max)
            return (true);
        return (false);
    }


    int nroelem ()
    {
        return (tope);
    }


    void adicionar (Disiplina elem)
    {
        if (!esllena ())
        {
            tope++;
            v [tope] = elem;
        }
        else
            System.out.println ("Pila llena");
    }


    Disiplina eliminar ()
    {
        Disiplina elem = null;
        if (!esvacia ())
        {
            elem = v [tope];
            tope--;
        }
        else
            System.out.println ("Pila vacia");
        return (elem);
    }


    void mostrar ()
    {
        Disiplina elem;
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Disiplinas de la Pila ");
            PilaD aux = new PilaD ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrar();
            }
            while (!aux.esvacia ())
            {
                elem = aux.eliminar ();

                adicionar (elem);
            }
        }
    }

    void vaciar (PilaD a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());

    }
}

/*
* ESTUDENT COMENTS
*
*
*/
