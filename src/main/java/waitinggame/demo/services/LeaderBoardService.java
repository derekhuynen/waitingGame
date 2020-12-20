package waitinggame.demo.services;

import waitinggame.demo.model.LeaderBoard;

import java.util.List;

public interface LeaderBoardService {

    List<LeaderBoard> getAllLeaderBoard();

    LeaderBoard getLeaderBoardById(int id);

    void addLeaderBoard(LeaderBoard LeaderBoard);

    void deleteLeaderBoard(int id);
}
