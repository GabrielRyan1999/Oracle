/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

/**
 *
 * @author admin
 */
public class Region {
    private int region_id;
    private String region_name;

    public Region() {
    }

    public Region(int region_id, String region_name) {
        this.region_id = region_id;
        this.region_name = region_name;
    }

    
    /**
     * @return the region_id
     */
    public int getRegion_id() {
        return region_id;
    }

    /**
     * @param region_id the region_id to set
     */
    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    /**
     * @return the region_name
     */
    public String getRegion_name() {
        return region_name;
    }

    /**
     * @param region_name the region_name to set
     */
    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
    
    public String toString(){
        return region_id+" "+region_name;
    }
    
}
