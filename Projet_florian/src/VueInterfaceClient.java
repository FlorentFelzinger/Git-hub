

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import java.awt.BorderLayout;
	import javax.swing.BoxLayout;
	import java.awt.GridLayout;
	import javax.swing.JMenuBar;
	import java.awt.Rectangle;
	import javax.swing.JButton;
	import java.awt.FlowLayout;
	import javax.swing.JTextField;
	import java.awt.Font;
	import javax.swing.JTree;
	import javax.swing.JTextArea;
	import javax.swing.JSpinner;
	import javax.swing.JScrollBar;
	import java.awt.Color;


public class VueInterfaceClient {

		private JFrame frame;
		private JTextField textField;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VueInterfaceClient window = new VueInterfaceClient();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public VueInterfaceClient() {
			initialize();
			
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			ControleurInterfaceClient controleur = new ControleurInterfaceClient(this);
			
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			/*frame.pack();*/
			
			JPanel pEntete = new JPanel();
			pEntete.setBackground(Color.CYAN);
			pEntete.setBounds(0, 0, 2000, 39);
			frame.getContentPane().add(pEntete);
			pEntete.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			
			JButton bAjouterPanier = new JButton("Ajouter au panier");
			bAjouterPanier.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			pEntete.add(bAjouterPanier);
			bAjouterPanier.addActionListener(controleur);
			
			JButton bVues = new JButton("Vues");
			bVues.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			pEntete.add(bVues);
			bVues.addActionListener(controleur);
			
			textField = new JTextField();
			textField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			pEntete.add(textField);
			textField.setColumns(10);
			
			JButton bAide = new JButton("Aide");
			bAide.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			pEntete.add(bAide);
			bAide.addActionListener(controleur);
			
			JTree tree = new JTree();
			tree.setBounds(0, 39, 125, 239);
			frame.getContentPane().add(tree);
			
			JPanel pMiniatures = new JPanel();
			pMiniatures.setBounds(137, 45, 313, 233);
			frame.getContentPane().add(pMiniatures);
			pMiniatures.setLayout(null);
			
			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(344, 6, 15, 221);
			pMiniatures.add(scrollBar);
		}
	

}
