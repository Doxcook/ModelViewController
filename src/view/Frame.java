package view;

import javax.swing.*;
import java.awt.*;

// просто рамка которая содержит панель с информацией

public class Frame extends JFrame {
    public Frame(Panel panel) {
        //настройки окна
        setTitle("CatView");
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
