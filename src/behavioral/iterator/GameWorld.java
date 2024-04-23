package behavioral.iterator;

public class GameWorld {
    public static void main(String[] args) {
        // Створення колекції об'єктів гри
        GameObjectCollection gameObjects = new GameObjectCollection();

        // Додавання об'єктів гри
        gameObjects.addGameObject(new GameObject("Player"));
        gameObjects.addGameObject(new GameObject("Enemy1"));
        gameObjects.addGameObject(new GameObject("Enemy2"));
        gameObjects.addGameObject(new GameObject("Item1"));
        gameObjects.addGameObject(new GameObject("Item2"));

        // Перегляд колекції за допомогою ітератора
        System.out.println("Game Objects in the World:");
        for (GameObject gameObject : gameObjects) {
            System.out.println("- " + gameObject.getName());
        }
    }
}