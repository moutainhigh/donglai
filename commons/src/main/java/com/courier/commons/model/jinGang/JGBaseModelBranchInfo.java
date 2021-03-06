package com.courier.commons.model.jinGang;

import com.courier.commons.entity.BaseEntity;

import java.io.Serializable;

/**
 * Created by bin on 2015/11/27.
 */
public class JGBaseModelBranchInfo  extends BaseEntity {
    private static final long serialVersionUID = 6894103356097666385L;
    private JGOrderInfoResult[] list;
    private String status;
    private String message;
    private JGBranchResult object;

    public JGOrderInfoResult[] getList() {
        return list;
    }

    public void setList(JGOrderInfoResult[] list) {
        this.list = list;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JGBranchResult getObject() {
        return object;
    }

    public void setObject(JGBranchResult object) {
        this.object = object;
    }
}
