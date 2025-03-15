package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
    private String topic;

    // message sent from client to unsubscribe on a topic
    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
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
        return "UnsubscribeMsg [topic=" + topic + ", " + super.toString() + "]";
    }
}