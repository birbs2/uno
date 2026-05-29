public class Game {
    private final boolean numberStacking;

    private final boolean stackDrawFours;
    private final boolean stackDrawTwos;

    public Game() {
        numberStacking = false;
        stackDrawFours = false;
        stackDrawTwos = false;
    }

    public boolean isNumberStacking() {
        return numberStacking;
    }

    public boolean isStackDrawFours() {
        return stackDrawFours;
    }

    public boolean isStackDrawTwos() {
        return stackDrawTwos;
    }
}
