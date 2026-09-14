import java.util.Scanner;

public class Project_Wadison_Rodriguez
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        // Gets the policy number
        System.out.print("Please enter the Policy Number: ");
        policyNumber = keyboard.nextLine();

        // Gets the provider name
        System.out.print("Please enter the Provider Name: ");
        providerName = keyboard.nextLine();

        // Gets the policyholder's first name
        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();

        // Gets the policyholder's last name
        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();

        // Gets the policyholder's age
        System.out.print("Please enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        // Gets the smoking status
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = keyboard.nextLine();

        // Gets the height
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();

        // Gets the weight
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = keyboard.nextDouble();

        // Creates a Policy object using all of the information entered
        Policy policy = new Policy(policyNumber, providerName, firstName,
                                   lastName, age, smokingStatus,
                                   height, weight);

        System.out.println();

        // Displays all of the policy information
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.getPolicyPrice());

        keyboard.close();
    }
}
