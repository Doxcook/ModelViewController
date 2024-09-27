import controller.Controller;
import model.ModelCat;


public class Main {
    public static void main(String[] args) {
        //создаем кошку
        ModelCat cat = new ModelCat("Musa", 3);

        Controller controller = new Controller(cat);
    }
}
