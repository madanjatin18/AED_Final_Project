/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Organization;

import BusinessModel.Doctor.DoctorDirectory;
import BusinessModel.Role.DoctorAdminRole;
import BusinessModel.Role.DoctorUserRole;
import BusinessModel.Role.NGOManagerRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shivanishekhawat
 */
public class DoctorOrganization extends Organization{
     DoctorDirectory doclist;
    
    public DoctorOrganization(String name)
    {
        super(Organization.Type.Doctor.getValue());
        doclist=new DoctorDirectory();
    }

    

   

    public DoctorDirectory getDoclist() {
        return doclist;
    }

    public void setDoclist(DoctorDirectory doclist) {
        this.doclist = doclist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new DoctorAdminRole());
       return role;
       
    }   
}




