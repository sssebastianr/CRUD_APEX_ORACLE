package com.eduar.misiontic.games2.repository;


import com.eduar.misiontic.games2.entities.Computer;

import com.eduar.misiontic.games2.repository.crudRepository.ComputerCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ComputerRepository {

    @Autowired
    private ComputerCrudRepository computerCrudRepository;

    public Optional<Computer> getComputer(int id){
        return computerCrudRepository.findById(id);
    }

    public Computer save(Computer computer){
        return computerCrudRepository.save(computer);
    }

    public void delete(Computer computer){
        computerCrudRepository.delete(computer);
    }

    public List<Computer> getAll(){
        return (List<Computer>) computerCrudRepository.findAll();
    }
}
