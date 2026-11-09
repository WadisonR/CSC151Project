import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Wadison_Rodriguez
{
    public static void main(String[] args) throws IOException
    {
        // Open the file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        // ArrayList to hold the Policy objects
        ArrayList<Policy> policies = new ArrayList<Policy>();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Read all the policies from the file
        while (inputFile.hasNext())
        {
            String policyNumber = inputFile.nextLine();
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();

            int age = Integer.parseInt(inputFile.nextLine());

            String smokingStatus = inputFile.nextLine();

            double height = Double.parseDouble(inputFile.nextLine());
            double weight = Double.parseDouble(inputFile.nextLine());

            // Create a PolicyHolder object
            PolicyHolder holder = new PolicyHolder(firstName, lastName,
                                      age, smokingStatus,
                                      height, weight);

            // Create a Policy object
            Policy policy = new Policy(policyNumber, providerName, holder);

            // Add the Policy object to the ArrayList
            policies.add(policy);

            // Skip the blank line between policies
            if (inputFile.hasNextLine())
            {
                inputFile.nextLine();
            }
        }

        inputFile.close();

        // Display all the policies
        for (Policy policy : policies)
        {
            System.out.println(policy);
            
            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
    {
    smokerCount++;
    }
    else
    {
    nonSmokerCount++;
    }

            System.out.println();
        }
        System.out.println("There were " + Policy.getPolicyCount()
                   + " Policy objects created.");
                   
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}