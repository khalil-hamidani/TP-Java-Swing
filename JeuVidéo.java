import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class JeuVidéo extends JFrame {
  public JeuVidéo() {
    // Instanciation de la fenêtre
    setTitle("Jeu Vidéo");
    setSize(500, 300);
    setLocationRelativeTo(null);
    // setResizable(false);
    setVisible(true);


    // Création des panneaux
    JPanel BoutonsDeplacements = new JPanel();
    JPanel BoutonsJeu = new JPanel();
    JPanel panneauJeu = new JPanel();
    JButton ADroite = new JButton("A droite");
    JButton AGauche = new JButton("A gauche");
    JButton EnHaut = new JButton("En haut");
    JButton EnBas = new JButton("En bas");
    JButton Accélérer = new JButton("Accélérer");
    JButton Ralentir = new JButton("Ralentir");

    // Définition de la couleur des panneaux
    BoutonsDeplacements.setBackground(Color.green);
    BoutonsJeu.setBackground(Color.red);
    panneauJeu.setBackground(Color.lightGray);

    // Ajout des panneaux à la fenêtre
    getContentPane().add(BoutonsDeplacements, BorderLayout.EAST);
    getContentPane().add(BoutonsJeu, BorderLayout.SOUTH);
    getContentPane().add(panneauJeu, BorderLayout.CENTER);

    // Ajout des boutons aux panneaux
    BoutonsDeplacements.add(ADroite);
    BoutonsDeplacements.add(AGauche);
    BoutonsDeplacements.add(EnHaut);
    BoutonsDeplacements.add(EnBas);
    BoutonsJeu.add(Accélérer);
    BoutonsJeu.add(Ralentir);

    // Création de l'étiquette et de la zone de saisie de texte
    JLabel label = new JLabel("Ceci sera ma zone de jeu");
    JTextArea textArea = new JTextArea(10, 20);

    // Ajout de l'étiquette et de la zone de saisie de texte au panneau
    panneauJeu.add(label);
    panneauJeu.add(textArea);

    // Modification du layout du panneau BoutonsDeplacements
    BoutonsDeplacements.setLayout(new GridLayout(2, 2));
    // Ajout des boutons aux panneaux
    BoutonsDeplacements.add(ADroite);
    BoutonsDeplacements.add(AGauche);
    BoutonsDeplacements.add(EnHaut);
    BoutonsDeplacements.add(EnBas);

    // Création d'un nouveau panneau pour contenir les boutons
    JPanel boutonsPanel = new JPanel();

    // Modification du layout du panneau boutonsPanel
    boutonsPanel.setLayout(new BoxLayout(boutonsPanel, BoxLayout.Y_AXIS));

    // Ajout des boutons au panneau boutonsPanel
    boutonsPanel.add(ADroite);
    boutonsPanel.add(AGauche);
    boutonsPanel.add(EnHaut);
    boutonsPanel.add(EnBas);

    // Ajout du panneau boutonsPanel au panneau BoutonsDeplacements
    BoutonsDeplacements.add(boutonsPanel);
  }

  public static void main(String[] args) {

    JeuVidéo jeu = new JeuVidéo();

  }
}