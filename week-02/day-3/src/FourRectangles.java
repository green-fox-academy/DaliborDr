import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics g){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i <4 ; i++) {
            g.setColor(new Color(randomNumber(),randomNumber(),randomNumber()));
            int x = randomNumber();
            int y = randomNumber();
            int height =randomNumber();
            int width = randomNumber();
            rect(g,x,y,width,height);


        }



    }
    public static void rect(Graphics g, int x,int y, int height, int width){
        g.drawRect(x,y,width,height);
    }
    public static Integer randomNumber(){
       int a = (int) (Math.random()* WIDTH );
        return a;

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}