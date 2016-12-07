//package fiddler.dao.generated;
//
//import javax.persistence.*;
//import java.util.Arrays;
//
//@Entity
//@Table(name = "qrtz_triggers", schema = "public", catalog = "indoc")
//public class QrtzTriggers {
//    private String schedName;
//    private String triggerName;
//    private String triggerGroup;
//    private String jobName;
//    private String jobGroup;
//    private String description;
//    private Long nextFireTime;
//    private Long prevFireTime;
//    private Integer priority;
//    private String triggerState;
//    private String triggerType;
//    private long startTime;
//    private Long endTime;
//    private String calendarName;
//    private Short misfireInstr;
//    private byte[] jobData;
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
//    @Column(name = "job_name")
//    public String getJobName() {
//        return jobName;
//    }
//
//    public void setJobName(String jobName) {
//        this.jobName = jobName;
//    }
//
//    @Basic
//    @Column(name = "job_group")
//    public String getJobGroup() {
//        return jobGroup;
//    }
//
//    public void setJobGroup(String jobGroup) {
//        this.jobGroup = jobGroup;
//    }
//
//    @Basic
//    @Column(name = "description")
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Basic
//    @Column(name = "next_fire_time")
//    public Long getNextFireTime() {
//        return nextFireTime;
//    }
//
//    public void setNextFireTime(Long nextFireTime) {
//        this.nextFireTime = nextFireTime;
//    }
//
//    @Basic
//    @Column(name = "prev_fire_time")
//    public Long getPrevFireTime() {
//        return prevFireTime;
//    }
//
//    public void setPrevFireTime(Long prevFireTime) {
//        this.prevFireTime = prevFireTime;
//    }
//
//    @Basic
//    @Column(name = "priority")
//    public Integer getPriority() {
//        return priority;
//    }
//
//    public void setPriority(Integer priority) {
//        this.priority = priority;
//    }
//
//    @Basic
//    @Column(name = "trigger_state")
//    public String getTriggerState() {
//        return triggerState;
//    }
//
//    public void setTriggerState(String triggerState) {
//        this.triggerState = triggerState;
//    }
//
//    @Basic
//    @Column(name = "trigger_type")
//    public String getTriggerType() {
//        return triggerType;
//    }
//
//    public void setTriggerType(String triggerType) {
//        this.triggerType = triggerType;
//    }
//
//    @Basic
//    @Column(name = "start_time")
//    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    @Basic
//    @Column(name = "end_time")
//    public Long getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(Long endTime) {
//        this.endTime = endTime;
//    }
//
//    @Basic
//    @Column(name = "calendar_name")
//    public String getCalendarName() {
//        return calendarName;
//    }
//
//    public void setCalendarName(String calendarName) {
//        this.calendarName = calendarName;
//    }
//
//    @Basic
//    @Column(name = "misfire_instr")
//    public Short getMisfireInstr() {
//        return misfireInstr;
//    }
//
//    public void setMisfireInstr(Short misfireInstr) {
//        this.misfireInstr = misfireInstr;
//    }
//
//    @Basic
//    @Column(name = "job_data")
//    public byte[] getJobData() {
//        return jobData;
//    }
//
//    public void setJobData(byte[] jobData) {
//        this.jobData = jobData;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzTriggers that = (QrtzTriggers) object;
//
//        if (startTime != that.startTime) return false;
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
//        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
//        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
//        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (nextFireTime != null ? !nextFireTime.equals(that.nextFireTime) : that.nextFireTime != null) return false;
//        if (prevFireTime != null ? !prevFireTime.equals(that.prevFireTime) : that.prevFireTime != null) return false;
//        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
//        if (triggerState != null ? !triggerState.equals(that.triggerState) : that.triggerState != null) return false;
//        if (triggerType != null ? !triggerType.equals(that.triggerType) : that.triggerType != null) return false;
//        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
//        if (calendarName != null ? !calendarName.equals(that.calendarName) : that.calendarName != null) return false;
//        if (misfireInstr != null ? !misfireInstr.equals(that.misfireInstr) : that.misfireInstr != null) return false;
//        if (!java.util.Arrays.equals(jobData, that.jobData)) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
//        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
//        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
//        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (nextFireTime != null ? nextFireTime.hashCode() : 0);
//        result = 31 * result + (prevFireTime != null ? prevFireTime.hashCode() : 0);
//        result = 31 * result + (priority != null ? priority.hashCode() : 0);
//        result = 31 * result + (triggerState != null ? triggerState.hashCode() : 0);
//        result = 31 * result + (triggerType != null ? triggerType.hashCode() : 0);
//        result = 31 * result + (int) (startTime ^ (startTime >>> 32));
//        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
//        result = 31 * result + (calendarName != null ? calendarName.hashCode() : 0);
//        result = 31 * result + (misfireInstr != null ? misfireInstr.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(jobData);
//        return result;
//    }
//}
