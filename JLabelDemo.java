import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class JLabelDemo extends Applet {
 public void init()  {
   try {
    SwingUtilities.invokeAndWait(new Runnable() { 
        public void run() {
          makeGUI();
        } } );
       } catch(Exception e) { }
     }
  void makeGUI() {
   ImageIcon img=new ImageIcon("C:/Users/SATWIK/Pictures/override program.JPG");
   JLabel lab= new JLabel ("Screen shot of desktop",img,JLabel.LEFT);
   add(lab);
  }
}