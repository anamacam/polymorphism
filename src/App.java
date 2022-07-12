import interfaces.Animal;
import interfaces.LivingBeing;
import interfaces.Personas;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static final void main(String[] args) {
        List<LivingBeing> livingBeings = new ArrayList<>();
        livingBeings.add(new Personas());
        livingBeings.add(new Animal());

        for (int i = 0; i < livingBeings.size(); i++){
            livingBeings.get(i).eat("pan");
            livingBeings.get(i).sleep();
            livingBeings.get(i).communicate();

        }



    }
}







