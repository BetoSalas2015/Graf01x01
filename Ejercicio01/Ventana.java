import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Dibujo extends Frame
{

    public Dibujo(String titulo)
    {
        super(titulo);

        addWindowListener( new CierraVentana() );

        setSize(350,350);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

    }

     public static void main(String[] args) {
        
        Dibujo dibujo = new Dibujo("Graficos en Java");
    }

    private class CierraVentana extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
    }

}