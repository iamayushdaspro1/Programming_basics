enum Message {
    HELLO_WORLD("Hello World!");

    private final String name;

    Message(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class HelloWorldEnum {
    public static void main(String[] args) {
        System.out.println(Message.HELLO_WORLD.getName());
    }
}