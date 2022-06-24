package mx.edu.iebem.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import mx.edu.iebem.api.mapper.curp_mapper;
import mx.edu.iebem.api.models.Curp;
import mx.edu.iebem.api.repositories.Curp_repositories;
@Service
public class Curp_services implements Curp_repositories {

    @Autowired
private JdbcTemplate jdbc;

@Autowired private curp_mapper mapper;


    @Override
    public List<Curp> Listcurp() {
        final String sql ="select top 10* from curp_empleado";
        // curp_mapper mapper =new curp_mapper();
        // jdbc.query(sql, mapper, new Object[]{});
        List<Curp> lista = jdbc.query(sql, mapper);
       
        return lista;
    }

    // @Override
    public Curp getCurp(String curp) {
        final String sql ="select * from curp_empleado where cve_unica=?";

        Curp resp =jdbc.queryForObject(sql,mapper, new Object[]{curp});
        return resp;
    }
}
