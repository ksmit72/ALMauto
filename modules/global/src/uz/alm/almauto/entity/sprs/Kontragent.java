package uz.alm.almauto.entity.sprs;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s %s %s %s %s %s %s %s|name,inn,lastName,firstName,middleName,post,address,rs,bank,mfo,telFax")
@Table(name = "ALMAUTO_KONTRAGENT")
@Entity(name = "almauto$Kontragent")
public class Kontragent extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -9004358450225920688L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "INN", length = 9)
    protected String inn;

    @Column(name = "LAST_NAME", length = 50)
    protected String lastName;

    @Column(name = "FIRST_NAME", length = 50)
    protected String firstName;

    @Column(name = "MIDDLE_NAME", length = 50)
    protected String middleName;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    protected Post post;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "RS", length = 30)
    protected String rs;

    @Column(name = "BANK")
    protected String bank;

    @Column(name = "MFO", length = 6)
    protected String mfo;

    @Column(name = "TEL_FAX")
    protected String telFax;

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

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getRs() {
        return rs;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setMfo(String mfo) {
        this.mfo = mfo;
    }

    public String getMfo() {
        return mfo;
    }

    public void setTelFax(String telFax) {
        this.telFax = telFax;
    }

    public String getTelFax() {
        return telFax;
    }


}