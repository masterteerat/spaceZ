import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PixelAnimation extends JPanel implements ActionListener {
    private final int PIXEL_SIZE = 10;  // ขนาดของพิกเซล
    private final int WIDTH = 400, HEIGHT = 200; // ขนาดหน้าต่าง
    private Timer timer;
    private int frame = 0;  // เฟรมของ animation

    public PixelAnimation() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        timer = new Timer(100, this); // 100ms = 10 FPS
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // วาดพื้นหลังสีดำ
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        
        // วาดพิกเซล (เปลี่ยนตำแหน่งตาม frame)
        g2d.setColor(Color.RED);
        int x = 50 + frame * PIXEL_SIZE; // เคลื่อนที่ไปทางขวา
        int y = 100; // คงที่
        g2d.fillRect(x, y, PIXEL_SIZE, PIXEL_SIZE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame++; // เพิ่ม frame
        if (frame > 30) frame = 0; // Reset animation loop
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pixel Animation");
        PixelAnimation animation = new PixelAnimation();
        frame.add(animation);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}