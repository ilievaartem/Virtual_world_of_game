package behavioral.mediator;

public class GameMediator {
    private PlayerMediator playerMediator;
    private NPC enemy;

    public GameMediator(PlayerMediator playerMediator, NPC enemy) {
        this.playerMediator = playerMediator;
        this.enemy = enemy;
    }

    public void playerAttackedEnemy() {
        int damage = playerMediator.calculateDamage();
        enemy.receiveDamage(damage);
        if (!enemy.isAlive()) {
            System.out.println("Enemy defeated!");
        }
    }

    public void enemyAttackedPlayer() {
        int damage = enemy.calculateDamage();
        playerMediator.receiveDamage(damage);
        if (!playerMediator.isAlive()) {
            System.out.println("Player defeated!");
        }
    }
}
