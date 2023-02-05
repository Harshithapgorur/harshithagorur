package comm.xworkzz.casino;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
	@RequestMapping("/beach")
	public class BeachController {
		public BeachController() {
			System.out.println("created "+this.getClass().getSimpleName());
		}
		@PostMapping
		public String onBeach(BeachDTO beachDto, Model model) {
			System.out.println("running onBeach"+beachDto);
			((BeachDTO) model).addAttribute("name", beachDto.getName());
			((BeachDTO) model).addAttribute("location", beachDto.getLocation());
			
			return "casinoindex.jsp";
		}
	}

