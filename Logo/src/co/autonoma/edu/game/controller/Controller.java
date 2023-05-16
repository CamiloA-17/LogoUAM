
package co.autonoma.edu.game.controller;
import co.autonoma.edu.game.elements.Interpreter;
import co.autonoma.edu.game.gui.Window;

public class Controller {
    public static void main(String[] args) {
        Window mainWindow = new Window();
        Interpreter interpreter = new Interpreter();
        mainWindow.setInterpreter(interpreter);
        mainWindow.setVisible(true);
    }
}
