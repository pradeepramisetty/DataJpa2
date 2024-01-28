package com.spring;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.adrepo.AddresRepo;
//import com.spring.adrepo.AddresRepo;
import com.spring.adrs.Addres;
import com.spring.adrs.Employee;
import com.spring.emprepo.EmployRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
	EmployRepo person = context.getBean(EmployRepo.class);
	AddresRepo passport = context.getBean(AddresRepo.class);
	
	/*
	 * Employee emp = new Employee(); emp.seteName("Pradeep");
	 * emp.seteGender("male"); emp.setSal(2000.0);
	 * 
	 * Addres ad = new Addres(); ad.setCity("Nellore"); ad.setCountry("india");
	 * ad.setState("Andhra Pradesh"); ad.setEmploy(emp);
	 * 
	 * Addres ad1 = new Addres(); ad1.setCity("Gunturu");
	 * ad1.setState("Andhra Pradesh"); ad1.setCountry("india"); ad1.setEmploy(emp);
	 * 
	 * List<Addres> ars = Arrays.asList(ad,ad1);
	 * 
	 * emp.setAdrs(ars);
	 * 
	 * person.save(emp);
	 */
	
	System.out.println(person.findById(2));
	
	
	/*
	 * Employee em =new Employee(); em.setpName("prasad"); em.setPgender("male");
	 * 
	 * Addres ad = new Addres(); ad.setPassNum("RPP456HMDA");
	 * ad.setIssueddt(LocalDate.now());
	 * ad.setExpireDt(LocalDate.now().plusYears(10));
	 * 
	 * em.setPassport(ad); ad.setPersone(em); person.save(em);
	 */
	/*
	 * Employee emp = new Employee(); emp.setEname("praadeep");
	 * emp.setSal(400002.2f);
	 * 
	 * Addres adrs = new Addres(); adrs.setCity("nallore"); adrs.setState("AP");
	 * adrs.setCountry("India");
	 * 
	 * Addres adr = new Addres(); adr.setCity("kadapa"); adr.setState("AP");
	 * adr.setCountry("India"); List<Addres> ar = Arrays.asList(adrs,adr);
	 * emp.setAdrscls(ar); EmployRepo emp1 = context.getBean(EmployRepo.class);
	 * emp1.save(emp); System.out.println("Record inserted");
	 */
	}

}
