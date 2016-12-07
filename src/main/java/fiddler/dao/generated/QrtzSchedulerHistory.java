//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "qrtz_scheduler_history", schema = "public", catalog = "indoc")
//public class QrtzSchedulerHistory {
//    private String hostIp;
//    private String hostName;
//    private String schedulerName;
//    private String eventType;
//    private String eventName;
//    private LocalDateTime eventTime;
//    private String info1;
//    private String info2;
//    private String info3;
//    private String info4;
//    private String info5;
//
//    @Basic
//    @Column(name = "host_ip")
//    public String getHostIp() {
//        return hostIp;
//    }
//
//    public void setHostIp(String hostIp) {
//        this.hostIp = hostIp;
//    }
//
//    @Basic
//    @Column(name = "host_name")
//    public String getHostName() {
//        return hostName;
//    }
//
//    public void setHostName(String hostName) {
//        this.hostName = hostName;
//    }
//
//    @Basic
//    @Column(name = "scheduler_name")
//    public String getSchedulerName() {
//        return schedulerName;
//    }
//
//    public void setSchedulerName(String schedulerName) {
//        this.schedulerName = schedulerName;
//    }
//
//    @Basic
//    @Column(name = "event_type")
//    public String getEventType() {
//        return eventType;
//    }
//
//    public void setEventType(String eventType) {
//        this.eventType = eventType;
//    }
//
//    @Basic
//    @Column(name = "event_name")
//    public String getEventName() {
//        return eventName;
//    }
//
//    public void setEventName(String eventName) {
//        this.eventName = eventName;
//    }
//
//    @Basic
//    @Column(name = "event_time")
//    public LocalDateTime getEventTime() {
//        return eventTime;
//    }
//
//    public void setEventTime(LocalDateTime eventTime) {
//        this.eventTime = eventTime;
//    }
//
//    @Basic
//    @Column(name = "info1")
//    public String getInfo1() {
//        return info1;
//    }
//
//    public void setInfo1(String info1) {
//        this.info1 = info1;
//    }
//
//    @Basic
//    @Column(name = "info2")
//    public String getInfo2() {
//        return info2;
//    }
//
//    public void setInfo2(String info2) {
//        this.info2 = info2;
//    }
//
//    @Basic
//    @Column(name = "info3")
//    public String getInfo3() {
//        return info3;
//    }
//
//    public void setInfo3(String info3) {
//        this.info3 = info3;
//    }
//
//    @Basic
//    @Column(name = "info4")
//    public String getInfo4() {
//        return info4;
//    }
//
//    public void setInfo4(String info4) {
//        this.info4 = info4;
//    }
//
//    @Basic
//    @Column(name = "info5")
//    public String getInfo5() {
//        return info5;
//    }
//
//    public void setInfo5(String info5) {
//        this.info5 = info5;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzSchedulerHistory that = (QrtzSchedulerHistory) object;
//
//        if (hostIp != null ? !hostIp.equals(that.hostIp) : that.hostIp != null) return false;
//        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null) return false;
//        if (schedulerName != null ? !schedulerName.equals(that.schedulerName) : that.schedulerName != null) return false;
//        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
//        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
//        if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null) return false;
//        if (info1 != null ? !info1.equals(that.info1) : that.info1 != null) return false;
//        if (info2 != null ? !info2.equals(that.info2) : that.info2 != null) return false;
//        if (info3 != null ? !info3.equals(that.info3) : that.info3 != null) return false;
//        if (info4 != null ? !info4.equals(that.info4) : that.info4 != null) return false;
//        if (info5 != null ? !info5.equals(that.info5) : that.info5 != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (hostIp != null ? hostIp.hashCode() : 0);
//        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
//        result = 31 * result + (schedulerName != null ? schedulerName.hashCode() : 0);
//        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
//        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
//        result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
//        result = 31 * result + (info1 != null ? info1.hashCode() : 0);
//        result = 31 * result + (info2 != null ? info2.hashCode() : 0);
//        result = 31 * result + (info3 != null ? info3.hashCode() : 0);
//        result = 31 * result + (info4 != null ? info4.hashCode() : 0);
//        result = 31 * result + (info5 != null ? info5.hashCode() : 0);
//        return result;
//    }
//}
