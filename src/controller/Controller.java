package controller;

import model.ModelCat;
import view.Frame;
import view.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    // Для того чтобы иметь доступ к классам
    ModelCat cat;
    Frame frame;
    Panel panel;

    public Controller(ModelCat cat) {
        this.cat = cat;
        panel = new Panel(this);
        frame = new Frame(panel);

        panel.setOldName(cat.getName());
        panel.setOldAge(cat.getAge());

        panel.button().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //получаем введенные данные
                String getName = panel.getNewName();
                int age = panel.getNewAge();

                //обновляем данные объекта
                cat.setName(getName);
                cat.setAge(age);

                //Обновляем интерфейс
                panel.setOldName(cat.getName());
                panel.setOldAge(cat.getAge());

            }
        });

    }
}
