package org.example.TemplatePattern;

import org.example.TemplatePattern.Generics.Product;
import org.example.TemplatePattern.Products.ElectronicProduct;
import org.example.TemplatePattern.Products.HouseProduct;
import org.example.TemplatePattern.Products.Perishable;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> productList = new ArrayList<>();
        productList.add(new HouseProduct("ведро", 1, 2, 3, 1));
        productList.add(new Perishable("помидор", 100, 100,100, 20));
        productList.add(new ElectronicProduct("Телефон", 10, 12, 3, 10));

        for (Product item : productList){
            System.out.println(item.GetName());
            System.out.println(item.GetProductType());
            System.out.println(item.GetSavingPlace());
            System.out.println(item.TypeofSize());
        }


    }
}
