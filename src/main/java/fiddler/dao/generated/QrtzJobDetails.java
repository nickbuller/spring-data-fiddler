//package fiddler.dao.generated;
//
//import javax.persistence.*;
//import java.util.Arrays;
//
//
//
//@Entity
//@Table(name = "qrtz_job_details", schema = "public", catalog = "indoc")
//public class QrtzJobDetails {
//    private String schedName;
//    private String jobName;
//    private String jobGroup;
//    private String description;
//    private String jobClassName;
//    private boolean isDurable;
//    private boolean isNonconcurrent;
//    private boolean isUpdateData;
//    private boolean requestsRecovery;
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
//    @Column(name = "job_class_name")
//    public String getJobClassName() {
//        return jobClassName;
//    }
//
//    public void setJobClassName(String jobClassName) {
//        this.jobClassName = jobClassName;
//    }
//
//    @Basic
//    @Column(name = "is_durable")
//    public boolean isDurable() {
//        return isDurable;
//    }
//
//    public void setDurable(boolean durable) {
//        isDurable = durable;
//    }
//
//    @Basic
//    @Column(name = "is_nonconcurrent")
//    public boolean isNonconcurrent() {
//        return isNonconcurrent;
//    }
//
//    public void setNonconcurrent(boolean nonconcurrent) {
//        isNonconcurrent = nonconcurrent;
//    }
//
//    @Basic
//    @Column(name = "is_update_data")
//    public boolean isUpdateData() {
//        return isUpdateData;
//    }
//
//    public void setUpdateData(boolean updateData) {
//        isUpdateData = updateData;
//    }
//
//    @Basic
//    @Column(name = "requests_recovery")
//    public boolean isRequestsRecovery() {
//        return requestsRecovery;
//    }
//
//    public void setRequestsRecovery(boolean requestsRecovery) {
//        this.requestsRecovery = requestsRecovery;
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
//        QrtzJobDetails that = (QrtzJobDetails) object;
//
//        if (isDurable != that.isDurable) return false;
//        if (isNonconcurrent != that.isNonconcurrent) return false;
//        if (isUpdateData != that.isUpdateData) return false;
//        if (requestsRecovery != that.requestsRecovery) return false;
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
//        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (jobClassName != null ? !jobClassName.equals(that.jobClassName) : that.jobClassName != null) return false;
//        if (!java.util.Arrays.equals(jobData, that.jobData)) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
//        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (jobClassName != null ? jobClassName.hashCode() : 0);
//        result = 31 * result + (isDurable ? 1 : 0);
//        result = 31 * result + (isNonconcurrent ? 1 : 0);
//        result = 31 * result + (isUpdateData ? 1 : 0);
//        result = 31 * result + (requestsRecovery ? 1 : 0);
//        result = 31 * result + Arrays.hashCode(jobData);
//        return result;
//    }
//}
