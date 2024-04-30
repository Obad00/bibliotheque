import java.util.ArrayList;
import java.util.Scanner;

// Classe principale du programme
public class GestionDocuments {
    // Liste de documents dans la bibliothèque
    private static ArrayList<Document> listeDocuments = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);



    // Méthode principale
    public static void main(String[] args) {
        afficherMenuPrincipal();
    }

    // Méthode pour afficher le menu principal
    private static void afficherMenuPrincipal() {

        while (true) {
            System.out.println("\nMenu Principal");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Supprimer un document");
            System.out.println("3. Afficher tous les documents");
            System.out.println("4. Afficher les caractéristiques d'un document");
            System.out.println("5. Quitter");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterDocument();
                    break;
                case 2:
                    supprimerDocument();
                    break;
                case 3:
                    afficherTousDocuments();
                    break;
                case 4:
                    afficherCaracteristiquesDocument();
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        }
    }

    // Méthode pour ajouter un document à la liste
    private static void ajouterDocument() {
        System.out.println("\nAjouter un document");
        // Demander le type de document à ajouter
        System.out.println("Quel type de document souhaitez-vous ajouter ?");
        System.out.println("1. Roman");
        System.out.println("2. Manuel");
        System.out.println("3. Revue");
        System.out.println("4. Dictionnaire");
        System.out.print("Votre choix : ");
        int choixTypeDocument = scanner.nextInt();

        // Ajouter le document approprié en fonction du choix de l'utilisateur
        switch (choixTypeDocument) {
            case 1:
                ajouterRoman();
                break;
            case 2:
                ajouterManuel();
                break;
            case 3:
                ajouterRevue();
                break;
            case 4:
                ajouterDictionnaire();
                break;
            default:
                System.out.println("Type de document invalide.");
        }
    }

    // Méthode pour ajouter un roman à la liste
    private static void ajouterRoman() {
        // Logique pour ajouter un roman à la liste
        
    }

// Méthode pour ajouter un manuel à la liste
private static void ajouterManuel() {
    System.out.println("\nAjouter un manuel");

    // Demander les détails du manuel à l'utilisateur
    System.out.print("Numéro d'enregistrement : ");
    String numEnregistrement = scanner.next();
    System.out.print("Titre : ");
    String titre = scanner.next();
    System.out.print("Nombre de copies : ");
    int nbCopies = scanner.nextInt();
    System.out.print("Domaine : ");
    String domaine = scanner.next();

    // Créer une instance de Manuel avec les détails fournis
    Manuel manuel = new Manuel(numEnregistrement, titre, nbCopies, domaine);

    // Ajouter le manuel à la liste de documents
    listeDocuments.add(manuel);

    System.out.println("Le manuel a été ajouté avec succès à la bibliothèque.");
}


     // Méthode pour ajouter une revue à la liste
private static void ajouterRevue() {
    System.out.println("\nAjouter une revue");

    // Demander les détails de la revue à l'utilisateur
    System.out.print("Numéro d'enregistrement : ");
    String numEnregistrement = scanner.next();
    System.out.print("Titre : ");
    String titre = scanner.next();
    System.out.print("Nombre de copies : ");
    int nbCopies = scanner.nextInt();
    System.out.print("Mois de publication : ");
    int moisPublication = scanner.nextInt();
    System.out.print("Année de publication : ");
    int anneePublication = scanner.nextInt();

    // Créer une instance de Revue avec les détails fournis
    Revue revue = new Revue(numEnregistrement, titre, nbCopies, moisPublication, anneePublication);

    // Ajouter la revue à la liste de documents
    listeDocuments.add(revue);

    System.out.println("La revue a été ajoutée avec succès à la bibliothèque.");
    System.out.println(listeDocuments);
}


   // Méthode pour ajouter un dictionnaire à la liste
private static void ajouterDictionnaire() {
    System.out.println("\nAjouter un dictionnaire");

    // Demander les détails du dictionnaire à l'utilisateur
    System.out.print("Numéro d'enregistrement : ");
    String numEnregistrement = scanner.next();
    System.out.print("Titre : ");
    String titre = scanner.next();
    System.out.print("Nombre de copies : ");
    int nbCopies = scanner.nextInt();
    System.out.print("Langue : ");
    String langue = scanner.next();

    // Créer une instance de Dictionnaire avec les détails fournis
    Dictionnaire dictionnaire = new Dictionnaire(numEnregistrement, titre, nbCopies, langue);

    // Ajouter le dictionnaire à la liste de documents
    listeDocuments.add(dictionnaire);

    System.out.println("Le dictionnaire a été ajouté avec succès à la bibliothèque.");
    System.out.println(listeDocuments);

}


 

   // Méthode pour supprimer un document de la liste
private static void supprimerDocument() {
    System.out.println("\nSupprimer un document");
    
    // Demander le numéro d'enregistrement du document à supprimer
    System.out.print("Entrez le numéro d'enregistrement du document : ");
    String numEnregistrement = scanner.next();

    // Recherche du document dans la liste
    for (Document doc : listeDocuments) {
        if (doc.getNumEnregistrement().equals(numEnregistrement)) {
            listeDocuments.remove(doc); // Supprimer le document de la liste
            System.out.println("Le document a été supprimé avec succès de la bibliothèque.");
            return; // Sortir de la méthode après avoir supprimé le document
        }
    }
    // Si le document n'est pas trouvé
    System.out.println("Document non trouvé.");
}
    // Méthode pour afficher tous les documents de la liste
    private static void afficherTousDocuments() {
        System.out.println("\nListe de tous les documents :");
        if (listeDocuments.isEmpty()) {
            System.out.println("Aucun document disponible.");
        } else {
            for (Document doc : listeDocuments) {
                System.out.println(doc);
            }
        }
    }

    // Méthode pour afficher les caractéristiques d'un document spécifique
    private static void afficherCaracteristiquesDocument() {
        System.out.println("\nAfficher les caractéristiques d'un document");
        System.out.print("Entrez le numéro d'enregistrement du document : ");
        String numEnregistrement = scanner.next();

        // Recherche du document dans la liste
        for (Document doc : listeDocuments) {
            if (doc.getNumEnregistrement().equals(numEnregistrement)) {
                doc.afficherCaracteristiques();
                return;
            }
        }
        System.out.println("Document non trouvé.");
    }
}

