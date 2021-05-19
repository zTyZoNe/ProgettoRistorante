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
public class Cliente 
{
    private String nome;
    private String cognome;
    private int posti; 
    
    public Cliente(String nome, String cognome, int posti)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.posti=posti;
    }
    public Cliente(Cliente l)
    {
        nome=l.getNome();
        cognome=l.getCognome();
        posti=l.getPosti();
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        nome=nome;
    }
    public String getCognome()
    {
        return cognome;
    }
    public void setCognome(String cognome)
    {
        cognome=cognome;
    }
    public int getPosti()
    {
        return posti;
    }
    public void setPosti(int posti)
    {
        posti=posti;
    }
    public String toString()
    {
        String s;
        s="Nome: "+getNome()+", Cognome: "+getCognome()+", Posti prenotati: "+getPosti();
        return s;
    }
}
