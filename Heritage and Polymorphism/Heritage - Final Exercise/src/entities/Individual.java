package entities;

public class Individual extends Payer {

    private final Double saude;

    public Individual(String name, Double renda, Double saude) {
        super(name, renda);
        this.saude = saude;
    }



    @Override
    public double imposto() {
        double imp = 0;
        if (getRenda() <= 20000){
            imp = getRenda()*0.15 - saude*0.5;
        } else if (getRenda() > 20000) {
            imp = getRenda()*0.25 - saude*0.5;

        }
        return imp;
    }
}
