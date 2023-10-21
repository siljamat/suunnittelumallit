import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        HeadOfUnit headOfUnit = new HeadOfUnit();
        President president = new President();
        supervisor.setSuccessor(headOfUnit);
        headOfUnit.setSuccessor(president);

        System.out.println("Enter the raise percentage to check who should approve it (as a decimal, e.g., 0.03 for 3% raise):");
        System.out.print(">");
        try {
            double raisePercentage = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            supervisor.processRequest(raisePercentage);
        } catch (Exception e) {
            System.exit(1);
        }
    }
}