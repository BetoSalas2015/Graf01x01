import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Vector;

public class Ventana extends Frame
{
    private Vector<Punto> vectorPuntos;     // manejador

    public Ventana(String titulo)
    {
        super(titulo);

        vectorPuntos = new Vector<Punto>();

        vectorPuntos.add( new Punto(100 , 100));
        vectorPuntos.add( new Punto(150 , 150));
        vectorPuntos.add( new Punto(100 , 200));
        vectorPuntos.add( new Punto(50 , 150));

        addWindowListener( new CierraVentana() );

        setSize(350,350);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        int i;
        Graphics2D g2d = (Graphics2D) g;
        for( i = 0; i < vectorPuntos.size() - 1; ++i)
            g2d.draw( new Line2D.Float(vectorPuntos.get(i).getX(),vectorPuntos.get(i).getY(),
                                       vectorPuntos.get(i + 1).getX(),vectorPuntos.get(i + 1).getY()));
        g2d.draw( new Line2D.Float(vectorPuntos.get(i).getX(),vectorPuntos.get(i).getY(),
                                vectorPuntos.get(0).getX(),vectorPuntos.get(0).getY()));
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