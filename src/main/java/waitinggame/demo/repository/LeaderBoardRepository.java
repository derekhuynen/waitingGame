package waitinggame.demo.repository;

import org.springframework.data.repository.CrudRepository;
import waitinggame.demo.model.LeaderBoard;

public interface LeaderBoardRepository extends CrudRepository<LeaderBoard, Integer> {
}
