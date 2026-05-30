package cards;

import javax.swing.*;
import java.awt.*;

public class Card {

    private final CardDeck.CardColor color;
    private final CardDeck.CardNumber number;

    public Card(CardDeck.CardColor color, CardDeck.CardNumber number) {
        this.color = color;
        this.number = number;
    }

    public boolean is(CardDeck.CardColor color, CardDeck.CardNumber number) {
        return (color == null || color == this.color) && (number == null || number == this.number);
    }

    public boolean is(CardDeck.CardColor color) {
        return this.is(color, null);
    }

    public boolean is(CardDeck.CardNumber number) {
        return this.is(null, number);
    }

    @Override
    public String toString() {
        return String.format("%s%d", number.ordinal() > 12 ? "B" : color, number.ordinal());
    }

    public ImageIcon getIcon(int width, int height) {
        ImageIcon icon = new ImageIcon("assets/" + this.toString() + ".png");
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
}
