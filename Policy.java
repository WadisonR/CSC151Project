public class Policy
{
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0;

    /**
       No argument constructor.
    */
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        policyHolder = new PolicyHolder();
        policyCount++;
    }

    /**
       Constructor that sets the policy information.
       @param policyNum policy number
       @param provider provider name
       @param holder policyholder object
    */
    public Policy(String policyNum, String provider,
                  PolicyHolder holder)
    {
        policyNumber = policyNum;
        providerName = provider;
        policyHolder = holder;
        policyCount++;
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
       Sets the policyholder.
       @param holder policyholder object
    */
    public void setPolicyHolder(PolicyHolder holder)
    {
        policyHolder = holder;
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
       Gets the policyholder.
       @return policyholder object
    */
    public PolicyHolder getPolicyHolder()
    {
        return policyHolder;
    }

    /**
       Calculates the policy price.
       @return policy price
    */
    public double getPolicyPrice()
    {
        double price = 600.0;

        if (policyHolder.getAge() > 50)
        {
            price = price + 75.0;
        }

        if (policyHolder.getSmokingStatus()
                        .equalsIgnoreCase("smoker"))
        {
            price = price + 100.0;
        }

        if (policyHolder.getBMI() > 35)
        {
            price = price +
                    ((policyHolder.getBMI() - 35) * 20);
        }

        return price;
    }
    
    /**
       Returns the policy information.
       @return policy information
    */
    public String toString()
    {
        String str = "Policy Number: "
                     + policyNumber + "\n";

        str += "Provider Name: "
               + providerName + "\n";

        str += policyHolder.toString() + "\n";

        str += String.format(
               "Policy Price: $%.2f",
               getPolicyPrice());

        return str;
    }
    /**
   Returns the number of policies created.
   @return number of policies
   */
    public static int getPolicyCount()
{
    return policyCount;
}

}
