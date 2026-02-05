package kz.aitu.OOP2.controller;

import kz.aitu.OOP2.dao.PlayerDAO;
import kz.aitu.OOP2.model.Player;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerDAO dao = new PlayerDAO();

    @GetMapping
    public List<Player> getPlayers() throws Exception {
        return dao.getAllPlayers();
    }

    @PostMapping
    public void addPlayer(@RequestBody Player player) throws Exception {
        dao.addPlayer(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable int id) throws Exception {
        dao.deletePlayer(id);
    }
    @GetMapping("/test")
    public String test() {
        return "OK";
    }
    @GetMapping("/dbtest")
    public String dbTest() throws Exception {
        dao.testConnection();
        return "DB OK";
    }

}
