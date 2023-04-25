package uz.alm.almauto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.FileDescriptor;

@NamePattern("%s %s|name,description")
@Table(name = "ALMAUTO_FIXED_ASSETS")
@Entity(name = "almauto$FixedAssets")
public class FixedAssets extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 3977944398656881240L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "fixedAssets")
    protected List<FixedAssetsFotos> fixedAssetsFotos;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DESCRIPTION")
    protected String description;




    public void setFixedAssetsFotos(List<FixedAssetsFotos> fixedAssetsFotos) {
        this.fixedAssetsFotos = fixedAssetsFotos;
    }

    public List<FixedAssetsFotos> getFixedAssetsFotos() {
        return fixedAssetsFotos;
    }


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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}