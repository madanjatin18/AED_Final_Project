/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.Role.HelpProviderAdminRole;
import BusinessModel.Role.HelpSeekerAdminRole;
import BusinessModel.Role.SocialServiceAdminRole;
import BusinessModel.Role.Role;
import BusinessModel.Role.VolunteerAdminRole;

import java.util.HashSet;

/**
 *
 * @author hp
 */

public class SocialServiceEnterprise extends Enterprise
{
    public SocialServiceEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.SocialService);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new CommunityAdminRole());
       
        role.add(new HelpProviderAdminRole());
              
        role.add(new HelpSeekerAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
}












