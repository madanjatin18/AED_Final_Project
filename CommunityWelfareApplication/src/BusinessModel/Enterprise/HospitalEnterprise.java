/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Role.DoctorUserRole;
import BusinessModel.Role.HospitalAdminRole;
import BusinessModel.Role.Role;

import java.util.HashSet;

/**
 *
 * @author akhileshdongre
 */



public class HospitalEnterprise extends Enterprise 
{
    public HospitalEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.Hospital);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new HospitalAdminRole());
        return role;
        
    }
}







