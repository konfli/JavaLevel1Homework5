package homework8;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JTextField jtf = new JTextField();

        add(jtf);

        String[] chars = new String[]{
                "%", "CE", "C", "<---",
                " ", "7", "8", "9", "*",
                " ", "4", "5", "6", "-",
                " ", "1", "2", "3", "+",
                " ", "0", ",", "=", "/"};
        setLayout(new GridLayout(6, 4));
        for (int i = 0; i < chars.length; i++) {
            JButton jb = new JButton(String.valueOf(chars[i]));
            jb.addActionListener(new ButtonListener(jtf));
            add(jb);
        }

    }
}




