package TestSecurity.TestSecurity.rep;


import TestSecurity.TestSecurity.models.ObjectOfBuilder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ObjectOfBuilderRepository extends CrudRepository <ObjectOfBuilder, Long> {
    List<ObjectOfBuilder> findAll();

}
