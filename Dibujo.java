import java.awt.*;
import java.awt.geom.*;

import javafx.geometry.Rectangle2D;

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
        Color color = new Color(1.0f, 0.0f, 0.0f);
        Font fuente = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 15);

        g2d.setPaint(new GradientPaint(69, 150, Color.BLUE, 170, 225, Color.YELLOW, false));



        

        g2d.fill(new Rectangle.Float(69, 150, 150, 135));

        g2d.setStroke(new BasicStroke(5.0f));

        g2d.setPaint(Color.RED);
        g2d.draw(new Line2D.Float(50,66, 200,155));
        //g.translate(100, 100);
        /*g.setColor(Color.pink);
        g.setFont(fuente);
        g.drawString("Saludos Programas", 100, 100);

        g.drawLine(50, 66, 200, 155);

        g.setColor(Color.red);
        g.fillRect(69, 150, 60, 35);
        g.clearRect(75, 155, 30, 10);
        g.fillRoundRect(150, 200, 70, 70, 70, 70);

        g.fillOval(50, 200, 56, 56);

        g.setColor(Color.yellow);
        g.fillArc(250, 200, 70, 70, 45, 270);
        g.setColor(Color.white);
        g.fillOval(275, 225, 10, 10);

        int xpoints[] = { 25,47,158,39,66,90};
        int ypoints[] = { 90,110,200,39,155,85};

        g.setColor(Color.magenta);
        //g.fillPolygon(xpoints,ypoints, 5);

        Polygon polygon = new Polygon(xpoints, ypoints, 5);
        g.fillPolygon(polygon);*/


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