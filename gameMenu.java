import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gameMenu {
    protected JLabel highScore;
    protected int intScore;
    JLabel stage;
    JButton start;
    JLabel gameName;
    JButton credit;
    

    public gameMenu(JFrame frame) {
        gameName = new JLabel("SPACEZ");
        gameName.setBounds(130,100,600,70);
        gameName.setFont(new Font("SpaceX", Font.BOLD, 72));
        gameName.setForeground(new Color(0, 255, 255));

        start = new JButton("Start!!!!");
        start.setBounds(280,325,150,50);
        start.setBackground(new Color(255, 102, 0)); start.setForeground(new Color(0, 0, 0));
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

        credit = new JButton("Credit");
        credit.setBounds(280,380,150,50);
        credit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().setBackground(Color.BLACK);
                frame.revalidate();
                frame.repaint();
                creditMenu(frame);
            }
        });

        highScore = new JLabel("High Score : " + intScore);
        highScore.setBounds(200, 35, 800, 40);
        highScore.setFont(new Font("SpaceX",Font.PLAIN,24));
        highScore.setForeground(Color.WHITE);

        frame.add(gameName); frame.add(start); frame.add(highScore); frame.add(credit);
        frame.setVisible(true);
    }
    private void creditMenu(JFrame frame) {
        JLabel memb = new JLabel("<html>Emmy<br>Chawin<br>Bonus<br>Peak</html>");
        memb.setBounds(320,250,500,400);
        memb.setFont(new Font("SpaceX", Font.PLAIN, 20));
        memb.setForeground(Color.WHITE);
        frame.add(memb);
    }
}
