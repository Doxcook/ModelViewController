package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JLabel oldName;
    JLabel oldAge;
    JTextField newName;
    JTextField newAge;
    JLabel space;
    JButton button;


    public Panel(Controller controller) {
        setLayout(new GridLayout(3,2));

        oldName = new JLabel();
        oldAge = new JLabel();
        newName = new JTextField();
        newAge = new JTextField();
        space = new JLabel();
        button = new JButton("Update");

        add(oldName);
        add(oldAge);
        add(newName);
        add(newAge);
        add(space);
        add(button);


    }

    // Методы для обновления отображения имени и возраста
    public void setOldName(String name) {
        oldName.setText("Current Name: " + name);
    }

    public void setOldAge(int age) {
        oldAge.setText("Current Age: " + age);
    }

    // Методы для получения введённых пользователем данных
    public String getNewName() {
        return newName.getText();
    }

    public int getNewAge() {
        try {
            return Integer.parseInt(newAge.getText());
        } catch (NumberFormatException e) {
            newAge.setText("Ошибка ввода");
            return 0;
        }
    }

    public JButton button() {
        return button;
    }
}

