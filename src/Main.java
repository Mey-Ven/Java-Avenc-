import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> filiere_A = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant("CNE001", "Mehdi", 15.00);
        filiere_A.add(etudiant1);

        Etudiant etudiant2 = new Etudiant("CNE002", "Rahaoui", 18.00);
        filiere_A.add(etudiant2);

        Etudiant etudiant3 = new Etudiant("CNE003", "Mohammed", 14.50);
        filiere_A.add(etudiant3);

        Etudiant etudiant4 = new Etudiant("CNE004", "Ismail", 12.70);
        filiere_A.add(etudiant4);

        Etudiant etudiant5 = new Etudiant("CNE005", "Anass", 9.00);
        filiere_A.add(etudiant5);


        double somme = 0;
        double meiNote = filiere_A.get(0).getMoyenne();
        double mauNote = filiere_A.get(0).getMoyenne();

        for (Etudiant etudiant : filiere_A) {
            double moyenne = etudiant.getMoyenne();
            somme += moyenne;
            if (moyenne > meiNote) {
                meiNote = moyenne;
            }
            if (moyenne < mauNote) {
                mauNote = moyenne;
            }
        }

        double moyenneGenerale = somme / filiere_A.size();
        System.out.println("Moyenne générale: " + moyenneGenerale);
        System.out.println("Meilleure note: " + meiNote);
        System.out.println("Mauvaise note: " + mauNote);


        // 4. Création des sous-listes admis_A, redoublants_A et rattrapage_A
        List<Etudiant> admis_A = new ArrayList<>();
        List<Etudiant> redoublants_A = new ArrayList<>();
        List<Etudiant> rattrapage_A = new ArrayList<>();

        // Cette boucle parcourt tous les étudiants de la filière et les classe dans l'une des trois sous-listes (admis, redoublants, rattrapage) en fonction de leur moyenne.
        for (Etudiant etudiant : filiere_A) {
            double moyenne = etudiant.getMoyenne();
            if (moyenne >= 10) {
                admis_A.add(etudiant);
                etudiant.setDecision("Admis");
            } else if (moyenne < 7) {
                redoublants_A.add(etudiant);
                etudiant.setDecision("Redoublant");
            } else {
                rattrapage_A.add(etudiant);
                etudiant.setDecision("Rattrapage");
            }
        }

        // Affichage des sous-listes
        System.out.println("Admis: " + admis_A);
        System.out.println("Redoublants: " + redoublants_A);
        System.out.println("Rattrapage: " + rattrapage_A);
    }
}
