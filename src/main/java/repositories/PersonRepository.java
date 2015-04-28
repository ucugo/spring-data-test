package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by uchegc01 on 28/04/2015.
 */
public interface PersonRepository extends JpaRepository<Person,Serializable> {

    public List<Person> findByFirstName(String firstName);
}
