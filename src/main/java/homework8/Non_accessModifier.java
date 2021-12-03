package homework8;

public class Non_accessModifier {

    public static final double pi = 3.14;

    double formula (double rad){
        double area = pi*rad*rad;
        return area;
    }
    static double formula1 (double rad1){
        double length = 2*pi*rad1;
        return length;
    }
    double result; void (double rad2){
        System.out.println ("Радиус: " + rad2 + "Длина: " + formula1(rad2) + "Площадь: " + formula(rad2,rad2));
    }




    static int multiply (int a, int b, int c) {
        return a * b * c;
    }
        static void divide (int a, int b){
            System.out.println(a / b);
            System.out.println(a % b);

        }
   protected class Non2 {
        public static void main(String[] args) {
            Non_accessModifier.multiply(1, 3, 6);
            Non_accessModifier.divide(5, 9);
            Non_accessModifier n1 = new Non_accessModifier();

            n1.formula(3.5);
            n1.formula1(3.6);
            n1.result(3.5);
        }
    }
}



