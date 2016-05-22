package com.innovamos.btracker.dto;

/**
 * DTO for Visits
 */
public class VisitsDTO {

    /*
     * Columnas
     */
    private String id;
    private String trigger_time;
    private String leave_time;
    private String customer_id;
    private String zone_id;
    private String viewed;

    private String description; // De la tabla Stores
    private String name; // De la tabla zones

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrigger_time() {
        return trigger_time;
    }

    public void setTrigger_time(String trigger_time) {
        this.trigger_time = trigger_time;
    }

    public String getLeave_time() {
        return leave_time;
    }

    public void setLeave_time(String leave_time) {
        this.leave_time = leave_time;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getZone_id() {
        return zone_id;
    }

    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    public String getViewed() {
        return viewed;
    }

    public void setViewed(String viewed) {
        this.viewed = viewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VisitsDTO(String id, String trigger_time, String leave_time, String customer_id, String zone_id, String viewed) {
        this.id = id;
        this.trigger_time = trigger_time;
        this.leave_time = leave_time;
        this.customer_id = customer_id;
        this.zone_id = zone_id;
        this.viewed = viewed;
    }
}