package SOLIDS.OpenClosedPrinciple;

public class OpenClosedPrincipleViolated {
    // Violation of OCP - Shape class not closed for modification
    public class Shape {

        private String type;

        public Shape(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        // Violation: This method requires modification when a new shape is added
        public double calculateArea() {
            if (type.equals("Circle")) {
                // Calculation logic for circle
                return Math.PI*Math.pow(2,2);
            } else if (type.equals("Square")) {
                // Calculation logic for square
                return 2*2;
            } else {
                throw new UnsupportedOperationException("Unsupported shape: " + type);
            }
        }
    }

}
