package waitinggame.demo.services;

import waitinggame.demo.model.LeaderBoard;

import java.util.List;

public interface LeaderBoardService {

    List<LeaderBoard> getAllLeaderBoard();

    List<LeaderBoard> getTopTenLeaderBoard();

    LeaderBoard getLeaderBoardById(int id);

    void addLeaderBoard(LeaderBoard LeaderBoard);

    void deleteLeaderBoard(int id);
}
