public class WallTile extends Tile {
    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    private boolean reachable = false;
    public WallTile(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}
