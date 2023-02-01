package traducuml;

import java.util.Objects;

public class Investissement {
    private int jh;
    private Discipline discipline;

    public Investissement(int jh, Discipline discipline) {
        this.jh = jh;
        this.discipline = discipline;
    }

    public int getJh() {
        return jh;
    }

    public void setJh(int jh) {
        this.jh = jh;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investissement that = (Investissement) o;
        return Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discipline);
    }
}
