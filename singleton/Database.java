public class Database {

    private static Database instance;

    private Database(){

    }
    public static Database getInstance()
    {
        if(Database.instance == null)
            acquireThreadLock();
                    if(Database.instance == null)
                        Database.instance = new Database();


        return Database.instance;

    }

    private static void acquireThreadLock() {
        System.out.println("lock");
    }

    public String query ( String sql)
    {    System.out.println(sql);
         return sql;
    }





}
