package lis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class za1 {
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */


	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        //lista 10 imion
	        String[] slowa = {"tomasz", "marta", "kasia", "iza", "sandra","marek",
	        "robert","marcin","beata","asia"};
	        String[] slowaDwa = {"bocian","malpa","kon","tygrys","mewa","slon"};

	         List<String> listaJeden = new ArrayList<>();
	   for (String slowo : slowa)
	            listaJeden.add(slowo);
	    List<String> listaDwa = new ArrayList<>();
	    for (String dwa : slowaDwa)
	        listaDwa.add(dwa);
	        // pierwsze wyswietlenie listy
	        System.out.println(listaJeden);
	       
	        // pobranie 3 pierwszych i 3 ostatnich imion
	        String s = listaJeden.get(2);
	        s = listaJeden.get(1);
	        s = listaJeden.get(2);
	        s = listaJeden.get(7);
	        s = listaJeden.get(8);
	        s = listaJeden.get(9);
	        // wstawienie nowego elementu
	     listaJeden.add(5, "gosc");
	    System.out.println("Nasza lista z nowym elementem:");
	    System.out.println(listaJeden);

	        listaJeden.remove(0);
	        listaJeden.remove(0);
	        listaJeden.remove(0);
	        listaJeden.remove(5);
	        listaJeden.remove(5);
	        listaJeden.remove(5);

	System.out.println("Nasza lista bez 3 pierwszych i ostatnich elementow:");
	  System.out.println(listaJeden);
	System.out.println("nowa tablica wyglada tak :"+"\n"+listaDwa);
	        
	        listaJeden.addAll(listaDwa);
	        
	         System.out.println("skopiowana tablica: ");
	         System.out.println(listaJeden);
	         
	         System.out.println("lista posortowana alfabetycznei rosnaco: ");
	         
	         Collections.sort(listaJeden);
	         System.out.println(listaJeden);
	         
	         System.out.println("lista posortowana alfabetycznei malejaco: ");
	         Collections.reverse(listaJeden);
	         System.out.println(listaJeden);
	    }

	  }
	    
	    
