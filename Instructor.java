import java.util.UUID;
import java.util.Date;

public class Instructor {
    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private Title title; 
    private Date hireDate;
    private boolean isActive;
    private UUID departmentId; // FK
    private String specialization;

    public Instructor(UUID id, String employeeNo, String nationalId, String firstName, String lastName, String email, Title title, Date hireDate, boolean isActive, UUID departmentId, String specialization) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.hireDate = hireDate;
        this.isActive = isActive;
        this.departmentId = departmentId;
        this.specialization = specialization;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getEmployeeNo() { return employeeNo; }
    
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }
    public String getNationalId() { return nationalId; }
    
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }
    public String getFirstName() { return firstName; }
    
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    
    public void setEmail(String email) { this.email = email; }
    public Title getTitle() { return title; }

    public void setTitle(Title title) { this.title = title; }
    public Date getHireDate() { return hireDate; }

    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }
    public boolean isActive() { return isActive; }

    public void setActive(boolean active) { isActive = active; }
    public UUID getDepartmentId() { return departmentId; }
    
    public void setDepartmentId(UUID departmentId) { this.departmentId = departmentId; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String toString() {
        return "Instructor [" + title + " " + firstName + " " + lastName + ", Email: " + email + "]";
    }
}