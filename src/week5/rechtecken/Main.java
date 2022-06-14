package week5.rechtecken;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];

        rectangles[0] = new Rectangle(1,5,2,2);
        rectangles[1] = new Rectangle(4,5,2,2); //disjoint.
        System.out.println(rectangles[0].relativePosition(rectangles[1]));
        System.out.println(rectangles[1].relativePosition(rectangles[0]));

        rectangles[2] = new Rectangle(1,1,2,2);
        rectangles[3] = new Rectangle(3,1,2,2); //aligned.
        System.out.println(rectangles[2].relativePosition(rectangles[3]));
        System.out.println(rectangles[3].relativePosition(rectangles[2]));

        rectangles[4] = new Rectangle(1,1,2,2);
        rectangles[5] = new Rectangle(3,4,2,2); //disjoint (NOT aligned).
        System.out.println(rectangles[4].relativePosition(rectangles[5]));
        System.out.println(rectangles[5].relativePosition(rectangles[4]));

        rectangles[6] = new Rectangle(1,1,4,4);
        rectangles[7] = new Rectangle(2,2,1,1); //contained (6 contains 7 - 7 contained by 6)
        System.out.println(rectangles[6].relativePosition(rectangles[7]));
        System.out.println(rectangles[7].relativePosition(rectangles[6]));

        System.out.println("-----------------------------");
        System.out.println(rectangles[2].relativePosition(rectangles[3]));
        rectangles[2].increase(5);
        System.out.println(rectangles[2].relativePosition(rectangles[3]));  //"contains" after stretching.
        rectangles[2].decrease(10);
        System.out.println(rectangles[2].relativePosition(rectangles[3])); //"disjoint" after shrinking.

        System.out.println("------------------------------");
        rectangles[7].printCoordinates();
        rectangles[7].move(10,20);
        rectangles[7].printCoordinates();

    }
}
