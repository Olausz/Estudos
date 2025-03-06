package ExercicoResolvido.Entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {

    }

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(nome, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (additionalCharge * 1.1);

    }
}
