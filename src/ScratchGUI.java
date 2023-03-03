

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ComponentListener;

public class ScratchGUI extends JFrame {

    public ScratchGUI() {
        setPreferredSize(new Dimension(500, 500));
        setMinimumSize(new Dimension(500, 500));
        setLocation(2000, 1000);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.GREEN);

        Container smallerPanel = new ResizePanel();
        addComponentListener((ComponentListener) smallerPanel);

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;

        panel.add(smallerPanel);
        setContentPane(panel);
        pack();


        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ScratchGUI();
    }
}

