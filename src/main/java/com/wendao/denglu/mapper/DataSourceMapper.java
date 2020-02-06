package com.wendao.denglu.mapper;
import com.wendao.denglu.bean.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @Author : JCccc
 * @CreateTime : 2019/10/23
 * @Description :
 **/
@Mapper
public interface DataSourceMapper {

    @Select("SELECT * FROM databasesource")
    List<DataSource> get();


}