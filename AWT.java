package Jaxa;
import java.awt.*;
public class AWT extends Frame{
	AWT(){
		Button b = new Button("Click me");
		b.setBounds(30,60,100,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		AWT a = new AWT();
	}
}
