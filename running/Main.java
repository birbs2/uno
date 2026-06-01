package running;

import gui.UnoJFrame;

public class Main {

    public static GameData game;

    public static void main(String [] args) {
        game = new GameData(true, true, true, 4);
        UnoJFrame unoGame = new UnoJFrame();
        unoGame.setVisible(true);
    }
}
