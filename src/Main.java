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
    }
}
