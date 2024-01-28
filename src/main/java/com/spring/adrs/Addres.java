package com.spring.adrs;



import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="adres")
public class Addres {
	@Id
	@Column(name="aId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE )
	private Integer aId;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@ManyToOne
	@JoinColumn(name="eId")
	private Employee employ;
	
	
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmploy() {
		return employ;
	}
	public void setEmploy(Employee employ) {
		this.employ = employ;
	}
	
	@Override
	public String toString() {
		return "Addres [aId=" + aId + ", city=" + city + ", state=" + state + ", country=" + country + ", employ="
				+ employ + "]";
	}
	
	/*
	 * @Id
	 * 
	 * @Column(name="passId")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE) private Integer
	 * passportId;
	 * 
	 * @Column(name="pasnum") private String passNum;
	 * 
	 * @Column(name="pissudt") private LocalDate Issueddt;
	 * 
	 * @Column(name="pexpirDt") private LocalDate expireDt;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name="pid") private Employee persone;
	 * 
	 * public Integer getPassportId() { return passportId; }
	 * 
	 * @Override public String toString() { return "Addres [passportId=" +
	 * passportId + ", passNum=" + passNum + ", Issueddt=" + Issueddt +
	 * ", expireDt=" + expireDt + ", persone=" + persone + "]"; } public void
	 * setPassportId(Integer passportId) { this.passportId = passportId; } public
	 * String getPassNum() { return passNum; } public void setPassNum(String
	 * passNum) { this.passNum = passNum; } public LocalDate getIssueddt() { return
	 * Issueddt; } public void setIssueddt(LocalDate issueddt) { Issueddt =
	 * issueddt; } public LocalDate getExpireDt() { return expireDt; } public void
	 * setExpireDt(LocalDate expireDt) { this.expireDt = expireDt; } public Employee
	 * getPersone() { return persone; } public void setPersone(Employee persone) {
	 * this.persone = persone; }
	 */
	
	
	
	/*
	 * @Id
	 * 
	 * @Column(name="adrsId")
	 * 
	 * @SequenceGenerator(name = "adrsId", sequenceName="add_seq")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="adrsId")
	 * private Integer adrsId;
	 * 
	 * @Column(name="city") private String city;
	 * 
	 * @Column(name="state") private String state;
	 * 
	 * @Column(name="country") private String country;
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="empid") private Employee empcl;
	 * 
	 * public Addres() {
	 * 
	 * }
	 * 
	 * public Addres(Integer adrsId, String city, String state, String country,
	 * Employee empcl) { this.adrsId = adrsId; this.city = city; this.state = state;
	 * this.country = country; this.empcl = empcl; }
	 * 
	 * public Integer getAdrsId() { return adrsId; }
	 * 
	 * public void setAdrsId(Integer adrsId) { this.adrsId = adrsId; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public String getState() { return state; }
	 * 
	 * public void setState(String state) { this.state = state; }
	 * 
	 * public String getCountry() { return country; }
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 * 
	 * public Employee getEmpcl() { return empcl; }
	 * 
	 * public void setEmpcl(Employee empcl) { this.empcl = empcl; }
	 * 
	 * @Override public String toString() { return "Addres [adrsId=" + adrsId +
	 * ", city=" + city + ", state=" + state + ", country=" + country + ", empcl=" +
	 * empcl + "]"; }
	 */
	
	
}
