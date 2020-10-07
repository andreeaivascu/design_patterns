public class DataSourceDecorator implements  DataSource{
     protected DataSource wrappe;

    public DataSourceDecorator(DataSource source) {
        this.wrappe = source;
    }

    @Override
    public void writeData(String data) {
        wrappe.writeData(data);

    }

    @Override
    public String readData() {

        return wrappe.readData();
    }
}
