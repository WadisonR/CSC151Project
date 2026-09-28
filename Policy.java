```java
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

    /**
       No argument constructor.
    */
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

    /**
       Constructor that sets all the policy information.
       @param policyNum policy number
       @param provider provider name
       @param first first name
       @param last last name
       @param policyAge age
       @param smoking smoking status
       @param policyHeight height
       @param policyWeight weight
    */
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

    /**
       Sets the policy number.
       @param policyNum policy number
    */
    public void setPolicyNumber(String policyNum)
    {
        policyNumber = policyNum;
    }

    /**
       Sets the provider name.
       @param provider provider name
    */
    public void setProviderName(String provider)
    {
        providerName = provider;
    }

    /**
       Sets the first name.
       @param first first name
    */
    public void setFirstName(String first)
    {
        firstName = first;
    }

    /**
       Sets the last name.
       @param last last name
    */
    public void setLastName(String last)
    {
        lastName = last;
    }

    /**
       Sets the age.
       @param policyAge age
    */
    public void setAge(int policyAge)
    {
        age = policyAge;
    }

    /**
       Sets the smoking status.
       @param smoking smoking status
    */
    public void setSmokingStatus(String smoking)
    {
        smokingStatus = smoking;
    }

    /**
       Sets the height.
       @param policyHeight height
    */
    public void setHeight(double policyHeight)
    {
        height = policyHeight;
    }

    /**
       Sets the weight.
       @param policyWeight weight
    */
    public void setWeight(double policyWeight)
    {
        weight = policyWeight;
    }

    /**
       Gets the policy number.
       @return policy number
    */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
       Gets the provider name.
       @return provider name
    */
    public String getProviderName()
    {
        return providerName;
    }

    /**
       Gets the first name.
       @return first name
    */
    public String getFirstName()
    {
        return firstName;
    }

    /**
       Gets the last name.
       @return last name
    */
    public String getLastName()
    {
        return lastName;
    }

    /**
       Gets the age.
       @return age
    */
    public int getAge()
    {
        return age;
    }

    /**
       Gets the smoking status.
       @return smoking status
    */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
       Gets the height.
       @return height
    */
    public double getHeight()
    {
        return height;
    }

    /**
       Gets the weight.
       @return weight
    */
    public double getWeight()
    {
        return weight;
    }

    /**
       Calculates the BMI.
       @return BMI
    */
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }

    /**
       Calculates the policy price.
       @return policy price
    */
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
