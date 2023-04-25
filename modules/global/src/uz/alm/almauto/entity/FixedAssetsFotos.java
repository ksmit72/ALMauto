package uz.alm.almauto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.FileDescriptor;
import javax.persistence.OneToOne;

@NamePattern(" %s %s|data,comment,imageFile")
@Table(name = "ALMAUTO_FIXED_ASSETS_FOTOS")
@Entity(name = "almauto$FixedAssetsFotos")
public class FixedAssetsFotos extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -3118543054194178526L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")
    protected FileDescriptor imageFile;

    @Column(name = "COMMENT_")
    protected String comment;

    @Column(name = "DATA_")
    protected byte[] data;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIXED_ASSETS_ID")
    protected FixedAssets fixedAssets;

    public void setFixedAssets(FixedAssets fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public FixedAssets getFixedAssets() {
        return fixedAssets;
    }


    public void setImageFile(FileDescriptor imageFile) {
        this.imageFile = imageFile;
    }

    public FileDescriptor getImageFile() {
        return imageFile;
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

    public void setData(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }


}