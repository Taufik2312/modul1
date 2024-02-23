import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Taufiq {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nama: ");
        String name = input.nextLine();

        System.out.print("jenis kelamin (L/P): ");
        String gender = input.nextLine();

        System.out.print("%n tanggal lahir(yyyy-mm-dd): ");
        String doblnput = input.nextLine();
        LocalDate dob = LocalDate.parse(doblnput);

        LocalDate now = LocalDate.now();
        Period period = Period.between(dob,now);

        System.out.println(" ");

        System.out.println("nama: " + name);
        System.out.print("jenis kelamin :");
        if (gender.equalsIgnoreCase("L")) {
            System.out.print("laki-laki");

        }   else if (gender.equalsIgnoreCase("P")){
            System.out.print("perempuan");
        }
        System.out.println();
        System.out.println("umur anda :" + period.getYears() + " Tahun " + period.getMonths() + " Bulan ");

        input.close();
    }
}
