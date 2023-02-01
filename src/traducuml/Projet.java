package traducuml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Projet {

    private String titre;
    private String dateDeb,dateFin;
    private double cout;

    private List<Investissement> investissements = new ArrayList<>();
    private List<Travail> travaux = new ArrayList<>();

    public Projet(String titre, String dateDeb, String dateFin, double cout) {
        this.titre = titre;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.cout = cout;
    }

    public List<Investissement> getInvestissements() {
        return investissements;
    }

    public void setInvestissements(List<Investissement> investissements) {
        this.investissements = investissements;
    }

    public List<Travail> getTravaux() {
        return travaux;
    }

    public void setTravaux(List<Travail> travaux) {
        this.travaux = travaux;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(String dateDeb) {
        this.dateDeb = dateDeb;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projet projet = (Projet) o;
        return Objects.equals(titre, projet.titre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre);
    }
}
