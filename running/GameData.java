package running;

import cards.CardDeck;

public class GameData {
    public boolean numberStacking;
    public boolean colorStacking;
    public boolean stackDraws;

    public int failedUnoDraws;

    public CardDeck deck;

    public GameData(boolean numberStacking, boolean colorStacking, boolean stackDraws, int failedUnoDraws) {
        this.numberStacking = numberStacking;
        this.colorStacking = colorStacking;
        this.stackDraws = stackDraws;
        this.failedUnoDraws = failedUnoDraws;
        deck = new CardDeck();
    }
}
