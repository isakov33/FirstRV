package space.abdilazov.firstrv;

public class Modelka {

    private String title;
    private int ImageView;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public Modelka(String title, int imageView) {
        this.title = title;
        ImageView = imageView;
    }
}
