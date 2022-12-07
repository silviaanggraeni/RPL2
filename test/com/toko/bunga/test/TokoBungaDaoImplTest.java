/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.bunga.test;

import com.toko.bunga.dao.TokoBungaDao;
import com.toko.bunga.model.TokoBunga;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author salis
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TokoBungaDaoImplTest {
    @Autowired
    TokoBungaDao tokoBungaDao;
    
    TokoBunga tokoBunga = new TokoBunga();
    
    @Test
    public void testSave(){
        String kode = "bg010";
        
        tokoBunga.setKd_bunga(kode);
        tokoBunga.setNama("TestNama1");
        tokoBunga.setHarga(90000);
        tokoBunga.setJenis("Hias");
        
        String res = tokoBungaDao.save(tokoBunga);
        assertTrue(res.equals(kode));
    }
}
