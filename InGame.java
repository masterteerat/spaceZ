import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InGame {
    JLabel player;
    JLabel enemy;
    JLabel bullet;

    public InGame(JFrame frame) {
        ImageIcon playIco = new ImageIcon(getClass().getResource("/Players/player1.png"));
        player = new JLabel(playIco);
        player.setBounds(280, 840, playIco.getIconWidth(), playIco.getIconHeight());
        frame.add(player);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        playerMove(frame, playIco);
    }
    private void playerMove(JFrame frame, ImageIcon playerIcon) {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = player.getX();
                int y = player.getY();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> player.setBounds(x - 10, y, playerIcon.getIconWidth(), playerIcon.getIconHeight());
                    case KeyEvent.VK_RIGHT -> player.setBounds(x + 10, y, playerIcon.getIconWidth(), playerIcon.getIconHeight());
                    case KeyEvent.VK_UP -> player.setBounds(x, y - 10, playerIcon.getIconWidth(), playerIcon.getIconHeight());
                    case KeyEvent.VK_DOWN -> player.setBounds(x, y + 10, playerIcon.getIconWidth(), playerIcon.getIconHeight());
                }
                frame.repaint();
            }
            @Override
            public void keyReleased(KeyEvent e) { }
            @Override
            public void keyTyped(KeyEvent e) { }
        });
    }
}
