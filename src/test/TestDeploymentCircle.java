package test;

import deployment_interface_chillshape.Circle;

public class TestDeploymentCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(5);
        circles[2] = new Circle(5,"while",false);

        System.out.println("Pre Resize");
        for(Circle circle : circles){
            System.out.println(circle);
            circle.resize(5);
        }

        System.out.println("After Resize");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
