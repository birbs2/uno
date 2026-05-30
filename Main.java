import cards.CardDeck;
import gui.UnoJFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args) {
        CardDeck deck = new CardDeck();
        UnoJFrame unoGame = new UnoJFrame(deck);
        unoGame.setVisible(true);
    }
}
