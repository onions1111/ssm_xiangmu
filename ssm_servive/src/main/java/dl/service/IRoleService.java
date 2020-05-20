package dl.service;

import dl.domain.Permission;
import dl.domain.Role;

import java.util.List;

public interface IRoleService {
    void save(Role role);

    List<Role> findAll() throws Exception;

    void deleteRoleById(int roleId);

    Role findById(int roleId);

    void addPermissionToRole(int roleId, int[] permissionIds);

    List<Permission> findOtherPermissions(int roleId);
}
