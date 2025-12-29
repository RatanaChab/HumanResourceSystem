package com.example.demo.EmployeeDetail;

import com.example.demo.Enum.MaritalEnum;
import com.example.demo.Enum.ReligionEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nickName;
	private String workExp;
	private String Identity;
	private String IdentityType;
	private String bankName;
	private String bankCode;
	private LocalDate birthDate;
	private String extension;
	private String email;
	private String currentAddress;
	private String birthAddress;
	@Enumerated(EnumType.STRING)
	private MaritalEnum maritalStatus;
	private Integer children;
	private String hobby;
	@Enumerated(EnumType.STRING)
	private ReligionEnum religion;
	private Integer age;
}
