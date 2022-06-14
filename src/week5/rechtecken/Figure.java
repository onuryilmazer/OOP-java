package week5.rechtecken;

public abstract class Figure {
    protected double xAxis;
    protected double yAxis;

    public Figure() {
        //Standard constructor
        xAxis=0;
        yAxis=0;
    }

    public Figure(double xAxis, double yAxis) {
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }

    public double getxAxis() {
        return xAxis;
    }

    public double getyAxis() {
        return yAxis;
    }

    public void setyAxis(double yAxis) {
        this.yAxis = yAxis;
    }

    public void setxAxis(double xAxis) {
        this.xAxis = xAxis;
    }

    public void printCoordinates() {
        System.out.println("X Axis: " + xAxis + ", Y Axis: " + yAxis);
    }
}
