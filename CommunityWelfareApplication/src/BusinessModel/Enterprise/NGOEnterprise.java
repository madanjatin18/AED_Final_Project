/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;

import BusinessModel.Role.NGOAdminRole;
import BusinessModel.Role.NGOManagerRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adhar
 */
public class NGOEnterprise extends Enterprise {

  public NGOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new NGOManagerRole());
        //role.add(new VolunteerRole());
        return role;
    }

    
    
}



