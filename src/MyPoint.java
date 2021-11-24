public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public MyPoint( double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(MyPoint point){
        return this.x == point.x && this.y == point.y;
    }

    public double getDistanceTo(MyPoint point){
        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));

    }
}


