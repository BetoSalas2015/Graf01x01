import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Ventana extends Frame
{
    Punto p1,p2, p3, p4;

    public Ventana(String titulo)
    {
        super(titulo);

        p1 = new Punto(100 , 100);
        p2 = new Punto(150 , 150);
        p3 = new Punto(100 , 200);
        p4 = new Punto(50 , 150);

        addWindowListener( new CierraVentana() );

        setSize(350,350);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new Line2D.Float(p1.getX(),p1.getY(),p2.getX(),p2.getY()));
        g2d.draw(new Line2D.Float(p2.getX(),p2.getY(),p3.getX(),p3.getY()));
        g2d.draw(new Line2D.Float(p3.getX(),p3.getY(),p4.getX(),p4.getY()));
        g2d.draw(new Line2D.Float(p4.getX(),p4.getY(),p1.getX(),p1.getY()));

    }

     public static void main(String[] args) {
        
        Ventana ventana = new Ventana("Graficos en Java");
    }

    private class CierraVentana extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
    }

}