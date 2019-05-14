import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void moveDown() {
        if (getPosY() != 648) {
            this.posY += 72;
            this.filename = "img/hero-down.png";
        } else {
            this.posY = 648;
        }
    }

    public void moveUp() {
        if (getPosY() != 0) {
            this.filename = "img/hero-up.png";
            this.posY -= 72;
        } else {
            this.posY = 0;
        }
    }

    public void moveLeft() {
        if (getPosX() != 0) {
            this.posX -= 72;
            this.filename = "img/hero-left.png";
        } else {
            this.posX = 0;
        }
    }

    public void moveRight() {
        if (getPosX() != 648) {
            this.posX += 72;
            this.filename = "img/hero-right.png";
        } else {
            this.posX = 648;
        }
    }

    @Override
    public void draw(Graphics graphics) {
        try {
            this.image = ImageIO.read(new File(this.filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (image != null) {
            graphics.drawImage(this.image, this.posX, this.posY, null);
        }
    }
}
