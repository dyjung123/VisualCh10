import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlusMinusKey extends JFrame {
    JPanel contentPane = new JPanel();
    JLabel la;
    PlusMinusKey() {
        setTitle("TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.addKeyListener(new MyKeyListener());
        la = new JLabel("Love Java");                         // Label 객체 생성
        la.setFont(new Font("Arial", Font.PLAIN, 10));   // 폰트 글자체, 사이즈 설정
        la.setLocation(0,0);
        la.setHorizontalAlignment(SwingConstants.CENTER);    //폰트를 가운데 정렬
        la.setSize(600, 450);           // 라벨 자체의 사이즈를 프레임과 맞춤.
        contentPane.add(la);

        setSize(600,450);
        setVisible(true);
        contentPane.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            Font f = la.getFont();
            int size = f.getSize();
            if(e.getKeyCode() == KeyEvent.VK_EQUALS) {        // Plus키를 입력받으면 폰트 사이즈 증가.
                la.setFont(new Font("Arial", Font.PLAIN, size+5));
            }
            if(e.getKeyCode() == KeyEvent.VK_MINUS) {         // Minus키를 입력받으면 폰트 사이즈 감소
                la.setFont(new Font("Arial", Font.PLAIN, size-5));
            }
        }
    }
    public static void main(String[] args) {
        new PlusMinusKey();
    }
}
