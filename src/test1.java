//자바 과제 아님.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 extends JFrame {
    test1() {
        setTitle("TEST");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Hello");
        btn.addActionListener(new MyActionListener("1"));
        btn.addActionListener(new MyActionListener("2"));
        btn.addActionListener(new MyActionListener("3")); // 3 2 1순으로 출력됨.

        add(btn);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new test1();
    }
}

class MyActionListener implements ActionListener {
    private String msg;
    public MyActionListener(String msg) { this.msg = msg; }
    public void actionPerformed(ActionEvent e) { System.out.println(msg); }
}
