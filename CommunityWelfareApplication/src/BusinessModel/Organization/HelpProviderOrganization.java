/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import Business.HelpProvider.HelpProviderDirectory;
import BusinessModel.Role.HelpProviderRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hp
 */
public class HelpProviderOrganization extends Organization  
{
    
    HelpProviderDirectory helpproviderlist;
    
    public HelpProviderOrganization()
    {
        super(Organization.Type.HelpProvider.getValue());
        helpproviderlist = new HelpProviderDirectory();
    }

    public HelpProviderDirectory getHelpproviderlist() {
        return helpproviderlist;
    }

    public void setHelpproviderlist(HelpProviderDirectory helpproviderlist) 
    {
        this.helpproviderlist = helpproviderlist;
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new HelpProviderRole());
       return role;
       
    }
    
    
}








