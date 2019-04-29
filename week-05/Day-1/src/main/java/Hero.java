public class Hero extends Character {
    private String filename;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    private int posX = 0;

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    private int posY = 0;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}
