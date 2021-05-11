package lis;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class za5 {
	
	public class Osoba implements Comparable<Osoba> {
	    private Long pesel;
	    private String imie;
	    private String nazwisko;
	    private Integer wiek;
	    private String adres;
	    private Integer priorytet;

	    public Osoba(Long pesel, String imie, String nazwisko, Integer wiek, String adres, Integer priorytet) {
	        this.pesel = pesel;
	        this.imie = imie;
	        this.nazwisko = nazwisko;
	        this.wiek = wiek;
	        this.adres = adres;
	        this.priorytet = priorytet;
	    }

	    @Override
	    public String toString() {
	        return "Osoba{" +
	                "pesel=" + pesel +
	                ", imie='" + imie + '\'' +
	                ", nazwisko='" + nazwisko + '\'' +
	                ", wiek=" + wiek +
	                ", adres='" + adres + '\'' +
	                ", priorytet=" + priorytet +'}'  +"\n";
	    }

	 //   public boolean equals(Osoba o) {
	     //   return this.getPriorytet()== o.getPriorytet();}
	 
	  //  public int compareTo(Osoba o) {//priorytet 1 najwiekszy, 6 mniejszy
	   //     if (this.equals(o))
	    //        return 0;
	    //    else if (getPriorytet() < o.getPriorytet())
	   //     return -1;
	    //    else 
	    //        return 1;}
	   
	    @Override
	    public int compareTo(Osoba o) {
	        if (priorytet != null && o.priorytet != null)
	            return priorytet.compareTo(o.priorytet);
	        return 0;
	    }

	    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Osoba osoba = (Osoba) o;

	        return pesel != null ? pesel.equals(osoba.pesel) : osoba.pesel == null;
	    }

	    @Override
	    public int hashCode() {
	        return pesel != null ? pesel.hashCode() : 0;
	    }

	    public void setPriorytet(Integer priorytet) {
	        this.priorytet = priorytet;
	    }
	public int getPriorytet(){
	    return priorytet;
	}
	    public Long getPesel() {
	        return pesel;
	    }

	    public String getImie() {
	        return imie;
	    }

	    public String getNazwisko() {
	        return nazwisko;
	    }

	    public Integer getWiek() {
	        return wiek;
	    }

	    public String getAdres() {
	        return adres;
	    }


	     public static void main(String[] args) {
	         PriorityQueue<Osoba> rejestr = new PriorityQueue<Osoba>();
	         PriorityQueue<Osoba> sortowanie = new PriorityQueue<Osoba>();
	         Scanner odczyt = new Scanner(System.in);
	         Scanner wpisz = new Scanner(System.in);
	Osoba m=new Osoba(88065353454L,"Tomasz","Gaworz",29,"Strzemska 8 Wroc³aw",12);
	Osoba n=new Osoba(91005614090L,"Adam","Marc",22,"Milowa 35 Wroc³aw",10);
	Osoba o=new Osoba(88022614090L,"Ada","Wilc",25,"Astralna 8 Wroc³aw",2);
	Osoba p=new Osoba(95022612340L,"Majka","Dwan",35,"pomska 5 Mirkow",25);
	Osoba r=new Osoba(80022641241L,"Alicja","Kwarc",17,"Wagonów 4 Wroc³aw",8);
	Osoba s=new Osoba(90022623400L,"Michal","Urban",42,"Bazia 38 Legnica",21);

	         rejestr.add(m);
	         rejestr.add(n);
	         rejestr.add(o);
	         rejestr.add(p);
	         rejestr.add(r);
	         rejestr.add(s);
	         
	         System.out.println("Cala lista:");
	       System.out.println(rejestr.toString());
	       // while (!rejestr.isEmpty())
	      //      System.out.println(rejestr.poll());
	         



	boolean program = true;
	        while(program){
	         //   program=false;
	        
	         System.out.println("\n"+"\n"+"witaj pracowniku, Ktora opcje wybierasz: "+"\n"
	        + "1. Zarejestrój nowego u¿ytkowanika."+"\n"+"2.Wywo³aj pierwsza osobe"
	        + " czekajaca w kolejce"+"\n"+"3.Podejrzyj zawartosc listy osob"+"\n"+
	                 "4.Podejrzyj liste osob o najwy¿szym priorytecie");
	int wybor= odczyt.nextInt();
	//switch(wybor){
	//case 1: }
	if (wybor==1){//zarejestroj
	    //String [] a = new String[6];
	   System.out.println("Podaj pesel");
	    String Pesel=wpisz.nextLine();
	    long number = Long.valueOf(Pesel);
	    //a[0] = Pesel;
	     System.out.println("Podaj imie");
	    String Imie=wpisz.nextLine();
	    ///a[1]=Imie;

	    System.out.println("Podaj nazwisko");
	String Nazwisko=wpisz.nextLine();
	   // a[2] = Nazwisko;
	    System.out.println("Podaj wiek");
	String Wiek=wpisz.nextLine();
	int lata = Integer.parseInt(Wiek);
	    //a[3] = Wiek;
	    System.out.println("Podaj adres");
	String Adres=wpisz.nextLine();
	   // a[4] = Adres;
	    System.out.println("Podaj priorytet");
	String Priorytet=wpisz.nextLine();
	int flaga = Integer.parseInt(Priorytet);
	Osoba z=new Osoba(number,Imie,Nazwisko,lata,Adres,flaga);
	rejestr.add(z);
	}
	else
	   
	   if(wybor==2){//wywolaj
	       Osoba b=rejestr.peek();
	    System.out.println("obraz dla pacjenta:"+"\n"+"zapraszamy do "
	 + "gabinetu pierwszego w kolejce pana/pania:"+"\n"+b.imie+" "+b.nazwisko); 
	System.out.println("obraz dla pracownika:"+"\n"+"Usunieto osobe z kolejki: "+
	        "\n"+rejestr.poll());

	   }
	    else 

	       if (wybor==3){
	            System.out.println("Cala lista:");
	      Iterator<Osoba> iterator = rejestr.iterator();
	      while (iterator.hasNext()) {
	            System.out.print(iterator.next());
	        }
	}
	else
	           if (wybor==4){
	               System.out.println("lista wg najwy¿szego priorytetu(od 1 najwyzej"
	                       + " do np 100 najmniejszy)");
	               sortowanie.addAll(rejestr);
	               while (!sortowanie.isEmpty())
	           System.out.print(sortowanie.poll());
	           }
	else
	      break;
	        program=true;}
	}
	}}