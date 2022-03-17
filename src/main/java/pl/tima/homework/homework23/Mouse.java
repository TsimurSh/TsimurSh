package pl.tima.homework.homework23;

public class Mouse extends Animal {

    static String showName(){
        return "Mouse";
    }
    void showInfoMouse() {
        System.out.println("This animal is : " + showName());
    }
}
