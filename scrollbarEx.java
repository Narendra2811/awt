
import java.awt.*;
public class scrollbarEx {
   scrollbarEx() {
      Frame f = new Frame("scro;;bar example");
      Scrollbar s = new Scrollbar();
      s.setBounds(100, 100, 50, 200);
      f.add(s);
      f.setSize(400, 400);
      f.setLayout(null);
      f.setVisible(true);
   }
   
   public static void main(String args[]) {
      new scrollbarEx();
   }
}
