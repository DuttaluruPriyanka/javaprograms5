import java.awt.*;

public class AwtFrame1{
public static void main(String[] args){
Frame frm = new Frame("Java AWT Frame");
Label lbl = new Label("Welcome ",Label.CENTER);
frm.add(lbl);
frm.setSize(400,400);
frm.setVisible(true);
  }
}