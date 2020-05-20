package dl.service;

import dl.domain.Permission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IPermissionService {
    void deleteById(int id)throws Exception;

    Permission findById(int id)throws Exception;

    void save(Permission permission)throws Exception;

    List<Permission> findAll()throws Exception;
}
