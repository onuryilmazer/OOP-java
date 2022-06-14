package week5.rechtecken;

public class Rectangle extends Figure implements IMobileObject {
    protected double width;
    protected double height;

    public enum RelativePosition {SAME, CONTAINED, CONTAINS, DISJOINT, ALIGNED, OVERLAPPING, UNDEFINED};  //static by default.

    public Rectangle() {
        super(); //redundant, as the compiler implicitly calls the default constructor of the base class.
        width = 0;
        height = 0;
    }

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        if (width<0) {
            System.out.println("Width can't be negative.");
            width=0;
        }
        if (height<0) {
            System.out.println("Height can't be negative.");
            height=0;
        }
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void printCoordinates() {
        super.printCoordinates();
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public void move(double x, double y) {
        setxAxis(x);
        setyAxis(y);
    }

    public void increase(double scalingFactor) {
        if (scalingFactor<1) {
            System.out.println("Stretching the size by a factor smaller than 1 isn't supported. You may use the decrease method for this behavior.");
            return;
        }

        double newWidth = getWidth() * scalingFactor;
        double newHeight = getHeight() * scalingFactor;

        width = newWidth;
        height = newHeight;
    }

    public void decrease(double scalingFactor) {
        if (scalingFactor<1) {
            System.out.println("Shrinking the size by a factor smaller than 1 isn't supported. You may use the increase method for this behavior.");
            return;
        }

        double newWidth = getWidth() / scalingFactor;
        double newHeight = getHeight() / scalingFactor;

        width = newWidth;
        height = newHeight;
    }

    public RelativePosition relativePosition(Rectangle rectangle) {
        double thisLeft = this.getxAxis();
        double thisRight = this.getxAxis()+this.getWidth();
        double thisBottom = this.getyAxis();
        double thisTop = this.getyAxis()+this.getHeight();

        double otherLeft = rectangle.getxAxis();
        double otherRight = rectangle.getxAxis()+rectangle.getWidth();
        double otherBottom = rectangle.getyAxis();
        double otherTop = rectangle.getyAxis()+rectangle.getHeight();

        if (this.equals(rectangle)) {
            System.out.println(RelativePosition.SAME.name());
            return RelativePosition.SAME;
        }
        else if (thisLeft >= otherLeft && thisBottom >= otherBottom && thisRight <= otherRight && thisTop <= otherTop) {  //case where all values are equal is covered above
            return RelativePosition.CONTAINED;
        }
        else if (otherLeft >= thisLeft && otherBottom >= thisBottom && otherRight <= thisRight && otherTop <= thisTop) {  //case where all values are equal is covered above
            return RelativePosition.CONTAINS;
        }
        else if (thisLeft > otherRight || thisRight < otherLeft || thisBottom > otherTop || thisTop < otherBottom) {  //only remaining possibilities: aligned or overlapping.
            return RelativePosition.DISJOINT;
        }
        else if (thisLeft == otherRight || thisRight == otherLeft || thisBottom == otherTop || thisTop == otherBottom) {
            return RelativePosition.ALIGNED;
        }
        else {
            return RelativePosition.OVERLAPPING;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        if (this.getxAxis() != other.getxAxis()) {
            return false;
        }
        if (this.getyAxis() != other.getyAxis()) {
            return false;
        }
        if (this.getWidth() != other.getWidth()) {
            return false;
        }
        if (this.getHeight() != other.getHeight()) {
            return false;
        }

        return true;
    }
}
