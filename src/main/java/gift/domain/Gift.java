package gift.domain;

public class Gift {
    private String name;
    private String description;
    private Integer price;
    private String url;

    public Gift(String name, String description, Integer price, String url) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

}
