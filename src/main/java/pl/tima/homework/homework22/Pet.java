package pl.tima.homework.homework22;

 class Pet extends Animal {
    Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    protected int tail = 1;
    protected int paw = 4;

    public void jump (){
        System.out.println("Pet jumps");
    }
    public void run (){
        System.out.println("Pet runs");
    }
}
