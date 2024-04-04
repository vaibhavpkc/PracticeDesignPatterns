package SOLIDS.OpenClosedPrinciple;

public class OpenClosedPrincipleNonViolated {
    // Adhering to OCP - Shape interface and separate classes for each shape


    // Circle class implementing the Shape interface
    public class Circle implements Shape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            // Calculation logic for circle
            return Math.PI * radius * radius;
        }
    }

    // Square class implementing the Shape interface
    public class Square implements Shape {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            // Calculation logic for square
            return side * side;
        }
    }

}
