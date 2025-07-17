package entity;

public class Invoice {
private int id;
private int customerId;
private int vehicleId;
private int serviceId;

    public Invoice(int id, int serviceId, int vehicleId, int customerId) {
        this.id = id;
        this.serviceId = serviceId;
        this.vehicleId = vehicleId;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Invoice[ " +
                "id=" + id +
                ", customerId=" + customerId +
                ", vehicleId=" + vehicleId +
                ", serviceId=" + serviceId +
                "]";
    }
}
