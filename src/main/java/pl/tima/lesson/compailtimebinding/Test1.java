package pl.tima.lesson.compailtimebinding;

public class Test1 {
    void abc() {
        try {
            def();
            return;
        } finally {
            System.out.println("finally");
        }
    }

    void def() {
        System.out.println("def");
        throw new StackOverflowError();
    }

    public static void main(String args[]) {
        Test1 t = new Test1();
        t.abc();
    }
}