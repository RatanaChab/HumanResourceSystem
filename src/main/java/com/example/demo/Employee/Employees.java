package com.example.demo.Employee;

import com.example.demo.Department.Departments;
import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Enum.JoinType;
import com.example.demo.Enum.SexEnum;
import com.example.demo.OrgUnit.OrgaUnit;
import com.example.demo.Position.Positions;
import com.example.demo.User.UserEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.YesNoConverter;

import java.time.LocalDate;

@Entity
@Data
//@Builder
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(unique = true, nullable = false)
	private String empCode;
	private String firstName;
	private String lastName;
	private String localName;
	@Enumerated(EnumType.STRING)
	private SexEnum sex;
	@Enumerated(EnumType.STRING)
	private JoinType joinType = JoinType.PROBATION;
	private LocalDate joinDate;
	private LocalDate resignDate;
	@Column(length = 20)
	private String phone;
	@Convert(converter = org.hibernate.type.YesNoConverter.class)
	private Boolean active;
	@ManyToOne
	@JoinColumn(name = "position_id")
	private Positions position;
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Departments department;
	@ManyToOne
	@JoinColumn(name = "org_id")
	private OrgaUnit orgUnit;
	@OneToOne
	@JoinColumn(name = "emp_detail")
	private EmployeeDetails details;
	@Column(name = "user_id", unique = true)
	private Long userId;
}
