package lessone8;

public class Finalnonaccess {

    public final int a;

    public Finalnonaccess() {
        a=15;
    }

    public Finalnonaccess(boolean b) {
        a = 10;
    }

    /*int wdwa ();
    wdwa = a*2; // нельзя менять при final non-access modifier
    return wdwa;*/

}

public class Human {

    String name = "Alex";
    short age = 46;
       final Finalnonaccess f = new Finalnonaccess();
    public static void main(String[] args) {
        Human h = new Human();
        h.f = new Finalnonaccess(); // новый обьект с новым адресом не создастся если будет non-acc "final"

    }
}