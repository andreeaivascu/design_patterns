public class CompressionDecorator extends DataSourceDecorator{


    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data)
    {
        System.out.println("compress passed data.. ");
        wrappe.writeData(data);

    }

    @Override
    public String readData() {
        String data=wrappe.readData();
        System.out.println("decompress..");

        System.out.println(data);
        return data;
    }
}
