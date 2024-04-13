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
public class PilaL {
    private int max=20;
    private Inscrito v[]=new Inscrito[max+1];
    private int tope;
    
    PilaL()
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


    void adicionar (Inscrito elem)
    {
        if (!esllena ())
        {
            tope++;
            v [tope] = elem;
        }
        else
            System.out.println ("Pila llena");
    }


    Inscrito eliminar ()
    {
        Inscrito elem = null;
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
        Inscrito elem;
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Inscritos de la Pila ");
            PilaL aux = new PilaL ();
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

    void vaciar (PilaL a)
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
