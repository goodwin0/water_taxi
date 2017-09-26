package app.repository;

import app.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface OrderRepository extends CrudRepository <Order, Long>{
}
