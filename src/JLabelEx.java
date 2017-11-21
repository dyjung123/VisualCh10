import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLabelEx extends JFrame{
    JLabel la;

    JLabelEx() {
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        la = new JLabel("사랑해");
        la.setLocation(250,100);
        la.setSize(100,50);
        la.addMouseListener(new MyMouseListener());
        c.add(la);

        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelEx();
    }
    class MyMouseListener extends MouseAdapter {  // 필요한 메소드만 구현하기 위해 Adapter 상속받음
        @Override
        public void mouseEntered(MouseEvent e) {  // 마우스가 라벨위에 올라오면 실행
            JLabel p = (JLabel)e.getSource();
            p.setText("Love Java");
        }

        @Override
        public void mouseExited(MouseEvent e) {  // 마우스가 라벨에서 내려오면 실행
            JLabel p = (JLabel)e.getSource();
            p.setText("사랑해");
        }
    }
}
