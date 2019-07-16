package edu.pitt.medschool.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import edu.pitt.medschool.model.dto.CsvFile;
import edu.pitt.medschool.model.dto.CsvFileExample;
import edu.pitt.medschool.model.dto.TimeLine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CsvFileMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = CsvFileSqlProvider.class, method = "countByExample")
	long countByExample(CsvFileExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@DeleteProvider(type = CsvFileSqlProvider.class, method = "deleteByExample")
	int deleteByExample(CsvFileExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@Delete({ "delete from csv_file", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@Insert({ "insert into csv_file (id, pid, ", "filename, start_time, ", "end_time, length, ", "density, machine, ",
			"ar, path, size, ", "uuid, header_time, ", "last_update, conflict_resolved, ", "status, comment, ",
			"width, start_version, ", "end_version)", "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=VARCHAR}, ",
			"#{filename,jdbcType=VARCHAR}, #{startTime,jdbcType=TIMESTAMP}, ",
			"#{endTime,jdbcType=TIMESTAMP}, #{length,jdbcType=INTEGER}, ",
			"#{density,jdbcType=DOUBLE}, #{machine,jdbcType=VARCHAR}, ",
			"#{ar,jdbcType=BIT}, #{path,jdbcType=VARCHAR}, #{size,jdbcType=BIGINT}, ",
			"#{uuid,jdbcType=CHAR}, #{headerTime,jdbcType=TIMESTAMP}, ",
			"#{lastUpdate,jdbcType=TIMESTAMP}, #{conflictResolved,jdbcType=BIT}, ",
			"#{status,jdbcType=INTEGER}, #{comment,jdbcType=VARCHAR}, ",
			"#{width,jdbcType=INTEGER}, #{startVersion,jdbcType=INTEGER}, ", "#{endVersion,jdbcType=INTEGER})" })
	int insert(CsvFile record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@InsertProvider(type = CsvFileSqlProvider.class, method = "insertSelective")
	int insertSelective(CsvFile record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = CsvFileSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER),
			@Result(column = "start_version", property = "startVersion", jdbcType = JdbcType.INTEGER),
			@Result(column = "end_version", property = "endVersion", jdbcType = JdbcType.INTEGER) })
	List<CsvFile> selectByExampleWithRowbounds(CsvFileExample example, RowBounds rowBounds);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@SelectProvider(type = CsvFileSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER),
			@Result(column = "start_version", property = "startVersion", jdbcType = JdbcType.INTEGER),
			@Result(column = "end_version", property = "endVersion", jdbcType = JdbcType.INTEGER) })
	List<CsvFile> selectByExample(CsvFileExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@Select({ "select", "id, pid, filename, start_time, end_time, length, density, machine, ar, path, ",
			"size, uuid, header_time, last_update, conflict_resolved, status, comment, width, ",
			"start_version, end_version", "from csv_file", "where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pid", property = "pid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "start_time", property = "startTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "end_time", property = "endTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "length", property = "length", jdbcType = JdbcType.INTEGER),
			@Result(column = "density", property = "density", jdbcType = JdbcType.DOUBLE),
			@Result(column = "machine", property = "machine", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ar", property = "ar", jdbcType = JdbcType.BIT),
			@Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.CHAR),
			@Result(column = "header_time", property = "headerTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "last_update", property = "lastUpdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "conflict_resolved", property = "conflictResolved", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
			@Result(column = "comment", property = "comment", jdbcType = JdbcType.VARCHAR),
			@Result(column = "width", property = "width", jdbcType = JdbcType.INTEGER),
			@Result(column = "start_version", property = "startVersion", jdbcType = JdbcType.INTEGER),
			@Result(column = "end_version", property = "endVersion", jdbcType = JdbcType.INTEGER) })
	CsvFile selectByPrimaryKey(Integer id);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = CsvFileSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") CsvFile record, @Param("example") CsvFileExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = CsvFileSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") CsvFile record, @Param("example") CsvFileExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@UpdateProvider(type = CsvFileSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(CsvFile record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@Update({ "update csv_file", "set pid = #{pid,jdbcType=VARCHAR},", "filename = #{filename,jdbcType=VARCHAR},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},", "end_time = #{endTime,jdbcType=TIMESTAMP},",
			"length = #{length,jdbcType=INTEGER},", "density = #{density,jdbcType=DOUBLE},",
			"machine = #{machine,jdbcType=VARCHAR},", "ar = #{ar,jdbcType=BIT},", "path = #{path,jdbcType=VARCHAR},",
			"size = #{size,jdbcType=BIGINT},", "uuid = #{uuid,jdbcType=CHAR},",
			"header_time = #{headerTime,jdbcType=TIMESTAMP},", "last_update = #{lastUpdate,jdbcType=TIMESTAMP},",
			"conflict_resolved = #{conflictResolved,jdbcType=BIT},", "status = #{status,jdbcType=INTEGER},",
			"comment = #{comment,jdbcType=VARCHAR},", "width = #{width,jdbcType=INTEGER},",
			"start_version = #{startVersion,jdbcType=INTEGER},", "end_version = #{endVersion,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CsvFile record);


	// for data cleaning use only unpublished data
	@Select({ "select c.pid as pid,c.filename as filename,c.start_time as start_time,c.end_time as end_time, ",
            "p.arrestdate as arrestdate,c.length as len, p.arresttime as arresttime, c.uuid as uuid, c.conflict_resolved as resolved, c.comment as comment",
            "from csv_file c, patient p where c.pid = p.id and c.machine= '${machine}' and c.status <> 1 and p.arrestdate is not null" })
    List<TimeLine> getPatientTimeLines(@Param("machine") String machine);


	// for user to select different version
	@Select({ "select c.pid as pid,c.filename as filename,c.start_time as start_time,c.end_time as end_time, ",
			"p.arrestdate as arrestdate,c.length as len, p.arresttime as arresttime, c.uuid as uuid, c.conflict_resolved as resolved, c.comment as comment",
			"from csv_file c, patient p where p.version<='${version}' and p.version != 0 and c.start_version !=0 and c.start_version<='${version}' and c.end_version>'${version}' and c.pid = p.id and c.machine= '${machine}' and c.status <> 1 and p.arrestdate is not null" })
	List<TimeLine> getPatientTimeLinesByVersion(@Param("version") int version, @Param("machine") String machine);

	// for admin to get latest version and unpublished data
	@Select({ "select c.pid as pid,c.filename as filename,c.start_time as start_time,c.end_time as end_time, ",
			"p.arrestdate as arrestdate,c.length as len, p.arresttime as arresttime, c.uuid as uuid, c.conflict_resolved as resolved, c.comment as comment",
			"from csv_file c, patient p where p.version<='${version}' and c.start_version<='${version}' and c.end_version>'${version}'+1 and c.pid = p.id and c.machine= '${machine}' and c.status <> 1 and p.arrestdate is not null" })
	List<TimeLine> getLatestPatientTimeLines(@Param("version") int version, @Param("machine") String machine);

	// for user to get files of one patient
	@Select({ "select c.pid as pid,c.filename as filename,c.start_time as start_time,c.end_time as end_time, ",
			"p.arrestdate as arrestdate,c.length as len, p.arresttime as arresttime, c.uuid as uuid, c.conflict_resolved as resolved, c.comment as comment",
			"from csv_file c, patient p where p.version<='${version}' and p.version != 0 and c.start_version !=0 and c.start_version<='${version}' and c.end_version>'${version}' and c.pid = p.id and p.id='${pid}' and c.machine= '${machine}' and c.status <> 1 and p.arrestdate is not null" })
	List<TimeLine> getPatientTimeLinesByVersionID(@Param("version") int version, @Param("machine") String machine,@Param("pid") String pid);

	@Select({"select count(distinct pid) from csv_file c where c.start_version<='${version}' and c.start_version !=0 and c.end_version>'${version}'"})
    Long getDistinctPids(@Param("version") int version);
}