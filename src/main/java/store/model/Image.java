package store.model;

/**
 * Created by fein on 6/27/2015.
 */
public class Image {
    private final int imageId;
    private final String path;
    private final String thumb;

    public Image(int imageId, String path) {
        this(imageId, path, null);
    }

    public Image(int imageId, String path, String thumb) {
        this.imageId = imageId;
        this.path = path;
        this.thumb = thumb;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPath() {
        return path;
    }

    public String getThumb() {
        return thumb;
    }

}
