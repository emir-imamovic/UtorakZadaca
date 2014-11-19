package zadaca;
import java.util.Scanner;
public class TreciZadatak {
	 public static void main(String[] args) {
	        System.out.println("Koliko komada jaja imate?");
	        Scanner unos = new Scanner(System.in);
	        int brojJaja = unos.nextInt();
	        int dozen = brojJaja / 12;
	        int gros = brojJaja / 144;
	        int ostatak = brojJaja % 12;
	        System.out.print("Imate " + dozen + " dozen-a, " + gros + "gros-eva i jos "
	                + ostatak + " jaja.");
	    }
}
