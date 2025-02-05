package Monster;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public abstract class Enemy {
	int speed;
    ImageIcon icon;
    public JLabel enmy;

    public void move() {

    }
    public void shoot() {

    }
    public boolean checkHit() {
        return false;
    }
}