package uz.alm.almauto.entity.prices;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import uz.alm.almauto.entity.Products;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|product,prices")
@Table(name = "ALMAUTO_PRICE_LIST")
@Entity(name = "almauto$PriceList")
public class PriceList extends StandardEntity {
    private static final long serialVersionUID = -3120898474525532014L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    protected Products product;

    @NumberFormat(pattern = "########.##")
    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICES_ID")
    protected Price prices;

    public void setPrices(Price prices) {
        this.prices = prices;
    }

    public Price getPrices() {
        return prices;
    }


    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProduct() {
        return product;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }


}