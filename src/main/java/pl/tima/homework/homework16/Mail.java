package pl.tima.homework.homework16;

public class Mail {
    public static void main(String[] args) {
        mail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }




    static void mail (String s){
       if (s.contains("yahoo.com;")){
        System.out.println("yahoo");
       }
       if (s.contains("gmail.com;")){
            System.out.println("gmail");
        }
       if (s.contains("mail.ru;")) {
           System.out.println("mail");
       }
       else {
           System.err.println("Такой почты мы не регистрируем");
       }
    }
    static void email (String s){
        int x = 0;
        int y = 0;
        int z = 0;
        while (z<s.length()-1){
            x = s.indexOf('@', z);
            y = s.indexOf('.', z);
            z = s.indexOf(';', z + 1);
            System.out.println(s.substring(x + 1, y));
        }
    }
}
