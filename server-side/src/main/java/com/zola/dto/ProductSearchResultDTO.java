package com.zola.dto;

public class ProductSearchResultDTO {
    private String productName;
    private Long productId;
    private String metroAreaTitle;
    private String fullName;
    private Long projectGroupId;

    public ProductSearchResultDTO(String productName, Long productId, String metroAreaTitle, String fullName, Long projectGroupId) {
        this.productName = productName;
        this.productId = productId;
        this.metroAreaTitle = metroAreaTitle;
        this.fullName = fullName;
        this.projectGroupId = projectGroupId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMetroAreaTitle() {
        return metroAreaTitle;
    }

    public void setMetroAreaTitle(String metroAreaTitle) {
        this.metroAreaTitle = metroAreaTitle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getProjectGroupId() {
        return projectGroupId;
    }

    public void setProjectGroupId(Long projectGroupId) {
        this.projectGroupId = projectGroupId;
    }
}
