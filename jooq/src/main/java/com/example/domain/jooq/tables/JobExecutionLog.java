/*
 * This file is generated by jOOQ.
*/
package com.example.domain.jooq.tables;


import com.example.domain.jooq.Indexes;
import com.example.domain.jooq.Jay;
import com.example.domain.jooq.Keys;
import com.example.domain.jooq.tables.records.JobExecutionLogRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobExecutionLog extends TableImpl<JobExecutionLogRecord> {

    private static final long serialVersionUID = -414932834;

    /**
     * The reference instance of <code>jay.JOB_EXECUTION_LOG</code>
     */
    public static final JobExecutionLog JOB_EXECUTION_LOG = new JobExecutionLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobExecutionLogRecord> getRecordType() {
        return JobExecutionLogRecord.class;
    }

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.id</code>.
     */
    public final TableField<JobExecutionLogRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.job_name</code>.
     */
    public final TableField<JobExecutionLogRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.task_id</code>.
     */
    public final TableField<JobExecutionLogRecord, String> TASK_ID = createField("task_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.hostname</code>.
     */
    public final TableField<JobExecutionLogRecord, String> HOSTNAME = createField("hostname", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.ip</code>.
     */
    public final TableField<JobExecutionLogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.sharding_item</code>.
     */
    public final TableField<JobExecutionLogRecord, Integer> SHARDING_ITEM = createField("sharding_item", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.execution_source</code>.
     */
    public final TableField<JobExecutionLogRecord, String> EXECUTION_SOURCE = createField("execution_source", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.failure_cause</code>.
     */
    public final TableField<JobExecutionLogRecord, String> FAILURE_CAUSE = createField("failure_cause", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.is_success</code>.
     */
    public final TableField<JobExecutionLogRecord, Integer> IS_SUCCESS = createField("is_success", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.start_time</code>.
     */
    public final TableField<JobExecutionLogRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jay.JOB_EXECUTION_LOG.complete_time</code>.
     */
    public final TableField<JobExecutionLogRecord, Timestamp> COMPLETE_TIME = createField("complete_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>jay.JOB_EXECUTION_LOG</code> table reference
     */
    public JobExecutionLog() {
        this(DSL.name("JOB_EXECUTION_LOG"), null);
    }

    /**
     * Create an aliased <code>jay.JOB_EXECUTION_LOG</code> table reference
     */
    public JobExecutionLog(String alias) {
        this(DSL.name(alias), JOB_EXECUTION_LOG);
    }

    /**
     * Create an aliased <code>jay.JOB_EXECUTION_LOG</code> table reference
     */
    public JobExecutionLog(Name alias) {
        this(alias, JOB_EXECUTION_LOG);
    }

    private JobExecutionLog(Name alias, Table<JobExecutionLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobExecutionLog(Name alias, Table<JobExecutionLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jay.JAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.JOB_EXECUTION_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobExecutionLogRecord> getPrimaryKey() {
        return Keys.KEY_JOB_EXECUTION_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobExecutionLogRecord>> getKeys() {
        return Arrays.<UniqueKey<JobExecutionLogRecord>>asList(Keys.KEY_JOB_EXECUTION_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobExecutionLog as(String alias) {
        return new JobExecutionLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobExecutionLog as(Name alias) {
        return new JobExecutionLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobExecutionLog rename(String name) {
        return new JobExecutionLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobExecutionLog rename(Name name) {
        return new JobExecutionLog(name, null);
    }
}
