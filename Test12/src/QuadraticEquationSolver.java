public class QuadraticEquationSolver {
    private double x1, x2;
    public int quadraticEq(double a, double b, double c){
        System.out.printf("Уравнение: %.1f x^2 + %.1f x + %.1f = 0\n",a,b,c);
        double dis = 0;

        dis = b*b - (4*a*c);
        if (dis > 0) {
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
            setX1(x1);
            setX2(x2);

        }
        else if (dis == 0){
            x1 = (-b) / (2 * a);
            System.out.println(x1);
            setX1(x1);
        }
        else {
            System.out.println("Действительный корней - нет.");
            return 0;
        }
        return 0;
    }

    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
}