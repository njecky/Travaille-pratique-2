import model.modele;
import view.View;
import controller.contoller;

public class App {
    public static void main(String[] args) throws Exception {
        modele model = new modele();
        View view = new View();
        contoller contoller = new contoller(model, view);
        contoller.initialize();
        // System.out.println("Hello, World Njecky félix Désiré!");
    }
}
