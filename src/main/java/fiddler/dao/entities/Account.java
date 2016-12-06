package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
public class Account {
    String scope;
    @Id
    @SequenceGenerator(name = "account_seq", sequenceName = "account_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
    private Long id;
    private String name;
    @Column(name = "creatorid")
    private Long creatorId;
    @Column(name = "createdts")
    private LocalDateTime createdts;
    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;
    @Column(name = "modifierid")
    private Long modifierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", creatorId=").append(creatorId);
        sb.append(", createdts=").append(createdts);
        sb.append(", modifiedTs=").append(modifiedTs);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
