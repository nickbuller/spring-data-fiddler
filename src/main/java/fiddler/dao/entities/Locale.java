package fiddler.dao.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
public class Locale {
    @Id
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Locale{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
