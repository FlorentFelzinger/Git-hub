import java.awt.*;

import javax.swing.*;

public class VueRegister {

	private JPanel[] tabMiniPanels;
	
	public VueRegister(){
		this.tabMiniPanels = new JPanel [9];
		
		JFrame main = new JFrame();
		main.setLayout(new BorderLayout());
		
		JPanel grille = new JPanel();
		grille.setLayout(new GridLayout(4,2));
		main.add(grille, BorderLayout.CENTER);
		
		for(int i=0; i<9; i++){
			this.tabMiniPanels[i] = new JPanel();
			this.tabMiniPanels[i].setLayout(new GridLayout(2,1));
			if(i<8)
				grille.add(this.tabMiniPanels[i]);	
		}
		
		this.tabMiniPanels[0].add(new JLabel("Adresse e-mail*"));
		this.tabMiniPanels[1].add(new JLabel("Mot de passe*"));
		this.tabMiniPanels[2].add(new JLabel("Prénom*"));
		this.tabMiniPanels[3].add(new JLabel("Confirmer le mot de passe*"));
		this.tabMiniPanels[4].add(new JLabel("Nom*"));
		this.tabMiniPanels[5].add(new JLabel("Nom de l'entreprise"));
		this.tabMiniPanels[6].add(new JLabel("Nom d'utilisateur*"));
		this.tabMiniPanels[7].add(new JLabel("Téléphone"));
		
		for(int i=0; i<8; i++){
			this.tabMiniPanels[i].add(new JTextField());
		}
		
		JPanel sud = new JPanel();
		sud.setLayout(new BorderLayout());
		main.add(sud,BorderLayout.SOUTH);
		
		sud.add(new JLabel("* : Champs obligatoires"), BorderLayout.NORTH);
		JButton senregistrer = new JButton("S'enregistrer");
		sud.add(senregistrer,BorderLayout.CENTER);
		
		
		main.setVisible(true);
	    main.pack();
	    main.setSize(250, 270);
	}
}
