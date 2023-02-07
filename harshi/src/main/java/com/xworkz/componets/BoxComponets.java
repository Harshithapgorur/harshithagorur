
package com.xworkz.componets;





import java.awt.List;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ChatDTO;
import com.xworkz.dto.EducationDTO;
import com.xworkz.dto.FamilyDTO;
import com.xworkz.dto.MobileDTO;

@Component
@RequestMapping("/")
public class BoxComponets {

	@PostMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("email", "harshithagorur@gmail.com");
		return "index.jsp";
	}

	@PostMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running onMobile");
		model.addAttribute("mobile", "7204205704");
		return "index.jsp";
	}

	@PostMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running onAadhar");
		model.addAttribute("aadhar", "573111071246");
		return "index.jsp";
	}

	@PostMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age", 20);
		return "index.jsp";
	}

	@PostMapping("/dob")
	public String onDob(Model model) {
		System.out.println("Running onDob");
		model.addAttribute("dob", LocalDateTime.of(2001, 3, 25, 12, 45));
		return "index.jsp";
	}


	@PostMapping("/ListOfFriends")
	public String onListOfFriends(Model model) {
		System.out.println("Running onFriends");
		Collection<String> ref = new ArrayList<String>();
		ref.add("friend1");
		ref.add("friend2");
		ref.add("friend3");
		model.addAttribute("ListOfFriends", ref);
		return "index.jsp";
	}
	@PostMapping("/skill")
	public String onskills(Model model) {
		System.out.println("Running onSkills");
		Collection<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("HTML");
		ref.add("SQL");
		model.addAttribute("skill", ref);
		return "index.jsp";
	}

	@PostMapping("/education")
	public String onEducation(Model model) {
		System.out.println("Running onEducation");
		EducationDTO dto = new EducationDTO();
		dto.setQualification("BCA");
		dto.setSchoolName("CJ school");
		dto.setBePercentage(77.7);
		dto.setBranch("computer application");
		dto.setDiplomaCollege("KTG");
		dto.setDiplomaPercentage(78.9);
		dto.setDeCollege("GHSC");
		dto.setLearntJava(true);
		dto.setSslcPercentage(70);
		dto.setTrainingInstitute("x-workz");
		model.addAttribute("info",dto);
		return "index.jsp";
	}
	@PostMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Prashantha M K");
		dto.setGrandFather("Krishene Gowda");
		dto.setGrandMother("Kameshi");
		dto.setLivesIn("Hassan");
		dto.setMotherName("Bharathi AG");
		dto.setSiblingName("Karthik");
		dto.setFamilmembrs(3);
		dto.setFatherqualification("D-phar");
		dto.setMotherqualification("PUC");
		dto.setNoOfsibling(3);
		model.addAttribute("fam",dto);
		return "index.jsp";
	}
	
	@PostMapping("/mobiledto")
	public String onMobileDTO(Model model) {
		System.out.println("Running onMobileDTO");
		MobileDTO dto = new MobileDTO();
		dto.setCompany("Hoonur");
		dto.setModel("note 8 pro");
		dto.setPrice(18000);
		dto.setDualSim(true);
		dto.setSimname("airtel");
		model.addAttribute("sim",dto);
		return "index.jsp";
	}
	
	
	
	@PostMapping("/chat")
	public String onChats(Model model) {
		System.out.println("Running onChats");
		ChatDTO dto = new ChatDTO();
		dto.setAvailable(true);
		dto.setDistance(3);
		dto.setGoodForHealth(false);
		dto.setLocation("Hasan");
		dto.setName("Pani-pure");
		dto.setOwnerName("whatever");
		dto.setPrice(30);
		dto.setShopClosesAt(LocalTime.of(10, 00));
		dto.setShopName("Lakshmi");
		dto.setShopOpensAt(LocalTime.of(05, 00));
		dto.setTastesGood(true);
		model.addAttribute("chat",dto);
		return "index.jsp";
	}

	

	
}
