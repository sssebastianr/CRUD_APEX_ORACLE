package com.eduar.misiontic.games2.repository.crudRepository;


import com.eduar.misiontic.games2.entities.Computer;
import org.springframework.data.repository.CrudRepository;

public interface GameCrudRepository extends CrudRepository<Computer, Integer> {
}
