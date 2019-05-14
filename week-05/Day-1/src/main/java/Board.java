import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
    Hero hero;

    public int[][] wallMatrix = {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
    };



    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
        this.hero = new Hero("img/hero-down.png",0,0);

    }






    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
//        PositionedImage image = new PositionedImage("yourimage.png", 300, 300);
//        image.draw(graphics);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                FloorTile floorTile = new FloorTile("img/floor.png", i * 72, j * 72);
                floorTile.draw(graphics);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (wallMatrix[i][j] == 1) {
                    WallTile wallTile = new WallTile("img/wall.png", j * 72, i * 72);
                    wallTile.draw(graphics);
                }
            }
        }
//        Hero hero = new Hero(fileName, moveX, moveY);
        hero.draw(graphics);
        Skeleton zombie = new Skeleton("img/skeleton.png", 72,144);
        zombie.draw(graphics);
    }


    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener§ú
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.moveUp();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.moveDown();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.moveRight();
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}