package week8.aktionsobjekte;

public class TestClass {
    public static void main(String[] args) {
        List myList = new List(new Node(5, new Node(0, new Node("asd", new Node(-3, new Node(0, new Node(11, new Node(3.0, null))))))));
        List myList2 = new List(new Node(5, new Node(5, new Node("asd", new Node(-3, new Node(5, new Node(11, new Node(3.0, null))))))));

        TestClass t = new TestClass();

        t.showContainsZero(myList);
        t.showPosSum(myList);

        System.out.println("--------------");

        t.showContainsZero(myList2);
        t.showPosSum(myList2);
    }

    class ZeroAction implements ActionObject {
        boolean containsZero = false;
        public void action(Node n) {
            if (n.data instanceof Integer && (int)n.data == 0) {
                containsZero = true;
            }
        }
    }
    public void showContainsZero(List list) {
        // hier soll das Aktionsobjekt aus a) verwendet
        // und das Ergebnis ausgegeben werden

        //list.traverseAndApply((Node n) -> {if (n.data instanceof Integer && (int)n.data == 0) System.out.println("Zero found.");});
        //implementation using a lambda function - prints a line for every zero found.

        ActionObject actobj = new ZeroAction();
        list.traverseAndApply(actobj);
        System.out.println("List contains a zero: " + ((ZeroAction)actobj).containsZero);
    }

    class SumAction implements ActionObject {
        private int sum = 0;
        public void action(Node n) {
            if (n.data instanceof Integer && (int)n.data > 0) {
                sum += (int)n.data;
            }
        }
        public int getSum() {
            return sum;
        }
    }

    public void showPosSum(List list) {
        // hier soll das Aktionsobjekt aus b) verwendet
        // und das Ergebnis ausgegeben werden

        ActionObject actobj = new SumAction();
        list.traverseAndApply(actobj);

        System.out.println("Sum of integer elements: " + ((SumAction)actobj).getSum());
    }
}
