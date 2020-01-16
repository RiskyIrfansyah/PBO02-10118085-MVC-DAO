/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.riskyirfan.latihanmvcjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.riskyirfan.latihanmvcjdbc.impl.PelangganDaoImpl;
import java.sql.SQLException;
import edu.riskyirfan.latihanmvcjdbc.service.PelangganDao;


/**
 *	
 * @author RisFan
 * NIM      : 10118085
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * 
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
            
        }
        
        return connection;
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
    
    if (pelangganDao==null){
        pelangganDao = new PelangganDaoImpl(getConnection());
    }
    
    return pelangganDao;
    }
    
}
