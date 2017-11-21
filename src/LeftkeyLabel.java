import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeftkeyLabel extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la = new JLabel("Love Java");
    LeftkeyLabel() {
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.addKeyListener(new MyKeyListener());
        la.setLocation(250,40);
        la.setSize(100,20);
        contentPane.add(la);

        setSize(600,450);
        setVisible(true);
        contentPane.requestFocus();   // contentPane에 Focus
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {        // key가 눌러지는 이벤트 처리
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {   // 눌러진 키가 <LEFT> 키
                String tmp = la.getText();
                String newname =  tmp.substring(1,9) + tmp.substring(0,1); // 문자열의 첫째 문자를 맨 뒤로 보내 출력
                la.setText(newname);
            }
        }
    }
    public static void main(String[] args) {
        new LeftkeyLabel();
    }


}
