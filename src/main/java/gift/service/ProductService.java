package gift.service;

import gift.domain.Product;
import gift.dto.CreateProductDto;
import gift.dto.ProductDto;
import gift.dto.UpdateProductDto;
import gift.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDto getProduct(Long id) {
        Product product = productRepository.getProductById(id);
        return ProductDto.from(product);
    }

    public Long createProduct(CreateProductDto giftDto) {
        Product product = giftDto.toProduct();
        return productRepository.saveProduct(product);
    }

    public Long updateProduct(UpdateProductDto giftDto) {
        Long id = giftDto.id();
        Product product = giftDto.toProduct();
        return productRepository.updateProduct(id, product);

    }

    public void deleteProduct(Long id) {
        productRepository.deleteProductById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
