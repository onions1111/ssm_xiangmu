package dl.service.impl;

import com.github.pagehelper.PageHelper;
import dl.dao.IOrdersDao;
import dl.domain.Orders;
import dl.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService{
    @Autowired
    IOrdersDao OrdersDao;

//    @Override
//    public List<Orders> findAll() throws Exception {
//
//        return OrdersDao.findAll();
//    }

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return OrdersDao.findAll();
    }

    @Override
    public Orders findById(int ordersId) throws Exception {
        return OrdersDao.findById(ordersId);
    }

}
