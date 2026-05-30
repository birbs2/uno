package gui;

import cards.Card;
import cards.CardDeck;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HandComponent extends JPanel {

    private JPanel sortingMenu;
    private JPanel cardsDisplay;

    public HandComponent(CardDeck cardDeck) {
        this.setBackground(Color.LIGHT_GRAY);

        this.sortingMenu = new JPanel();
        this.sortingMenu.add(new Label("testing."));

        this.cardsDisplay = new JPanel();
        JScrollPane scrollCardsDisplay = new JScrollPane(this.cardsDisplay);

        for (int i = 0; i < 7; i++) {
            this.cardsDisplay.add(new JButton(cardDeck.getRandomCard().getIcon(80, 120)));
        }
        this.add(sortingMenu, BorderLayout.WEST);
        this.add(scrollCardsDisplay, BorderLayout.EAST);
    }
}
