//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "qrtz_cron_triggers", schema = "public", catalog = "indoc")
//public class QrtzCronTriggers {
//    private String schedName;
//    private String triggerName;
//    private String triggerGroup;
//    private String cronExpression;
//    private String timeZoneId;
//
//    @Basic
//    @Column(name = "sched_name")
//    public String getSchedName() {
//        return schedName;
//    }
//
//    public void setSchedName(String schedName) {
//        this.schedName = schedName;
//    }
//
//    @Basic
//    @Column(name = "trigger_name")
//    public String getTriggerName() {
//        return triggerName;
//    }
//
//    public void setTriggerName(String triggerName) {
//        this.triggerName = triggerName;
//    }
//
//    @Basic
//    @Column(name = "trigger_group")
//    public String getTriggerGroup() {
//        return triggerGroup;
//    }
//
//    public void setTriggerGroup(String triggerGroup) {
//        this.triggerGroup = triggerGroup;
//    }
//
//    @Basic
//    @Column(name = "cron_expression")
//    public String getCronExpression() {
//        return cronExpression;
//    }
//
//    public void setCronExpression(String cronExpression) {
//        this.cronExpression = cronExpression;
//    }
//
//    @Basic
//    @Column(name = "time_zone_id")
//    public String getTimeZoneId() {
//        return timeZoneId;
//    }
//
//    public void setTimeZoneId(String timeZoneId) {
//        this.timeZoneId = timeZoneId;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzCronTriggers that = (QrtzCronTriggers) object;
//
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
//        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
//        if (cronExpression != null ? !cronExpression.equals(that.cronExpression) : that.cronExpression != null) return false;
//        if (timeZoneId != null ? !timeZoneId.equals(that.timeZoneId) : that.timeZoneId != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
//        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
//        result = 31 * result + (cronExpression != null ? cronExpression.hashCode() : 0);
//        result = 31 * result + (timeZoneId != null ? timeZoneId.hashCode() : 0);
//        return result;
//    }
//}
