package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.DownsampleMeta;
import edu.pitt.medschool.model.dto.DownsampleMetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface DownsampleMetaMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleMetaSqlProvider.class, method = "countByExample")
    long countByExample(DownsampleMetaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @DeleteProvider(type = DownsampleMetaSqlProvider.class, method = "deleteByExample")
    int deleteByExample(DownsampleMetaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @Delete({ "delete from downsample_meta", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @Insert({ "insert into downsample_meta (query_id, key, ", "value, create_time, ", "update_time)", "values (#{queryId,jdbcType=INTEGER}, #{key,jdbcType=VARCHAR}, ", "#{value,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ", "#{updateTime,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(DownsampleMeta record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @InsertProvider(type = DownsampleMetaSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(DownsampleMeta record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleMetaSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "query_id", property = "queryId", jdbcType = JdbcType.INTEGER), @Result(column = "key", property = "key", jdbcType = JdbcType.VARCHAR), @Result(column = "value", property = "value", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
    List<DownsampleMeta> selectByExampleWithRowbounds(DownsampleMetaExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleMetaSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "query_id", property = "queryId", jdbcType = JdbcType.INTEGER), @Result(column = "key", property = "key", jdbcType = JdbcType.VARCHAR), @Result(column = "value", property = "value", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
    List<DownsampleMeta> selectByExample(DownsampleMetaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @Select({ "select", "id, query_id, key, value, create_time, update_time", "from downsample_meta", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "query_id", property = "queryId", jdbcType = JdbcType.INTEGER), @Result(column = "key", property = "key", jdbcType = JdbcType.VARCHAR), @Result(column = "value", property = "value", jdbcType = JdbcType.VARCHAR), @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
    DownsampleMeta selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleMetaSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DownsampleMeta record, @Param("example") DownsampleMetaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleMetaSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") DownsampleMeta record, @Param("example") DownsampleMetaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleMetaSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DownsampleMeta record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_meta
     * @mbg.generated
     */
    @Update({ "update downsample_meta", "set query_id = #{queryId,jdbcType=INTEGER},", "key = #{key,jdbcType=VARCHAR},", "value = #{value,jdbcType=VARCHAR},", "create_time = #{createTime,jdbcType=TIMESTAMP},", "update_time = #{updateTime,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(DownsampleMeta record);
}