import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ChangeBGC extends JFrame {
    JPanel contentPane = new JPanel();
    ChangeBGC() {
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);

        contentPane.addMouseMotionListener(new MyMouseListener());// MouseMotionListener가 구현된 MyMouseListener()추가

        setSize(600,450);
        setVisible(true);
    }

    class MyMouseListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {   // 마우스 드래그 이벤트 발생시 배경 노란색
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseMoved(MouseEvent e) {    // 마우스가 그냥 움직이면 배경 초록색
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ChangeBGC();
    }

}
