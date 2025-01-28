import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SPACEZ");
        frame.setLayout(null);
        frame.setSize(1280,720);

        JButton button = new JButton("Test");
        button.setBounds(100,200,600,50);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
