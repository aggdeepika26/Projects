package Opdracht_WhyPhone;
import java.util.Scanner;

public class WhyPhoneApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        DummyPhone dummyPhone = new DummyPhone();
        WhyPhone phone = new WhyPhone(1000, "Apple", "Black");//Constructor aanroepen
        System.out.println("Choose from the list");
        System.out.println("1. Dummy Phone");
        System.out.println("2. Smart Phone");
        int choice = myScanner.nextInt();
        if(choice == 1)
        {
            showSpecsDummy(dummyPhone);
        }
        else if(choice == 2)
        {
            showSpecs(phone);
        }
        else {
            System.out.println("Enter correct choice");
        }

    }
        public static void showSpecs(SmartPhone phone)
        {
            Scanner myScanner = new Scanner(System.in);
            String mobileData;
            String genInfo = phone.toString();                 //aanroepen van toString method
            System.out.println(genInfo);
            System.out.println("Enter Your mobile data is on/off"); //vraagt voor internetconnection on of off
            mobileData = myScanner.nextLine();
            if(mobileData.equalsIgnoreCase("on"))       //als internetconnection is on dan de persoon ka gebruiken verschillende diensten
            {
                phone.connect("on");
                System.out.println();
                System.out.println("Different services are available");
                System.out.println("1. Find current Location");
                System.out.println("2. Navigation");
                System.out.println("3. Play FM");
                System.out.println("4. Change FM Channel");
                System.out.println("5. Shoot Photo" );
                System.out.println("6. View Photo");
                System.out.println("Enter your choice  ");
                int choice = myScanner.nextInt();           //Enter optie
                switch(choice)
                {
                    case 1:
                    {
                        String location = phone.locate(101.6, 37.9);
                        System.out.println(location);
                        break;
                    }
                    case 2:
                    {
                        phone.navigate();
                        break;
                    }
                    case 3:
                    {
                        phone.playChannel(200.45);
                        break;
                    }
                    case 4:
                    {
                        phone.changeChannel(300.24);
                        break;
                    }
                    case 5:
                    {
                        phone.shootAPhoto(15);
                        break;
                    }
                    case 6:
                    {
                        String[] picsArray = phone.viewPhotos();
                        System.out.println("Your pics");
                        for(String pic : picsArray )
                        {
                            System.out.println(pic);
                        }
                        break;

                    }
                }
            }
            else
            {
                phone.disconnect("off");

            }
        }

        public static void showSpecsDummy(DummyPhone dummyPhone)   //Methode gemaakt voor Dummyklas methode te aanroepen
        {
            System.out.println("Oh this is old version . you can only make a call and listen radio");
            dummyPhone.playChannel(150);
            dummyPhone.changeChannel(100);
            dummyPhone.startCall("991...");
            dummyPhone.endCall();

        }
}





