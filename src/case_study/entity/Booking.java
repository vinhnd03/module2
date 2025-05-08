package case_study.entity;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String id;
    private String date;
    private String startDate;
    private String endDate;
    private String customerId;
    private String serviceId;
    private boolean complete;

    public Booking() {
    }

    public Booking(String id, String date, String startDate, String endDate, String customerId, String serviceId) {
        this.id = id;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.complete = false;
    }

    public Booking(String id, String date, String startDate, String endDate, String customerId, String serviceId, boolean complete) {
        this.id = id;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", StartDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", complete='" + complete + '\'' +
                '}';
    }

    public String infoToCSVFile(){
        return id + "," + date + "," + startDate + "," + endDate + "," + customerId + "," + serviceId + "," + complete;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Booking booking = (Booking) object;
        return Objects.equals(id, booking.id) && Objects.equals(customerId, booking.customerId) && Objects.equals(serviceId, booking.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, serviceId);
    }

    private LocalDate convertToDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            return LocalDate.parse(date, formatter);
        }catch (DateTimeException e){
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public int compareTo(Booking o) {
        LocalDate date1 = convertToDate(o.date);
        LocalDate date2 = convertToDate(this.date);
        return date1.compareTo(date2);
    }
}
