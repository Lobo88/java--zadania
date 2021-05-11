package lis;
import java.util.ArrayDeque;

	public class Osoba implements Comparable<Osoba> {
	    private Long pesel;
	    private String imie;
	    private String nazwisko;
	    private Integer wiek;
	    private String adres;
	    private Integer priorytet;

	    public za4(Long pesel, String imie, String nazwisko, Integer wiek, String adres, Integer priorytet) {
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
	                ", nazwisko='" + nazwisko + '\'' + + wiek +
	                ", adres='" + adres + '\'' +
	                ", priorytet=" + priorytet +
	                  ",wiek="+wiek;
	               
	    }

	   
	    public int compareTo(Osoba o) {
	        if (priorytet != null && o.priorytet != null)
	            return priorytet.compareTo(o.priorytet);
	        return 0;
	    }

	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Osoba osoba = (Osoba) o;

	        return pesel != null ? pesel.equals(osoba.pesel) : osoba.pesel == null;
	    }

	   
	    public int hashCode() {
	        return pesel != null ? pesel.hashCode() : 0;
	    }

	    public void setPriorytet(Integer priorytet) {
	        this.priorytet = priorytet;
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

	    public Integer getPriorytet() {
	        return priorytet;
	    }
	     public static void main(String[] args) {
	//Long pesel, Str imie, Str nazwisko, Inte wiek, String adres, Integ priorytet)
	Osoba m=new Osoba(88022614090L,"Tomasz","Gancarz",29,"Strzegomska 28 Wroc³aw",12);
	Osoba n=new Osoba(91005614090L,"Adam","Marc",22,"Milowa 35 Wroc³aw",10);
	Osoba o=new Osoba(88022614090L,"Ada","Wilc",25,"Astralna 8 Wroc³aw",20);
	Osoba p=new Osoba(95022612340L,"Majka","Dwan",35,"pomska 5 Mirkow",2);
	Osoba r=new Osoba(80022641241L,"Alicja","Kwarc",17,"Wagonów 4 Wroc³aw",8);
	Osoba s=new Osoba(90022623400L,"Michal","Urban",42,"Bazia 38 Legnica",21);
	     System.out.println(m.getAdres());
	      ArrayDeque<String> rejestr= new ArrayDeque<String>();
	        ArrayDeque<String> lista= new ArrayDeque<String>();
	         rejestr.add(m.getImie());    
	         rejestr.add(n.getImie());
	         rejestr.add(o.getImie());
	         rejestr.add(p.getImie());
	         rejestr.add(r.getImie());
	         rejestr.add(s.getImie());
	         
	         System.out.println(rejestr);
	         
	         char znak='A';
	        
	         String wynik =null;
	                 int b = 0;
	                 
	      while (!rejestr.isEmpty()){
	          
	            wynik = rejestr.peek();
	                    b=wynik.indexOf(znak );  
	                 if (b==-1)
	                    {lista.add(wynik);
	                  rejestr.remove(wynik);}
	                 else rejestr.remove(wynik);

	      }
	                
	      
	        System.out.println(b);
	          System.out.println(rejestr.pollFirst());
	           System.out.println("rejestr"+rejestr);
	           System.out.println("lista"+lista);
	          System.out.println();
	     }}

