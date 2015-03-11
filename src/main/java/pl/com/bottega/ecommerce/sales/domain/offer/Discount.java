/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

/**
 *
 * @author Godzio
 */
public class Discount {
    private String discountCause;
    private Money discountValue;

    /**
     * @return the discountCause
     */
    public String getDiscountCause() {
        return discountCause;
    }

    /**
     * @param discountCause the discountCause to set
     */
    public void setDiscountCause(String discountCause) {
        this.discountCause = discountCause;
    }

    /**
     * @return the discountValue
     */
    public Money getDiscountValue() {
        return discountValue;
    }

    /**
     * @param discountValue the discountValue to set
     */
    public void setDiscountValue(Money discountValue) {
        this.discountValue = discountValue;
    }
    
}
