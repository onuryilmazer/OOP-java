package week7.abstraktesrechteck;

import org.w3c.dom.css.Rect;

public class Rectangle implements MoveableGO, ResizeableGO {
    private float x;
    private float y;
    private float width;
    private float height;
    private int color;

    boolean shown;

    Rectangle(float x, float y, float width, float height, int color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        shown = false;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void show() {
        if(!shown) {
            shown = true;
            System.out.println("Rectangle is being shown.");
        }
        else {
            System.out.println("Rectangle is already being shown.");
        }
    }

    public void hide() {
        if (shown) {
            shown = false;
            System.out.println("Rectangle has been hidden.");
        }
        else {
            System.out.println("Rectangle is already hidden.");
        }
    }

    public void move(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void resize(float factor) {
        width *= factor;
        height *= factor;
    }

    public static void resizeAll(float r, ResizeableGO rgo[]) {
        for (ResizeableGO g : rgo) g.resize(r);
    }
    public static void moveAll(float dx, float dy, MoveableGO mgo[]) {
        for (MoveableGO m : mgo) m.move(dx, dy);
    }

    public static void printAll(Rectangle[] rects) {
        for (Rectangle r : rects) System.out.println(r);
    }

    @Override
    public String toString() {
        return ("X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height + ", Color: " + color);
    }

    public static void main(String[] args) {
        Rectangle rects[] =  {new Rectangle(1,1,1,1,1), new Rectangle(10,10,10,10,2), new Rectangle(5,5,5,5,3)};

        Rectangle.printAll(rects);
        System.out.println("-------------");

        Rectangle.resizeAll(2, rects);
        Rectangle.printAll(rects);
        System.out.println("-------------");

        Rectangle.moveAll(3,3,rects);
        Rectangle.printAll(rects);

    }
}
