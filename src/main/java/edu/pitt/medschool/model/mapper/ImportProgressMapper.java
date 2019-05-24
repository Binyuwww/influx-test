package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.controller.load.vo.ActivityVO;
import edu.pitt.medschool.controller.load.vo.ProgressVO;
import edu.pitt.medschool.model.dto.ImportProgress;
import edu.pitt.medschool.model.dto.ImportProgressExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
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

@Mapper
public interface ImportProgressMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@SelectProvider(type = ImportProgressSqlProvider.class, method = "countByExample")
	long countByExample(ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@DeleteProvider(type = ImportProgressSqlProvider.class, method = "deleteByExample")
	int deleteByExample(ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@Insert({ "insert into import_progress (id, uuid, ", "batch_id, filename, ", "status, percent, ",
			"size, create_time, ", "update_time, reason)", "values (#{id,jdbcType=INTEGER}, #{uuid,jdbcType=VARCHAR}, ",
			"#{batchId,jdbcType=VARCHAR}, #{filename,jdbcType=VARCHAR}, ",
			"#{status,jdbcType=VARCHAR}, #{percent,jdbcType=DOUBLE}, ",
			"#{size,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
			"#{updateTime,jdbcType=TIMESTAMP}, #{reason,jdbcType=LONGVARCHAR})" })
	int insert(ImportProgress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@InsertProvider(type = ImportProgressSqlProvider.class, method = "insertSelective")
	int insertSelective(ImportProgress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@SelectProvider(type = ImportProgressSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "batch_id", property = "batchId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "percent", property = "percent", jdbcType = JdbcType.DOUBLE),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "reason", property = "reason", jdbcType = JdbcType.LONGVARCHAR) })
	List<ImportProgress> selectByExampleWithBLOBsWithRowbounds(ImportProgressExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@SelectProvider(type = ImportProgressSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "batch_id", property = "batchId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "percent", property = "percent", jdbcType = JdbcType.DOUBLE),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "reason", property = "reason", jdbcType = JdbcType.LONGVARCHAR) })
	List<ImportProgress> selectByExampleWithBLOBs(ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@SelectProvider(type = ImportProgressSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "batch_id", property = "batchId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "percent", property = "percent", jdbcType = JdbcType.DOUBLE),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
	List<ImportProgress> selectByExampleWithRowbounds(ImportProgressExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@SelectProvider(type = ImportProgressSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
			@Result(column = "uuid", property = "uuid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "batch_id", property = "batchId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "percent", property = "percent", jdbcType = JdbcType.DOUBLE),
			@Result(column = "size", property = "size", jdbcType = JdbcType.BIGINT),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
	List<ImportProgress> selectByExample(ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@UpdateProvider(type = ImportProgressSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") ImportProgress record,
			@Param("example") ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@UpdateProvider(type = ImportProgressSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") ImportProgress record,
			@Param("example") ImportProgressExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table import_progress
	 * @mbg.generated
	 */
	@UpdateProvider(type = ImportProgressSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") ImportProgress record, @Param("example") ImportProgressExample example);

	@Select({
            "SELECT",
            "filename, percent, status, reason",
            "FROM import_progress",
            "WHERE uuid = #{uuid} AND batch_id = #{batchId}"
    })
    @ResultType(ProgressVO.class)
    @Results({
            @Result(column="filename", property="file_name", jdbcType=JdbcType.VARCHAR),
            @Result(column="percent", property="progress", jdbcType=JdbcType.DOUBLE),
            @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
            @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR)
    })
    List<ProgressVO> selectTaskDetailProgress(String uuid, String batchId);

    @Select({
        "SELECT",
            "batch_id,",
            "max(update_time) AS end_time, ",
            "min(create_time) AS start_time, ",
            "concat('', TIMEDIFF(max(update_time), min(create_time))) AS elapsed_time, ",
            "sys.format_bytes(sum(size)) AS size, ",
            "COUNT(*) AS file_count,",
            "COUNT(IF( `status`='STATUS_FINISHED', `status`, NULL)) AS finished_count,",
            "COUNT(IF( `status`='STATUS_FAIL', `status`, NULL)) AS fail_count,",
            "COUNT(IF( `status`='STATUS_INPROGRESS', `status`, NULL)) AS in_progress_count,",
            "COUNT(IF( `status`='STATUS_QUEUED', `status`, NULL)) AS queued_count,",
            "IF(COUNT(*)=COUNT(IF( `status`='STATUS_FINISHED', `status`, NULL)) + COUNT(IF( `status`='STATUS_FAIL', `status`, NULL)), TRUE, FALSE) AS finished",
        "FROM import_progress ",
        "WHERE uuid = #{uuid}",
        "GROUP BY batch_id",
        "ORDER BY end_time DESC;"
    })
    @ResultType(ActivityVO.class)
    @Results({
        @Result(column="batch_id", property="batchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="elapsed_time", property="elapsedTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_count", property="fileCount", jdbcType=JdbcType.INTEGER),
        @Result(column="finished_count", property="finishedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fail_count", property="failCount", jdbcType=JdbcType.INTEGER),
        @Result(column="in_progress_count", property="inProgressCount", jdbcType=JdbcType.INTEGER),
        @Result(column="queued_count", property="queuedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="finished", property="finished", jdbcType=JdbcType.BOOLEAN)
    })
    List<ActivityVO> getActivityList(String uuid);

    @Select({
        "SELECT temp.batch_id FROM (SELECT batch_id, ",
        "       Min(import_progress.create_time) AS start, ",
        "       Max(import_progress.update_time) AS end, ",
        "      IF(( Count(0) = ( Count(IF((status = 'STATUS_FINISHED'), status, NULL)) + Count(IF((status = 'STATUS_FAIL'), status, NULL)) ) ), 1, 0) AS finish ",
        "FROM   import_progress ",
        "WHERE  uuid = #{uuid} ",
        "GROUP  BY import_progress.batch_id ",
        "ORDER  BY end DESC LIMIT 1) temp;"
    })
    @ResultType(String.class)
    String selectDatabaseVersion(String uuid);

}