package behavioral.observe;

public class MonsterSystem implements GameEventListener {
    @Override
    public void onEvent(String event) {
        if (event.equals("Monster Killed")) {
            System.out.println("A monster has been killed!");
        }
    }
}