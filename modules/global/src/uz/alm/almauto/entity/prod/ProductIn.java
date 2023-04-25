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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import uz.alm.almauto.entity.sprs.Warehouse;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import uz.alm.almauto.entity.prices.Price;
import uz.alm.almauto.entity.sprs.TypeFlow;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s %s %s %s %s|vDate,warehouse,price,amount,comment")
@Table(name = "ALMAUTO_PRODUCT_IN")
@Entity(name = "almauto$ProductIn")
public class ProductIn extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -6141249053744627656L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "productIn")
    protected List<ProductInList> productInList;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "V_DATE", nullable = false)
    protected Date vDate;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WAREHOUSE_ID")
    protected Warehouse warehouse;

    @Column(name = "TYPE_FLOW")
    protected Integer typeFlow;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICE_ID")
    protected Price price;

    @Column(name = "AMOUNT")
    protected Double amount;

    @Column(name = "COMMENT_")
    protected String comment;

    public void setProductInList(List<ProductInList> productInList) {
        this.productInList = productInList;
    }

    public List<ProductInList> getProductInList() {
        return productInList;
    }


    public void setTypeFlow(TypeFlow typeFlow) {
        this.typeFlow = typeFlow == null ? null : typeFlow.getId();
    }

    public TypeFlow getTypeFlow() {
        return typeFlow == null ? null : TypeFlow.fromId(typeFlow);
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setVDate(Date vDate) {
        this.vDate = vDate;
    }

    public Date getVDate() {
        return vDate;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }


}