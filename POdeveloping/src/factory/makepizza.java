package factory;
import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;
public abstract class makepizza{
    protected String name;
    protected boolean cheese;
    protected boolean acute;
    protected boolean sausage;
    public makepizza(boolean cheese,boolean acute, boolean sausage){

        this.cheese=cheese;
        this.acute=acute;
        this.sausage=sausage;
    }

    public String GetIngredients(){
        String ingredients="";

        return ingredients;
    }
    public String chooser(){
        return this.name;
    }

}
