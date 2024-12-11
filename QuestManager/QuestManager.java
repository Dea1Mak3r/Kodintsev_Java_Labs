package QuestManager;

import java.util.ArrayList;
import java.util.List;

interface QuestSubscriber {
    void update(String message);
}

class QuestManager {
    private final List<QuestSubscriber> subscribers = new ArrayList<>();

    public void addSubscriber(QuestSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(QuestSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (QuestSubscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void addQuest(String quest) {
//        System.out.println("New quest added: " + quest);
        notifySubscribers("New quest added: " + quest);
    }

    public void completeQuest(String quest) {
//        System.out.println("Quest completed: " + quest);
        notifySubscribers("Quest completed: " + quest);
    }
}

class Player implements QuestSubscriber {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}