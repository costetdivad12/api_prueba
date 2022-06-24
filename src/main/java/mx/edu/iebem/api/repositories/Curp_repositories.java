package mx.edu.iebem.api.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import mx.edu.iebem.api.models.Curp;
@Repository
public interface Curp_repositories {
    public List<Curp> Listcurp();


    // public Curp getCurp(String curp);
}
