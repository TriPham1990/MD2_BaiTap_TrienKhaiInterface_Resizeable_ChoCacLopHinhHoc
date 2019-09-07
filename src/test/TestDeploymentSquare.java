package test;

import deployment_interface_chillshape.Square;

public class TestDeploymentSquare {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(20);
        squares[2] = new Square(50,"orange",true);

        System.out.println("Pre Resize");
        for(Square square : squares){
            System.out.println(square);
            square.resize(17);
        }

        System.out.println("After Resize");
        for (Square square : squares){
            System.out.println(square);
        }
    }
}
