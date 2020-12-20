package waitinggame.demo.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "leaderboard_table")
public class LeaderBoard {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="pk")
    private int pk;

    @Column(name="user")
    private String user;

    @Column(name="score")
    private int score;



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }




}
