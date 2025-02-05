package Monster;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class en01 extends Enemy {
    public en01() {
        speed = 2;
        icon = new ImageIcon(getClass().getResource("/en01.png"));
        enmy = new JLabel(icon);
    }
}
