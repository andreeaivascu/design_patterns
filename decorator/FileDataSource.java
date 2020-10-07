
public class FileDataSource implements DataSource{
    public String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        filename.concat(data);
        System.out.println("Write data to file ");

    }

    @Override
    public String readData() {
        System.out.println("Read data from file "+filename);
        return this.filename;
    }
}
