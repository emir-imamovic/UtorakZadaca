package zadaca;
import java.util.Scanner;
public class DrugiZadatak {
	public static void main(String[] args) {
        System.out.println("Koliko penija imas?");
        Scanner unos = new Scanner(System.in);
        int peni = unos.nextInt();
        System.out.println("Koliko frtalja imas?");
        int frtalj = unos.nextInt();
        System.out.println("Koliko niklova imas?");
        int nikl = unos.nextInt();
        System.out.println("Koliko dimova imas?");
        int dim = unos.nextInt();
        double peniji = (peni * 0.01);
        double frtalji = (frtalj * 0.25);
        double niklovi = (nikl * 0.05);
        double dimovi = (dim * 0.10);
        double ukupno = (peniji + frtalji + niklovi + dimovi);
        System.out.println("Imas " + peni + " penija.");
        System.out.println("Imas " + frtalj + " frtalja.");
        System.out.println("Imas " + nikl + " niklova.");
        System.out.println("Imas " + dim + " dimova.");
        System.out.println("Imas " + ukupno + " dolara.");
    }

}
