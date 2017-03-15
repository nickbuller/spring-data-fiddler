package fiddler.dao.repository.tag;

import fiddler.dao.entities.tag.TagData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TagDataRepository extends CrudRepository<TagData, Long> {
	@Query("select o from TagData o")
	Stream<TagData> streamAll();
}
