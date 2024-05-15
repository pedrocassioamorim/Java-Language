import entites.Circle;
import entites.Color;
import entites.Rectangle;
import entites.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Shape #" + (i+1)+ " data: ");
            System.out.println("Rectangle or Circle? (r/c): ");
            char tipo = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (tipo == 'c'){
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                Shape sp = new Circle(color, radius);
                list.add(sp);

            } else if (tipo == 'r') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                Shape sp = new Rectangle(color, width, height);
                list.add(sp);
            }

        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.printf("%.2f%n", shape.area());
        }





        sc.close();
    }
}