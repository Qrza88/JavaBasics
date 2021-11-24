public class Triangle {
    private MyPoint a;
    private MyPoint b;
    private MyPoint c;

    public Triangle(MyPoint a, MyPoint b, MyPoint c) throws Exception {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            throw new Exception("Punkty nie mogą być takie same!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MyPoint getA() {
        return a;
    }

    public MyPoint getB() {
        return b;
    }

    public void setB(MyPoint b) {
        this.b = b;
    }

    public MyPoint getC() {
        return c;
    }

    public void setC(MyPoint c) {
        this.c = c;
    }

    public void setA(MyPoint a) {
        this.a = a;
    }

    public double calculateCircuit(){
        return a.getDistanceTo(b) + b.getDistanceTo(c) + c.getDistanceTo(a);
    }
}
