package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;

	public Principal() throws HeadlessException {
		super("Inicio");
		inicializar();
	}

	private void inicializar() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setBounds(200, 300, 600, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

}
