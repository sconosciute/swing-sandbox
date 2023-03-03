import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ResizePanel extends JPanel implements ComponentListener {
    public ResizePanel(){

        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.CYAN);

    }


    @Override
    public void componentResized(ComponentEvent e) {
        Dimension pSize = e.getComponent().getSize();
        Dimension newSize = new Dimension(pSize.width - 50, pSize.height - 50);
        System.out.println("Resizing from \n" + "Frame: " + pSize +
                "\n Current Size:" + getSize() +
                "\n Resizing to:" + newSize);

        setPreferredSize(new Dimension(newSize.width, newSize.height));
        System.out.println("Actually resized to: " + getSize().toString());
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
