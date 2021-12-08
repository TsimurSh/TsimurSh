package pl.tima.homework.homework6;

class OverloadingHW {

    int sum (){
      int  result = 0;
        System.out.println("Сумма равна: " + result);
            return result;
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
        System.out.println("Сумма: " + ov);
        ov.sum(0);
        System.out.println("Сумма: " + ov);
        ov.sum(7,8,11);
        System.out.println("Сумма: " + ov);
        ov.sum(5,7,1,3);
        System.out.println("Сумма: " + ov);
    }
}
