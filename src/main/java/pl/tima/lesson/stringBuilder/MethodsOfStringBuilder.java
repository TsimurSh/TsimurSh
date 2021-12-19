package pl.tima.lesson.stringBuilder;

public class MethodsOfStringBuilder {


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("This hotel also has a laundry services");
            sb1.append(22);
                System.out.println(sb1);

        sb1.replace(0,4,"That");
            System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("There are electric fires and radiators in every room");
            String s1 = new String(sb2);
                System.out.println(s1);
        StringBuffer sb3 = new StringBuffer(s1);
        StringBuffer sb4 = new StringBuffer(s1);
        System.out.println(sb3 + " or " +sb4);

    }
}
