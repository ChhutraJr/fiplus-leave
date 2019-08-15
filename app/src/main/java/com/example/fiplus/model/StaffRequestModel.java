package com.example.fiplus.model;

public class StaffRequestModel {

    private String staff_name;
    private String num_day_leave;
    private String leave_period;
    private String leave_hour;
    private String booking_time;

    public StaffRequestModel(String staff_name, String num_day_leave, String leave_period, String leave_hour, String booking_time) {
        this.staff_name = staff_name;
        this.num_day_leave = num_day_leave;
        this.leave_period = leave_period;
        this.leave_hour = leave_hour;
        this.booking_time = booking_time;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getNum_day_leave() {
        return num_day_leave;
    }

    public void setNum_day_leave(String num_day_leave) {
        this.num_day_leave = num_day_leave;
    }

    public String getLeave_period() {
        return leave_period;
    }

    public void setLeave_period(String leave_period) {
        this.leave_period = leave_period;
    }

    public String getLeave_hour() {
        return leave_hour;
    }

    public void setLeave_hour(String leave_hour) {
        this.leave_hour = leave_hour;
    }
}
