/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;
import BusinessModel.EcoSystem;

import BusinessModel.UserAccount.UserAccount;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */

public abstract class Role {
    
    public enum RoleType{
        SystemAdministrator("SystemAdministrator"),
        HelpProviderAdmin("HelpProviderAdmin"),
        HelpProvider("HelpProvider"),
        HelpSeekerAdmin("HelpSeekerAdmin"),
        HelpSeeker("HelpSeeker"),
        EnterpriseAdmin("EnterpriseAdmin"),
        HospitalAdmin("HospitalAdmin"),
        SocialServiceAdminRole("SocialServiceAdminRole"),
        NGOAdminRole("NGOAdminRole"),
        NGOManagerRole("NGOManagerRole"),
        SupplierAdminRole("SupplierAdminRole"),
        SupplierManagerRole("SupplierManagerRole"),
        VolunteerAdminRole("VolunteerAdminRole"),
        VolunteerRole("VolunteerRole"),
        DonorRole("DonorRole"),
        DonorAdminRole("DonorAdminRole"),
        DoctorAdminRole("DoctorAdminRole"),
        DoctorUserRole("DoctorUserRole"),
        HospitalAdminRole("HospitalAdminRole");
        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system);
    
    
}











