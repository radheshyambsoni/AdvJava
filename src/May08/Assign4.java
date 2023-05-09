package May08;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Assign4 extends Canvas {
    JFrame jf;
    int shapeNum=0;
    boolean redOrGreen = false;

    public Assign4() {
        jf = new JFrame("Assignment 4");
        jf.setSize(400, 400);

        JPanel mainPanel = new JPanel(new BorderLayout(ALLBITS, ABORT));
        jf.add(mainPanel);

        JPanel shapePanel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                Shape s;

                if (shapeNum == 1) {
                    s=new Square(100);
                    g2d.draw(s);
                    if(redOrGreen){
                        g2d.setColor(Color.RED);
                        g2d.fill(s);
                    }else{
                        g2d.setColor(Color.GREEN);
                        g2d.fill(s);
                    }
                }else if(shapeNum==2){
                    s=new Circle(100);
                    g2d.draw(s);
                    if(redOrGreen){
                        g2d.setColor(Color.RED);
                        g2d.fill(s);
                    }else{
                        g2d.setColor(Color.GREEN);
                        g2d.fill(s);
                    }
                }else if(shapeNum==3){
                    s=new Sphere(100);
                    g2d.draw(s);
                }else if(shapeNum==4){
                    s=new Cube(100);
                    g2d.draw(s);
                }
        
            }
        };
        mainPanel.add(shapePanel);

        JMenuBar jmb = new JMenuBar();

        JMenu shapes = new JMenu("Shapes");
        JMenu twoDShapes = new JMenu("2D Shapes");
        JMenu threeDShapes = new JMenu("3D Shapes");
        JMenu colors = new JMenu("Colors");

        JMenuItem circle = new JMenuItem("Circle");
        JMenuItem square = new JMenuItem("Square");
        JMenuItem sphere = new JMenuItem("Sphere");
        JMenuItem cube = new JMenuItem("Cube");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");

        twoDShapes.add(circle);
        twoDShapes.add(square);

        threeDShapes.add(sphere);
        threeDShapes.add(cube);
        colors.add(red);
        colors.add(green);

        shapes.add(twoDShapes);
        shapes.add(threeDShapes);

        jmb.add(shapes);
        jmb.add(colors);

        square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeNum = 1;
                shapePanel.repaint();
            }
        });
        circle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeNum = 2;
                shapePanel.repaint();
            }
        });
        cube.addActionListener(e ->{
                shapeNum = 4;
                shapePanel.repaint();
            }
        );
        sphere.addActionListener(e -> {
                shapeNum = 3;
                shapePanel.repaint();
            }
        );

        red.addActionListener(e -> {
                redOrGreen = true;
                shapePanel.repaint();
            }
        );
        green.addActionListener(e ->{
                redOrGreen = false;
                shapePanel.repaint();
            }
        );

        jf.setJMenuBar(jmb);
        // jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Assign4 o = new Assign4();
            o.jf.setVisible(true);
        });
    }
}

class Square extends Path2D.Double {
    public Square(double sideLength) {
        moveTo(0, 0);
        lineTo(sideLength, 0);
        lineTo(sideLength, sideLength);
        lineTo(0, sideLength);
        closePath();
    }
}

class Circle extends Ellipse2D.Double {
    public Circle(double radius) {
        super(0, 0, radius * 2, radius * 2);
    }
}

class Sphere extends Path2D.Double {
    public Sphere(double radius) {
        moveTo(radius, 0);
        for (int i = 1; i <= 180; i++) {
            double x = radius * Math.sin(Math.toRadians(i));
            double y = radius * Math.cos(Math.toRadians(i));
            lineTo(x, y);
        }

        for (int i = 179; i >= 0; i--) {
            double x = -radius * Math.sin(Math.toRadians(i));
            double y = radius * Math.cos(Math.toRadians(i));
            lineTo(x, y);
        }

        closePath();
    }
}

class Cube extends Path2D.Double {
    public Cube(double sideLength) {
        moveTo(0, 0);
        lineTo(sideLength, 0);
        lineTo(sideLength, sideLength);
        lineTo(0, sideLength);
        closePath();
        moveTo(sideLength / 4, 0);
        lineTo((3 * sideLength) / 4, 0);
        lineTo((3 * sideLength) / 4, sideLength / 4);
        lineTo(sideLength / 4, sideLength / 4);
        closePath();
        moveTo(sideLength / 4, (3 * sideLength) / 4);
        lineTo((3 * sideLength) / 4, (3 * sideLength) / 4);
        lineTo((3 * sideLength) / 4, sideLength);
        lineTo(sideLength / 4, sideLength);
        closePath();
        moveTo(0, sideLength / 4);
        lineTo(sideLength / 4, sideLength / 4);
        lineTo(sideLength / 4, (3 * sideLength) / 4);
        lineTo(0, (3 * sideLength) / 4);
        closePath();
        moveTo(sideLength, sideLength / 4);
        lineTo((3 * sideLength) / 4, sideLength / 4);
        lineTo((3 * sideLength) / 4, (3 * sideLength) / 4);
        lineTo(sideLength, (3 * sideLength) / 4);
        closePath();
        moveTo(sideLength / 4, sideLength / 4);
        lineTo((3 * sideLength) / 4, sideLength / 4);
        lineTo((3 * sideLength) / 4, (3 * sideLength) / 4);
        lineTo(sideLength / 4, (3 * sideLength) / 4);
        closePath();
    }
}