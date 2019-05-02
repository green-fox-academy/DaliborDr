public class WallTile extends Tile {
    public boolean isReachable() {
        return reachable;
    }

    public boolean isReachable(boolean reachable) {
        return reachable;
    }

    private boolean reachable = false;
    public WallTile(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}
