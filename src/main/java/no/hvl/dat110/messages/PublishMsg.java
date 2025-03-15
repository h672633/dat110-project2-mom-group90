package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	private String topic;
	private String message;

	// message sent from client to publish a message on a topic
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	// Getter method for topic
	public String getTopic() {
		return topic;
	}

	// Setter method for topic
	public void setTopic(String topic) {
		this.topic = topic;
	}

	// Getter method for message
	public String getMessage() {
		return message;
	}

	// Setter method for message
	public void setMessage(String message) {
		this.message = message;
	}

	// toString method for logging purposes
	@Override
	public String toString() {
		return "PublishMsg [topic=" + topic + ", message=" + message + ", " + super.toString() + "]";
	}
}