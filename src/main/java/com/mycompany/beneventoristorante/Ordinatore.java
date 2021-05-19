/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beneventoristorante;

/**
 *
 * @author STUDENTE
 */
public class Ordinatore 
{
    public static void scambia (Prenotazione v[], int posizione1, int posizione2)
    {
        Prenotazione c;
        c=v[posizione1];
        v[posizione1]=v[posizione2];
        v[posizione2]=c;
    }
    public static Prenotazione [] selectionSortAlfabeticoCliente(Prenotazione[] a)
    {
        Prenotazione[] ordinato=new Prenotazione[a.length];
        
        for (int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
        
        for (int i=0;i<ordinato.length-1;i++)
        {
            for (int j=i+1;j<ordinato.length;j++)
            {
                    if (ordinato[j].getNome().compareToIgnoreCase(ordinato[i].getNome())<0 || (ordinato[j].getNome().compareToIgnoreCase(ordinato[i].getNome())==0 ) && (ordinato[j].getCognome().compareToIgnoreCase(ordinato[i].getCognome())<0));
                    scambia(ordinato,i,j);
            }
        }
        return ordinato;
    }
}
