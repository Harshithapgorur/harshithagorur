import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
	@RequestMapping("/pass")
	public class Interview {
		public Interview() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}
		
		@PostMapping
		public String onPass(InterviewDto dto) {
			System.out.println("running onPass...");
			System.out.println(dto);
			return "index.jsp";
		}

}
