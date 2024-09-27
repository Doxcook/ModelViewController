import controller.Controller;
import model.ModelCat;
import view.Frame;
import view.Panel;

public class Main {
    public static void main(String[] args) {
        // Создаем модель кошки
        ModelCat cat = new ModelCat("Musa", 3);

        // Создаем контроллер и передаем в него модель
        Controller controller = new Controller(cat);
    }
}
