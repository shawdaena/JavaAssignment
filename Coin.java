public class Coin implements Measurable {
    private double value;
    private String name;
    //define a Coin
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }
    public double getValue()
    {
        return value;
    }
    public double getMeasure()
    {
        return value;
    }
    public String getName() {
        return name;
    }
    public String toString()
    {
        return "Coin[value=" + value + ",name=" + name + "]";
    }

}
