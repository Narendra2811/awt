import java.awt.*;

public class all_componants {
    all_componants() {
        Frame f = new Frame();
        Label l = new Label("Employee id");
        l.setBounds(30, 70, 150, 30);
        f.add(l);

        Button b = new Button("Submit");
        b.setBounds(30, 130, 80, 30);
        f.add(b);

        TextField t = new TextField();
        t.setBounds(200, 70, 150, 30);
        f.add(t);

        TextArea ta = new TextArea();
        ta.setBounds(30, 180, 100, 100);
        f.add(ta);

        Checkbox checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(140, 130, 50, 50);
        f.add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Java", true);
        checkbox2.setBounds(190, 130, 50, 50);
        f.add(checkbox2);

        Choice c = new Choice();
        c.setBounds(30, 200, 150, 30);
        c.add("item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("menu");
        Menu submenu = new Menu("Sub menu");
        MenuItem i1 = new MenuItem("item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4); // we will create subpartical for menu.....
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setMenuBar(mb);

        Panel panel = new Panel();
        panel.setBounds(30, 400, 80, 80);
        panel.setBackground(Color.gray);
        f.add(panel);

        f.setSize(500, 500);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        all_componants obj = new all_componants();
    }
}