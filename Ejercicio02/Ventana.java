import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Ventana extends Frame
{
    Dibujo1 dibujo1;
    Dibujo2 dibujo2;

    public Ventana(String titulo)
    {
        super(titulo);
        
        dibujo1 = new Dibujo1();
        dibujo2 = new Dibujo2();

        setLayout(new GridLayout(1,2) );
        add(dibujo2);
        add(dibujo1);

        addWindowListener( new CierraVentana() );

        setSize(350,350);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

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