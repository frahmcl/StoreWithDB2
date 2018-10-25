package us.mattgreen.model;
import java.sql.*;

public class DBStructure {
    public DBStructure()
    {
        try
        {
            final String DB_URL = "jdbc:derby:ProductDB;create=true";
            Connection conn = DriverManager.getConnection(DB_URL);

            // Build PRODUCTS Table
            buildProductsTable(conn);

            // Build CART Table if CART does not already exist
                buildCartTable(conn);



            // Close the connections

            conn.close();
        } catch (Exception e)
        {
            e.getMessage();
        }
    }

    public static void buildProductsTable(Connection conn) throws SQLException
    {
        try{


        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE PRODUCTS (" +
                "ProductNumber INT NOT NULL PRIMARY KEY, " +
                "ProductName VARCHAR(50), " +
                "Price DOUBLE, " +
                "Description VARCHAR (8000), " +
                "Image VARCHAR(25) " +
                ")");


        stmt.execute("INSERT INTO PRODUCTS VALUES ( 1, 'Bread', 1.99, 'Bread is good', 'bread' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 2, 'Salt', 4.99, 'Salt is good', 'salt' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 3, 'Bananas', 5.99, 'Bananas are good', 'bananas' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 4, 'Apples', 1.99, 'Apples are good', 'apples' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 5, 'Steak', 9.99, 'Steak is good', 'steak' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 6, 'Grapes', 6.99, 'Grapes are good', 'grapes' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 7, 'Carrots', 0.99, 'Carrots are good', 'carrots' )");
        stmt.execute("INSERT INTO PRODUCTS VALUES ( 8, 'Pineapple', 5.55, 'Pineapple is good', 'pineapple' )");

        }
        catch(SQLException ex){
            System.out.println("TABLE ERROR:" + ex.getMessage());
        }
    }

    public static void buildCartTable(Connection conn) throws SQLException
    {
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE CART (" +
                    "CustomerNumber INT NOT NULL PRIMARY KEY, " +
                    "ProductNumber INT NOT NULL, " +
                    "Name VARCHAR(50)," +
                    "Date DATE," +
                    "Price double ," +
                    "Image VARCHAR(25) " +
                    ")");
        }
        catch(SQLException ex){
            System.out.println("TABLE ERROR:" + ex.getMessage());
        }
    }

}
