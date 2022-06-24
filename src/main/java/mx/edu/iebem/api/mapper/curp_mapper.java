package mx.edu.iebem.api.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import mx.edu.iebem.api.models.Curp;
@Component
public class curp_mapper implements RowMapper<Curp> {
    @Override
    public Curp mapRow(ResultSet arg0, int arg1) throws SQLException {

        Curp curp = new Curp();
        curp.setId(arg0.getInt("id"));
        curp.setRfc(arg0.getString("rfc"));
        curp.setCve_unica(arg0.getString("cve_unica"));
        curp.setNombre(arg0.getString("nombre"));
        return curp;
    }
}
