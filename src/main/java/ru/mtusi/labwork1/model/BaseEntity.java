package ru.mtusi.labwork1.model;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public class BaseEntity {

    @Id
    @SequenceGenerator(name = "global_seq",
            sequenceName = "global_seq",
            allocationSize = 1, initialValue = 100000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "global_seq")
    @Access(value = AccessType.PROPERTY)
    private long id;

    public BaseEntity() {
    }

    public BaseEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                String.format(
                "Entity of type %s with id: %s",
                        getClass().getName(),
                        getId()
                );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

}
