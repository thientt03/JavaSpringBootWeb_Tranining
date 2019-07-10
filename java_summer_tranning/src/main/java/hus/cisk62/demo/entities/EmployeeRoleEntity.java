package hus.cisk62.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee_role", schema = "okaymen", catalog = "")
@IdClass(EmployeeRoleEntityPK.class)
public class EmployeeRoleEntity {
    private int employeeId;
    private int roleId;

    @Id
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Id
    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRoleEntity that = (EmployeeRoleEntity) o;

        if (employeeId != that.employeeId) return false;
        if (roleId != that.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + roleId;
        return result;
    }
}
