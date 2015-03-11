/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

/**
 *
 * @author Godzio
 */
public class Product {

    private String productId;
    private Money productPrice;
    private String productName;
    private Date productSnapshotDate;
    private String productType;

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @return the productPrice
     */
    public Money getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(Money productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productSnapshotDate
     */
    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    /**
     * @param productSnapshotDate the productSnapshotDate to set
     */
    public void setProductSnapshotDate(Date productSnapshotDate) {
        this.productSnapshotDate = productSnapshotDate;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

}
