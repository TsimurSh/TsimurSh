package pl.tima.lesson.lesson_26_OverrideEqualsToString;

public class Test {
    String color;
    String model;

    public Test(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public static void main(String[] args) {
        Test test1 = new Test("Green", "PTTR");
        Test test3 = new Test("Green", "PMMM");
        Test test2 = new Test("Green", "POMM");
        System.out.println(test2.toString(test3));
        System.out.println();
    }
    public  String toString(Object o) {
    return "Объект Test имеет поля: " + this.color +" и " + this.model;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Test) {
            Test test = (Test) o;
            if (o == null || getClass() != o.getClass()) return false;
            return color.equals(test.color) && model.equals(test.model);
        }
        return false;
    }
}
