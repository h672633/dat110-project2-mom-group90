package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
    private String topic;

    // message sent from client to delete topic on the broker
    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
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
        return "DeleteTopicMsg [topic=" + topic + ", " + super.toString() + "]";
    }
}