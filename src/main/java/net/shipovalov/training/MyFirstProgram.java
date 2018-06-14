package net.shipovalov.training;


public class MyFirstProgram {

    public static void main(String[] array) {
       Square s = new Square(15.0);

       Triangle tr = new Triangle(155.0 , 123.0);
       System.out.println("Площадь квадрата равна " + s.sayArea());
       System.out.println("Площадь треугольника равна " + tr.sayArea());

       Point p1 = new Point(1,3);
       Point p2 = new Point(4,7);
       System.out.println(distance(p1,p2));
       System.out.println(p1.distance(p1));
    }


    public static double triangleArea (Triangle t){
        double area = ((t.a * t.b) / 2);
        return area;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    };

}
