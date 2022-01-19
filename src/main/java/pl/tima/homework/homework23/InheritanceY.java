package pl.tima.homework.homework23;

import pl.tima.facultativ.repository.InheritanceX;

public class InheritanceY extends InheritanceX {

    InheritanceY () {}

    @Override
    public void xy() {
        System.out.println("Y");
    }
    public void ui (){
        InheritanceY y = new InheritanceY();
        y.xy();
    }
    public void yx (){
        InheritanceX x = new InheritanceY();
        x.xy();
    }


    public static void main(String[] args) {
        InheritanceY y = new InheritanceY();
        y.xy();
        y.ui();
        y.yx();
    }
}
