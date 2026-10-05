package mar;

import javax.swing.JFrame;

public class App extends JFrame {
    int WIDTH = 500;
    int HEIGHT = 300;
    int X = 500;
    int Y = 500;

    public App() {
        super("App");

        setBounds(X, Y, WIDTH, HEIGHT);
        setVisible(true);
    }

    public void run() {
        while (true) {
            update();
        }
    }

    void update() {

    }
}
