package ExercicioFixacao.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(manufactureDate);

        return getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " + formattedDate + ")";
    }
}