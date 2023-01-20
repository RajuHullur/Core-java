 package com.xworkz.validation.dto;


import java.io.Serializable;
import java.time.LocalDateTime;

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
public class AbstractAuditDTO  implements   Serializable {
	
	private String createdBy;
	private LocalDateTime createdAt;
	
	private String updatedBy;
	private LocalDateTime updatedAt;

}
