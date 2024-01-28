package com.spring.adrs;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="eId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer eId;
	@Column(name="eName")
	private String eName;
	@Column(name="egender")
	private String eGender;
	@Column(name="sal")
	private Double sal;
	
	@OneToMany(mappedBy="employ", cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	private List<Addres> adrs;
	
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteGender() {
		return eGender;
	}
	public void seteGender(String eGender) {
		this.eGender = eGender;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public List<Addres> getAdrs() {
		return adrs;
	}
	public void setAdrs(List<Addres> adrs) {
		this.adrs = adrs;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eGender=" + eGender + ", sal=" + sal + ", adrs=" + adrs
				+ "]";
	}
	
	
	/*
	 * @Id
	 * 
	 * @Column(name="pid")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE) private Integer pId;
	 * 
	 * @Column(name="pname") private String pName;
	 * 
	 * @Column(name="pgender") private String pgender;
	 * 
	 * @OneToOne(mappedBy="persone" , cascade=CascadeType.ALL) private Addres
	 * passport;
	 * 
	 * public Integer getpId() { return pId; } public void setpId(Integer pId) {
	 * this.pId = pId; } public String getpName() { return pName; } public void
	 * setpName(String pName) { this.pName = pName; } public String getPgender() {
	 * return pgender; } public void setPgender(String pgender) { this.pgender =
	 * pgender; } public Addres getPassport() { return passport; } public void
	 * setPassport(Addres passport) { this.passport = passport; }
	 * 
	 * @Override public String toString() { return "Employee [pId=" + pId +
	 * ", pName=" + pName + ", pgender=" + pgender + ", passport=" + passport + "]";
	 * }
	 */
	
	/*
	 * @Id
	 * 
	 * @Column(name="eid")
	 * 
	 * @SequenceGenerator(name = "eId", sequenceName="emp_seq")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="eId") private
	 * Integer eId;
	 * 
	 * @Column(name="sal") private Float sal;
	 * 
	 * @Column(name="ename") private String ename;
	 * 
	 * @OneToMany(mappedBy="empcl" ,cascade=CascadeType.ALL) private List<Addres>
	 * adrscls; public Employee() {
	 * 
	 * } public Employee(Integer eId, Float sal, String ename, List<Addres> adrscls)
	 * { this.eId = eId; this.sal = sal; this.ename = ename; this.adrscls = adrscls;
	 * } public Integer geteId() { return eId; } public void seteId(Integer eId) {
	 * this.eId = eId; } public Float getSal() { return sal; } public void
	 * setSal(Float sal) { this.sal = sal; } public String getEname() { return
	 * ename; } public void setEname(String ename) { this.ename = ename; } public
	 * List<Addres> getAdrscls() { return adrscls; } public void
	 * setAdrscls(List<Addres> adrscls) { this.adrscls = adrscls; }
	 * 
	 * @Override public String toString() { return "Employee [eId=" + eId + ", sal="
	 * + sal + ", ename=" + ename + ", adrscls=" + adrscls + "]"; }
	 */
	
	
	
}

	