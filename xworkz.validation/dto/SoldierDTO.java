package com.xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SoldierDTO extends AbstractAuditDTO {
	
	
	@NonNull  // non primitive
	@NotBlank
	@NotNull
	@Size(min =2, max =20)
	private String name;
	
	@Min(value =0,  message ="Id must be greater than zero")
	@Max(1000)      //primitive
	private int id;
	
	
	@NonNull
	@NotBlank
	@NotNull
	@Size(min =4, max =40)
	private String rank;
	
	
	@NonNull
	@NotBlank
	@NotNull
	@Size(min =3, max =50)
	private String  batallion;
	
	
	@NonNull
	@NotBlank
	@NotNull
	@Size(min =3, max =20)
	private String country;
	
	
}
