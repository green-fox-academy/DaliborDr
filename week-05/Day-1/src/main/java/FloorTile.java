public class FloorTile extends Tile {
    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    private boolean reachable = true;

    public FloorTile(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}

