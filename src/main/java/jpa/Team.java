package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String name;

    /*
    다대일 양방향
    team이라는 것에 의해 매핑이 됨을 나타낸다.
    단순 읽기만 가능
     */
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public Team() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
