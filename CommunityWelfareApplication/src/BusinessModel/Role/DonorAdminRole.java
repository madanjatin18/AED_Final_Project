/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;
import BusinessModel.Organization.DonorOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.Donor.DonorAdminWorkArea;
import UserInterface.Volunteer.VolunteerAdminWorkArea;
/**
 *
 * @author adhar
 */
public class DonorAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DonorAdminWorkArea(downJPanel,UserAccount,(DonorOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.DonorAdminRole.getValue();
}
    
}




