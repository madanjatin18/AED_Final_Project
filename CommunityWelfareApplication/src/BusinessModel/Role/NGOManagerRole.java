/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;

import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.NGOOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;
import UserInterface.NGOManager.ManagerWorkArea;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author shivanishekhawat
 */


public class NGOManagerRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem){
        return new ManagerWorkArea(downJPanel,UserAccount,(NGOOrganization)org,enterprise, ESystem);
    }
        @Override
        public String toString()
{
   return Role.RoleType.NGOManagerRole.getValue();
}
}



