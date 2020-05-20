package dl.dao;

import dl.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(int id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission) throws Exception;

    @Delete("delete from role_permission where permissionId=#{id}")
    void deleteFromRole_Permission(int id) throws Exception;

    @Delete("delete from permission where id=#{id}")
    void deleteById(int id) throws Exception ;

    @Select("select * from permission where id=#{id}")
    Permission findById(int id)throws Exception;
}
