package xyz.nda.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.nda.model.Weatherdata;
import xyz.nda.model.WeatherdataPK;

import java.util.List;

@Repository
public interface ReactiveWeatherdataRepository extends CrudRepository<Weatherdata, WeatherdataPK> {

    List<Weatherdata> findAllByOrderByLogDateAsc(Pageable pageable);

}
