package case_study.entity;

public class Booking {
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
}
