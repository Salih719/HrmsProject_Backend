package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site")
	private String webSite;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone_number")
	private String telephoneNumber;
	
	@Column(name="password_hast")
	private byte passwordHash;
	
	@Column(name="password_salt")
	private byte passwordSalt;
	
	//passwordSalt'ın setter'ı yok
	
	
	public Employer() {}
	public Employer(int id, String companyName, String webSite, String email, String telephoneNumber, byte passwordHash,
			byte passwordSalt) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSite = webSite;
		this.email = email;
		this.telephoneNumber = telephoneNumber;
		this.passwordHash = passwordHash;
		this.passwordSalt = passwordSalt;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
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
