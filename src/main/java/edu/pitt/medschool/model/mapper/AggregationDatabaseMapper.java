package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.AggregationDatabase;
import edu.pitt.medschool.model.dto.AggregationDatabaseExample;
import edu.pitt.medschool.model.dto.AggregationDatabaseWithBLOBs;
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
public interface AggregationDatabaseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@SelectProvider(type = AggregationDatabaseSqlProvider.class, method = "countByExample")
	long countByExample(AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@DeleteProvider(type = AggregationDatabaseSqlProvider.class, method = "deleteByExample")
	int deleteByExample(AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@Delete({ "delete from aggregation_database", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@Insert({ "insert into aggregation_database (db_name, version, ", "aggregate_time, create_time, ",
			"mean, max, min, ", "sd, median, q1, ", "q3, sum, status, ", "total, finished, ",
			"auto_update, arType, from_db, ", "time_cost, threads, ", "parts, nday, pid_list, ", "columns)",
			"values (#{dbName,jdbcType=VARCHAR}, #{version,jdbcType=INTEGER}, ",
			"#{aggregateTime,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
			"#{mean,jdbcType=BIT}, #{max,jdbcType=BIT}, #{min,jdbcType=BIT}, ",
			"#{sd,jdbcType=BIT}, #{median,jdbcType=BIT}, #{q1,jdbcType=BIT}, ",
			"#{q3,jdbcType=BIT}, #{sum,jdbcType=BIT}, #{status,jdbcType=VARCHAR}, ",
			"#{total,jdbcType=INTEGER}, #{finished,jdbcType=INTEGER}, ",
			"#{autoUpdate,jdbcType=BIT}, #{artype,jdbcType=BIT}, #{fromDb,jdbcType=VARCHAR}, ",
			"#{timeCost,jdbcType=VARCHAR}, #{threads,jdbcType=INTEGER}, ",
			"#{parts,jdbcType=INTEGER}, #{nday,jdbcType=INTEGER}, #{pidList,jdbcType=LONGVARCHAR}, ",
			"#{columns,jdbcType=LONGVARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
	int insert(AggregationDatabaseWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@InsertProvider(type = AggregationDatabaseSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
	int insertSelective(AggregationDatabaseWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@SelectProvider(type = AggregationDatabaseSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "db_name", property = "dbName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
			@Result(column = "aggregate_time", property = "aggregateTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "mean", property = "mean", jdbcType = JdbcType.BIT),
			@Result(column = "max", property = "max", jdbcType = JdbcType.BIT),
			@Result(column = "min", property = "min", jdbcType = JdbcType.BIT),
			@Result(column = "sd", property = "sd", jdbcType = JdbcType.BIT),
			@Result(column = "median", property = "median", jdbcType = JdbcType.BIT),
			@Result(column = "q1", property = "q1", jdbcType = JdbcType.BIT),
			@Result(column = "q3", property = "q3", jdbcType = JdbcType.BIT),
			@Result(column = "sum", property = "sum", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "total", property = "total", jdbcType = JdbcType.INTEGER),
			@Result(column = "finished", property = "finished", jdbcType = JdbcType.INTEGER),
			@Result(column = "auto_update", property = "autoUpdate", jdbcType = JdbcType.BIT),
			@Result(column = "arType", property = "artype", jdbcType = JdbcType.BIT),
			@Result(column = "from_db", property = "fromDb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time_cost", property = "timeCost", jdbcType = JdbcType.VARCHAR),
			@Result(column = "threads", property = "threads", jdbcType = JdbcType.INTEGER),
			@Result(column = "parts", property = "parts", jdbcType = JdbcType.INTEGER),
			@Result(column = "nday", property = "nday", jdbcType = JdbcType.INTEGER),
			@Result(column = "pid_list", property = "pidList", jdbcType = JdbcType.LONGVARCHAR),
			@Result(column = "columns", property = "columns", jdbcType = JdbcType.LONGVARCHAR) })
	List<AggregationDatabaseWithBLOBs> selectByExampleWithBLOBsWithRowbounds(AggregationDatabaseExample example,
			RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@SelectProvider(type = AggregationDatabaseSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "db_name", property = "dbName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
			@Result(column = "aggregate_time", property = "aggregateTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "mean", property = "mean", jdbcType = JdbcType.BIT),
			@Result(column = "max", property = "max", jdbcType = JdbcType.BIT),
			@Result(column = "min", property = "min", jdbcType = JdbcType.BIT),
			@Result(column = "sd", property = "sd", jdbcType = JdbcType.BIT),
			@Result(column = "median", property = "median", jdbcType = JdbcType.BIT),
			@Result(column = "q1", property = "q1", jdbcType = JdbcType.BIT),
			@Result(column = "q3", property = "q3", jdbcType = JdbcType.BIT),
			@Result(column = "sum", property = "sum", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "total", property = "total", jdbcType = JdbcType.INTEGER),
			@Result(column = "finished", property = "finished", jdbcType = JdbcType.INTEGER),
			@Result(column = "auto_update", property = "autoUpdate", jdbcType = JdbcType.BIT),
			@Result(column = "arType", property = "artype", jdbcType = JdbcType.BIT),
			@Result(column = "from_db", property = "fromDb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time_cost", property = "timeCost", jdbcType = JdbcType.VARCHAR),
			@Result(column = "threads", property = "threads", jdbcType = JdbcType.INTEGER),
			@Result(column = "parts", property = "parts", jdbcType = JdbcType.INTEGER),
			@Result(column = "nday", property = "nday", jdbcType = JdbcType.INTEGER),
			@Result(column = "pid_list", property = "pidList", jdbcType = JdbcType.LONGVARCHAR),
			@Result(column = "columns", property = "columns", jdbcType = JdbcType.LONGVARCHAR) })
	List<AggregationDatabaseWithBLOBs> selectByExampleWithBLOBs(AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@SelectProvider(type = AggregationDatabaseSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "db_name", property = "dbName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
			@Result(column = "aggregate_time", property = "aggregateTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "mean", property = "mean", jdbcType = JdbcType.BIT),
			@Result(column = "max", property = "max", jdbcType = JdbcType.BIT),
			@Result(column = "min", property = "min", jdbcType = JdbcType.BIT),
			@Result(column = "sd", property = "sd", jdbcType = JdbcType.BIT),
			@Result(column = "median", property = "median", jdbcType = JdbcType.BIT),
			@Result(column = "q1", property = "q1", jdbcType = JdbcType.BIT),
			@Result(column = "q3", property = "q3", jdbcType = JdbcType.BIT),
			@Result(column = "sum", property = "sum", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "total", property = "total", jdbcType = JdbcType.INTEGER),
			@Result(column = "finished", property = "finished", jdbcType = JdbcType.INTEGER),
			@Result(column = "auto_update", property = "autoUpdate", jdbcType = JdbcType.BIT),
			@Result(column = "arType", property = "artype", jdbcType = JdbcType.BIT),
			@Result(column = "from_db", property = "fromDb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time_cost", property = "timeCost", jdbcType = JdbcType.VARCHAR),
			@Result(column = "threads", property = "threads", jdbcType = JdbcType.INTEGER),
			@Result(column = "parts", property = "parts", jdbcType = JdbcType.INTEGER),
			@Result(column = "nday", property = "nday", jdbcType = JdbcType.INTEGER) })
	List<AggregationDatabase> selectByExampleWithRowbounds(AggregationDatabaseExample example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@SelectProvider(type = AggregationDatabaseSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "db_name", property = "dbName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
			@Result(column = "aggregate_time", property = "aggregateTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "mean", property = "mean", jdbcType = JdbcType.BIT),
			@Result(column = "max", property = "max", jdbcType = JdbcType.BIT),
			@Result(column = "min", property = "min", jdbcType = JdbcType.BIT),
			@Result(column = "sd", property = "sd", jdbcType = JdbcType.BIT),
			@Result(column = "median", property = "median", jdbcType = JdbcType.BIT),
			@Result(column = "q1", property = "q1", jdbcType = JdbcType.BIT),
			@Result(column = "q3", property = "q3", jdbcType = JdbcType.BIT),
			@Result(column = "sum", property = "sum", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "total", property = "total", jdbcType = JdbcType.INTEGER),
			@Result(column = "finished", property = "finished", jdbcType = JdbcType.INTEGER),
			@Result(column = "auto_update", property = "autoUpdate", jdbcType = JdbcType.BIT),
			@Result(column = "arType", property = "artype", jdbcType = JdbcType.BIT),
			@Result(column = "from_db", property = "fromDb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time_cost", property = "timeCost", jdbcType = JdbcType.VARCHAR),
			@Result(column = "threads", property = "threads", jdbcType = JdbcType.INTEGER),
			@Result(column = "parts", property = "parts", jdbcType = JdbcType.INTEGER),
			@Result(column = "nday", property = "nday", jdbcType = JdbcType.INTEGER) })
	List<AggregationDatabase> selectByExample(AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@Select({ "select", "id, db_name, version, aggregate_time, create_time, mean, max, min, sd, median, ",
			"q1, q3, sum, status, total, finished, auto_update, arType, from_db, time_cost, ",
			"threads, parts, nday, pid_list, columns", "from aggregation_database",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "db_name", property = "dbName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "version", property = "version", jdbcType = JdbcType.INTEGER),
			@Result(column = "aggregate_time", property = "aggregateTime", jdbcType = JdbcType.INTEGER),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "mean", property = "mean", jdbcType = JdbcType.BIT),
			@Result(column = "max", property = "max", jdbcType = JdbcType.BIT),
			@Result(column = "min", property = "min", jdbcType = JdbcType.BIT),
			@Result(column = "sd", property = "sd", jdbcType = JdbcType.BIT),
			@Result(column = "median", property = "median", jdbcType = JdbcType.BIT),
			@Result(column = "q1", property = "q1", jdbcType = JdbcType.BIT),
			@Result(column = "q3", property = "q3", jdbcType = JdbcType.BIT),
			@Result(column = "sum", property = "sum", jdbcType = JdbcType.BIT),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "total", property = "total", jdbcType = JdbcType.INTEGER),
			@Result(column = "finished", property = "finished", jdbcType = JdbcType.INTEGER),
			@Result(column = "auto_update", property = "autoUpdate", jdbcType = JdbcType.BIT),
			@Result(column = "arType", property = "artype", jdbcType = JdbcType.BIT),
			@Result(column = "from_db", property = "fromDb", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time_cost", property = "timeCost", jdbcType = JdbcType.VARCHAR),
			@Result(column = "threads", property = "threads", jdbcType = JdbcType.INTEGER),
			@Result(column = "parts", property = "parts", jdbcType = JdbcType.INTEGER),
			@Result(column = "nday", property = "nday", jdbcType = JdbcType.INTEGER),
			@Result(column = "pid_list", property = "pidList", jdbcType = JdbcType.LONGVARCHAR),
			@Result(column = "columns", property = "columns", jdbcType = JdbcType.LONGVARCHAR) })
	AggregationDatabaseWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@UpdateProvider(type = AggregationDatabaseSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") AggregationDatabaseWithBLOBs record,
			@Param("example") AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@UpdateProvider(type = AggregationDatabaseSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") AggregationDatabaseWithBLOBs record,
			@Param("example") AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@UpdateProvider(type = AggregationDatabaseSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") AggregationDatabase record,
			@Param("example") AggregationDatabaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@UpdateProvider(type = AggregationDatabaseSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(AggregationDatabaseWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@Update({ "update aggregation_database", "set db_name = #{dbName,jdbcType=VARCHAR},",
			"version = #{version,jdbcType=INTEGER},", "aggregate_time = #{aggregateTime,jdbcType=INTEGER},",
			"create_time = #{createTime,jdbcType=TIMESTAMP},", "mean = #{mean,jdbcType=BIT},",
			"max = #{max,jdbcType=BIT},", "min = #{min,jdbcType=BIT},", "sd = #{sd,jdbcType=BIT},",
			"median = #{median,jdbcType=BIT},", "q1 = #{q1,jdbcType=BIT},", "q3 = #{q3,jdbcType=BIT},",
			"sum = #{sum,jdbcType=BIT},", "status = #{status,jdbcType=VARCHAR},", "total = #{total,jdbcType=INTEGER},",
			"finished = #{finished,jdbcType=INTEGER},", "auto_update = #{autoUpdate,jdbcType=BIT},",
			"arType = #{artype,jdbcType=BIT},", "from_db = #{fromDb,jdbcType=VARCHAR},",
			"time_cost = #{timeCost,jdbcType=VARCHAR},", "threads = #{threads,jdbcType=INTEGER},",
			"parts = #{parts,jdbcType=INTEGER},", "nday = #{nday,jdbcType=INTEGER},",
			"pid_list = #{pidList,jdbcType=LONGVARCHAR},", "columns = #{columns,jdbcType=LONGVARCHAR}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKeyWithBLOBs(AggregationDatabaseWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	@Update({ "update aggregation_database", "set db_name = #{dbName,jdbcType=VARCHAR},",
			"version = #{version,jdbcType=INTEGER},", "aggregate_time = #{aggregateTime,jdbcType=INTEGER},",
			"create_time = #{createTime,jdbcType=TIMESTAMP},", "mean = #{mean,jdbcType=BIT},",
			"max = #{max,jdbcType=BIT},", "min = #{min,jdbcType=BIT},", "sd = #{sd,jdbcType=BIT},",
			"median = #{median,jdbcType=BIT},", "q1 = #{q1,jdbcType=BIT},", "q3 = #{q3,jdbcType=BIT},",
			"sum = #{sum,jdbcType=BIT},", "status = #{status,jdbcType=VARCHAR},", "total = #{total,jdbcType=INTEGER},",
			"finished = #{finished,jdbcType=INTEGER},", "auto_update = #{autoUpdate,jdbcType=BIT},",
			"arType = #{artype,jdbcType=BIT},", "from_db = #{fromDb,jdbcType=VARCHAR},",
			"time_cost = #{timeCost,jdbcType=VARCHAR},", "threads = #{threads,jdbcType=INTEGER},",
			"parts = #{parts,jdbcType=INTEGER},", "nday = #{nday,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(AggregationDatabase record);
}