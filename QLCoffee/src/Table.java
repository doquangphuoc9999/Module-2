public class Table {
    private int tableNumber;
    private boolean status;

    public Table(int tableNumber, boolean status) {
        this.tableNumber = tableNumber;
        this.status = status;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
