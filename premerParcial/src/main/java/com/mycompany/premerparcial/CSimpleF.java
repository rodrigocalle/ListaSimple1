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
public class CSimpleF {
     private int max= 50;
    private Facultad v[]=new Facultad[max+1];

    private int ini,fin;
    
    CSimpleF()
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
    void adicionar (Facultad elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    Facultad eliminar ()
    {
	Facultad elem = null;
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
	Facultad elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Nombres de la Cola Facultad ");
	    CSimpleF aux = new CSimpleF ();
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
    void vaciar (CSimpleF a)
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
