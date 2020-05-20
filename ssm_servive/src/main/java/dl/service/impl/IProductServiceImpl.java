package dl.service.impl;

import dl.dao.IProductDao;
import dl.domain.Product;
import dl.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IProductServiceImpl implements IProductService{

    @Autowired
    private IProductDao iProductdao;
    @Override
    public List<Product> findAll() throws Exception {
        return iProductdao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        iProductdao.save(product);
    }
}
