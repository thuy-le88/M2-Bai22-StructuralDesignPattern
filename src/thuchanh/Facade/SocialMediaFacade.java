package thuchanh.Facade;

public class SocialMediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialMediaFacade() {

    }

    public SocialMediaFacade(Facebook facebook, Twitter twitter, LinkedIn linkedIn) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
    }

    public void share (String message) {
        this.facebook.setMessage(message);
        this.facebook.share();
        this.linkedIn.setMessage(message);
        this.linkedIn.share();
        this.twitter.setMessage(message);
        this.twitter.share();
    }
}
