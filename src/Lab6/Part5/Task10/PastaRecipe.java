package Lab6.Part5.Task10;

public class PastaRecipe extends CookingRecipe {
    @Override
    public void prepareRecipe() {
        boilWater();
        addSalt();
        super.prepareRecipe();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void addSalt() {
        System.out.println("Adding salt in water");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }
    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
    @Override
    public void serve() {
        System.out.println("Serving");
    }
}
