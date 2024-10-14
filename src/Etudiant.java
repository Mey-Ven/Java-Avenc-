public class Etudiant {
    private String CNE;
    private String nom;
    private float Moyenne;
    private String decision;
    private String classement;

    public Etudiant(String CNE, String nom, float moyenne) {
        this.CNE = CNE;
        this.nom = nom;
        this.Moyenne = moyenne;
    }

    public String getCNE() {
        return CNE;
    }

    public String getNom() {
        return nom;
    }

    public float getMoyenne() {
        return Moyenne;
    }

    public String getDecision() {
        return decision;
    }

    public String getClassement() {
        return classement;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(float moyenne) {
        Moyenne = moyenne;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public void setClassement(String classement) {
        this.classement = classement;
    }
}
