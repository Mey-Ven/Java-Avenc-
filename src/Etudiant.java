public class Etudiant {
    private String CNE;
    private String nom;
    private double Moyenne;
    private String decision;
    private String classement;

    public Etudiant(String CNE, String nom, double Moyenne) {
        this.CNE = CNE;
        this.nom = nom;
        this.Moyenne = Moyenne;
    }

    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(float moyenne) {
        Moyenne = moyenne;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getClassement() {
        return classement;
    }

    public void setClassement(String classement) {
        this.classement = classement;
    }
}
