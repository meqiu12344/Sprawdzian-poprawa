import java.util.Objects;

/**
 * Opis: Klasa ta jest to klasa obliczeniowa. Zachodzą tutaj wszystkie obliczenia dodtyczące delty.
 *      Sprzadza ona czy delta jest ujemna/dodatnie czy rowna zero
 * Pola:
 *   a : double, przechowuje wartosc a
 *   b : double, przechowuje warotsc b
 *   c : double, przechowuje wartosc c
 */

public class RownanieKwadratowe {
    private final double a;
    private final double b;
    private final double c;

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] oblicz_pierwiastki(double a, double b, double c){
        double delta =  (b*b) - (4*a*c);

        if(delta < 0){
            return new double[0];
        } else if(delta == 0){
            return new double[]{-b / (2 * a)};
        }else if(delta > 0){
            double ret1 = (-b + Math.sqrt(delta) / (2*a));
            double ret2 = (-b - Math.sqrt(delta) / (2*a));

            return new double[]{ret1, ret2};
        }

        return new double[0];
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RownanieKwadratowe that = (RownanieKwadratowe) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "("+a+"x^2 + "+b+"x + "+c+")";
    }
}
