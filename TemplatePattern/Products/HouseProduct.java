package org.example.TemplatePattern.Products;

import org.example.TemplatePattern.Generics.Product;

public class HouseProduct extends Product {

    public HouseProduct(String name, int sizex, int sizey, int sizez, int weight) {
        super(name, sizex, sizey, sizez, weight);
    }

    @Override
    public String GetProductType(){
        return "Хоз-товары.";
    }

    @Override
    public String TypeofSize(){
        if (weight > 100) return "Для хранения на палете";
        if (sizeX > 10 || sizeY > 10 || sizeZ > 10) return "Для хранения на полу";

        return "Для хранения на полках";
    }

    @Override
    public String GetSavingPlace(){
        return "Для хранения в складе общего доступа.";
    }
}
