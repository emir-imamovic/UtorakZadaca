package zadaca;
import java.util.Scanner;
public class CetvrtiZadatak {
	  public static void main(String[] args) {
	        System.out.println("Unesite vase ime i prezime sa razmakom izmedju!");
	        Scanner unos = new Scanner(System.in);
	        String unosImena = unos.nextLine();
	        int razmak = unosImena.trim().indexOf(' ');
	        
	            String ime = unosImena.substring(0, razmak);
	            System.out.println("Vase ime je: " + ime);
	            String prezime = unosImena.substring(razmak + 1, unosImena.length());
	        System.out.println("Vase prezime je: " + prezime);
	        String inicijali = ime.substring(0, 1) + prezime.substring(0, 1);
	        System.out.println("Vasi inicijali su: " + inicijali);
	        System.out.println("Hvala na paznji i dovidjenja!");
	    }
}
