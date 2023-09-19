package com.model.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;

/**
 *      IEnum            ，View   spring-mybatis.xml    typeEnumsPackage
 */
public enum TypeEnum implements IEnum {
    DISABLED(0, "  "),
    NORMAL(1, "  ");

    private final int value;
    private final String desc;

    TypeEnum(final int value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }

    // Jackson     JsonValue      json   
    public String getDesc() {
        return this.desc;
    }
}
