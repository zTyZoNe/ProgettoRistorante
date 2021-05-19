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
public class Ristorante 
{
    private Prenotazione[] persone;
    private static int NUM_MAX_PERSONE=20;
    public Ristorante()
    {
        persone=new Prenotazione[NUM_MAX_PERSONE];
    } 
    public Ristorante(Ristorante p)
    {
        persone=new Prenotazione[NUM_MAX_PERSONE];
        for(int i=0;i<getNumMaxPersone();i++)
        {
            persone[i]=p.getPersona(i);
        }
    }
    public Ristorante (Prenotazione[] elencoClienti)
    {
       persone=new Prenotazione[NUM_MAX_PERSONE];
       int numeroPersone=0;
       if(elencoClienti.length==0)
           return;
       if(elencoClienti.length>getNumMaxPersone())
           numeroPersone=getNumMaxPersone();
       else
           numeroPersone=elencoClienti.length;
       
       for(int i=0;i<numeroPersone;i++)
       {
           if(elencoClienti[i]!=null)
           {
               persone[i]=new Prenotazione(elencoClienti[i]);
           }
       }
    }
    public int getNumMaxPersone()
    {
        return NUM_MAX_PERSONE;
    }
    
    public int getNumPersone()
    {
        int contatore=0;
   
        for(int i=0;i<NUM_MAX_PERSONE;i++)
        {
            if(persone[i]!=null)
                contatore++;
        }
        return contatore;
    }
    public int setPersona(Prenotazione persona, int posizione)
    {
        if(posizione<0 || posizione>=getNumMaxPersone())
            return -1;
        else
            return -2;
    }   
    public Prenotazione getPersona(int posizione)
    {
        if(posizione<0 || posizione>=getNumMaxPersone())
            return null;
        if(persone[posizione]==null)
             return null;
        return new Prenotazione(persone[posizione]);
    } 
    public int rimuoviPrenotazione(int posizione)
    {
        if(posizione<0 || posizione>=getNumMaxPersone())
            return -1;
        else
            return -2;
    }
}
