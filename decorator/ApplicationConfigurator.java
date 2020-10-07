public class ApplicationConfigurator {
    public static void configurationExample()
    {
        boolean enableEncryption=false;
        boolean enableCompression=false;
        DataSource source=new FileDataSource("salary.dat");
        if(((FileDataSource) source).filename.contains("dat"))
            enableEncryption=true;
        System.out.println(((FileDataSource) source).filename+"->"+enableEncryption);
        if(((FileDataSource) source).filename.contains("zip")||((FileDataSource) source).filename.contains("rar"))
            enableCompression=true;
        System.out.println(((FileDataSource) source).filename+"->"+enableCompression);
        if(enableEncryption)
            source=new EncryptionDecorator(source);

        if(enableCompression)
            source=new CompressionDecorator(source);

        SalaryManager logger=new SalaryManager(source);
        String salary=logger.load();


    }

    public static void main(String args[])
    {
        configurationExample();
    }
}
