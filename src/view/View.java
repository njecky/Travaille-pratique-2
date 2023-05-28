package view;

import java.awt.*;
import javax.swing.*;


public class View {
    private JFrame frame;
    private JLabel label;

    public View(){
        frame = new JFrame("Mon Application");
        frame.setLayout(new FlowLayout());
        label = new JLabel();
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void show(){
        frame.setVisible(true);
    }
    public void update(String data){
        label.setText(data);
    }
}
