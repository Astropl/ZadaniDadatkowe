package SDA;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Zadanie2 {/*2. Napisz program zamienijący wszystkie litery 'd' litreami 'f' w dowolnym ciągu znaków
        (wykorzystaj replaceAll)*/

    public Zadanie2()

    {
        System.out.println("********************");
        System.out.println("*      Zadanie 2   *");
        System.out.println("********************");
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\n\nPodaj ciąg znaków z małej litery\nz duża ilościa liter 'd' \na ja zamnienie wszystkie 'd' na 'f'");
        String jakisWyraz = sc.nextLine();
        //for (int i=0;i <jakisWyraz.length();i++)
        {
            String jakisWyraz1 = jakisWyraz.replace("d", "f");
            System.out.println(jakisWyraz1);
        }


        /*String jakisWyraz1 = jakisWyraz.replaceAll(jakisWyraz,"f");
        System.out.println(jakisWyraz);
        System.out.println(jakisWyraz1);*/

    }


}



