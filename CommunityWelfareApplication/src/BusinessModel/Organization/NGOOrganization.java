/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;
import BusinessModel.NGO.NGODirectory;
import BusinessModel.Role.NGOAdminRole;
import BusinessModel.Role.NGOManagerRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shivanishekhawat
 */

public class NGOOrganization extends Organization {
   
    NGODirectory ngolist;
    
    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngolist=new NGODirectory();
    }

    public NGODirectory getNgolist() {
        return ngolist;
    }

    public void setNgolist(NGODirectory ngolist) {
        this.ngolist = ngolist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }   
}




