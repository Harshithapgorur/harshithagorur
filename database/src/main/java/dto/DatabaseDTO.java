package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="tree")
public class DatabaseDTO {
	@Column(name="id")
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	

}
