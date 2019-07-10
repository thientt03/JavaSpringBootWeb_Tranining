package hus.cisk62.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "application", schema = "okaymen", catalog = "")
public class ApplicationEntity {
    private int id;
    private Timestamp timeStart;
    private Timestamp timeEnd;
    private String reason;
    private String description;
    private Timestamp createAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time_start", nullable = false)
    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    @Basic
    @Column(name = "time_end", nullable = false)
    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Basic
    @Column(name = "reason", nullable = false, length = -1)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "create_at", nullable = false)
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplicationEntity entity = (ApplicationEntity) o;

        if (id != entity.id) return false;
        if (timeStart != null ? !timeStart.equals(entity.timeStart) : entity.timeStart != null) return false;
        if (timeEnd != null ? !timeEnd.equals(entity.timeEnd) : entity.timeEnd != null) return false;
        if (reason != null ? !reason.equals(entity.reason) : entity.reason != null) return false;
        if (description != null ? !description.equals(entity.description) : entity.description != null) return false;
        if (createAt != null ? !createAt.equals(entity.createAt) : entity.createAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (timeStart != null ? timeStart.hashCode() : 0);
        result = 31 * result + (timeEnd != null ? timeEnd.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        return result;
    }
}
