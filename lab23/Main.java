import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Леха");
        User user2 = new User("Лепеха");
        Group group1 = new Group("Приколы");
        Group group2 = new Group("Приколы2");
        Group group3 = new Group("Погода на меркурие");
        Group group4 = new Group("Подслушано Таганрог");
        Group group5 = new Group("игры");
        Group group6 = new Group("программирование на jaba");
        Group group7 = new Group("Крутые коты");
        group1.addObserver(user1);
        group2.addObserver(user1);
        group3.addObserver(user1);
        group4.addObserver(user2);
        group5.addObserver(user2);
        group6.addObserver(user2);
        group7.addObserver(user2);
        group1.notifyObserver("Новый прикол");
        group2.notifyObserver("Приколы2");
        group3.notifyObserver("Дождь");
        group4.notifyObserver("Сегодня не просыхаем");
        group5.notifyObserver("халф лайф 3 завтра");
        group6.notifyObserver("Наблюдательква");
        group7.notifyObserver("Рально крутые");
    }
}
interface Notifier{
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver(String notification);
}
interface Observer{
    public void update(String groupName, String message);
}

class Group implements Notifier{
    private String name;
    private List<Observer> observers = new ArrayList<>();
    Group(String name){
        this.name = name;
    }
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(String notification){
        for(Observer observer : observers){
            observer.update(name, notification);
        }
    }
}

class User implements Observer{
    private String username;
    User(String username){
        this.username = username;
    }
    @Override
    public void update(String groupName, String notification){
        System.out.printf("Сообщение от группы %s для %s: \"%s\"\n",groupName,username,notification);
    }
}

