package mg.tpspring.restapi.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import mg.tpspring.restapi.repository.ProductRepository;
import java.util.List;
import mg.tpspring.restapi.model.Product;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        return repository.findById(id).orElseThrow();
    }
    
    public Product save(Product product){
        return repository.save(product);
    }
}