// Classe abstraite Document
abstract class Document {
    protected String numEnregistrement;
    protected String titre;
    protected int nbCopies;

    public Document(String numEnregistrement, String titre, int nbCopies) {
        this.numEnregistrement = numEnregistrement;
        this.titre = titre;
        this.nbCopies = nbCopies;
    }

    public String getNumEnregistrement() {
        return numEnregistrement;
    }

    public abstract void afficherCaracteristiques();
}

// Classes Roman, Manuel, Revue, Dictionnaire ...
class Roman extends Document {
    private ArrayList<String> prixLitteraires;

    public Roman(String numEnregistrement, String titre, int nbCopies, ArrayList<String> prixLitteraires) {
        super(numEnregistrement, titre, nbCopies); // Appeler le constructeur de la superclasse avec les paramètres correspondants
        this.prixLitteraires = prixLitteraires;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Ce document est de type roman, un roman est ...");
        // Afficher les caractéristiques spécifiques d'un roman
        System.out.println("Prix litteraires : ");
        for (String prix : prixLitteraires) {
            System.out.println("- " + prix);
        }
    }
}

class Manuel extends Document {
    private String domaine;

    public Manuel(String numEnregistrement, String titre, int nbCopies, String domaine) {
        super(numEnregistrement, titre, nbCopies); // Adjusted constructor call
        this.domaine = domaine;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Ce document est de type manuel, un manuel est ...");
        // Afficher les caractéristiques spécifiques d'un manuel
        System.out.println("Domaine : " + domaine);
    }
}


// Classe Revue
class Revue extends Document {
    private int moisPublication;
    private int anneePublication;

    public Revue(String numEnregistrement, String titre, int nbCopies, int moisPublication, int anneePublication) {
        super(numEnregistrement, titre, nbCopies);
        this.moisPublication = moisPublication;
        this.anneePublication = anneePublication;
    }

        @Override
    public void afficherCaracteristiques() {
        System.out.println("Ce document est de type revue, une revue est ...");
        // Afficher les caractéristiques spécifiques d'une revue
        System.out.println("Mois de publication : " + moisPublication);
        System.out.println("Année de publication : " + anneePublication);
    }
}

// Classe Dictionnaire
class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(String numEnregistrement, String titre, int nbCopies, String langue) {
        super(numEnregistrement, titre, nbCopies);
        this.langue = langue;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Ce document est de type dictionnaire, un dictionnaire est ...");
        // Afficher les caractéristiques spécifiques d'un dictionnaire
        System.out.println("Langue : " + langue);
    }
}

// Ce programme Java gère une bibliothèque de documents. La classe principale est GestionDocuments, qui contient une liste d'objets Document et un objet Scanner pour la saisie utilisateur. La méthode main affiche un menu qui permet à l'utilisateur d'ajouter un document, de supprimer un document, d'afficher tous les documents, d'afficher les caractéristiques d'un document, ou de quitter le programme.

// La classe Document est une classe abstraite qui représente un document dans la bibliothèque. Elle a trois propriétés : un numéro d'enregistrement, un titre et le nombre de copies. Elle a également une méthode afficherCaracteristiques() qui affiche les caractéristiques du document. Cette méthode étant abstraite, elle doit être implémentée par toute sous-classe concrète de Document.

// Il y a quatre sous-classes concrètes de Document : Roman, Manuel, Revue et Dictionnaire. Chaque sous-classe représente un type de document différent et a ses propres propriétés spécifiques et son propre implémentation de la méthode afficherCaracteristiques().

// La méthode ajouterDocument() dans la classe GestionDocuments permet à l'utilisateur d'ajouter un document à la bibliothèque. L'utilisateur est invité à choisir le type de document à ajouter, puis le constructeur de la sous-classe appropriée est appelé pour créer un nouvel objet document.

// La méthode supprimerDocument() permet à l'utilisateur de supprimer un document de la bibliothèque. L'utilisateur est invité à entrer le numéro d'enregistrement du document à supprimer, puis le document est supprimé de la liste.

// La méthode afficherTousDocuments() affiche tous les documents de la bibliothèque. Si la bibliothèque est vide, un message est affiché pour indiquer qu'il n'y a pas de documents disponibles.

// La méthode afficherCaracteristiquesDocument() permet à l'utilisateur d'afficher les caractéristiques d'un document spécifique. L'utilisateur est invité à entrer le numéro d'enregistrement du document, puis le document est recherché dans la liste. Si le document est trouvé, ses caractéristiques sont affichées à l'aide de la méthode afficherCaracteristiques().

// Dans l'ensemble, ce programme fournit une interface simple pour gérer une bibliothèque de documents, avec la possibilité d'ajouter, de supprimer et d'afficher des documents de différents types.