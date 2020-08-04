package thuchanh.Facade;

public class Client {
    public void share(String message) {
        SocialMediaFacade socialMediaFacade=new SocialMediaFacade(new Facebook(),new Twitter(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
