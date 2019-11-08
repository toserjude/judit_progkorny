package hu.uni.eszterhazy.dao;


import hu.uni.eszterhazy.exceptions.NemJoNev;
import hu.uni.eszterhazy.models.Cica;
import org.junit.Test;

import java.io.IOException;

class CicaDaoTest {
    @Test
    public void testDB() throws IOException, NemJoNev {
        CicaDao dao = new CicaDao("cica.json");
        Cica c = new Cica();
        c.setNev("Macska");
        dao.addCica(c);
    }
}
