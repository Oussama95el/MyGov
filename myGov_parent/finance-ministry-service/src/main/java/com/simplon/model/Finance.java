package com.simplon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Date;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Finance {


    @Id
    @SequenceGenerator(name = "finance_seq", sequenceName = "finance_seq", allocationSize = 1)
    @GeneratedValue(generator = "finance_seq")
    private Long id;

    private String name;

    private String description;

    private String ministry;

    private Date date;

    private String amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Finance finance = (Finance) o;
        return id != null && Objects.equals(id, finance.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
