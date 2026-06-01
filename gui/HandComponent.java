package gui;

import cards.Card;
import cards.CardDeck;
import cards.Hand;

import javax.swing.*;
import java.awt.*;

public class HandComponent extends JPanel {

    private JPanel sortingMenu;

    public HandComponent() {
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.LIGHT_GRAY);
        this.sortingMenu = new JPanel();
        this.sortingMenu.add(new Label("testing."));

        showCards();
    }

    public void showCards() {
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel cardsDisplay = new JPanel();
        JScrollPane scrollCardsDisplay = new JScrollPane(cardsDisplay, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = UnoJFrame.RULES_WIDTH;
        gbc.weighty = 1;
        this.add(sortingMenu, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1 - UnoJFrame.RULES_WIDTH;
        gbc.weighty = 1;

        this.add(scrollCardsDisplay, gbc);

        for (Card card : new Hand()) {
            cardsDisplay.add(new JButton(card.getIcon((int) (UnoJFrame.HEIGHT * UnoJFrame.HAND_HEIGHT) - 30)));
        }
    }
}
