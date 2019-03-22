package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.MedicalDownsample;
import edu.pitt.medschool.model.dto.MedicalDownsampleExample;
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
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface MedicalDownsampleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@SelectProvider(type = MedicalDownsampleSqlProvider.class, method = "countByExample")
	long countByExample(MedicalDownsampleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@DeleteProvider(type = MedicalDownsampleSqlProvider.class, method = "deleteByExample")
	int deleteByExample(MedicalDownsampleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@Delete({ "delete from medical_downsample", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@Insert({ "insert into medical_downsample (alias, medicine, ", "before_medicine, after_medicine, ",
			"period, min_bin, ", "min_bin_row, downsample_first, ", "create_time, update_time, ", "deleted)",
			"values (#{alias,jdbcType=VARCHAR}, #{medicine,jdbcType=VARCHAR}, ",
			"#{beforeMedicine,jdbcType=INTEGER}, #{afterMedicine,jdbcType=INTEGER}, ",
			"#{period,jdbcType=INTEGER}, #{minBin,jdbcType=INTEGER}, ",
			"#{minBinRow,jdbcType=INTEGER}, #{downsampleFirst,jdbcType=BIT}, ",
			"#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ", "#{deleted,jdbcType=BIT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
	int insert(MedicalDownsample record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@InsertProvider(type = MedicalDownsampleSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
	int insertSelective(MedicalDownsample record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@SelectProvider(type = MedicalDownsampleSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
			@Result(column = "medicine", property = "medicine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "before_medicine", property = "beforeMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "after_medicine", property = "afterMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin", property = "minBin", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin_row", property = "minBinRow", jdbcType = JdbcType.INTEGER),
			@Result(column = "downsample_first", property = "downsampleFirst", jdbcType = JdbcType.BIT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "deleted", property = "deleted", jdbcType = JdbcType.BIT) })
	List<MedicalDownsample> selectByExampleWithRowbounds(MedicalDownsampleExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@SelectProvider(type = MedicalDownsampleSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
			@Result(column = "medicine", property = "medicine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "before_medicine", property = "beforeMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "after_medicine", property = "afterMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin", property = "minBin", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin_row", property = "minBinRow", jdbcType = JdbcType.INTEGER),
			@Result(column = "downsample_first", property = "downsampleFirst", jdbcType = JdbcType.BIT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "deleted", property = "deleted", jdbcType = JdbcType.BIT) })
	List<MedicalDownsample> selectByExample(MedicalDownsampleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@Select({ "select", "id, alias, medicine, before_medicine, after_medicine, period, min_bin, min_bin_row, ",
			"downsample_first, create_time, update_time, deleted", "from medical_downsample",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "alias", property = "alias", jdbcType = JdbcType.VARCHAR),
			@Result(column = "medicine", property = "medicine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "before_medicine", property = "beforeMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "after_medicine", property = "afterMedicine", jdbcType = JdbcType.INTEGER),
			@Result(column = "period", property = "period", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin", property = "minBin", jdbcType = JdbcType.INTEGER),
			@Result(column = "min_bin_row", property = "minBinRow", jdbcType = JdbcType.INTEGER),
			@Result(column = "downsample_first", property = "downsampleFirst", jdbcType = JdbcType.BIT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "deleted", property = "deleted", jdbcType = JdbcType.BIT) })
	MedicalDownsample selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@UpdateProvider(type = MedicalDownsampleSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") MedicalDownsample record,
			@Param("example") MedicalDownsampleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@UpdateProvider(type = MedicalDownsampleSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") MedicalDownsample record, @Param("example") MedicalDownsampleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@UpdateProvider(type = MedicalDownsampleSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(MedicalDownsample record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	@Update({ "update medical_downsample", "set alias = #{alias,jdbcType=VARCHAR},",
			"medicine = #{medicine,jdbcType=VARCHAR},", "before_medicine = #{beforeMedicine,jdbcType=INTEGER},",
			"after_medicine = #{afterMedicine,jdbcType=INTEGER},", "period = #{period,jdbcType=INTEGER},",
			"min_bin = #{minBin,jdbcType=INTEGER},", "min_bin_row = #{minBinRow,jdbcType=INTEGER},",
			"downsample_first = #{downsampleFirst,jdbcType=BIT},", "create_time = #{createTime,jdbcType=TIMESTAMP},",
			"update_time = #{updateTime,jdbcType=TIMESTAMP},", "deleted = #{deleted,jdbcType=BIT}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(MedicalDownsample record);
}