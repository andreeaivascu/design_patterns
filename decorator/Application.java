public class Application {

    public String salaryRecords;

    public void dumbUsage(String salaryRecords)
    {
        DataSource source=new FileDataSource("somefile.dat");
        source.writeData(salaryRecords);
        source=new CompressionDecorator(source);
        source.writeData(salaryRecords);
        source=new EncryptionDecorator(source);
        source.writeData(salaryRecords);

    }
}
