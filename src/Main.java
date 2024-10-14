import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> filiere_A = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant("CNE001", "Mehdi");
        filiere_A.add(etudiant1);

        Etudiant etudiant2 = new Etudiant("CNE002", "Rahaoui");
        filiere_A.add(etudiant2);

        Etudiant etudiant3 = new Etudiant("CNE003", "Mohammed");
        filiere_A.add(etudiant3);

        Etudiant etudiant4 = new Etudiant("CNE004", "Ismail");
        filiere_A.add(etudiant4);

        Etudiant etudiant5 = new Etudiant("CNE005", "Anass");
        filiere_A.add(etudiant5);


        float somme = 0;
        float meiNote = filiere_A.get(0).getMoyenne();
        float mauNote = filiere_A.get(0).getMoyenne();

        for (Etudiant etudiant : filiere_A) {
            float moyenne = etudiant.getMoyenne();
            somme += moyenne;
            if (moyenne > meiNote) {
                meiNote = moyenne;
            }
            if (moyenne < mauNote) {
                mauNote = moyenne;
            }
        }

        float moyenneGenerale = somme / filiere_A.size();
        System.out.println("Moyenne générale: " + moyenneGenerale);
        System.out.println("Meilleure note: " + meiNote);
        System.out.println("Mauvaise note: " + mauNote);
    }
}
