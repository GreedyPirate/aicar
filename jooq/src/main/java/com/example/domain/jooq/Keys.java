/*
 * This file is generated by jOOQ.
*/
package com.example.domain.jooq;


import com.example.domain.jooq.tables.CarOpLog;
import com.example.domain.jooq.tables.JobExecutionLog;
import com.example.domain.jooq.tables.JobStatusTraceLog;
import com.example.domain.jooq.tables.User;
import com.example.domain.jooq.tables.records.CarOpLogRecord;
import com.example.domain.jooq.tables.records.JobExecutionLogRecord;
import com.example.domain.jooq.tables.records.JobStatusTraceLogRecord;
import com.example.domain.jooq.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>jay</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CarOpLogRecord, Long> IDENTITY_CAR_OP_LOG = Identities0.IDENTITY_CAR_OP_LOG;
    public static final Identity<UserRecord, UInteger> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CarOpLogRecord> KEY_CAR_OP_LOG_PRIMARY = UniqueKeys0.KEY_CAR_OP_LOG_PRIMARY;
    public static final UniqueKey<CarOpLogRecord> KEY_CAR_OP_LOG_IDX_OP_ID = UniqueKeys0.KEY_CAR_OP_LOG_IDX_OP_ID;
    public static final UniqueKey<JobExecutionLogRecord> KEY_JOB_EXECUTION_LOG_PRIMARY = UniqueKeys0.KEY_JOB_EXECUTION_LOG_PRIMARY;
    public static final UniqueKey<JobStatusTraceLogRecord> KEY_JOB_STATUS_TRACE_LOG_PRIMARY = UniqueKeys0.KEY_JOB_STATUS_TRACE_LOG_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CarOpLogRecord, Long> IDENTITY_CAR_OP_LOG = Internal.createIdentity(CarOpLog.CAR_OP_LOG, CarOpLog.CAR_OP_LOG.ID);
        public static Identity<UserRecord, UInteger> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CarOpLogRecord> KEY_CAR_OP_LOG_PRIMARY = Internal.createUniqueKey(CarOpLog.CAR_OP_LOG, "KEY_car_op_log_PRIMARY", CarOpLog.CAR_OP_LOG.ID);
        public static final UniqueKey<CarOpLogRecord> KEY_CAR_OP_LOG_IDX_OP_ID = Internal.createUniqueKey(CarOpLog.CAR_OP_LOG, "KEY_car_op_log_idx_op_id", CarOpLog.CAR_OP_LOG.OP_ID);
        public static final UniqueKey<JobExecutionLogRecord> KEY_JOB_EXECUTION_LOG_PRIMARY = Internal.createUniqueKey(JobExecutionLog.JOB_EXECUTION_LOG, "KEY_JOB_EXECUTION_LOG_PRIMARY", JobExecutionLog.JOB_EXECUTION_LOG.ID);
        public static final UniqueKey<JobStatusTraceLogRecord> KEY_JOB_STATUS_TRACE_LOG_PRIMARY = Internal.createUniqueKey(JobStatusTraceLog.JOB_STATUS_TRACE_LOG, "KEY_JOB_STATUS_TRACE_LOG_PRIMARY", JobStatusTraceLog.JOB_STATUS_TRACE_LOG.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
    }
}
