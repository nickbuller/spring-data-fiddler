//package fiddler.dao.generated;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "qrtz_simple_triggers", schema = "public", catalog = "indoc")
//public class QrtzSimpleTriggers {
//    private String schedName;
//    private String triggerName;
//    private String triggerGroup;
//    private long repeatCount;
//    private long repeatInterval;
//    private long timesTriggered;
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
//    @Id
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
//    @Column(name = "repeat_count")
//    public long getRepeatCount() {
//        return repeatCount;
//    }
//
//    public void setRepeatCount(long repeatCount) {
//        this.repeatCount = repeatCount;
//    }
//
//    @Basic
//    @Column(name = "repeat_interval")
//    public long getRepeatInterval() {
//        return repeatInterval;
//    }
//
//    public void setRepeatInterval(long repeatInterval) {
//        this.repeatInterval = repeatInterval;
//    }
//
//    @Basic
//    @Column(name = "times_triggered")
//    public long getTimesTriggered() {
//        return timesTriggered;
//    }
//
//    public void setTimesTriggered(long timesTriggered) {
//        this.timesTriggered = timesTriggered;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzSimpleTriggers that = (QrtzSimpleTriggers) object;
//
//        if (repeatCount != that.repeatCount) return false;
//        if (repeatInterval != that.repeatInterval) return false;
//        if (timesTriggered != that.timesTriggered) return false;
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
//        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
//        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
//        result = 31 * result + (int) (repeatCount ^ (repeatCount >>> 32));
//        result = 31 * result + (int) (repeatInterval ^ (repeatInterval >>> 32));
//        result = 31 * result + (int) (timesTriggered ^ (timesTriggered >>> 32));
//        return result;
//    }
//}
