package cards;

import java.util.ArrayList;

public class CardDeck {

    public enum CardColor {
        RED,
        YELLOW,
        GREEN,
        BLUE
    }
    public enum CardNumber {
        ZERO,
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        REVERSE, // 10
        SKIP, // 11
        DRAW_TWO, // 12
        WILD, // 13
        DRAW_FOUR // 14
    }

    private Card[] allCards;
    private ArrayList<Card> deck;

    public CardDeck() {
        ArrayList<Card> allCardsArrayList = new ArrayList<>(112);
        for (CardNumber number : CardNumber.values()) {
            for (CardColor color : CardColor.values()) {
                allCardsArrayList.add(new Card(color, number));
                if (number.ordinal() < 14 && number.ordinal() > 0) {
                    allCardsArrayList.add(new Card(color, number));
                }
            }
        }
        allCards = allCardsArrayList.toArray(new Card[112]);
        deck = new ArrayList<>(allCardsArrayList);
    }

    public Card draw() {
        int seed = (int) (Math.random() * deck.size());
        System.out.println(deck.get(seed));
        return deck.remove(seed);
    }

}
