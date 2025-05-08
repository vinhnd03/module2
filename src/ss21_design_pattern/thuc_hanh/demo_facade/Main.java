package ss21_design_pattern.thuc_hanh.demo_facade;

public class Main {
    public static void main(String[] args) {
        SocialMediaShare socialMediaShare = new SocialMediaShare(new FacebookShare(), new TwitterShare());
        socialMediaShare.share("hello");
    }
}
