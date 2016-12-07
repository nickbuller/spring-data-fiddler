//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.util.Arrays;
//
//
//@Entity
//@Table(name = "qrtz_calendars", schema = "public", catalog = "indoc")
//public class QrtzCalendars {
//    private String schedName;
//    private String calendarName;
//    private byte[] calendar;
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
//    @Column(name = "calendar")
//    public byte[] getCalendar() {
//        return calendar;
//    }
//
//    public void setCalendar(byte[] calendar) {
//        this.calendar = calendar;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        QrtzCalendars that = (QrtzCalendars) object;
//
//        if (schedName != null ? !schedName.equals(that.schedName) : that.schedName != null) return false;
//        if (calendarName != null ? !calendarName.equals(that.calendarName) : that.calendarName != null) return false;
//        if (!java.util.Arrays.equals(calendar, that.calendar)) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (schedName != null ? schedName.hashCode() : 0);
//        result = 31 * result + (calendarName != null ? calendarName.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(calendar);
//        return result;
//    }
//}
