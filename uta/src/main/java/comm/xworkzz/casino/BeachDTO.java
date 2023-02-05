package comm.xworkzz.casino;

import lombok.Data;

@Data
public class BeachDTO {
	private String name;
	private String location;
	private boolean clean;
	private boolean games;
	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games + "]";
	}
	public void addAttribute(String string, String location2) {
		// TODO Auto-generated method stub
		
	}
	public void addAttribute1(String string, String name2) {
		// TODO Auto-generated method stub
		
	}
	

}
