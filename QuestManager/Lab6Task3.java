package QuestManager;

public class Lab6Task3 {
    public static void main(String[] args) {

        QuestManager questManager = new QuestManager();

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        questManager.addSubscriber(player1);
        questManager.addSubscriber(player2);

        questManager.addQuest("Find the Dragon");
        questManager.addQuest("Rescue the Princess");

        questManager.completeQuest("Find the Dragon");

        questManager.removeSubscriber(player1);

        questManager.completeQuest("Rescue the Princess");
    }
}
