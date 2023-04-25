package uz.alm.almauto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ALMAUTO_PRODUCT_TYPE")
@Entity(name = "almauto$ProductType")
public class ProductType extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -981562255837846827L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "NAME")
    protected String name;

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}