package com.eduar.misiontic.games2.repository;


import com.eduar.misiontic.games2.entities.Computer;

import com.eduar.misiontic.games2.repository.crudRepository.GameCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class GameRepository {

    @Autowired
    private GameCrudRepository gameCrudRepository;

    public Optional<Computer> getGames(int id){
        return gameCrudRepository.findById(id);
    }

    public Computer save(Computer computer){
        return gameCrudRepository.save(computer);
    }

    public void delete(Computer computer){
        gameCrudRepository.delete(computer);
    }

    public List<Computer> getAll(){
        return (List<Computer>) gameCrudRepository.findAll();
    }
}
