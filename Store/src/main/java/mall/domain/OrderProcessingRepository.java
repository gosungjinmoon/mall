package mall.domain;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderProcessings", path="orderProcessings")
public interface OrderProcessingRepository extends PagingAndSortingRepository<OrderProcessing, Long>{

}
