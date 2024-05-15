package entities;

public class Company extends Payer {

    private Integer funcionarios;

    public Company(String name, Double renda, Integer funcionarios) {
        super(name, renda);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        double imp = 0;
        if (funcionarios > 10){
            imp = getRenda() * 0.14;
        } else {
            imp = getRenda() * 0.16;
        }
        return imp;
    }
}
