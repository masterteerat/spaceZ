import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gameMenu {
    protected JLabel highScore;
    JLabel stage;
    JButton start;
    JLabel gameName;
    JLabel credit;

    public gameMenu(JFrame frame) {
        gameName = new JLabel("SPACEZ");
        gameName.setBounds(130,100,600,70);
        gameName.setFont(new Font("SpaceX", Font.BOLD, 72));
        gameName.setForeground(new Color(0, 255, 255));

        start = new JButton("Start!!!!");
        start.setBounds(280,400,150,50);
        start.setBackground(new Color(255, 102, 0)); start.setForeground(new Color(0, 0, 0));

        highScore = new JLabel("");
        // highScore.setBounds

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().setBackground(Color.BLACK);
                frame.revalidate();
                frame.repaint();
                new InGame(frame);
            }
        });
        frame.add(gameName); frame.add(start); frame.add(highScore);
        frame.setVisible(true);
    }
}
