package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.Downsample;
import edu.pitt.medschool.model.dto.DownsampleExample;
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
public interface DownsampleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleSqlProvider.class, method = "countByExample")
    long countByExample(DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @DeleteProvider(type = DownsampleSqlProvider.class, method = "deleteByExample")
    int deleteByExample(DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @Delete({ "delete from downsample", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @Insert({ "insert into downsample (alias, period, ", "duration, origin, ", "min_total_bin_threshold, min_every_bin_thershold, ", "is_downsample_first, update_time, ", "create_time, patientList)",
            "values (#{alias,jdbcType=VARCHAR}, #{period,jdbcType=INTEGER}, ", "#{duration,jdbcType=INTEGER}, #{origin,jdbcType=INTEGER}, ",
            "#{minTotalBinThreshold,jdbcType=INTEGER}, #{minEveryBinThershold,jdbcType=INTEGER}, ", "#{isDownsampleFirst,jdbcType=BIT}, #{updateTime,jdbcType=TIMESTAMP}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{patientlist,jdbcType=LONGVARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Downsample record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @InsertProvider(type = DownsampleSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(Downsample record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
            @Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER), @Result(column = "duration", property = "duration", jdbcType = JdbcType.INTEGER),
            @Result(column = "origin", property = "origin", jdbcType = JdbcType.INTEGER), @Result(column = "min_total_bin_threshold", property = "minTotalBinThreshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "min_every_bin_thershold", property = "minEveryBinThershold", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_downsample_first", property = "isDownsampleFirst", jdbcType = JdbcType.BIT), @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "patientList", property = "patientlist", jdbcType = JdbcType.LONGVARCHAR) })
    List<Downsample> selectByExampleWithBLOBsWithRowbounds(DownsampleExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
            @Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER), @Result(column = "duration", property = "duration", jdbcType = JdbcType.INTEGER),
            @Result(column = "origin", property = "origin", jdbcType = JdbcType.INTEGER), @Result(column = "min_total_bin_threshold", property = "minTotalBinThreshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "min_every_bin_thershold", property = "minEveryBinThershold", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_downsample_first", property = "isDownsampleFirst", jdbcType = JdbcType.BIT), @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "patientList", property = "patientlist", jdbcType = JdbcType.LONGVARCHAR) })
    List<Downsample> selectByExampleWithBLOBs(DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
            @Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER), @Result(column = "duration", property = "duration", jdbcType = JdbcType.INTEGER),
            @Result(column = "origin", property = "origin", jdbcType = JdbcType.INTEGER), @Result(column = "min_total_bin_threshold", property = "minTotalBinThreshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "min_every_bin_thershold", property = "minEveryBinThershold", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_downsample_first", property = "isDownsampleFirst", jdbcType = JdbcType.BIT), @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    List<Downsample> selectByExampleWithRowbounds(DownsampleExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @SelectProvider(type = DownsampleSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
            @Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER), @Result(column = "duration", property = "duration", jdbcType = JdbcType.INTEGER),
            @Result(column = "origin", property = "origin", jdbcType = JdbcType.INTEGER), @Result(column = "min_total_bin_threshold", property = "minTotalBinThreshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "min_every_bin_thershold", property = "minEveryBinThershold", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_downsample_first", property = "isDownsampleFirst", jdbcType = JdbcType.BIT), @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    List<Downsample> selectByExample(DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @Select({ "select", "id, alias, period, duration, origin, min_total_bin_threshold, min_every_bin_thershold, ", "is_downsample_first, update_time, create_time, patientList", "from downsample",
            "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
            @Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER), @Result(column = "duration", property = "duration", jdbcType = JdbcType.INTEGER),
            @Result(column = "origin", property = "origin", jdbcType = JdbcType.INTEGER), @Result(column = "min_total_bin_threshold", property = "minTotalBinThreshold", jdbcType = JdbcType.INTEGER),
            @Result(column = "min_every_bin_thershold", property = "minEveryBinThershold", jdbcType = JdbcType.INTEGER),
            @Result(column = "is_downsample_first", property = "isDownsampleFirst", jdbcType = JdbcType.BIT), @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP), @Result(column = "patientList", property = "patientlist", jdbcType = JdbcType.LONGVARCHAR) })
    Downsample selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Downsample record, @Param("example") DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Downsample record, @Param("example") DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Downsample record, @Param("example") DownsampleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @UpdateProvider(type = DownsampleSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Downsample record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @Update({ "update downsample", "set alias = #{alias,jdbcType=VARCHAR},", "period = #{period,jdbcType=INTEGER},", "duration = #{duration,jdbcType=INTEGER},", "origin = #{origin,jdbcType=INTEGER},",
            "min_total_bin_threshold = #{minTotalBinThreshold,jdbcType=INTEGER},", "min_every_bin_thershold = #{minEveryBinThershold,jdbcType=INTEGER},",
            "is_downsample_first = #{isDownsampleFirst,jdbcType=BIT},", "update_time = #{updateTime,jdbcType=TIMESTAMP},", "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "patientList = #{patientlist,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKeyWithBLOBs(Downsample record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample
     * @mbg.generated
     */
    @Update({ "update downsample", "set alias = #{alias,jdbcType=VARCHAR},", "period = #{period,jdbcType=INTEGER},", "duration = #{duration,jdbcType=INTEGER},", "origin = #{origin,jdbcType=INTEGER},",
            "min_total_bin_threshold = #{minTotalBinThreshold,jdbcType=INTEGER},", "min_every_bin_thershold = #{minEveryBinThershold,jdbcType=INTEGER},",
            "is_downsample_first = #{isDownsampleFirst,jdbcType=BIT},", "update_time = #{updateTime,jdbcType=TIMESTAMP},", "create_time = #{createTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(Downsample record);
}