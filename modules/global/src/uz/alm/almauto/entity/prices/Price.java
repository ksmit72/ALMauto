package uz.alm.almauto.entity.prices;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s %s|vDate,comment")
@Table(name = "ALMAUTO_PRICE")
@Entity(name = "almauto$Price")
public class Price extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 2971703731571345957L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "prices")
    protected List<PriceList> priceList;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "V_DATE", nullable = false)
    protected Date vDate;

    @Column(name = "COMMENT_")
    protected String comment;

    public void setPriceList(List<PriceList> priceList) {
        this.priceList = priceList;
    }

    public List<PriceList> getPriceList() {
        return priceList;
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

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


}