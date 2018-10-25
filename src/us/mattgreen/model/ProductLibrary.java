package us.mattgreen.model;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductLibrary implements ProductInterface
{
    DBStructure db = new DBStructure();

    @Override
    public List<Product> getAllProducts()
    {
        List<Product> productList = new ArrayList<>();
        final String DB_URL = "jdbc:derby:ProductDB";
        Statement stmt = null;
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM PRODUCTS";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                //Retrieve by column name
                int id = rs.getInt("ProductNumber");
                String name = rs.getString("ProductName");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");
                String image = rs.getString("Image");
                productList.add(new Product(id, name, description, price, image));
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally
        {
            //finally block used to close resources
            try
            {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2)
            {
            }// nothing we can do
            try
            {
                if (conn != null)
                    conn.close();
            } catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        return productList;
    }

    @Override
    public Product getProductByName(String name)
    {
        Product theProduct = null;
        for (Product e : getAllProducts())
        {
            if (e.getProductName().equals(name))
            {
                theProduct = e;
            }
        }
        return theProduct;
    }

    @Override
    public List<Product> searchProducts(String search)
    {
        search = search.toLowerCase();
        List<Product> searchList = new ArrayList<>();
        for (Product name : getAllProducts())
        {
            if (name.getProductName().toLowerCase().contains(search))
            {
                searchList.add(name);
            }
        }
        return searchList;
    }

    @Override
    public Product getSingleProduct(int itemNum)
    {
        Product item = null;
        for (Product i : getAllProducts())
        {
            if (i.getProductNumber() == itemNum)
            {
                return i;
            }
        }
        return item;
    }

    @Override
    public void addContent()
    {
        final String DB_URL = "jdbc:derby:ProductDB";
        Statement stmt = null;
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            //Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally
        {
            //finally block used to close resources
            try
            {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2)
            {
            }// nothing we can do
            try
            {
                if (conn != null)
                    conn.close();
            } catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
    }

    @Override
    public void deleteContent()
    {
    }

    @Override
    public void updateContent()
    {
    }
}