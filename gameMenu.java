import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class gameMenu extends Game {
    
    public gameMenu() {
        frame = new JFrame("SPACEZ");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(720,1000);
        frame.getContentPane().setBackground(Color.BLACK);

        setElement();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void setElement() {
        gameName = new JLabel("SPACEZ");
        gameName.setBounds(130,100,600,70);
        gameName.setFont(new Font("SpaceX", Font.BOLD, 72));
        gameName.setForeground(new Color(0, 255, 255));

        start = new JButton("Start!!!!");
        start.setBounds(280,400,150,50);
        start.setBackground(new Color(255, 102, 0)); start.setForeground(new Color(0, 0, 0));

        highScore = new JLabel("");
        // highScore.setBounds


        frame.add(gameName); frame.add(start); frame.add(highScore);
    }
}
