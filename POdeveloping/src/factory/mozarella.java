package factory;

public class mozarella extends makepizza {

    mozarella(boolean cheese, boolean acute, boolean sausage){
        super(cheese, acute,sausage);

    }
    @Override
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
        if(cheese==false &&acute==true &&sausage==true){
                    this.name="Mozarella";
        }
        return this.name;
    }
}
