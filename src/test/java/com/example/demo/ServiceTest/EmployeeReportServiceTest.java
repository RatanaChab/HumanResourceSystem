package com.example.demo.ServiceTest;

import com.example.demo.Employee.Employees;
import com.example.demo.EmployeeReport.Persistence.EmpReportRepository;
import com.example.demo.EmployeeReport.Service.EmpReportService;
import com.example.demo.EmployeeReport.Service.EmpReportServiceImp;
import com.example.demo.EmployeeReport.Persistence.EmployeeReporting;
import com.example.demo.Exception.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class EmployeeReportServiceTest {

	@Mock
	private EmpReportRepository empReportRepository;
	private EmpReportService reportService;

	@BeforeEach
	public void startService() {
		reportService = new EmpReportServiceImp(empReportRepository);
	}

	@Test
	public void testFindManager() {
		// given
		Employees employees = new Employees();
		employees.setId(1L);
		employees.setActive(true);

		EmployeeReporting reporting = new EmployeeReporting();
		reporting.setId(1L);
		reporting.setActive(true);
		reporting.setEmployee(employees);

		// when
		Mockito.when(empReportRepository.findById(1L)).thenReturn(Optional.of(reporting));
		Employees manager = reportService.findManager(1L);
		Assertions.assertNull(manager);
		Assertions.assertEquals(1L, reporting.getEmployee().getId());
	}

	@Test
	void shouldThrowExceptionWhenUserNotFound() {
		Mockito.when(empReportRepository.findById(1L)).thenReturn(Optional.empty());

		RuntimeException exception = Assertions.assertThrows(ResourceNotFoundException.class,
				() -> reportService.findManager(1L));

		Assertions.assertEquals("Manager Not Found with id = 1 not found", exception.getMessage());
	}
}
