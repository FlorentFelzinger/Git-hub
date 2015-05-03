import javax.swing.*;

import java.awt.*;

public class VueLogin {
	private JPanel[] tabPanels;
	
	public VueLogin(){
		this.tabPanels = new JPanel [7];
		
		JFrame main = new JFrame("S'identifier");
		main.setLayout(new GridLayout(7,1));
		
		for (int i=0; i<7; i++){
			this.tabPanels[i] = new JPanel();
			main.add(this.tabPanels[i]);
		}
		
		JLabel sIdentifier = new JLabel("S'identifier");
		this.tabPanels[0].add(sIdentifier);
		
		JPanel user = new JPanel();
		user.setLayout(new BorderLayout());
		user.add(new JLabel("Nom d'utilisateur"),BorderLayout.NORTH);
		user.add(new JTextField(),BorderLayout.CENTER);
		this.tabPanels[1].add(user);
		
		JPanel pass = new JPanel();
		pass.setLayout(new BorderLayout());
		pass.add(new JLabel("Mot de passe"),BorderLayout.NORTH);
		pass.add(new JTextField(),BorderLayout.CENTER);
		this.tabPanels[2].add(pass);
		
		JButton validerIdentification = new JButton("S'identidfier");
		this.tabPanels[3].add(validerIdentification);
		
		JLabel creerCompte = new JLabel("Créer un compte");
		this.tabPanels[4].add(creerCompte);
		
		JPanel choixComptes = new JPanel();
		choixComptes.setLayout(new GridLayout(1,2));
		choixComptes.add(new JButton("S'enregistrer en tant que client"));
		choixComptes.add(new JButton("S'enregistrer en tant que photographe"));
		this.tabPanels[5].add(choixComptes);
		
		JLabel mdpOublie = new JLabel("Vous avez oublié votre nom d'utilisateur ou votre mot de passe?");
		this.tabPanels[6].add(mdpOublie);
		
		main.setVisible(true);
	    main.pack();
	    main.setSize(500,300);
		
	}
}
