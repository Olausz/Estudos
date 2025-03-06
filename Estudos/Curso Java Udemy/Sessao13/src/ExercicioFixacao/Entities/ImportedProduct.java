package ExercicioFixacao.Entities;

public final class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public ImportedProduct(){

    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return getPrice() + customFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + "(Custom fee: $ " + customFee + ")";
    }

}
