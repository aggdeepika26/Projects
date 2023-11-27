package Project_Speeltje;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

    public class SnakeGame extends JPanel implements ActionListener, KeyListener {

        private class Tile {
            int x;
            int y;

            Tile(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        int boardWidth;
        int boardHeight;
        int tileSize = 25;

        //Snake
        Tile snakeHead;
        ArrayList<Tile> snakeBody;

        //Apple
        Tile apple;
        Tile goldApple;
        ArrayList<Tile> blueApples;
        Random random;

        //snake move
        float velocityX;
        float velocityY;

        //game logic
        ArrayList<Timer> gameLoop;
        int countLoop;
        int delay;
        int score;
        int countApple;
        boolean gameOver;
        boolean[][] board;

        public SnakeGame(int boardWidth, int boardHeight) {
            //board size
            this.boardWidth = boardWidth;
            this.boardHeight = boardHeight;
            setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));

            setBackground(Color.BLACK);
            //???
            addKeyListener(this);
            setFocusable(true);

            // Every tile is return true for the "isEmpty" methode
            board = new boolean[24][24];
            for (int i = 0; i < board.length; i++)
                for (int j = 0; j < board[i].length; j++)
                    board[i][j] = true;


            snakeHead = new Tile(5, 5);
            snakeBody = new ArrayList<Tile>();

            apple = new Tile(10, 10);
            goldApple = new Tile(-1*tileSize,-1*tileSize);
            blueApples = new ArrayList<Tile>();

            random = new Random();
            placefood();

            velocityX = 1f;
            velocityY = 0f;

            score = 0;
            countApple = 0;

            countLoop = 0;
            delay = 300;
            gameLoop = new ArrayList<Timer>();
            gameLoop.add(new Timer(delay, this));
            gameLoop.get(0).start();

            gameOver = false;
        }



        public boolean isEmpty(int x, int y){
            return board[x][y];
        }

        public void placefood() {

            //apple
            do {
                apple.x = random.nextInt(boardWidth / tileSize); //600/25 = 24
                apple.y = random.nextInt(boardWidth / tileSize);
            }while (!isEmpty(apple.x, apple.y));
            board[apple.x][apple.y] = false;

            //gold apple
            if (snakeBody.size() % 4 == 2) {
                do {
                    goldApple.x = random.nextInt(boardWidth / tileSize);
                    goldApple.y = random.nextInt(boardWidth / tileSize);
                }while (!isEmpty(goldApple.x, goldApple.y));
                board[goldApple.x][goldApple.y] = false;
            }

            //blue apple
            if (countApple % 2 == 1){
                blueApples.add(new Tile(random.nextInt(boardWidth / tileSize),random.nextInt(boardWidth / tileSize)));
            }
        }

        public void ifMove() {
            //eat food
            //with apple
            if (collision(snakeHead, apple)) {
                snakeBody.add(new Tile(apple.x, apple.y));
                board[apple.x][apple.y] = true;
                placefood();
                score += 100;
                countApple += 1;
                // gold apple disperses if the snake eats an apple
                if (snakeBody.size() % 4 == 3) {
                    goldApple.x = -1 * tileSize;
                    goldApple.y = -1 * tileSize;
                }
                // The snake move faster every 3 apples eating
                if (countApple % 3 == 2) {
                    countLoop += 1;
                    delay -= 25;
                    gameLoop.add(new Timer(delay,this));
                    gameLoop.get(countLoop).start();
                    gameLoop.get(countLoop-1).stop();
                }
            }
            //with goldApple
            //more score and de snake goes slower
            if (collision(snakeHead, goldApple)){
                board[goldApple.x][goldApple.y] = true;
                goldApple = new Tile(-1*tileSize,-1*tileSize);
                score += 250;
                countLoop += 1;
                delay += 25;
                gameLoop.add(new Timer(delay,this));
                gameLoop.get(countLoop).start();
                gameLoop.get(countLoop-1).stop();
            }
            //with blueApple
            //less score, de snake goes even faster and the snake grows faster (3 tiles)
            for (int i = 0; i < blueApples.size(); i++) {
                if (collision(snakeHead, blueApples.get(i))) {
                    board[blueApples.get(i).x][blueApples.get(i).y] = true;
                    score -= 50;
                    countLoop += 1;
                    delay -= 50;
                    gameLoop.add(new Timer(delay,this));
                    gameLoop.get(countLoop).start();
                    gameLoop.get(countLoop-1).stop();
                    blueApples.remove(i);
                    snakeBody.add(new Tile(apple.x, apple.y));
                    snakeBody.add(new Tile(apple.x, apple.y));
                    snakeBody.add(new Tile(apple.x, apple.y));
                }
            }
            //Snake Body
            for (int i = snakeBody.size() - 1; i >= 0; i--) {
                Tile snakePart = snakeBody.get(i);
                board[snakeHead.x][snakeHead.y] = false;
                if (i == 0) {
                    snakePart.x = snakeHead.x;
                    snakePart.y = snakeHead.y;
                } else {
                    Tile prevSnakePart = snakeBody.get(i - 1);
                    snakePart.x = prevSnakePart.x;
                    snakePart.y = prevSnakePart.y;
                    board[snakePart.x][snakePart.y] = false;
                }
            }
            // Snake Head moving (go keyPressed methode )
            snakeHead.x += velocityX;
            snakeHead.y += velocityY;

            // snake goes from side to side
            if (snakeHead.x <= -1)
                snakeHead.x = boardWidth/tileSize -1;
            else if (snakeHead.x >= boardWidth/tileSize)
                snakeHead.x = 0;
            else if (snakeHead.y <= -1)
                snakeHead.y = boardHeight/tileSize -1;
            else if (snakeHead.y >= boardHeight/tileSize)
                snakeHead.y = 0;

            // game over conditions
            for (int i = 0; i < snakeBody.size(); i++){
                Tile snakePart = snakeBody.get(i);
                if (collision(snakeHead, snakePart)){
                    gameOver = true;
                }
            }

        }

        public boolean collision(Tile tile1, Tile tile2){
            return tile1.x == tile2.x && tile1.y == tile2.y;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ifMove();
            repaint();
            if (gameOver){
                gameLoop.get(countLoop).stop();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (velocityY != 1)
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    velocityX = 0;
                    velocityY = -1;
                }
            if (velocityY != -1)
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    velocityX = 0;
                    velocityY = 1;
                }
            if (velocityX != -1)
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    velocityX = 1;
                    velocityY = 0;
                }
            if (velocityX != 1)
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    velocityX = -1;
                    velocityY = 0;
                }

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
        }

        public void draw(Graphics g) {

            //grid
        /*
        for (int i = 0; i < boardWidth / tileSize; i++) {
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        }*/

            //Apple
            g.setColor(Color.RED);
            g.fill3DRect(apple.x * tileSize, apple.y * tileSize, tileSize, tileSize, true);

            //Gold Apple
            g. setColor(Color.YELLOW);
            g.fill3DRect(goldApple.x * tileSize, goldApple.y * tileSize, tileSize, tileSize, true);

            //Blue Apple
            for (int i = 0; i < blueApples.size(); i++) {
                g.setColor(Color.BLUE);
                Tile blueApple = blueApples.get(i);
                g.fill3DRect(blueApple.x * tileSize, blueApple.y * tileSize, tileSize, tileSize, true);
            }

            //Snake head
            g.setColor(Color.GREEN);
            g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize,true);

            //Snake Body
            for (int i = 0; i < snakeBody.size(); i++) {
                Tile snakePart = snakeBody.get(i);
                g.fill3DRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize, true);

            }
            //Score
            g.setColor(Color.YELLOW);
            g.drawString("Score: " + score, 6, 15);

            //Game over
            g.setFont((new Font("Arial", Font.PLAIN, 25)));
            if (gameOver) {
                g.setColor(Color.BLUE);
                g.drawString("Game Over!!!",9 * tileSize, 12*tileSize);
                g.drawString(" Je eet " + String.valueOf(countApple) + " appelen.", 8*tileSize, 14*tileSize);
            }
        }

        //no need
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }




