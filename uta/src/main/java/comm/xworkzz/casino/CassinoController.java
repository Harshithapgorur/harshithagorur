package comm.xworkzz.casino;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
	@RequestMapping("/casino")
	public class CassinoController {
		public CassinoController() {
			System.out.println("created "+this.getClass().getSimpleName());
			
		}
		@PostMapping
		public String onCassino(CassinoDTO dto, Model model) {
			System.out.println("running onCassino"+dto);
			((CassinoDTO) model).addAttribute("name", dto.getName());
			((CassinoDTO) model).addAttribute("price", dto.getEntryFee());
			return "casinoindex.jsp";
		}

}
