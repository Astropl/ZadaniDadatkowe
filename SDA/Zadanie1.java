package SDA;

import java.util.Scanner;

public class Zadanie1 {/*1. Napisz program pobierający od użytkownika dowolny tekst i index znaku, który ma zostać
    wyświetlony
    Przykład:
    Podaj test: test ala test kot test małpa
    Podaj index: 3
    Znak znajdujący się pod indexem nr 3: t*/

    public Zadanie1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("*      Zadanie 1   *");
        System.out.println("********************");
        System.out.println("Podaj jakiś dlugi tekt :");
        String jakisTekst = sc.nextLine();
        System.out.println(" Podaj index na którym mam znalezc znak od 0 do " + jakisTekst.length());
        int numerIndex = sc.nextInt();
        System.out.println("Litera na indexie " + numerIndex + " to " + jakisTekst.charAt(numerIndex));
    }

}
