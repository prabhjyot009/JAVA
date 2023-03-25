import java.applet.Applet;
import java.awt.Graphics;

public class Myapplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 250, 500);
   }
}
/*
<APPLET CODE="Myapplet.class" WIDTH=500 HEIGHT=500>
</APPLET>
*/