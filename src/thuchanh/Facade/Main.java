package thuchanh.Facade;

public class Main {
    public static void main(String[] args) {
        Client client=new Client();
        String message="this is a post";
        client.share(message);
    }
}
