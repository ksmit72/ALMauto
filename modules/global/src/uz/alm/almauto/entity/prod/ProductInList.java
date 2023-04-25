package uz.alm.almauto.entity.prod;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import uz.alm.almauto.entity.PackageType;
import uz.alm.almauto.entity.Products;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.SoftDelete;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s %s %s %s|product,inUpak,packageType,kolUpak,umKol,price,amount")
@Table(name = "ALMAUTO_PRODUCT_IN_LIST")
@Entity(name = "almauto$ProductInList")
public class ProductInList extends BaseIntegerIdEntity implements SoftDelete, HasUuid {
    private static final long serialVersionUID = 6076103108955627731L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    protected Products product;

    @Column(name = "KOL_UPAK")
    protected Integer kolUpak;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PACKAGE_TYPE_ID")
    protected PackageType packageType;

    @Column(name = "IN_UPAK")
    protected Integer inUpak;

    @Column(name = "UM_KOL")
    protected Integer umKol;

    @Column(name = "PRICE")
    protected Double price;

    @Column(name = "AMOUNT")
    protected Double amount;

    @Column(name = "DELETE_TS")
    protected Date deleteTs;

    @Column(name = "DELETED_BY", length = 50)
    protected String deletedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_IN_ID")
    protected ProductIn productIn;

    public void setProductIn(ProductIn productIn) {
        this.productIn = productIn;
    }

    public ProductIn getProductIn() {
        return productIn;
    }


    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProduct() {
        return product;
    }

    public void setKolUpak(Integer kolUpak) {
        this.kolUpak = kolUpak;
    }

    public Integer getKolUpak() {
        return kolUpak;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setInUpak(Integer inUpak) {
        this.inUpak = inUpak;
    }

    public Integer getInUpak() {
        return inUpak;
    }

    public void setUmKol(Integer umKol) {
        this.umKol = umKol;
    }

    public Integer getUmKol() {
        return umKol;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }


}