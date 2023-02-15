import domain.NutritionFacts;
import domain.NutritionFacts.Builder;

public class Application {

    public static void main(String[] args) {
        NutritionFacts facts = new Builder(3, 3).carbohydrate(3).calories(286).build();
        System.out.println(facts);
    }
}
