package com.tipdm.framework.model.dmserver;

import com.tipdm.framework.model.IdEntity;
import com.tipdm.framework.persist.datatype.JsonType;
import com.tipdm.framework.persist.datatype.TextType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by TipDM on 2016/12/9.
 * E-mail:devp@tipdm.com
 * 控件
 */
@Entity
@Table(name = "dm_element_type", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
@TypeDefs( {@TypeDef( name= "json", typeClass = JsonType.class), @TypeDef( name= "text", typeClass = TextType.class)})
public class Widget  extends IdEntity<Long> {

    private static final long serialVersionUID = 5801973233191562413L;

    @Column(nullable = false)
    private String name;

    @Column(name = "codename", nullable = false)
    private String codeName;

    @Column(name = "description")
    @Type(type = "text")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
