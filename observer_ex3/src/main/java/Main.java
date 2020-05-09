import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        Observer observer1 = new EmailTopicSubscriber("observer_1");
        Observer observer2 = new EmailTopicSubscriber("observer_2");
        Observer observer3 = new EmailTopicSubscriber("observer_3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();
        observer3.update();

        topic.postMessage("hello subscribers");

        topic.unregister(observer1);

        topic.postMessage("hello again subscribers");
    }
}
