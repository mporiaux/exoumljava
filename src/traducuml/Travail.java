package traducuml;

import java.util.Objects;

public class Travail {
    private int pcent;
    private String dateEng;
    private Employe employe;

    public Travail(int pcent, String dateEng, Employe employe) {
        this.pcent = pcent;
        this.dateEng = dateEng;
        this.employe = employe;
    }

    public int getPcent() {
        return pcent;
    }

    public void setPcent(int pcent) {
        this.pcent = pcent;
    }

    public String getDateEng() {
        return dateEng;
    }

    public void setDateEng(String dateEng) {
        this.dateEng = dateEng;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travail travail = (Travail) o;
        return Objects.equals(employe, travail.employe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employe);
    }
}
