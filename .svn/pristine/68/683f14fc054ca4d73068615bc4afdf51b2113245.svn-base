package moteurPackage.graphiquePack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.scene.PerspectiveCamera;
import javafx.animation.RotateTransition;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.geometry.Point3D;
import javafx.scene.transform.Translate;

public class Tortue3D extends Application {


    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        //Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        //create the sphere
        Sphere sphere = new Sphere();

        //Setting the preoperties of the Sphere
        sphere.setRadius(100.0);

        sphere.setTranslateX(300);
        sphere.setTranslateY(150);

        //Points 3D
        Point3D p1 = new Point3D(500,800,50);
        double dist = 200;
        Point3D p2 = new Point3D(p1.getX(),p1.getY()-dist,50);

        //Draw a line
        //Line l1 = new Line(p1,p2);

        //Create a groupe object
        Group root = new Group(createConnection(p1,p2));


        //Creating a scene object
        Scene scene = new Scene(root, 1000, 800);

        // create a Path
        Path p = new Path();

        MoveTo moveto = new MoveTo();
        moveto.setX(500);
        moveto.setY(800);

        LineTo line = new LineTo();
        line.setX(500);
        line.setY(500);






        //Setting camera
      PerspectiveCamera camera = new PerspectiveCamera(false);
      camera.setTranslateX(0);
      camera.setTranslateY(0);
      camera.setTranslateZ(0);
      scene.setCamera(camera);
        //Setting title to the Stage
      stage.setTitle("L-Systèmes plantes - 3D");


        //Adding scene to the stage
        stage.setScene(scene);


        //Displaying the contents of the stage
        stage.show();
    }




    public Path interr(String arbre, double distance ,double x, double y,double angle)
    {
    	Path p = new Path();
    	MoveTo moveto = new MoveTo((int)Math.round(x), (int)Math.round(y));
    	LineTo lineTo;
    	p.getElements().add(moveto);
    	for(int i=0; i<arbre.length(); i++)
    	{
    		char c = arbre.charAt(i);
    		if(c == 'F')
    		{
    			x = x + distance * Math.cos(angle);
    			y = y + distance * Math.sin(angle);

          lineTo = new LineTo();
    			lineTo.setX((int)Math.round(x));
    			lineTo.setY((int)Math.round(y));
          p.getElements().add(lineTo);
    			moveto = new MoveTo((int)Math.round(x), (int)Math.round(y));
    			p.getElements().add(moveto);

    		}
    	}
    	return p;
    }
    public Cylinder createConnection(Point3D origin, Point3D target) {
      Point3D yAxis = new Point3D(0, 1, 0);
      Point3D diff = target.subtract(origin);
      double height = diff.magnitude();

      Point3D mid = target.midpoint(origin);
      Translate moveToMidpoint = new Translate(mid.getX(), mid.getY(), mid.getZ());

      Point3D axisOfRotation = diff.crossProduct(yAxis);
      double angle = Math.acos(diff.normalize().dotProduct(yAxis));
      Rotate rotateAroundCenter = new Rotate(-Math.toDegrees(angle), axisOfRotation);

      Cylinder line = new Cylinder(2, height);

      line.getTransforms().addAll(moveToMidpoint, rotateAroundCenter);

      return line;
  }
    public static void main(String[] args) {
        launch();
    }

}
