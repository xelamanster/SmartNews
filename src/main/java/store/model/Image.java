package store.model;

/**
 * Created by fein on 6/27/2015.
 */
public class Image {
    private final int imageId;
    private final String full;
    private final String thumb;

    public Image(int imageId, String full) {
        this(imageId, full, null);
    }

    public Image(int imageId, String full, String thumb) {
        this.imageId = imageId;
        this.full = full;
        this.thumb = thumb;
    }

    public int getImageId() {
        return imageId;
    }

    public String getFull() {
        return full;
    }

    public String getThumb() {
        return thumb;
    }

}
