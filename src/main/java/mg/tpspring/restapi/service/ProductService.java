package mg.tpspring.restapi.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import mg.tpspring.restapi.repository.ProductRepository;
import java.util.List;

import mg.tpspring.restapi.dto.ProductDTO;
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
    
    public Product save(ProductDTO dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return repository.save(product);
    }
       
}


