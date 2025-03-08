package ExercicioFixacao2.Entities;

public final class Company extends TaxPayer {

    private Integer numberOfEmployers;

    public Company(String name, Double anualIncome, Integer numberOfEmployers) {
        super(name, anualIncome);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }


    @Override
    public double tax(Double percent) {
        return getAnualIncome() * percent;
    }
}
