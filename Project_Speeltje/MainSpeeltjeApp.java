package Project_Speeltje;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainSpeeltjeApp {
    public static void main(String[] args) throws Exception {
        char ans = 'y';
        while (ans == 'y' || ans == 'Y') {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("1.Snake");
            System.out.println("2. TicTacToe");
            System.out.println("3. Text Based Adventure");
            System.out.println("4. Minefield");
            System.out.println("Enter your choice from 1 to 4");
            int choice = myScanner.nextInt();
            switch (choice) {
                case 1: {
                    int boardWidth = 600;
                    int boardHeight = boardWidth;
                    JFrame frame = new JFrame("Snake");
                    frame.setSize(boardWidth, boardHeight);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
                    frame.add(snakeGame);
                    frame.pack();
                    snakeGame.requestFocus();
                    break;
                }
                case 2: {
                    String[] ticTacBoard = new String[9];
                    // passeren String array van size 9 aan de constructor
                    TicTac tictac = new TicTac(ticTacBoard);
                    // aanroepen TicTac game play
                    tictac.gamePlay();
                    break;
                }
                case 3: {
                    AdventureGame adventureGame = new AdventureGame();
                    adventureGame.startAdventure();
                    break;
                }
                case 4: {
                    Bord myBord = new Bord();
                    String[][] bord = new String[10][10];
                    Random myrRandom = new Random();
                    System.out.println("Welcome to Mine Field Game :\n");


                    for (int x = 0; x < bord.length; x++)
                    {
                        for (int y = 0; y < bord.length; y++)
                        {
                            int set = myrRandom.nextInt(9);
                            if (set==2||set==8)
                            {  bord[x][y]   = "$$ ";}
                            else bord[x][y] = "() ";
                        }
                    }

                    myBord.print(bord);
                    myBord.play(bord);
                    break;



                }
            }
            System.out.println("Do you want to play again y/n");
            ans = myScanner.next().charAt(0);

        }


    }
}
