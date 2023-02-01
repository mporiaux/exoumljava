package traducuml;

import java.util.Objects;

public class Employe {
    private String matricule;
    private String nom,prenom;
    private String mail;
    private String tel;

    private Discipline specialite;

    public Employe(String matricule, String nom, String prenom, String mail, String tel) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.tel = tel;
    }

    public Discipline getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Discipline specialite) {
        this.specialite = specialite;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(matricule, employe.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }
}
