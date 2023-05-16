import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Opis: Klasa ta podaje argumenty obliczeniowe do klasy kalkulacyjnej
 * @author: Mateusa Maniak
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RownanieKwadratowe> rownanieKwadratowe = new ArrayList<>();
        RownanieKwadratowe obj1 = new RownanieKwadratowe(1,2,3);

        for(int i = 1;i<5;i++){
            System.out.println("Obiekt " + i);

            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.print("c: ");
            double c = scanner.nextDouble();

            rownanieKwadratowe.add(new RownanieKwadratowe(a, b, c));
        }

        for(RownanieKwadratowe x : rownanieKwadratowe){
            System.out.println(x.toString());
        }

        int lenTab = rownanieKwadratowe.size() - 1;
        System.out.println("OSTATNI ELEMENT KOLEKCJI: "+rownanieKwadratowe.get(lenTab).toString());

        double rownanie = rownanieKwadratowe.get(0).getA() + rownanieKwadratowe.get(0).getB() + rownanieKwadratowe.get(0).getC();
        Function<Double, Boolean> parz = (Double x) -> x%2 == 0;
        System.out.println(parz.apply(rownanie));

    }
}