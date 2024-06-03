import java.awt.*;

public class panelExample {
    panelExample() {
        Frame f = new Frame();
        Panel panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.red);
        Button b1 = new Button("button 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        Button b2 = new Button("Button 2");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.cyan);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
 public static void main(String[] args) {
     new panelExample();
 }
}
