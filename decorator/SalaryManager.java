public class SalaryManager {
    public DataSource source;
   // public String salaryRecords

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load()
    {
        return source.readData();
    }

    public void save(String salaryRecords)
    {
        source.writeData(salaryRecords);

    }
}
