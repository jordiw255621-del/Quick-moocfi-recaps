class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void shift(double moveX, double moveY) {
        x += moveX;
        y += moveY;
    }

    public void quadrant() {
        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else {
            System.out.println("On an axis");
        }
    }

    public class TestPoint {
        public static void main(String[] args) {
            Point p = new Point(3, 4);
            System.out.println("Original Point: " + p);

            p.quadrant();
            p.shift(2, -5);
            System.out.println("after shifting: " + p);
            p.quadrant();
        }

    }
}
