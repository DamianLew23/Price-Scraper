package pl.smartdesign.pricescraper.category.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    private Long id;
    private String name;

    public Category() {}
}
