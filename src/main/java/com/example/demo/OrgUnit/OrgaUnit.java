package com.example.demo.OrgUnit;

import com.example.demo.Enum.OrgUnitType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrgaUnit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String unitCode;
	@Column(unique = true)
	private String unitName;
	@Enumerated(EnumType.STRING)
	private OrgUnitType unitType; // DEPARTMENT, BRANCH

}
