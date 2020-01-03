package com.spring.studentbook.model.relationship;


import com.spring.studentbook.model.node.User;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "KNOWS")
public class Knows {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private User userA;

    @EndNode
    private User userB;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserA() {
        return userA;
    }

    public void setUserA(User userA) {
        this.userA = userA;
    }

    public User getUserB() {
        return userB;
    }

    public void setUserB(User userB) {
        this.userB = userB;
    }
}
