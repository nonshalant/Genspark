import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

import static javax.swing.JFrame.*;

public class humanVsGoblins {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(2,3));

        frame.add(new JButton("North"));
        frame.add(new JButton("South"));
        frame.add(new JButton("East"));
        frame.add(new JButton("West"));

        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(1,1));
        frame.setVisible(true);
    }
}
