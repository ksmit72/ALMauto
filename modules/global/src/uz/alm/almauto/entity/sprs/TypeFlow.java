package uz.alm.almauto.entity.sprs;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeFlow implements EnumClass<Integer> {

    in(1),
    out(-1);

    private Integer id;

    TypeFlow(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer idd)
    {
        id = idd;
    }

    @Nullable
    public static TypeFlow fromId(Integer id) {
        for (TypeFlow at : TypeFlow.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}