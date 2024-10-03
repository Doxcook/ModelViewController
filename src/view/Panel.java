package view;

import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


//самый глупый чел, умеет только показывать что ему скажут

public class Panel extends JPanel implements Observer {
    JLabel oldName;
    JLabel oldAge;
    JTextField newName;
    JTextField newAge;
    JLabel space;
    JButton button;
    JTextField echo;


    public Panel(Controller controller) {
        setLayout(new GridLayout(3,2));

        oldName = new JLabel();
        oldAge = new JLabel();
        newName = new JTextField();
        newAge = new JTextField();
        echo = new JTextField();
        button = new JButton("Update");

        add(oldName);
        add(oldAge);
        add(newName);
        add(newAge);
        add(echo);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //получаем введенные данные
                String getName = getNewName();
                int age = getNewAge();

                //обновляем данные объекта
                controller.setName(getName);
                controller.setAge(age);

                //Обновляем интерфейс
                setOldName(controller.getName());
                setOldAge(controller.getAge());
            }
        });


    }


    public void setOldName(String name) {
        oldName.setText("Current Name: " + name);
    }

    public void setOldAge(int age) {
        oldAge.setText("Current Age: " + age);
    }


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

    @Override
    public void update(Observable o, Object arg) {
        echo.setText("echo myu");
    }


//    public JButton button() {
//        return button;
//    }
}

