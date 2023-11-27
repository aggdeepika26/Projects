package Opdracht_WhyPhone;

public class WhyPhone extends SmartPhone{
    private final String COLOR;
    public WhyPhone(double PRICE , String BRAND, String COLOR )
    {
     super(PRICE,BRAND);                                //Super class constructor call
     this.COLOR = COLOR;
    }
    public String getCOLOR()
    {
        return COLOR;
    }
    @Override
    public String toString()
    {
        String genInfo = super.toString();
        System.out.println(genInfo);
        return
                "COLOR  :" + getCOLOR() + "\n";

    }

}
