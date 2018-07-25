package unuploaded;

interface SocialFeedReader
{	
	public Message pollForNewMessage();
}

class TwitterFeedReader implements SocialFeedReader
{

	@Override
	public Message pollForNewMessage() {
		Message m = new Message();
		m.setMessageId(1);
		m.setMessageSource("String");
		m.setMessageType("Twitter");
		m.setMessage("Hello all....I am tweeting this..");
		m.setSender("Rakshhhhhh");
		return m;
	}
	
}

class FacebookReader implements SocialFeedReader
{

	@Override
	public Message pollForNewMessage() {
		Message m1 = new Message();
		m1.setMessageId(2);
		m1.setMessageSource("String");
		m1.setMessageType("Facebook");
		m1.setMessage("Hello all......");
		m1.setSender("JayaLusu");
		return m1;
	}
	
}


class Message
{
	int messageId;
	String messageSource;
	String messageType;
	String message;
	String sender;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

public class Interface2 {

	public static void main(String[] args) {
		TwitterFeedReader t = new TwitterFeedReader();
		Message m = t.pollForNewMessage();
		
		FacebookReader f = new FacebookReader();
		Message m1 = f.pollForNewMessage();
		
		System.out.println(m.getMessageId());
		System.out.println(m.getMessageType());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessage());
		System.out.println(m.getSender());
		
		System.out.println(m1.getMessageId());
		System.out.println(m1.getMessageType());
		System.out.println(m1.getMessageSource());
		System.out.println(m1.getMessage());
		System.out.println(m1.getSender());
		

	}

}
