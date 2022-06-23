package week6.bindung;

public class TestBindung {
    public static void main(String[] args) {
        TestBindung t = new TestBindung();

        A a = new A();
        B b = new B();
        C c = new C();
        //t.add(1.0, 2.0);        // Aufruf 1  //----, Keine passende Signatur (Für Methode 2 müsste das double 2.0 explizit zu Long konvertiert werden).
        t.add(1, 2);        // Aufruf 2  //Method1, 1 wird implizit zu long konvertiert.
        t.add(2, 1L);       // Aufruf 3  //Method2, 2 wird implizit zu double und 1L zu float konvertiert.
        t.print(c, c);            // Aufruf 4  //Method3, das erste Argument wird implizit zu Typ B konvertiert. Das ist möglich, da C von B vererbt ist.
        t.print(a, c);            // Aufruf 5  //Method4, nicht Method3, weil A kann nicht implizit zu B konvertiert werden.
        t.print(c, b);            // Aufruf 6  //Method4, C ist A, B ist B (laut Polymorphie).
        //t.print(b, a);          // Aufruf 7  //----, Keine passende Signatur. Das 2te Argument ist "zu groß" für alle definierten Methoden.


        //Teil 2
        Print1 p1 = new Print1();
        Print2 p2 = new Print2();
        p1 = p2;
        System.out.println(p1.x);   // Aufruf 1 //1. Statisches Binden - Java erlaubt Polymorphism mit Fields nicht.
        p1.print(c);                // Aufruf 2 //4. Dynamisches Binden - überschreibende print-Method von Klasse Print2 mit derselben Signatur (i.e. print(B b) ) wird aufgerufen, und die Variable x ist im Gültigkeitsbereich von Print2 überdeckt.
        ((Print2)p1).print(c);      // Aufruf 3 //5. print-Method von Klasse Print2 mit der passenden Signatur print(C c) wird aufgerufen, und int Feld x ist in der Klasse Print2 mit x=3 überdeckt.
        ((Print1)p2).print(b);      // Aufruf 4 //4. Dynamisches Binden - Print2::print(B b) wird aufgerufen.
        ((Print1)p2).print(c);      // Aufruf 5 //4. Dynamisches Binden - Print2::print(B b) wird aufgerufen (Signatur wird vor dem dynamischen Binden festgelegt, daher nicht Print2::print(C c) ).
        p2.print(c);                // Aufruf 6 //5.
        p1 = new Print1();
        //((Print2)p1).print(a);      // Aufruf 7 //Fehlermeldung. (p1 instanceof Print2) ist False, daher "downcasting" (Typumwandlung zur oberen Klasse) mittels cast-Operator ist unmöglich.
    }

    int add(long a, int b) {System.out.println("Method1"); return 0;} // Methode 1
    int add(double a, float b) {System.out.println("Method2"); return 0;} // Methode 2
    void print(B b, C c) {System.out.println("Method3");} // Methode 3
    void print(A a, B b) {System.out.println("Method4");} // Methode 4
}

class A {

}

class B extends A {

}

class C extends B {

}

class Print1 {
    int x = 1;
    public void print(A a) { System.out.println(x); System.out.println("Print1.print(A a)");}
    public void print(B b) { System.out.println(x+1); System.out.println("Print1.print(B b)");}
}

class Print2 extends Print1 {
    int x = 3;
    public void print(A a) { System.out.println(x); System.out.println("Print2.print(A a)");}
    public void print(B b) { System.out.println(x+1); System.out.println("Print2.print(B b)");}
    public void print(C c) { System.out.println(x+2); System.out.println("Print2.print(C c)");}
}
