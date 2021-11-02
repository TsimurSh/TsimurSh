package lesson6;

class MethodOverloading2 {
    int sum (int a1, int a2) {
        return a1 + a2;
    }

    String sum (String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloadin2Test{
    public static void main(String[] args) {
        MethodOverloadin2Test mo2 = new MethodOverloadin2Test();

        int a;
        a = mo2.sum(4, 4);
        System.out.println(a);

        String s = mo2.sum("Kola", "Dima");
        System.out.println(s);
    }
}