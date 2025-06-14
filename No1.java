abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly, they swim instead.");
    }
}

public class No1 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();
        penguin.fly();
    }
}
