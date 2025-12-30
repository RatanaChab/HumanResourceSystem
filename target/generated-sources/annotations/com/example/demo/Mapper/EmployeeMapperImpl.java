package com.example.demo.Mapper;

import com.example.demo.Employee.DTO.CreateEmployeeRequest;
import com.example.demo.Employee.Employees;
import com.example.demo.Position.Positions;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-30T15:21:33+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employees empMapping(CreateEmployeeRequest request) {
        if ( request == null ) {
            return null;
        }

        Employees employees = new Employees();

        employees.setPosition( createEmployeeRequestToPositions( request ) );
        employees.setEmpCode( request.getEmpCode() );
        employees.setFirstName( request.getFirstName() );
        employees.setLastName( request.getLastName() );
        employees.setLocalName( request.getLocalName() );
        employees.setSex( request.getSex() );
        employees.setJoinDate( request.getJoinDate() );
        employees.setPhone( request.getPhone() );
        employees.setDetails( request.getDetails() );

        return employees;
    }

    protected Positions createEmployeeRequestToPositions(CreateEmployeeRequest createEmployeeRequest) {
        if ( createEmployeeRequest == null ) {
            return null;
        }

        Positions positions = new Positions();

        positions.setId( createEmployeeRequest.getPosition() );

        return positions;
    }
}
