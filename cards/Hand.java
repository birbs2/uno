package cards;

import running.Main;

import java.util.ArrayList;

public class Hand extends ArrayList<Card> {

    public Hand() {
        for (int i = 0; i < 7; i++) {
            add(Main.game.deck.draw());
        }
    }
}
