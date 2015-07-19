package store.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by fein on 6/27/2015.
 */
public class Product {
    private String name;
    private BigDecimal price;
    private String description;
    private String specification;
    private boolean canPurchase;
    private boolean soldOut;
    private List<Image> images;
    private List<Review> reviews;

    public Product(String name, BigDecimal price, String description, String specification,
                   List<Image> images, List<Review> reviews) {
        this(name, price, description, specification, true, false, images, reviews);
    }

    public Product(String name, BigDecimal price, String description, String specification, boolean canPurchase,
                   boolean soldOut, List<Image> images, List<Review> reviews) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.specification = specification;
        this.canPurchase = canPurchase;
        this.soldOut = soldOut;
        this.images = images;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public boolean isCanPurchase() {
        return canPurchase;
    }

    public void setCanPurchase(boolean canPurchase) {
        this.canPurchase = canPurchase;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
