package q1;

public class tester {

    public static void main(String[] args) {

        worker worker1 = new worker("Ichigo", 5000);
       worker worker2 = new worker("Rubi", 6000);
       worker worker3 = new worker("Bakhira", 5000);
        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);

        supervisor supervisor1 = new supervisor("Shikamaru", 70000, "IT");
        System.out.println(supervisor1);

        director director1 = new director("Naruto", 100000, "CSE");
        System.out.println(director1);
    }
}
