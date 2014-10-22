package com.swipesapp.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.swipesapp.android.db.TaskSync;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TASK_SYNC.
*/
public class TaskSyncDao extends AbstractDao<TaskSync, Long> {

    public static final String TABLENAME = "TASK_SYNC";

    /**
     * Properties of entity TaskSync.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ObjectId = new Property(1, String.class, "objectId", false, "OBJECT_ID");
        public final static Property TempId = new Property(2, String.class, "tempId", false, "TEMP_ID");
        public final static Property ParentLocalId = new Property(3, String.class, "parentLocalId", false, "PARENT_LOCAL_ID");
        public final static Property CreatedAt = new Property(4, java.util.Date.class, "createdAt", false, "CREATED_AT");
        public final static Property UpdatedAt = new Property(5, java.util.Date.class, "updatedAt", false, "UPDATED_AT");
        public final static Property Deleted = new Property(6, Boolean.class, "deleted", false, "DELETED");
        public final static Property Title = new Property(7, String.class, "title", false, "TITLE");
        public final static Property Notes = new Property(8, String.class, "notes", false, "NOTES");
        public final static Property Order = new Property(9, Integer.class, "order", false, "ORDER");
        public final static Property Priority = new Property(10, Integer.class, "priority", false, "PRIORITY");
        public final static Property CompletionDate = new Property(11, java.util.Date.class, "completionDate", false, "COMPLETION_DATE");
        public final static Property Schedule = new Property(12, java.util.Date.class, "schedule", false, "SCHEDULE");
        public final static Property Location = new Property(13, String.class, "location", false, "LOCATION");
        public final static Property RepeatDate = new Property(14, java.util.Date.class, "repeatDate", false, "REPEAT_DATE");
        public final static Property RepeatOption = new Property(15, String.class, "repeatOption", false, "REPEAT_OPTION");
        public final static Property Origin = new Property(16, String.class, "origin", false, "ORIGIN");
        public final static Property OriginIdentifier = new Property(17, String.class, "originIdentifier", false, "ORIGIN_IDENTIFIER");
    };


    public TaskSyncDao(DaoConfig config) {
        super(config);
    }
    
    public TaskSyncDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TASK_SYNC' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'OBJECT_ID' TEXT," + // 1: objectId
                "'TEMP_ID' TEXT," + // 2: tempId
                "'PARENT_LOCAL_ID' TEXT," + // 3: parentLocalId
                "'CREATED_AT' INTEGER," + // 4: createdAt
                "'UPDATED_AT' INTEGER," + // 5: updatedAt
                "'DELETED' INTEGER," + // 6: deleted
                "'TITLE' TEXT," + // 7: title
                "'NOTES' TEXT," + // 8: notes
                "'ORDER' INTEGER," + // 9: order
                "'PRIORITY' INTEGER," + // 10: priority
                "'COMPLETION_DATE' INTEGER," + // 11: completionDate
                "'SCHEDULE' INTEGER," + // 12: schedule
                "'LOCATION' TEXT," + // 13: location
                "'REPEAT_DATE' INTEGER," + // 14: repeatDate
                "'REPEAT_OPTION' TEXT," + // 15: repeatOption
                "'ORIGIN' TEXT," + // 16: origin
                "'ORIGIN_IDENTIFIER' TEXT);"); // 17: originIdentifier
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TASK_SYNC'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TaskSync entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String objectId = entity.getObjectId();
        if (objectId != null) {
            stmt.bindString(2, objectId);
        }
 
        String tempId = entity.getTempId();
        if (tempId != null) {
            stmt.bindString(3, tempId);
        }
 
        String parentLocalId = entity.getParentLocalId();
        if (parentLocalId != null) {
            stmt.bindString(4, parentLocalId);
        }
 
        java.util.Date createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindLong(5, createdAt.getTime());
        }
 
        java.util.Date updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindLong(6, updatedAt.getTime());
        }
 
        Boolean deleted = entity.getDeleted();
        if (deleted != null) {
            stmt.bindLong(7, deleted ? 1l: 0l);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(8, title);
        }
 
        String notes = entity.getNotes();
        if (notes != null) {
            stmt.bindString(9, notes);
        }
 
        Integer order = entity.getOrder();
        if (order != null) {
            stmt.bindLong(10, order);
        }
 
        Integer priority = entity.getPriority();
        if (priority != null) {
            stmt.bindLong(11, priority);
        }
 
        java.util.Date completionDate = entity.getCompletionDate();
        if (completionDate != null) {
            stmt.bindLong(12, completionDate.getTime());
        }
 
        java.util.Date schedule = entity.getSchedule();
        if (schedule != null) {
            stmt.bindLong(13, schedule.getTime());
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(14, location);
        }
 
        java.util.Date repeatDate = entity.getRepeatDate();
        if (repeatDate != null) {
            stmt.bindLong(15, repeatDate.getTime());
        }
 
        String repeatOption = entity.getRepeatOption();
        if (repeatOption != null) {
            stmt.bindString(16, repeatOption);
        }
 
        String origin = entity.getOrigin();
        if (origin != null) {
            stmt.bindString(17, origin);
        }
 
        String originIdentifier = entity.getOriginIdentifier();
        if (originIdentifier != null) {
            stmt.bindString(18, originIdentifier);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TaskSync readEntity(Cursor cursor, int offset) {
        TaskSync entity = new TaskSync( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // objectId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // tempId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // parentLocalId
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // createdAt
            cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)), // updatedAt
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // deleted
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // title
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // notes
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // order
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // priority
            cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)), // completionDate
            cursor.isNull(offset + 12) ? null : new java.util.Date(cursor.getLong(offset + 12)), // schedule
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // location
            cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)), // repeatDate
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // repeatOption
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // origin
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // originIdentifier
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TaskSync entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setObjectId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTempId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setParentLocalId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreatedAt(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
        entity.setUpdatedAt(cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)));
        entity.setDeleted(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setTitle(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNotes(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setOrder(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setPriority(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setCompletionDate(cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)));
        entity.setSchedule(cursor.isNull(offset + 12) ? null : new java.util.Date(cursor.getLong(offset + 12)));
        entity.setLocation(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setRepeatDate(cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)));
        entity.setRepeatOption(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setOrigin(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setOriginIdentifier(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TaskSync entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TaskSync entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
