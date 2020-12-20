package waitinggame.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waitinggame.demo.model.LeaderBoard;
import waitinggame.demo.services.LeaderBoardService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class LeaderBoardController {

    @Autowired
    private LeaderBoardService LeaderBoardService;

    @GetMapping("/LeaderBoard")
    public List<LeaderBoard> getAllLeaderBoard() {
        return LeaderBoardService.getAllLeaderBoard();
    }

    @PutMapping("/LeaderBoard")
    public LeaderBoard addLeaderBoard(@RequestBody LeaderBoard LeaderBoard) {
        LeaderBoardService.addLeaderBoard(LeaderBoard);
        return LeaderBoard;
    }

    @PostMapping("/LeaderBoard")
    public LeaderBoard postLeaderBoard(@RequestBody LeaderBoard LeaderBoard) {
        LeaderBoardService.addLeaderBoard(LeaderBoard);
        return LeaderBoard;
    }

    @GetMapping("/LeaderBoard/{id}")
    public LeaderBoard getLeaderBoardById(@PathVariable int id) {
        return LeaderBoardService.getLeaderBoardById(id);
    }

    @DeleteMapping("/LeaderBoard/{id}")
    public String delete(@PathVariable int id) {
        LeaderBoardService.deleteLeaderBoard(id);

        return "LeaderBoard removed with id " + id;
    }


}
