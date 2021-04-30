import java.awt.*;
import java.applet.*;

public class helloapp extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(100,100,100,100);
        g.drawOval(300,100,100,75);
        g.drawRect(500, 100, 100, 75);
        g.drawLine(100, 250, 300, 250);
        g.drawRect(100, 300, 100, 100);
    }
}