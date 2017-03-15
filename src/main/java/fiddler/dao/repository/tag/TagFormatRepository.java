package fiddler.dao.repository.tag;

import fiddler.dao.entities.tag.TagFormat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TagFormatRepository extends CrudRepository<TagFormat, Long> {
	@Query("select o from TagFormat o")
	Stream<TagFormat> streamAll();
}
