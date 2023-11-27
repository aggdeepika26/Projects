package Opdracht_WhyPhone;

public class SmartPhone implements ICamera,IGPS,IRadio,ISimCard,IWiFi
{
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;
    public double altitude;
    public double longitude;
    public String internetConnection;

    public SmartPhone(double PRICE, String BRAND)
    {
        this.PRICE = PRICE;
        this.BRAND = BRAND;

    }

    public double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }


    @Override
    public void shootAPhoto(double amountOfPhotos)
    {
        System.out.println("You have " +amountOfPhotos + "GB Capacity to shoot photos");

    }

    @Override
    public String[] viewPhotos()
    {
        return new String[] { "Pic1","Pic2","Pic3"};
    }

    @Override
    public String locate(double altitude, double longitude) {
        //this.altitude = altitude;
        //this.longitude = longitude;
        System.out.println("Your current location is");
        return "altitude " + String.valueOf(altitude) + "longitude " + String.valueOf(longitude);
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    @Override
    public void navigate() {


        System.out.println("Navigating from location altitude " + getAltitude() + "and longitude" + getLongitude() );

    }

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

    @Override
    public void connect(String internetConnection)
    {
        this.internetConnection = internetConnection;
        System.out.println("Internet connection is " + this.internetConnection );

    }


    @Override
    public void disconnect(String internetConnection)
    {
        this.internetConnection = internetConnection;
        System.out.println("Your internet connection is " + this.internetConnection);
        System.out.println("Turn on your connection to enjoy services");

    }

    @Override
    public String toString() {
        return "Price  :"  + getPRICE() + "\n" +
                "Brand :"  + getBRAND() ;
    }
}



