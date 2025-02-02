package Hotel.Management1.HotelMGT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hotel_Mgt")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
    @Column(name="firstname")
    private String firstname;
    
    @Column(name="lastname")
    private String lastname;
    
	
    @Column(name="username")
    private String username;
    
	
    @Column(name="email")
    private String email;
    
	
    @Column(name="password")
    private String password;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
    
}
