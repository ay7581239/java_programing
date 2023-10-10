import java.applet.*;
import java.awt.*;
public class face extends Applet{
    int x;
    public void init(){
        x=0;
    }
    public void start(){

    }
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(25,25,150,175);
         g.setColor(Color.red);//mouth
        g.fillOval(80,150,45,20);
        g.setColor(Color.red);
        g.fillOval(95,100,12,48);
         g.setColor(Color.black);//left eye
        g.fillOval(60,70,20,x);
         g.setColor(Color.black);//right eye
        g.fillOval(125,70,20,x);
       /* g.setColor(Color.blue);
        g.fillOval(60,80,10,x+5);*/
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
/*<applet code="face" width="400" height="500"></applet> */