package gui;

import cards.CardDeck;

import javax.swing.*;
import java.awt.*;

public class UnoJFrame extends JFrame {

    private static final double HAND_HEIGHT = 0.2;
    private static final double RULES_WIDTH = 0.1;
    private static final double STATS_WIDTH = 0.1;
    private static final double STATS_HEIGHT = 0.1;

    private GameRulesComponent gameRules = new GameRulesComponent();
    private HandComponent hand;
    private QueueComponent queue;
    private StatsComponent stats;
    private TableComponent table;

    public UnoJFrame(CardDeck cardDeck) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setSize(800, 600);
        this.hand = new HandComponent(cardDeck);
        this.queue = new QueueComponent();
        this.stats = new StatsComponent();
        this.table = new TableComponent();
        this.generateSections();
    }

    private void generateSections() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        gbc.weightx = RULES_WIDTH;
        gbc.weighty = 1 - HAND_HEIGHT;
        this.add(this.gameRules, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 1 - RULES_WIDTH - STATS_WIDTH;
        gbc.weighty = 1 - HAND_HEIGHT;
        this.add(this.table, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1;
        gbc.weighty = HAND_HEIGHT;
        this.add(this.hand, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = STATS_WIDTH;
        gbc.weighty = STATS_HEIGHT;
        this.add(this.stats, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        gbc.weightx = STATS_WIDTH;
        gbc.weighty = STATS_HEIGHT;
        this.add(this.queue, gbc);
    }
}
