package dl.dao;

import dl.domain.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IMemberDao {
    @Select("select * from member where id = #{id}")
    Member findById(int id);
}
