package homework6;

public class OverloadingHW {

    int sum (int a){
            return a++;
    }
    int sum (int a, int b){
            return a + b;
    }
    int sum (int a, int b, int c){
            return a+b+c;
    }
    int sum (int a, int b, int c, int d){
            return a+b+c+d;
    }


    public static void main(String[] args) {
        OverloadingHW ov = new OverloadingHW();
        ov.sum(5,50);
        System.out.println(ov);
    }
}
