package pl.tima.lesson.lesson5_ClassesAndMethods;

public class Cat {
    public static void main(String[] args) {
        Cats cats1 = new Cats("Barsik", 3, 4, 7);
        Cats cats2 = new Cats("Busia", 2, 3, 5);
        Cats cats3 = new Cats("Kuzia", 5, 4, 6);
        System.out.println(cats1.fight(cats2));
        System.out.println(cats1.fight(cats3));
    }

    public static class Cats {
        private String name;
        private int weight;
        private int age;
        private int strength;

        public Cats(String name, int age, int weigth, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight1(Cats anotherCats) {
            if (anotherCats.age == this.age) {
                return false;
            }
            if (anotherCats.strength > this.strength && anotherCats.weight > this.weight && anotherCats.age > this.age) {
                return true;
            }
            if (anotherCats.strength <= this.strength && anotherCats.weight <= this.weight && anotherCats.age < this.age)
                ;
            return false;
        }

        public boolean fight(Cats anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}