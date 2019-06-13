package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.NotInCsvFile;
import edu.pitt.medschool.model.dto.NotInCsvFileExample;
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

@Mapper
public interface NotInCsvFileMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = NotInCsvFileSqlProvider.class, method = "countByExample")
	long countByExample(NotInCsvFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@DeleteProvider(type = NotInCsvFileSqlProvider.class, method = "deleteByExample")
	int deleteByExample(NotInCsvFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@Delete({ "delete from not_in_csv_file", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@Insert({ "insert into not_in_csv_file (id, pid, ", "start_time, end_time, ", "header_time, uuid, ",
			"filename, length, ", "density, comment, ", "last_update, not_in_csv_filecol, ", "machine, ar, path, ",
			"size, conflict_resolved, ", "status, width)", "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=VARCHAR}, ",
			"#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
			"#{headerTime,jdbcType=TIMESTAMP}, #{uuid,jdbcType=CHAR}, ",
			"#{filename,jdbcType=VARCHAR}, #{length,jdbcType=INTEGER}, ",
			"#{density,jdbcType=DOUBLE}, #{comment,jdbcType=VARCHAR}, ",
			"#{lastUpdate,jdbcType=TIMESTAMP}, #{notInCsvFilecol,jdbcType=VARCHAR}, ",
			"#{machine,jdbcType=VARCHAR}, #{ar,jdbcType=BIT}, #{path,jdbcType=VARCHAR}, ",
			"#{size,jdbcType=BIGINT}, #{conflictResolved,jdbcType=BIT}, ",
			"#{status,jdbcType=INTEGER}, #{width,jdbcType=INTEGER})" })
	int insert(NotInCsvFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@InsertProvider(type = NotInCsvFileSqlProvider.class, method = "insertSelective")
	int insertSelective(NotInCsvFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = NotInCsvFileSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "not_in_csv_filecol", property = "notInCsvFilecol", jdbcType = JdbcType.VARCHAR),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER) })
	List<NotInCsvFile> selectByExampleWithRowbounds(NotInCsvFileExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = NotInCsvFileSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "not_in_csv_filecol", property = "notInCsvFilecol", jdbcType = JdbcType.VARCHAR),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER) })
	List<NotInCsvFile> selectByExample(NotInCsvFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@Select({ "select", "id, pid, start_time, end_time, header_time, uuid, filename, length, density, ",
			"comment, last_update, not_in_csv_filecol, machine, ar, path, size, conflict_resolved, ", "status, width",
			"from not_in_csv_file", "where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "not_in_csv_filecol", property = "notInCsvFilecol", jdbcType = JdbcType.VARCHAR),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER) })
	NotInCsvFile selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = NotInCsvFileSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") NotInCsvFile record, @Param("example") NotInCsvFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = NotInCsvFileSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") NotInCsvFile record, @Param("example") NotInCsvFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = NotInCsvFileSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(NotInCsvFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..not_in_csv_file
	 * @mbg.generated
	 */
	@Update({ "update not_in_csv_file", "set pid = #{pid,jdbcType=VARCHAR},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},", "end_time = #{endTime,jdbcType=TIMESTAMP},",
			"header_time = #{headerTime,jdbcType=TIMESTAMP},", "uuid = #{uuid,jdbcType=CHAR},",
			"filename = #{filename,jdbcType=VARCHAR},", "length = #{length,jdbcType=INTEGER},",
			"density = #{density,jdbcType=DOUBLE},", "comment = #{comment,jdbcType=VARCHAR},",
			"last_update = #{lastUpdate,jdbcType=TIMESTAMP},",
			"not_in_csv_filecol = #{notInCsvFilecol,jdbcType=VARCHAR},", "machine = #{machine,jdbcType=VARCHAR},",
			"ar = #{ar,jdbcType=BIT},", "path = #{path,jdbcType=VARCHAR},", "size = #{size,jdbcType=BIGINT},",
			"conflict_resolved = #{conflictResolved,jdbcType=BIT},", "status = #{status,jdbcType=INTEGER},",
			"width = #{width,jdbcType=INTEGER}", "where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(NotInCsvFile record);
}