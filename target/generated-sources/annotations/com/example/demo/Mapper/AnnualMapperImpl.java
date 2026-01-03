package com.example.demo.Mapper;

import com.example.demo.AnnualLeave.AnnualEntity;
import com.example.demo.AnnualLeave.DTO.leaveRegisterDTO;
import com.example.demo.Employee.Employees;
import com.example.demo.Enum.ActiveEnum;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-02T22:39:22+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 24.0.1 (Oracle Corporation)"
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

        code = mapStatus( dto.getCode() );
        forwardLeave = dto.getForwardLeave();
        totalLeave = dto.getTotalLeave();
        leaveTaken = dto.getLeaveTaken();
        leaveBalance = dto.getLeaveBalance();
        leaveApply = dto.getLeaveApply();

        Long id = null;
        ActiveEnum active = null;

        AnnualEntity annualEntity = new AnnualEntity( id, code, forwardLeave, totalLeave, leaveTaken, leaveBalance, leaveApply, active );

        return annualEntity;
    }
}
