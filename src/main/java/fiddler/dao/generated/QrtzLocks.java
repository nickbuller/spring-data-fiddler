//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//
//
//@Entity
//@Table(name = "qrtz_locks", schema = "public", catalog = "indoc")
//public class QrtzLocks {
//    private String schedName;
//    private String lockName;
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
//    @Column(name = "lock_name")
//    public String getLockName() {
//        return lockName;
//    }
//
//    public void setLockName(String lockName) {
//        this.lockName = lockName;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzLocks qrtzLocks = (QrtzLocks) object;
//
//        if (schedName != null ? !schedName.equals(qrtzLocks.schedName) : qrtzLocks.schedName != null) return false;
//        if (lockName != null ? !lockName.equals(qrtzLocks.lockName) : qrtzLocks.lockName != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (lockName != null ? lockName.hashCode() : 0);
//        return result;
//    }
//}
