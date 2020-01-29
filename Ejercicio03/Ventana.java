import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Ventana extends Frame
{
    Dibujo dibujo;
    Panel punto1,punto2, panelDatos;
    TextField puntox1,puntoy1,puntox2, puntoy2;
    Label lblPunto1, lblPunto2;
    Button btnGraficar;


    public Ventana(String titulo)
    {
        super(titulo);

        dibujo = new Dibujo();
        
        panelDatos = new Panel();
        panelDatos.setLayout(new GridLayout(6,1));
        punto1 = new Panel();
        punto1.setLayout(new GridLayout(1,2));
        punto2 = new Panel();
        punto2.setLayout(new GridLayout(1,2));

        lblPunto1 = new Label("Punto 1:");
        lblPunto2 = new Label("Punto 2:");

        puntox1 = new TextField("0");
        puntoy1 = new TextField("0");
        puntox2 = new TextField("0");
        puntoy2 = new TextField("0");

        btnGraficar = new Button("Graficar!");
        btnGraficar.addActionListener(new BotonGrafica());

        punto1.add(puntox1); punto1.add(puntoy1);
        punto2.add(puntox2); punto2.add(puntoy2);

        panelDatos.add(lblPunto1);
        panelDatos.add(punto1);
        panelDatos.add(lblPunto2);
        panelDatos.add(punto2);
        panelDatos.add(btnGraficar);

        add(panelDatos, "West");
        add(dibujo, "Center");
  

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

    private class BotonGrafica implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            int x1 = Integer.parseInt(puntox1.getText() );
            int y1 = Integer.parseInt(puntoy1.getText() );
            int x2 = Integer.parseInt(puntox2.getText() );
            int y2 = Integer.parseInt(puntoy2.getText() );

            dibujo.setPuntos(x1, y1, x2, y2);
            dibujo.repaint();
        }
    }

}