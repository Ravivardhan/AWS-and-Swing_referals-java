import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LabelTest extends JFrame 
{
  private JLabel label1, label2, label3;
  public LabelTest()
  {
   super( "Testing JLabel" );
   Container c = getContentPane();
   c.setLayout( new FlowLayout() );
   label1 = new JLabel( "Label with text" );
   label1.setToolTipText( "This is label1" );
   c.add( label1 );
   Icon image = new ImageIcon( "IMG_20151203_112600534_HDR.jpef" );
   label2 = new JLabel( "Label with text and icon",image, SwingConstants.LEFT );
   label2.setToolTipText( "This is label2" );
   c.add( label2 );
   label3 = new JLabel();
   label3.setText( "Label with icon and text at bottom" );
   label3.setIcon( image );
   label3.setHorizontalTextPosition(SwingConstants.CENTER );
   label3.setVerticalTextPosition(SwingConstants.BOTTOM );
   label3.setToolTipText( "This is label3" );
   c.add( label3 );
   setSize( 300, 300 );
   setVisible(true);
   //show();
  }
  public static void main(String args[])
  {
   LabelTest app = new LabelTest();
   app.addWindowListener(new WindowAdapter() {
            public void windowClosing( WindowEvent e ){
            System.exit( 0 );

    }});
  }
}
