package SOLIDS.SRP;

public class SingleResponsibilityPrinciple {

    // Violation of SRP - Report class with two responsibilities
    public class Report {

        private String content;

        public Report(String content) {
            this.content = content;
        }

        // Responsibility 1: Generating the report
        public String generateReport() {
            // Logic to generate the report content
            // This could be a complex process involving data manipulation, calculations, etc.
            return content;
        }

        // Responsibility 2: Printing the report
        public void printReport() {
            // Logic to print the report
            System.out.println("Printing report: " + content);
        }
    }

// Adhering to SRP - Separate classes for generating and printing reports

    // ReportGenerator class with responsibility for generating the report
    public class ReportGenerator {

        private String content;

        public ReportGenerator(String content) {
            this.content = content;
        }

        public String generateReport() {
            // Logic to generate the report content
            // This could be a complex process involving data manipulation, calculations, etc.
            return content;
        }
    }

    // ReportPrinter class with responsibility for printing the report
    public class ReportPrinter {

        public void printReport(String content) {
            // Logic to print the report
            System.out.println("Printing report: " + content);
        }
    }

}
