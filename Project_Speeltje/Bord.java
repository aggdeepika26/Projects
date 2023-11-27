package Project_Speeltje;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

    public class Bord {

        public void check (String[][] bord,int h , int k)
        {

            if (Objects.equals(bord[h][k], "$$ "))
            {
                explosion (bord);
            }

            else

            {bord=edit_Bord(bord,h,k);
                print(bord);
                System.out.print("\n\nYou are safe ,");
                play(bord);
            }
        }
        public void explosion (String[][] bord)
        {
            for (int x = 0; x < bord.length; x++)
            {for (int y = 0; y < bord.length; y++)
            {
                System.out.print(bord[x][y]);

                if (y == bord.length - 1)
                {System.out.println(x + 1);}
            }
            }
            System.out.println("Unfortunately , you lost ");

        }
        public String[][] edit_Bord (String[][] bord,int h , int k)
        {
            for (int x = 0; x < bord.length; x++)
            {
                for (int y = 0; y < bord.length; y++)

                {
                    if (x==h&&y==k)
                    {bord[h][k]="// ";return bord;}

                }
            }
            return bord;

        }
        public void print(String[][] bord)
        {
            for (int x = 0; x < bord.length; x++)
            {for (int y = 0; y < bord.length; y++)
            {
                if (Objects.equals(bord[x][y], "$$ "))
                {System.out.print("() ");}
                else {System.out.print(bord[x][y]);}
                if (y == bord.length - 1)
                {System.out.println(x + 1);}
            }
                System.out.println();
            }

            for (int x = 0; x < bord.length; x++)
            {System.out.print((x + 1 + "  "));}
        }


        public void play(String[][] bord)
        {
            System.out.println("please enter the coordinates X And Y :");
            Scanner myScanner = new Scanner(System.in);
            int  x , y ;
            System.out.print("X = ");
            x=myScanner.nextInt()-1;
            System.out.print("Y = ");
            y=myScanner.nextInt()-1;
            check(bord,x,y);

        }


    }



