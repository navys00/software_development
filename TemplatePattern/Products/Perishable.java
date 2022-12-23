package org.example.TemplatePattern.Products;

import org.example.TemplatePattern.Generics.Product;

public class Perishable extends Product {


    public Perishable(String name, int sizex, int sizey, int sizez, int weight) {
        super(name, sizex, sizey, sizez, weight);
    }

    @Override
    public String GetProductType(){
        return "Продукт питания.";
    }

    @Override
    public String TypeofSize(){
        return "Для хранения на полках";
    }

    @Override
    public String GetSavingPlace(){
        return "Для хранения в морозильной камере.";
    }

}
