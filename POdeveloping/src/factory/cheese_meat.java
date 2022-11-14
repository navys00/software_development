package factory;

public class cheese_meat extends makepizza{
    cheese_meat(boolean cheese, boolean acute, boolean sausage){
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
        if(cheese==true &&acute==true &&sausage==false){
            this.name="cheese_meat";
        }


        return this.name;
    }
}
