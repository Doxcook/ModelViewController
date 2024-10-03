package controller;

import model.ModelCat;
import view.Frame;
import view.Panel;

// самый умный чел среди всех, управляет всеми сразу

public class Controller {

    // Для того чтобы иметь доступ к классам
    ModelCat cat;
    Frame frame;
    Panel panel;

    public Controller() {
        cat = new ModelCat("Musa", 3);
        panel = new Panel(this);
        cat.addObserver(panel);
        frame = new Frame(panel);

        panel.setOldName(cat.getName());
        panel.setOldAge(cat.getAge());

//        panel.button().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //получаем введенные данные
//                String getName = panel.getNewName();
//                int age = panel.getNewAge();
//
//                //обновляем данные объекта
//                cat.setName(getName);
//                cat.setAge(age);
//
//                //Обновляем интерфейс
//                panel.setOldName(cat.getName());
//                panel.setOldAge(cat.getAge());
//
//            }
//        });
    }
    public void setAge(int age){
        cat.setAge(age);
    }

    public String getName(){
        return cat.getName();
    }

    public int getAge(){
        return cat.getAge();
    }

    public void setName(String getName) {
        cat.setName(getName);
    }
}
