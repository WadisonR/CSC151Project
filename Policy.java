public class Policy
{
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No argument constructor
    // Sets the starting values
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor with arguments
    // Sets the policy information
    public Policy(String policyNum, String provider, String first,
                  String last, int policyAge, String smoking,
                  double policyHeight, double policyWeight)
    {
        policyNumber = policyNum;
        providerName = provider;
        firstName = first;
        lastName = last;
        age = policyAge;
        smokingStatus = smoking;
        height = policyHeight;
        weight = policyWeight;
    }

    // Set methods
    public void setPolicyNumber(String policyNum)
    {
        policyNumber = policyNum;
    }

    public void setProviderName(String provider)
    {
        providerName = provider;
    }

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

    // Get methods
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

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

    // Figures out the BMI
    public double getBMI()
    {
        final double BMI_NUMBER = 703.0;

        double bmi;
        bmi = (weight * BMI_NUMBER) / (height * height);

        return bmi;
    }

    // Figures out the price of the policy
    public double getPolicyPrice()
    {
        // Values used for the policy price
        final double BASE_PRICE = 600.0;
        final int AGE_LIMIT = 50;
        final double AGE_FEE = 75.0;
        final double SMOKER_FEE = 100.0;
        final double BMI_LIMIT = 35.0;
        final double BMI_FEE = 20.0;

        double price = BASE_PRICE;

        // Extra cost for being over 50
        if (age > AGE_LIMIT)
        {
            price = price + AGE_FEE;
        }

        // Extra cost if they smoke
        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price = price + SMOKER_FEE;
        }

        // Extra cost if BMI is over 35
        if (getBMI() > BMI_LIMIT)
        {
            price = price + ((getBMI() - BMI_LIMIT) * BMI_FEE);
        }

        return price;
    }
}
