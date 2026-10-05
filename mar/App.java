package mar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JFrame {
    int WIDTH = 500;
    int HEIGHT = 300;
    int X = 500;
    int Y = 500;

    public App() {
        super("App");

        setBounds(X, Y, WIDTH, HEIGHT);
        setVisible(true);

        var panel = new JPanel();

        var saveButton = new JButton("Click Me");

        panel.add(saveButton);
        add(panel);
    }

    public void run() {
        while (true) {
            update();
        }
    }

    void update() {

    }
}
