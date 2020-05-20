package dl.service;

import dl.domain.Orders;

import java.util.List;

public interface IOrdersService {
//    List<Orders> findAll() throws Exception;
     List<Orders> findAll(int page, int size) throws Exception;
    Orders findById(int ordersId) throws Exception;
}
