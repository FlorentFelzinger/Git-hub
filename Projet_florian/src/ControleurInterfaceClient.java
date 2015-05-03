import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControleurInterfaceClient implements ActionListener {
	
	private ModeleInterfaceClient modele;
	private VueInterfaceClient vue;
	
	public ControleurInterfaceClient(VueInterfaceClient vue) {
		
	}
	
	public void afficherAide() {
		
	}
	
	public void changerVue() {
		
	}
	
	public void importerPhotos() {
		
	}
	
	public void rechercherPhotos(JTextField tf){
		String texte = tf.getText();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()) {
			JTextField tf = (JTextField) e.getSource();
			rechercherPhotos(tf);
		}
		
		else{
			JButton b = (JButton) e.getSource();
			String nom = b.getText();
			switch (nom) {
			case "Aide" :
				afficherAide();
				break;
			case "Vues" :
				changerVue();
				break;
			case "Importer des photos" :
				importerPhotos();
				break;
			}
		}
	}
}
