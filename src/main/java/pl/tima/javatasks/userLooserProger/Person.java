package pl.tima.javatasks.userLooserProger;

public interface Person {
    class User implements Person {
        static void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        static void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        static void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        static void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }

}
