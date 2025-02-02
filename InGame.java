import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Players.*;

public class InGame {
    JLabel player;
    JLabel enemy;
    JLabel bullet;

    public InGame(JFrame frame) {
        ImageIcon playIco = new ImageIcon("IMG_0369.png");
        player = new JLabel(playIco);
        player.setBounds(280, 400, playIco.getIconWidth(), playIco.getIconHeight());
        frame.add(player);

    }
}
