package moteurPackage.graphiquePack;

/**
* Classe JsonToArbre Crée un arbre depuis un fichier .json et le visualiser en 2D ou 3D.
 * @author Mohamed Akaddar
 * Date 09/03/2022
 * */


 import org.json.simple.JSONArray;
 import org.json.simple.JSONObject;
 import org.json.simple.parser.ParseException;
 import org.json.simple.parser.JSONParser;

 import java.io.FileReader;
 import java.io.Reader;
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.util.Iterator;

 import moteurPackage.reecriturePack.Regles;
  import moteurPackage.reecriturePack.LSysteme;
 import java.util.ArrayList;
 import java.util.List;

public class JsonToArbre
{
  public JsonToArbre(String path)
  {
    JSONParser parser = new JSONParser();
    try (Reader reader = new FileReader(path)){

      JSONObject jsonObject = (JSONObject) parser.parse(reader);
      //System.out.println(jsonObject);

      String axiom = (String) jsonObject.get("axiom");

      double angle = (double) jsonObject.get("angle");

      int nbIterations = ((Long) jsonObject.get("nbIterations")).intValue();

      int nbRegles = ((Long) jsonObject.get("nbRegles")).intValue();

      JSONArray reglesList = (JSONArray) jsonObject.get("regles");
      ArrayList<Regles> r = new ArrayList<Regles>();
      JSONObject obj;
      for(int i=0; i<nbRegles; i++)
      {
        obj = (JSONObject) reglesList.get(i);

        String lettre = (String) obj.get((i+1)+".a");
        String lettreT = (String) obj.get((i+1)+".b");

        r.add(new Regles(lettre, lettreT));
      }

      LSysteme l = new LSysteme(axiom, r);
      String arbre = l.generer(nbIterations);
      Interpreteur i = new  Interpreteur(10,angle);
  		i.visualiser2D(arbre);

    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
  }

}
