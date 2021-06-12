package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="jobseekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="password_hast")
	private byte passwordHash;
	
	@Column(name="password_salt")
	private byte passwordSalt;
	
	
	
	
	public JobSeeker() {
		super();
	}


	public JobSeeker(int id, String firstName, String lastName, String nationalityId, String email, Date birthDate,
			byte passwordHash, byte passwordSalt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.email = email;
		this.birthDate = birthDate;
		this.passwordHash = passwordHash;
		this.passwordSalt = passwordSalt;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public byte getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(byte passwordHash) {
		this.passwordHash = passwordHash;
	}
	public byte getPasswordSalt() {
		return passwordSalt;
	}
	
	
	
}
