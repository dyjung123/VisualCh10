import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickC extends JFrame{
    Container c;
    JLabel la = new JLabel("c");
    ClickC() {                               // 프로그램 실행시 각각 설정.
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        la.setLocation(100,100);
        la.setSize(50,50);
        la.addMouseListener(new MyMouseListener());   // JLabel la에 MyMouseListener() 추가, 이벤트 처리.
        c.add(la);                                    // la를 Container에 추가

        setSize(1200,900);
        setVisible(true);
        c.requestFocus();
    }
    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            double randomvalue = Math.random();             // c의 x축 좌표를 결정
            int x = (int)(randomvalue * 600);               // x : 0~599
            randomvalue = Math.random();                     // c의 y축 좌표를 결정
            int y = (int)(randomvalue * 450);               // y : 0~450
            la.setLocation(x,y);
//            System.out.print("x:" + x + " y:" + y + "\n");  // c의 좌표 출력
        }
    }
    public static void main(String[] args) {
        new ClickC();
    }
}
