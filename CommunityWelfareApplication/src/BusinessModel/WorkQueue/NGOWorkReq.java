/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.WorkQueue;
import Business.Volunteer.VolunteerDirectory;
/**
 *
 * @author hp
 */
public class NGOWorkReq extends WorkReq {
 
    
    private String title;
    private String description;
    private String location;
    private int volunteerRequired;
    private int volunteerAcquired;
    private boolean add;
    private String volunteerQty;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getVolunteerRequired() {
        return volunteerRequired;
    }

    public void setVolunteerRequired(int volunteerRequired) {
        this.volunteerRequired = volunteerRequired;
    }

    public int getVolunteerAcquired() {
        return volunteerAcquired;
    }

    public void setVolunteerAcquired(int volunteerAcquired) {
        this.volunteerAcquired = volunteerAcquired;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public String getVolunteerQty() {
        return volunteerQty;
    }

    public void setVolunteerQty(String volunteerQty) {
        this.volunteerQty = volunteerQty;
    }
    
    
}
