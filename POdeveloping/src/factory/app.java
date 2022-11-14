package factory;
import java.util.List;
import java.util.ArrayList;
public class app {
    public static void main(String[] args) {
        List<makepizza>list=new ArrayList();
        list.add(new mozarella(false,true,true ));
        for(makepizza item: list){
            System.out.println(item.GetIngredients());
            System.out.println(item.chooser());
        }


    }
}
