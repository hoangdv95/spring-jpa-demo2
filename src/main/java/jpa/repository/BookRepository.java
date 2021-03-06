package jpa.repository;

import jpa.entity.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PC on 06/08/17.
 */
@Repository
public interface BookRepository extends CrudRepository{
    List<BookEntity> findByAuThor(String author);
    List<BookEntity> findByNameAndAuthor(String name, String author);
    List<BookEntity> findByNameOrAuthor(String name, String author);

    BookEntity findByBookDetailsIsbn(String isbn);

    List<BookEntity> findByBookDetailsPriceLessThan(int price);
    List<BookEntity> findByBookDetailsPriceLessThanEqual(int price);
    List<BookEntity> findByBookDetailsPriceGreaterThanEqual(int price);

    List<BookEntity> findByNameContaining(String name);

    @Query("select b from BookEntity b")
    List<BookEntity> getAll();

//    @Query(value = "select * from book",nativeQuery = true)
//    List<BookEntity> getAll();

    @Query("select  b from BookEntity b where b.name like ?1%")
    List<BookEntity> getBookNameStartWith(String name);

    @Query("select  b from BookEntity b where b.bookDetails.price > ?1")
    List<BookEntity> getBookPriceGreaterThan(int price);
}
