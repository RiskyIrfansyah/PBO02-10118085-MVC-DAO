/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.riskyirfan.latihanmvcjdbc.service;

import edu.riskyirfan.latihanmvcjdbc.error.PelangganException;
import edu.riskyirfan.latihanmvcjdbc.entity.Pelanggan;
import java.util.List;

/**
 *	
 * @author RisFan
 * NIM      : 10118085
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * 
 */
public interface PelangganDao {
    
    public void inserPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

    public void insertPelanggan(Pelanggan pelanggan);
    
}
