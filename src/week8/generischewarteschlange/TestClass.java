package week8.generischewarteschlange;

public class TestClass {
    public static void main(String[] args) {
        Wschlange queue1 = new Wschlange(1,"a",3.0,2,3);
        queue1.enqueue("text");
        queue1.enqueue(1234);
        while (!queue1.isEmpty()) {
            System.out.println(queue1.dequeue().toString());
        }

        System.out.println("---------");

        Schlange<Double> queue2 = new Schlange<Double>(1.0,2.0,3.0);
        queue2.enqueue(3.14);
        queue2.enqueue(10.0);
        while (!queue2.isEmpty()) {
            System.out.println(queue2.dequeue().toString());
        }

        System.out.println("---------");

        Schlange<String> queue3 = new Schlange<String>("j","en","a");
        queue3.enqueue("f");
        queue3.enqueue("su");
        while (!queue3.isEmpty()) {
            System.out.println(queue3.dequeue().toString());
        }
    }
}
