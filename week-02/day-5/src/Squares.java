import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics g) {
//        horizontal Lines
        lines(g,0,0,0,300);
        lines(g,100,0,100,300);
        lines(g,200,0,200,300);
        lines(g,300,0,300,300);

//        Vertical Lines
        lines(g,0,0,300,0);
        lines(g,0,100,300,100);
        lines(g,0,200,300,200);
        lines(g,0,300,300,300);

        //        horizontal Lines
        lines2(g,0,0,0,300);
        lines2(g,100,0,100,300);
        lines2(g,200,0,200,300);
        lines2(g,300,0,300,300);

//        Vertical Lines
        lines2(g,0,0,300,0);
        lines2(g,0,100,300,100);
        lines2(g,0,200,300,200);
        lines2(g,0,300,300,300);
//





    }
    public static int lines(Graphics g,int x,int y, int x2,int y2){
        if (y2>10) {
            g.drawLine(x, y, x2, y2);

            return lines(g,x/3+100,y/3,x2/3+100,y2/3);


        }return y;

    }
    public static int lines2(Graphics g,int x,int y, int x2,int y2) {
        if (y2 > 10) {
            g.drawLine(x, y, x2, y2);

            return lines(g, x / 3 + 200, y / 3, x2 / 3 + 200, y2 / 3);


        }
        return y;
    }
//    public static int lines2

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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