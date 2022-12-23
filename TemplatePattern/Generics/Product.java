package org.example.TemplatePattern.Generics;

public abstract class Product extends SyzeAbstract {

    protected String name;

    public Product(String name, int sizex, int sizey, int sizez, int weight){
        this.name = name;
        this.sizeX = sizex;
        this.sizeY = sizey;
        this.sizeZ = sizez;
        this.weight = weight;
    }

    public String GetName() {return this.name;}
    public String GetProductType(){
        return "Для ручного определения";
    }

    public String GetSavingPlace(){
        return "Склад для товаров ручного определения.";
    }
}
