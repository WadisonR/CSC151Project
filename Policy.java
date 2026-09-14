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

    // No-argument constructor
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

    // Setters
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

    // Getters
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

    // Calculate and return BMI
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }

    // Calculate and return policy price
    public double getPolicyPrice()
    {
        double price = 600.0;

        if (age > 50)
        {
            price = price + 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price = price + 100.0;
        }

        if (getBMI() > 35)
        {
            price = price + ((getBMI() - 35) * 20);
        }

        return price;
    }
}