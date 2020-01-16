/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.riskyirfan.latihanmvcjdbc.main;

import edu.riskyirfan.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.riskyirfan.latihanmvcjdbc.entity.Pelanggan;
import edu.riskyirfan.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;
import java.util.List;
import edu.riskyirfan.latihanmvcjdbc.service.PelangganDao;
import edu.riskyirfan.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *	
 * @author RisFan
 * NIM      : 10118085
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * 
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws PelangganException, SQLException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}