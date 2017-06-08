package jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by PC on 06/08/17.
 */
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "descripton")
    private String desripton;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<BookEntity> bookEntityList;

    public CategoryEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesripton() {
        return desripton;
    }

    public void setDesripton(String desripton) {
        this.desripton = desripton;
    }

    public List<BookEntity> getBookEntityList() {
        return bookEntityList;
    }

    public void setBookEntityList(List<BookEntity> bookEntityList) {
        this.bookEntityList = bookEntityList;
    }
}
