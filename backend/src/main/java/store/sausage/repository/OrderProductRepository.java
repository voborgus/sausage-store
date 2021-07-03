package store.sausage.repository;

import store.sausage.model.OrderProduct;
import store.sausage.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
