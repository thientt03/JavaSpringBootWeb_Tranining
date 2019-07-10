package hus.cisk62.demo.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EmployeeRoleEntityPK implements Serializable {
    private int employeeId;
    private int roleId;

    @Column(name = "employee_id", nullable = false)
    @Id
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name = "role_id", nullable = false)
    @Id
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

        EmployeeRoleEntityPK that = (EmployeeRoleEntityPK) o;

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
