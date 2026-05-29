package gui;

import javax.swing.*;
import java.awt.*;

public class QueueComponent extends JPanel {
    public QueueComponent() {
        this.setBackground(Color.LIGHT_GRAY);
        this.add(new Button("Queue"));
    }
}
