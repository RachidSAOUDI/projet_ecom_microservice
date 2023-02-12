package ma.usmba.orderservice.web;

import ma.usmba.orderservice.entities.Order;
import ma.usmba.orderservice.models.Customer;
import ma.usmba.orderservice.models.Product;
import ma.usmba.orderservice.repositories.OrderRepository;
import ma.usmba.orderservice.repositories.ProductItemRepository;
import ma.usmba.orderservice.services.CustomerRestClientService;
import ma.usmba.orderservice.services.InventoryRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;

    public OrderRestController(OrderRepository orderRepository, ProductItemRepository productItemRepository, CustomerRestClientService customerRestClientService, InventoryRestClientService inventoryRestClientService) {
        this.orderRepository = orderRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClientService = customerRestClientService;
        this.inventoryRestClientService = inventoryRestClientService;
    }

    @GetMapping("/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        Order order=orderRepository.findById(id).get();
        Customer customer=customerRestClientService.customerById(order.getCustomerId());
        order.setCustomer(customer);
        order.getProductItems().forEach(productItem -> {
            Product product=inventoryRestClientService.productById(productItem.getProductId());
            productItem.setProduct(product);
        });
        return order;
    }
}
