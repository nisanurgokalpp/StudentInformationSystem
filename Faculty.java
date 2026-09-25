import java.util.UUID;

public class Faculty {
    private UUID id;
    private String name;
    private UUID deanId; //FK
    private String phone;
    private String email;
    private boolean isActive; 

    //Constructor 
    public Faculty(UUID id, String name, UUID deanId, String phone, String email, boolean isActive){
        this.id = id;
        this.name = name;
        this deanId = deanId;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
    }

    //Getter And Setter Methods
    public UUID getID(){ return id; }
    public void setId(UUID id){this.id = id; }
    
    public String getName(){ return name; }
    public void setName(String name){this.name = name; }

    public UUID getDeanId(){ return deanId; }
    public void setDeanId(UUID deanId){this.deanId = deanId; }

    public String getPhone(){ return phone; }
    public void setPhone(String phone){ this.phone = phone; }

    public String getEmail(){ return email; }
    public void setEmail(String email){this.email = email; }

    public boolean isActive() {return isActive;}
    public void setActive(boolean active) { isActive = active } 

    //toString Method
    @Override
    public String toString(){
        return "Faculty [Name: " + name + ", Email: " + email + ", Active: " + isActive + "]";
    }

}