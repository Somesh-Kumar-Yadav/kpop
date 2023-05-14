package com.kpop.entry;

import com.kpop.domain.KpopDomain;

import java.util.Date;

public class KpopEntry {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private String group;
    private String image;

    public KpopEntry() {

    }

    public KpopEntry(KpopDomain domain) {
        id = domain.id;
        name = domain.name;
        dateOfBirth = domain.dateOfBirth;
        group = domain.group;
        image = domain.image;

    }

}
