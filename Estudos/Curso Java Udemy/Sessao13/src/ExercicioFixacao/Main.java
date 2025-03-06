package ExercicioFixacao;

import ExercicioFixacao.Entities.ImportedProduct;
import ExercicioFixacao.Entities.Product;
import ExercicioFixacao.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.printf("Product #%d data \n", i);
            System.out.print("Common, used or Imported (c/u/i) \n");
            char source = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (source == 'i') {
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));

            } else if (source == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }
        }

        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
