package com.project.Entitiy;

import com.project.RoleEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int member_id;

    @Column(length = 45)
    private String id;

    @Column(length = 45)
    private String password;

    @Column(length = 45)
    private String nickname;

    @Column(length = 45)
    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    private LocalDateTime last_visited;
    private LocalDateTime created_date;

    public Member(){}
}
