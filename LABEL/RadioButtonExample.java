// import java.awt.*;
// import java.awt.event.*;

// public class itemlistenerexample implements ItemListener {
//     Checkbox checkbox1, checkbox2;
//     Label label;

//     itemlistenerexample() {
//         Frame f = new Frame("ItemListener Example");
//         label = new Label();
//         label.setAlignment(Label.CENTER);
//         label.setSize(400, 100);
//         checkbox1 = new Checkbox("c++");
//         checkbox1.setBounds(100, 100, 50, 50);
//         checkbox2 = new Checkbox("Java");
//         checkbox2.setBounds(100, 150, 50, 50);
//         f.add(checkbox1);
//         f.add(checkbox2);
//         f.add(label);
//         checkbox1.addItemListener(this);
//         checkbox2.addItemListener(this);
//         f.setSize(400, 400);
//         f.setLayout(null);
//         f.setVisible(true);

//     }

//     public void itemStateChanged(ItemEvent ie) {
//         if (ie.getSource() == checkbox1)
//             label.setText("c++ checkbox:" + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
//         if (ie.getSource() == checkbox2)
//             label.setText("Java Checkbox: "
//                     + (ie.getStateChange() == 1 ? "checked" : "unchecked"));

//     }

//     public static void main(String[] args) {
//         new itemlistenerexample();

//     }

// }


import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample implements ItemListener {
    CheckboxGroup group;
    Checkbox radioButton1, radioButton2;
    Label label;

    RadioButtonExample() {
        Frame f = new Frame("RadioButton Example");
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        group = new CheckboxGroup();
        radioButton1 = new Checkbox("c++", group, true);
        radioButton1.setBounds(100, 100, 50, 50);
        radioButton2 = new Checkbox("Java", group, false);
        radioButton2.setBounds(100, 150, 50, 50);
        f.add(radioButton1);
        f.add(radioButton2);
        f.add(label);
        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == radioButton1)
            label.setText("c++ radio button: " + (ie.getStateChange() == 1 ? "selected" : "deselected"));
        if (ie.getSource() == radioButton2)
            label.setText("Java radio button: " + (ie.getStateChange() == 1 ? "selected" : "deselected"));
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}