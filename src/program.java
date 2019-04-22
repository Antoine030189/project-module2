import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "a: Examenoverzicht";
        String b = "b: Studentenoverzicht";
        String c = "c: Inschrijven student";
        String d = "d: Student verwijderen";
        String e = "e: Statistieken overzicht";
        String f = "f: Is student geslaagd ?";
        String g = "g: Welke examens zijn behaald door student ?";
        String h = "h: Welke student is voor de meeste examens geslaagd ?";
        String quit = " Quit";

        System.out.println("Keuzemenu ");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(quit);
        System.out.print("Voer je keuze in: ");

        String input = scanner.nextLine();



    }
}
