package SDA;

import java.awt.*;
import java.util.Scanner;

public class Zadanie3 {
    public Zadanie3() {
        /*3. Napisz program zamieniający wszelkie duże litery na małem w podany przez użytkownika ciąg
                znaków
          4. Napisz program zamieniający wszelkie małe litery na duże w podany przez użytkownika ciąg
                znaków
          5. Napisz program usuwający wszystkie białe znaki z podanego przez użytkownika ciągu znaku
          6. Napisz program wyświetlający długość podanego przez użytkownika ciągu znaków*/
        System.out.println("**************************");
        System.out.println("* Zadanie 3 i 4 i 5 i 6  *");
        System.out.println("**************************");

        System.out.println("Podaj długi tekst z amłej litery\n a ja go zamienie na duze litery");
        Scanner sc = new Scanner(System.in);
        String dlugiWyraz = sc.nextLine();
        System.out.println(dlugiWyraz.toUpperCase());
        System.out.println(" A tutaj zaminiam to na male litery");
        System.out.println(dlugiWyraz.toLowerCase());
        System.out.println(" A tutaj usuwam wszystkie białe znaki");
        System.out.println(dlugiWyraz.trim());
    }
}
