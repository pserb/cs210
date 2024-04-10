server: MessageServer.class
	java MessageServer $(ARGS)

client: MessageClient.class
	java MessageClient $(ARGS)

MessageServer.class: MessageServer.java
	javac MessageServer.java

MessageClient.class: MessageClient.java
	javac MessageClient.java

clean:
	rm *.class
