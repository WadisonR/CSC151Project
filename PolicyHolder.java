
public class PolicyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-argument constructor
    public PolicyHolder()
    {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor with arguments
    public PolicyHolder(String first, String last,
                        int policyAge, String smoking,
                        double policyHeight, double policyWeight)
    {
        firstName = first;
        lastName = last;
        age = policyAge;
        smokingStatus = smoking;
        height = policyHeight;
        weight = policyWeight;
    }

    // Setters
    public void setFirstName(String first)
    {
        firstName = first;
    }

    public void setLastName(String last)
    {
        lastName = last;
    }

    public void setAge(int policyAge)
    {
        age = policyAge;
    }

    public void setSmokingStatus(String smoking)
    {
        smokingStatus = smoking;
    }

    public void setHeight(double policyHeight)
    {
        height = policyHeight;
    }

    public void setWeight(double policyWeight)
    {
        weight = policyWeight;
    }

    // Getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    // Calculate BMI
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }    
    public String toString()
    {
        String str = "Policyholder's First Name: "
                     + firstName + "\n";

        str += "Policyholder's Last Name: "
               + lastName + "\n";

        str += "Policyholder's Age: "
               + age + "\n";

        str += "Policyholder's Smoking Status (Y/N): "
               + smokingStatus + "\n";

        str += String.format(
               "Policyholder's Height: %.1f inches\n",
               height);

        str += String.format(
               "Policyholder's Weight: %.1f pounds\n",
               weight);

        str += String.format(
               "Policyholder's BMI: %.2f", getBMI());

        return str;
    }
}