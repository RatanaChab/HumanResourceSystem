package com.example.demo.Mapper;

import com.example.demo.AnnualLeave.AnnualEntity;
import com.example.demo.AnnualLeave.DTO.leaveRegisterDTO;
import com.example.demo.Employee.Employees;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-30T14:03:05+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class AnnualMapperImpl implements AnnualMapper {

    @Override
    public AnnualEntity convertCode(leaveRegisterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employees code = null;
        Float forwardLeave = null;
        Float totalLeave = null;
        Float leaveTaken = null;
        Float leaveBalance = null;
        Integer leaveApply = null;
        String leaveType = null;

        code = mapStatus( dto.getCode() );
        forwardLeave = dto.getForwardLeave();
        totalLeave = dto.getTotalLeave();
        leaveTaken = dto.getLeaveTaken();
        leaveBalance = dto.getLeaveBalance();
        leaveApply = dto.getLeaveApply();
        leaveType = dto.getLeaveType();

        Long id = null;

        AnnualEntity annualEntity = new AnnualEntity( id, code, forwardLeave, totalLeave, leaveTaken, leaveBalance, leaveApply, leaveType );

        return annualEntity;
    }
}
