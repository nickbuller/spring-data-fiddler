//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.util.Arrays;
//
//@Entity
//@Table(name = "qrtz_blob_triggers", schema = "public", catalog = "indoc")
//public class QrtzBlobTriggers {
//    private String schedName;
//    private String triggerName;
//    private String triggerGroup;
//    private byte[] blobData;
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
//    @Column(name = "blob_data")
//    public byte[] getBlobData() {
//        return blobData;
//    }
//
//    public void setBlobData(byte[] blobData) {
//        this.blobData = blobData;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzBlobTriggers that = (QrtzBlobTriggers) object;
//
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (triggerName != null ? !triggerName.equals(that.triggerName) : that.triggerName != null) return false;
//        if (triggerGroup != null ? !triggerGroup.equals(that.triggerGroup) : that.triggerGroup != null) return false;
//        if (!java.util.Arrays.equals(blobData, that.blobData)) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (triggerName != null ? triggerName.hashCode() : 0);
//        result = 31 * result + (triggerGroup != null ? triggerGroup.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(blobData);
//        return result;
//    }
//}
