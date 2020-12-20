package waitinggame.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import waitinggame.demo.model.LeaderBoard;
import waitinggame.demo.repository.LeaderBoardRepository;



import java.util.List;

@Service
@Transactional
public class LeaderBoardServiceImplementation implements LeaderBoardService {

    @Autowired
    LeaderBoardRepository LeaderBoardRepository;

    @Override
    public List<LeaderBoard> getAllLeaderBoard() {
        return (List<LeaderBoard>) LeaderBoardRepository.findAll();
    }

    @Override
    public LeaderBoard getLeaderBoardById(int id) {
        return LeaderBoardRepository.findById(id).get();
    }


    @Override
    public void addLeaderBoard(LeaderBoard person) {
        LeaderBoardRepository.save(person);
    }

    @Override
    public void deleteLeaderBoard(int id) {
        LeaderBoardRepository.deleteById(id);
    }

}
