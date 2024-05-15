package entities;

import java.util.Objects;

public class Politico {
    private String name;
    private Integer votes;

    public Politico(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Politico politico)) return false;
        return Objects.equals(name, politico.name) && Objects.equals(votes, politico.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, votes);
    }
}
