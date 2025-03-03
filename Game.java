import java.awt.Color;
import javax.swing.JFrame;

public class Game {
    private JFrame frame;
    public Game() {
        frame = new JFrame("SPACEZ");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(720, 840);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        new gameMenu(frame);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}