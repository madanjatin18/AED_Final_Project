/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Enterprise;
import BusinessModel.Role.SupplierManagerRole;
import BusinessModel.Role.Role;
import java.util.HashSet;

/**
 *
 * @author akhileshdongre
 */

public class SupplierEnterprise extends Enterprise 
{
    public SupplierEnterprise(String name)
    {
        super(name, Enterprise.EnterpriseType.Supplier);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierManagerRole();
        return role;
        
    }
}






