package test;

import deployment_interface_chillshape.Rectangle;

public class TestDeploymentRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(10,20);
        rectangles[2] = new Rectangle(20,40,"brown",false);

        System.out.println("Pre Resize");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
            rectangle.resize(13);
        }

        System.out.println("After Resize");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
