package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
    private String topic;

    // message sent from client to subscribe on a topic
    public SubscribeMsg(String user, String topic) {
        super(MessageType.SUBSCRIBE, user);
        this.topic = topic;
    }

    // Getter method for topic
    public String getTopic() {
        return topic;
    }

    // Setter method for topic
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString method for logging purposes
    @Override
    public String toString() {
        return "SubscribeMsg [topic=" + topic + ", " + super.toString() + "]";
    }
}