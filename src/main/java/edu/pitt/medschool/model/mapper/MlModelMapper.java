package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.MlModel;
import edu.pitt.medschool.model.dto.MlModelExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface MlModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @SelectProvider(type=MlModelSqlProvider.class, method="countByExample")
    long countByExample(MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @DeleteProvider(type=MlModelSqlProvider.class, method="deleteByExample")
    int deleteByExample(MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @Insert({
        "insert into ml_model (iteration, pipeline_name, ",
        "ml_method, agg_level, ",
        "agg_method, feature_set, ",
        "accuracy_score, threshold, ",
        "threshold_standard, pipeline)",
        "values (#{iteration,jdbcType=INTEGER}, #{pipelineName,jdbcType=VARCHAR}, ",
        "#{mlMethod,jdbcType=VARCHAR}, #{aggLevel,jdbcType=INTEGER}, ",
        "#{aggMethod,jdbcType=VARCHAR}, #{featureSet,jdbcType=VARCHAR}, ",
        "#{accuracyScore,jdbcType=DOUBLE}, #{threshold,jdbcType=DOUBLE}, ",
        "#{thresholdStandard,jdbcType=DOUBLE}, #{pipeline,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(MlModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @InsertProvider(type=MlModelSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(MlModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @SelectProvider(type=MlModelSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="iteration", property="iteration", jdbcType=JdbcType.INTEGER),
        @Result(column="pipeline_name", property="pipelineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ml_method", property="mlMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="agg_level", property="aggLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="agg_method", property="aggMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="feature_set", property="featureSet", jdbcType=JdbcType.VARCHAR),
        @Result(column="accuracy_score", property="accuracyScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold", property="threshold", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold_standard", property="thresholdStandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="pipeline", property="pipeline", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<MlModel> selectByExampleWithBLOBsWithRowbounds(MlModelExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @SelectProvider(type=MlModelSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="iteration", property="iteration", jdbcType=JdbcType.INTEGER),
        @Result(column="pipeline_name", property="pipelineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ml_method", property="mlMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="agg_level", property="aggLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="agg_method", property="aggMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="feature_set", property="featureSet", jdbcType=JdbcType.VARCHAR),
        @Result(column="accuracy_score", property="accuracyScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold", property="threshold", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold_standard", property="thresholdStandard", jdbcType=JdbcType.DOUBLE),
        @Result(column="pipeline", property="pipeline", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<MlModel> selectByExampleWithBLOBs(MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @SelectProvider(type=MlModelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="iteration", property="iteration", jdbcType=JdbcType.INTEGER),
        @Result(column="pipeline_name", property="pipelineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ml_method", property="mlMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="agg_level", property="aggLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="agg_method", property="aggMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="feature_set", property="featureSet", jdbcType=JdbcType.VARCHAR),
        @Result(column="accuracy_score", property="accuracyScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold", property="threshold", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold_standard", property="thresholdStandard", jdbcType=JdbcType.DOUBLE)
    })
    List<MlModel> selectByExampleWithRowbounds(MlModelExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @SelectProvider(type=MlModelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="iteration", property="iteration", jdbcType=JdbcType.INTEGER),
        @Result(column="pipeline_name", property="pipelineName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ml_method", property="mlMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="agg_level", property="aggLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="agg_method", property="aggMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="feature_set", property="featureSet", jdbcType=JdbcType.VARCHAR),
        @Result(column="accuracy_score", property="accuracyScore", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold", property="threshold", jdbcType=JdbcType.DOUBLE),
        @Result(column="threshold_standard", property="thresholdStandard", jdbcType=JdbcType.DOUBLE)
    })
    List<MlModel> selectByExample(MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MlModelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MlModel record, @Param("example") MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MlModelSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") MlModel record, @Param("example") MlModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MlModelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MlModel record, @Param("example") MlModelExample example);
}