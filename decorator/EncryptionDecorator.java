public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data)
    {
        wrappe.writeData(data);
        System.out.println("data passed encrypted ");

    }


    public String readData()
    {
        String data=wrappe.readData();
        System.out.println("decrypting..");

        System.out.println(data);
        return data;
    }
}
