package uz.alm.almauto.entity.sprs;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "ALMAUTO_POST")
@Entity(name = "almauto$Post")
public class Post extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -6728638821265137588L;

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