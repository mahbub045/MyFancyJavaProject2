package com.company;


class DbConnection{

    private static DbConnection instance=null;

    private DbConnection(String dbUser,String dbPassword,String dbName ) {
        SQLConnection connection = new SQLConnection(dbUser, dbPassword, dbName);
    }


    public static DbConnection getDbConnection(String dbUser,String dbPassword,String dbName) {
        if (instance== null )
            instance = new DbConnection(dbUser,dbPassword,dbName) ;

        return instance;
    }
}
class SQLConnection {

    String dbUser;
    String dbPassword;
    String dbName;

    public SQLConnection(String dbUser, String dbPassword, String dbName) {
        super();
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbName = dbName;
    }


}

public class sampleProject {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world.");
        System.out.println("This is our Assignment.");

        int age=20;
        if(age<18){
            System.out.println("You are a Baby.");
        }else{
            System.out.println("You are not Baby.");
        }
        String dbUser="admin";
        String dbPassword="admin";
        String dbName="tesDb";
        DbConnection connection=DbConnection.getDbConnection(dbUser, dbPassword, dbName);

    }
}