package framesPackage;


/**
* Class LogoPanel les composantes de l'interface graphique principale.
 * @author Mohamed Akaddar
 * Date 08/03/2022
 *
 *
 * */

import moteurPackage.graphiquePack.JsonToArbre;
import java.awt.*;
import javax.swing.*;
import java.io.*;


public class LogoPanel extends JPanel
{
  protected JButton quitter, personnaliser;

  public LogoPanel(String titre , char c)
  {
    JPanel panel1, panel2;
    panel1 = new JPanel();
    JLabel label = new JLabel();
    label.setText(titre);
    this.add(label);
    this.setBounds(135,100, 500, 80);
  }

  public LogoPanel(String title)
  {
    JLabel Title = new JLabel();
    Title.setText(title);
    Title.setFont(new Font("serif",Font.BOLD ,25));
    this.add(Title);
    this.setBounds(140,60, 500, 50);
  }

  public LogoPanel(int e)
  {
    ImageIcon enter = new ImageIcon("assets/images/enter.png");

    quitter = new JButton("Quitter");
    quitter.setIcon(enter);

    this.add(quitter);

    this.setBounds(140,400, 500, 100);


  }

  public LogoPanel(String a, String path1)
  {
    ImageIcon charger = new ImageIcon(path1);

    personnaliser = new JButton(a);
    personnaliser.setIcon(charger);

    this.add(personnaliser);

    this.setBounds(120,250, 500, 200);

    if(a == "Charger et visualiser mon modèle")
    {
      this.personnaliser.addActionListener(e -> {
        JFileChooser filechooser = new JFileChooser();
        int reponse = filechooser.showOpenDialog(null); // select file to open
        if( reponse == filechooser.APPROVE_OPTION)
        {
          File pathfile  = new File(filechooser.getSelectedFile().getAbsolutePath());
          System.out.println(pathfile);
          JsonToArbre js = new JsonToArbre(""+pathfile);
        }
      });
    }

  }

  public LogoPanel()
  {

  }


}
