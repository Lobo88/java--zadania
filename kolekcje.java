package lis;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import static java.util.Spliterators.iterator;
public class za2 {
	

	    public static void main(String[] args) {
	   String[] liczby = {"1","13","7","29","48","15"};
	   String[] liczby2 = {"10","12","13","22","50","48","68","72"};
	    Set<String> zbior1 = new HashSet<>(Arrays.asList(liczby));
	    Set<String> zbior2 = new HashSet<>(Arrays.asList(liczby2));
	    
	    System.out.println("zbior pierwszy ma postac: ");
	    System.out.println(zbior1);
	    System.out.println("zbior drugi  ma postac: ");
	        System.out.println(zbior2);
	    System.out.println("ilosc elementow pierwszego zbioru pokrywajaca sie w drugim: ");
	      Iterator<String> iterator = zbior1.iterator();
	      Iterator<String> iterator2 = zbior2.iterator();
	        while (iterator.hasNext()) {
	            
	            // pobranie nastepnego elemntu
	            System.out.print(iterator.next()+"    ");
	        System.out.println(iterator2.next());}
	        
	        
	       
	        int rozmiar = zbior1.size();
	        int rozmiar2 = zbior2.size();
	System.out.println("zbior pierwszy posiada: "+rozmiar+" elementow"+"\n"+
	        "zbior drugi: "+rozmiar2+" elementow");

	    System.out.println("czeœæ wspolna zbiorow:");
	zbior1.retainAll(zbior2);
	   System.out.println(zbior1);
	zbior1.clear();
	zbior1 = new HashSet<>(Arrays.asList(liczby));

	  System.out.println("od zbioru pierwszego odejmujemy drugi:");
	  zbior1.removeAll(zbior2);
	  System.out.println(zbior1);
	  zbior1.clear();
	zbior1 = new HashSet<>(Arrays.asList(liczby));

	  System.out.println("od zbioru drugiego odejmujemy pierwszy:");
	  zbior2.removeAll(zbior1);
	  System.out.println(zbior2);
	    zbior2.clear();
	zbior2 = new HashSet<>(Arrays.asList(liczby2));
	 
	  System.out.println("suma zbiorów: ");
	  zbior1.addAll(Arrays.asList(liczby2));
	   System.out.println(zbior1);
	   zbior1.clear();
	zbior1 = new HashSet<>(Arrays.asList(liczby));


	  System.out.println("dopelnienie zbiorów: ");
	Set<String> zbior3 = new HashSet<>(Arrays.asList(liczby));
	zbior1.retainAll(zbior2);
	zbior3.addAll(Arrays.asList(liczby2));
	zbior3.removeAll(zbior1);
	  System.out.println(zbior3);
	    }}

