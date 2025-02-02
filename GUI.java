import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SPACEZ");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(720,1000);
        frame.getContentPane().setBackground(Color.BLACK);

        JLabel gameName = new JLabel("SPACEZ");
        gameName.setBounds(210,100,300,70);
        gameName.setFont(new Font("Arial", Font.BOLD, 72));

        JButton button = new JButton("Start!!!!");
        button.setBounds(280,400,150,50);

        frame.add(button); frame.add(gameName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
