package inv;
import
import
import
import
javax.persistence.Entity;
javax.persistence.GeneratedValue;
javax.persistence.GenerationType;
javax.persistence.Id;
@Entity
public class Can {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String power;
private String capacity;
public String getPower() {
return power;
}
public void setPower(String power) {
this.power = power;
}
public String getCapacity() {
return capacity;
}
public void setCapacity(String capacity) {
this.capacity = capacity;
}
}
