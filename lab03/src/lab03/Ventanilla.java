package lab03;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventanilla {
	
		public static void Ciudad(String name, int pop, String country, String comuna, String provincia, String region)
		    JFrame frame = new JFrame(); 
		    JLabel label = new JLabel();
		    label.setText("ventana");
		    frame.add(label);
		    JButton boton = new JButton();
		    boton.setText("ventana");
		    frame.add(boton);
		    frame.setTitle("ventana"); 
		    frame.setSize(800,600); 
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		    frame.setVisible(true); 
		
		}

}
