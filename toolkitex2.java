
import java.awt.*;
public class toolkitex2 {
    toolkitex2() {
        Frame f = new Frame("Toolkit Example");
        Image icon = Toolkit.getDefaultToolkit().getImage("image.png");
    f.setIconImage(icon);  
    f.setLayout(null);   
    f.setSize(400,400);   
    f.setVisible(true);   
  
    }
    public static void main(String args[]){   
        new toolkitex2();   
    }  
}  

