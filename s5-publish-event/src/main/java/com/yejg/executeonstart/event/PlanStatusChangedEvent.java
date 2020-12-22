package com.yejg.executeonstart.event;

/**
 * @author yejingang
 * @since 2020-12-21
 */
public class PlanStatusChangedEvent {
    // planId
    private Long id;
    // 修改后的状态
    private Integer status;
    // 修改者信息
    private Integer operatorId;
    private String operatorName;

    public PlanStatusChangedEvent() {
    }

    public PlanStatusChangedEvent(Long id, Integer status, Integer operatorId, String operatorName) {
        this.id = id;
        this.status = status;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanStatusChangedEvent{");
        sb.append("id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operatorName='").append(operatorName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
