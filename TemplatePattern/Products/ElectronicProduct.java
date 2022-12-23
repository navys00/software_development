package org.example.TemplatePattern.Products;

import org.example.TemplatePattern.Generics.Product;

public class ElectronicProduct extends Product {

    public ElectronicProduct(String name, int sizex, int sizey, int sizez, int weight) {
        super(name, sizex, sizey, sizez, weight);
    }

    @Override
    public String GetProductType(){
        return "Электронные товары.";
    }

    @Override
    public String TypeofSize(){
        return "Для хранения на паллетах";
    }

    @Override
    public String GetSavingPlace(){
        return "Для хранения в складе общего доступа.";
    }

}
