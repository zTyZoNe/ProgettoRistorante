/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beneventoristorante;

import java.util.*;
/**
 *
 * @author STUDENTE
 */
public class Main
{
    public static void main(String[] args)
    {
        String[] vociMenu=new String[7];
        int sceltaUtente=-1;
        Scanner tastiera=new Scanner(System.in);
        
        Ristorante s1=new Ristorante();
        Prenotazione prenotazione = null;
        int esitoOperazione=0;
        
        
        vociMenu[0]="Esci ";
        vociMenu[1]="Aggiungi prenotazione ";
        vociMenu[2]="Visualizza prenotazione ";
        vociMenu[3]="Rimuovi prenotazione ";
        vociMenu[4]="Visualizza prenotazioni in base al cliente ";
        vociMenu[5]="Visualizza posti prenotati in base alla data ";
        vociMenu[6]="Visualizza prenotazioni in base alla data ";
        
        
        Menu menu= new Menu(vociMenu);
        
        do
        {
            switch(sceltaUtente)
            {
                case 0:
                {
                    System.out.println("L'applicazione verrà terminata");
                    break;
                }
                case 1:
                {
                    prenotazione=new Prenotazione("nome","cognome",5);
                    
                    System.out.println("Nome ---> ");
                    prenotazione.setNome(tastiera.nextLine());
                    System.out.println("Cognome ---> ");
                    prenotazione.setCognome(tastiera.nextLine());
                    System.out.println("Posti occupati ---> ");
                    prenotazione.setPosti(tastiera.nextInt());
                    System.out.println("Premi un tasto per continuare ");
                    tastiera.nextLine();
                    break;
                }
                case 2:
                {
                    System.out.println(prenotazione.toString());
                    System.out.println("Premi un tasto per continuare ");
                    tastiera.nextLine();
                    break;
                }/*
                case 3:
                {
                    s1.rimuoviPrenotazione();
                    System.out.println("OK rimozione effettuata correttamente");
                    System.out.println("Premi un tasto per continuare ");
                    tastiera.nextLine();
                    break;
                }
                case 4:
                {
                    String[] elencoTitoli;
                    String autore;
                    System.out.println("Autore ---> ");
                    autore=tastiera.nextLine();
                    elencoTitoli=s1.elencoTitoliAutore(autore);
                        if (elencoTitoli==null)
                             System.out.println("Nessun libro presente dell'autore "+autore);
                        else
                        {
                             for (int i=0;i<elencoTitoli.length;i++)
                             System.out.println(elencoTitoli[i]);
                        }
                    System.out.println("Premi un tasto per continuare ");
                    tastiera.nextLine();
                    break;
                }
                case 5:
                {
                    System.out.println(s1.toString());
                }
                case 6:
                {
                    try
                    {
                        System.out.println(s1.elencoAlfabeticoLibri());
                    }
                    catch (EccezionePosizioneNonValida e1)
                    {
                        System.out.println(e1.toString());
                    }
                    break;
                }*/
        }while (sceltaUtente!=0);
    }
}
