package TestSecurity.TestSecurity.rep;

import TestSecurity.TestSecurity.models.FileEntity;
import org.springframework.data.repository.CrudRepository;

public interface FileEntityRepository extends CrudRepository <FileEntity, Long> {

}
