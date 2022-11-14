package factory;

public class peperonny extends makepizza {
    peperonny(boolean cheese, boolean acute, boolean sausage){
        super(cheese, acute,sausage);
    }
    public String GetIngredients(){
        String ingredients="";
        if(cheese==true){
            ingredients+="cheese ";
        }
        if(acute==true){
            ingredients+="acute ";
        }
        if(sausage==true){
            ingredients+="sausage";
        }
        return ingredients;
    }
    @Override

    public String chooser(){
        if(cheese==true &&acute==false &&sausage==true){
            this.name="Peperonny";
        }



        return this.name;
    }
}
