package entities;

public abstract class Payer {
    private String name;
    private Double renda;

    public abstract double imposto();

    public Payer(String name, Double renda) {
        this.name = name;
        this.renda = renda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
}
