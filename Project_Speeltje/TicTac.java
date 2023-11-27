package Project_Speeltje;
import java.util.Scanner;
import java.util.Arrays;
public class TicTac{

    // parameters declaratie
    public String ticTacBoard[];
    public String winner = null;

    public int position;
    public String chkline = null;
    Scanner myScanner = new Scanner(System.in);

    // parameterized constructor dat krijg een String array
    public TicTac(String ticTacBoard[]) {
        this.ticTacBoard = ticTacBoard;
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        for (int a = 0; a < 9; a++) {
            ticTacBoard[a] = String.valueOf(a + 1);
        }
        // aanroepen van de displayBoard method in het zelfde klas
        this.displayBoard();
    }


    // het is display board van TicTacToe
    public void displayBoard() {

        System.out.println("|---|---|---|");
        System.out.println("| " + ticTacBoard[0] + "| " + ticTacBoard[1] + "| " + ticTacBoard[2] + "| ");
        System.out.println("| " + ticTacBoard[3] + "| " + ticTacBoard[4] + "| " + ticTacBoard[5] + "| ");
        System.out.println("| " + ticTacBoard[6] + "| " + ticTacBoard[7] + "| " + ticTacBoard[8] + "| ");
        System.out.println("|---|---|---|");


    }


    // checkWinner methode controleert de winnaar
    public String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            // Er zijn 8 conditie voor winnaar
            switch (a)
            {
                case 0:
                    chkline = ticTacBoard[0] + ticTacBoard[1] + ticTacBoard[2];
                    break;
                case 1:
                    chkline = ticTacBoard[3] + ticTacBoard[4] + ticTacBoard[5];
                    break;
                case 2:
                    chkline = ticTacBoard[6] + ticTacBoard[7] + ticTacBoard[8];
                    break;
                case 3:
                    chkline = ticTacBoard[0] + ticTacBoard[3] + ticTacBoard[6];
                    break;
                case 4:
                    chkline = ticTacBoard[1] + ticTacBoard[4] + ticTacBoard[7];
                    break;
                case 5:
                    chkline = ticTacBoard[2] + ticTacBoard[5] + ticTacBoard[8];
                    break;
                case 6:
                    chkline = ticTacBoard[0] + ticTacBoard[4] + ticTacBoard[8];
                    break;
                case 7:
                    chkline = ticTacBoard[2] + ticTacBoard[4] + ticTacBoard[6];
                    break;
            }

            //For X winner
            if (chkline.equals("XXX")) {
                winner = "X";
                break;
            }

            // For O winner
            else if (chkline.equals("OOO")) {
                winner = "O";
                break;
            }
        }
           // Als niemand is winnaar dan er is draw
        for (int pos = 0; pos < 9; pos++)
        {
            if (Arrays.asList(ticTacBoard).contains(String.valueOf(pos + 1))) // ((!ticTacBoard[pos].equals("X")) || (!ticTacBoard[pos].equals("O")))
            {
                break;
            }
            else if (pos == 8)
            {
                winner = "draw";
            }
        }
        return winner;

    }


    public void gamePlay() {
        System.out.println("X will play first. Enter a slot number to place X in:");
        String turn = "X";


        // position will take position from user like from 1 to 9.
        // If it is not in range from 1 to 9.
        // then it will show you an error "Invalid input and to reenter."
        while(winner == null)
        {

            position = myScanner.nextInt();
            if (!(position > 0 && position <= 9))
            {
                {
                    System.out.println("Invalid input; re-enter slot number from 1 to 9 only:");
                }
                continue;
            }
            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (ticTacBoard[position - 1].equals(String.valueOf(position)))
            {
                ticTacBoard[position - 1] = turn;

                if (turn.equals("X"))
                {
                    turn = "O";
                    displayBoard();
                    winner = this.checkWinner();
                    if(winner != null)
                    {
                        break;
                    }

                    System.out.println("Now turn of O");
                    System.out.println("Enter slot number to position O");
                }
                else
                {
                    turn = "X";
                    displayBoard();
                    winner = this.checkWinner();
                    if(winner != null)
                    {
                        break;
                    }
                    System.out.println("Now turn of X");
                    System.out.println("Enter slot number to position X");
                }
            }
            else
            {
                System.out.println("Sorry this slot is already used. Choose another place");

            }


        }


        if (winner.equals("draw")) {
            System.out.println("Its a draw");
            System.out.println("Thanks for playing");
        } else
        {
            System.out.println(winner + "is the winner");
            System.out.println("Congratulations!Thanks for playing");

        }
    }
}


