import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.applet.*;

public class hello extends Applet implements ActionListener
{
    TextField t1,t2;
    String s;
    public void init()
    {
        t1= new TextField("0");
        t2= new TextField("0");
        Button b1=new Button("+");
        Button b2=new Button("-");
        Button b3=new Button("/");
        Button b4=new Button("*");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(s, 100, 50);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int x=0,y=0,z=0;
        try
        {
            x=Integer.parseInt(t1.getText());
            y=Integer.parseInt(t2.getText());
            
            s=ae.getActionCommand();
            if(s.equals("+"))
                z=x+y;
            else if(s.equals("-"))
                z=x-y;
            else if(s.equals("*"))
                z=x*y;
            else if(s.equals("/"))
                    z=x/y;
            s=String.valueOf(z);
            repaint();
        }
        catch(Exception e)
        {
            System.out.println("Wrong Input Type "+e);
        }
    }
}