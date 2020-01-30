import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Vector;

public class Ventana extends Frame
{
    private Vector<Point> vectorPuntos;     // manejador

    public Ventana(String titulo)
    {
        super(titulo);

        vectorPuntos = new Vector<Point>();

        vectorPuntos.add( new Point(100 , 100));
        vectorPuntos.add( new Point(150 , 150));
        vectorPuntos.add( new Point(100 , 200));
        vectorPuntos.add( new Point(50 , 150));

        addWindowListener( new CierraVentana() );

        setSize(350,350);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        int i;
        Graphics2D g2d = (Graphics2D) g;
        for( i = 0; i < vectorPuntos.size() - 1; ++i)
            g2d.draw( new Line2D.Float(vectorPuntos.get(i),vectorPuntos.get(i + 1)));
            g2d.draw( new Line2D.Float(vectorPuntos.get(i),vectorPuntos.get(0)));
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