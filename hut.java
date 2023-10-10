import java.applet.*;
import java.awt.*;
public class hut extends Applet{
    int x;
    public void init(){
        x=0;
    }
    public void start(){

    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(35,45,200,175);
         g.setColor(Color.pink);
        g.fillRect(90,150,70,70);
        g.setColor(Color.red);
        g.drawLine(135,0,35,45);
         g.setColor(Color.red);
        g.drawLine(135,0,235,45);
        g.setColor(Color.red);
        g.fillOval(100,195,x,x);
        
        x=x+5;
        try{
        Thread.sleep(100);
        }catch(Exception e){}
        if(x==20)
        x=0;
        repaint();
    }
    public void stop()
    {

    }
    public void destroy(){

    }
}
/*<applet code="hut" width="400" height="500"></applet> */