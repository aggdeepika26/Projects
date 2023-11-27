package Opdracht_WhyPhone;

public class DummyPhone implements ISimCard,IRadio
{
    @Override
    public void playChannel(double fm)
        {
            System.out.println("Enjoy " + fm + "Qmusic");

        }


    @Override
    public void changeChannel(double fm)
    {
        System.out.println("Enjoy " + fm + "MNM hits");
    }
}
