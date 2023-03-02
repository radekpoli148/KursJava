/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregacja;

public class Agregacja {

    public static void main(String[] args)
    {
        Pracownik p = new Pracownik("Radek", new Adres("Rozbórz Długi", 148));
        
        System.out.println(p);
    }
    
}

class Pracownik
{
    String imie;
    Adres adres;//agregacja - łączenie w jedną zmienną czegoś składającego się z wielu

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() 
    {
        return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
    }
    
    
}

class Adres
{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
    
    
}