package com.eduar.misiontic.games2.controller;



import com.eduar.misiontic.games2.entities.Computer;
import com.eduar.misiontic.games2.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/all")
    public List<Computer> getAll(){
        return gameService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer g){
        return gameService.save(g);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer computer){
        return gameService.update(computer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable ("id")int id){
        return gameService.delete(id);
    }
}
