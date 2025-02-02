import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SPACEZ");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(720,1000);
        frame.getContentPane().setBackground(Color.BLACK);

        JLabel gameName = new JLabel("SPACEZ");
        gameName.setBounds(130,100,600,70);
        gameName.setFont(new Font("SpaceX", Font.BOLD, 72));
        gameName.setForeground(new Color(0, 255, 255));

        JButton button = new JButton("Start!!!!");
        button.setBounds(280,400,150,50);
        button.setBackground(new Color(255, 102, 0)); button.setForeground(new Color(0, 0, 0));

        ImageIcon starImg = new ImageIcon("Screenshot (3).jpg");
        JLabel starImgLabel = new JLabel(starImg);
        starImgLabel.setBounds(250,230,500,250); frame.add(starImgLabel);

        button.addActionListener(new ActionListener() { // Anonymous !!!!!
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().setBackground(Color.BLACK);
                frame.revalidate();
                frame.repaint();
                InGame.Main();
            }
        });

        frame.add(button); frame.add(gameName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
