interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    public void work() {
        System.out.println("Chef is cooking.");
    }

    public double getSalary() {
        return 30000.00;
    }
}

class Waiter implements Employee {
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    public double getSalary() {
        return 15000.00;
    }
}

public class No7 {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        chef.work();
        System.out.println("Chef salary: " + chef.getSalary());
        waiter.work();
        System.out.println("Waiter salary: " + waiter.getSalary());
    }
}
