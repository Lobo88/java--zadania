package lis;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class za3 {

	    public static void main(String[] args) {
	        Scanner odczyt = new Scanner(System.in);
	     //   Integer[] tablica={};
	       Map<Integer, Integer> przedzial = new HashMap<Integer, Integer>();
	       List<Integer> lista = new ArrayList<Integer>();
	        
	        System.out.println("podaj liczbe od 1 do x bedaca przedzialem losowanych liczb:");
	        int liczba= odczyt.nextInt();
	        if (liczba<1){
	            System.out.println("podana z³a liczba");
	             System.exit(0);}
	        
	             System.out.println("podaj iloœc losowañ:");
	             int cyfra = odczyt.nextInt();
	              if (cyfra<1){
	            System.out.println("podana z³a liczba");
	             System.exit(0);} 
	int [] wyniki=new int [cyfra];
	Random losuj = new Random();
	for(int i=0; i<cyfra; i++) {
	    //wyniki[i]=losuj.nextInt(liczba)+1;
	    lista.add(losuj.nextInt(liczba)+1);
	    System.out.print(lista.get(i)+" , ");
	 //  przedzial.put(i+1,losuj.nextInt(liczba)+1);
	}
	System.out.print("\n");
	Collections.sort(lista);
	int [] wynik = new int [cyfra];
	int licznik = 1;

	        for (int i = 1; i < cyfra; i++) { //Zliczanie wyst¹pieñ
	            if (lista.get(i) == lista.get(i-1)) {
	                licznik = licznik + 1;
	            } else {
	                wynik [i-1] = licznik;
	                licznik = 1;
	            }
	        }
	        wynik [cyfra - 1] = licznik;
	 
	        for (int i = 0; i < cyfra; i++) { //Wyœwietlanie
	            if (wynik [i] > 0) {
	                przedzial.put(lista.get(i),wynik[i]);
	                System.out.println(lista.get(i)+" jest "+wynik [i]);
	            }
	        }

	System.out.println("losowa liczba = wystapila  ");
	System.out.println(przedzial);

	 System.out.println("Iterowanie po kluczach i wartosciach");
	for(   Map.Entry<Integer, Integer> entry : przedzial.entrySet()) {
	    Integer key = entry.getKey();
	    Integer value = entry.getValue();
	    System.out.println("liczba "+key + "   wystapila :  " + value+"  razy");}

	    }
	    
	}
