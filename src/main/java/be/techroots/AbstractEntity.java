package be.techroots;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

    @Column(length = 40, unique = true)
    private String name;

}
