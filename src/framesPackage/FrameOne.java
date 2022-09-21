package framesPackage;

/**
* Class FrameOne la construction de l'interface graphique principale.
 * @author Mohamed Akaddar
 * Date 08/03/2022
 * */

import java.awt.*;
import javax.swing.*;
public class FrameOne extends JFrame
{
  LogoPanel panel;
  
  public FrameOne()
  {

    super("L-Système Application");


    LogoPanel panel = new LogoPanel("Université de Caen Normandie",'c');
    this.add(panel);

    LogoPanel panel2 = new LogoPanel("L-Systèmes plantes");
    this.add(panel2);

    LogoPanel panel3 = new LogoPanel(3);
    this.add(panel3);

    LogoPanel panel4 = new LogoPanel("Charger et visualiser mon modèle" , "assets/images/importer.png");
    this.add(panel4);

    panel3.quitter.addActionListener(e -> {this.dispose();});





    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(750,600);
    this.setResizable(false);
    this.setVisible(true);
  }
}
