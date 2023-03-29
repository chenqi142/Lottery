package cn.itedus.lottery.rpc.req;

import java.io.Serializable;

/**
 * @author cq
 * @date 2023/03/28
 */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
