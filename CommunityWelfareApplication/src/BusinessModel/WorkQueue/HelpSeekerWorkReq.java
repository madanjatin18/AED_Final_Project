/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.WorkQueue;

/**
 *
 * @author hp
 */
public class HelpSeekerWorkReq extends WorkReq {
    
   
    private String description;
    private boolean add;
    private String location;
    
      public HelpSeekerWorkReq() {
        
        add = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
  

    
    
}

