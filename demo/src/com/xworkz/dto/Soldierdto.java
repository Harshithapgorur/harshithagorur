package com.xworkz.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Soldierdto {
	@NotNull
	@Size(min=3,max=25)
	private String type;
	@NotNull
	@Size(min=5,max=15)
	private String country;
	@Min(2)
	private int age;
	@Email(message="email should be valid")
	private String email;
	@NotNull
	@Size(min=3,max=35)
	private String name;
	

}
