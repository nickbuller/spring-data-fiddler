//package fiddler.dao.generated;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "qrtz_scheduler_state", schema = "public", catalog = "indoc")
//public class QrtzSchedulerState {
//    private String schedName;
//    private String instanceName;
//    private long lastCheckinTime;
//    private long checkinInterval;
//
//    @Id
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
//    @Column(name = "instance_name")
//    public String getInstanceName() {
//        return instanceName;
//    }
//
//    public void setInstanceName(String instanceName) {
//        this.instanceName = instanceName;
//    }
//
//    @Basic
//    @Column(name = "last_checkin_time")
//    public long getLastCheckinTime() {
//        return lastCheckinTime;
//    }
//
//    public void setLastCheckinTime(long lastCheckinTime) {
//        this.lastCheckinTime = lastCheckinTime;
//    }
//
//    @Basic
//    @Column(name = "checkin_interval")
//    public long getCheckinInterval() {
//        return checkinInterval;
//    }
//
//    public void setCheckinInterval(long checkinInterval) {
//        this.checkinInterval = checkinInterval;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzSchedulerState that = (QrtzSchedulerState) object;
//
//        if (lastCheckinTime != that.lastCheckinTime) return false;
//        if (checkinInterval != that.checkinInterval) return false;
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (instanceName != null ? !instanceName.equals(that.instanceName) : that.instanceName != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (instanceName != null ? instanceName.hashCode() : 0);
//        result = 31 * result + (int) (lastCheckinTime ^ (lastCheckinTime >>> 32));
//        result = 31 * result + (int) (checkinInterval ^ (checkinInterval >>> 32));
//        return result;
//    }
//}
