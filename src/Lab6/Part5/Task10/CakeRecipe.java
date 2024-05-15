package Lab6.Part5.Task10;

public class CakeRecipe extends CookingRecipe {
    @Override
    public void prepareRecipe() {
        chooseCakeFilling();
        super.prepareRecipe();
    }

    private void chooseCakeFilling() {
        System.out.println("Choosing strawberry filling");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding flour, milk, eggs, sugar");
    }

    @Override
    public void cook() {
        System.out.println("Baking the cake in the oven");
    }

    @Override
    public void serve() {
        System.out.println("Serving");
    }
}
