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
public class CSimpleC {
     private int max= 50;
    private Carrera v[]=new Carrera[max+1];

    private int ini,fin;
    
    CSimpleC()
    {
        ini=fin=0;
    }
    boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (fin - ini);
    }
    void adicionar (Carrera elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    Carrera eliminar ()
    {
	Carrera elem = null;
	if (!esvacia ())
	{
	    ini++;
	    elem = v [ini];
	    if (ini == fin)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola Simple vacia");
	return (elem);
    }
    void mostrar ()
    {
	Carrera elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Nombres de la Cola Carrera ");
	    CSimpleC aux = new CSimpleC ();
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
   // void llenar (int n)
   // {
	///int i;
	//for (i = 1 ; i <= n ; i++)
	    //adicionar (Leer.dato ());
   // }
    void vaciar (CSimpleC a)
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
