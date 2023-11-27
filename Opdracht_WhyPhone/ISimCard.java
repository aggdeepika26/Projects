package Opdracht_WhyPhone;
 public interface ISimCard{
        public default void startCall(String number)
        {
            System.out.println("Calling 911");
        }

        public default void endCall()
        {
            System.out.println("Call ended");
        }

    }




