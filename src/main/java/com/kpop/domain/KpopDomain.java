package com.kpop.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kpop_idol")
public class KpopDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public Date dateOfBirth;

    public String group;

    public String image;

}
