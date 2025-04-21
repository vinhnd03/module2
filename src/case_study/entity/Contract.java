package case_study.entity;

public class Contract {
    private int contractNumber;
    private String bookingId;
    private long deposit;
    private long total;

    public Contract() {
    }

    public Contract(int contractNumber, String bookingId, long deposit, long total) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.total = total;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingId='" + bookingId + '\'' +
                ", deposit=" + deposit +
                ", total=" + total +
                '}';
    }
}
