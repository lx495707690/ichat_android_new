package me.itangqi.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import me.itangqi.greendao.DBMessage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBMESSAGE".
*/
public class DBMessageDao extends AbstractDao<DBMessage, Long> {

    public static final String TABLENAME = "DBMESSAGE";

    /**
     * Properties of entity DBMessage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property My_userId = new Property(1, String.class, "my_userId", false, "MY_USER_ID");
        public final static Property Message = new Property(2, String.class, "message", false, "MESSAGE");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property FromId = new Property(4, String.class, "fromId", false, "FROM_ID");
        public final static Property ToId = new Property(5, String.class, "toId", false, "TO_ID");
        public final static Property ChannelId = new Property(6, String.class, "channelId", false, "CHANNEL_ID");
        public final static Property Image = new Property(7, String.class, "image", false, "IMAGE");
        public final static Property From_name = new Property(8, String.class, "from_name", false, "FROM_NAME");
        public final static Property Channal_name = new Property(9, String.class, "channal_name", false, "CHANNAL_NAME");
        public final static Property From_me = new Property(10, boolean.class, "from_me", false, "FROM_ME");
        public final static Property Is_sended = new Property(11, boolean.class, "is_sended", false, "IS_SENDED");
    };


    public DBMessageDao(DaoConfig config) {
        super(config);
    }
    
    public DBMessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBMESSAGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"MY_USER_ID\" TEXT NOT NULL ," + // 1: my_userId
                "\"MESSAGE\" TEXT NOT NULL ," + // 2: message
                "\"DATE\" TEXT NOT NULL ," + // 3: date
                "\"FROM_ID\" TEXT NOT NULL ," + // 4: fromId
                "\"TO_ID\" TEXT NOT NULL ," + // 5: toId
                "\"CHANNEL_ID\" TEXT NOT NULL ," + // 6: channelId
                "\"IMAGE\" TEXT NOT NULL ," + // 7: image
                "\"FROM_NAME\" TEXT NOT NULL ," + // 8: from_name
                "\"CHANNAL_NAME\" TEXT NOT NULL ," + // 9: channal_name
                "\"FROM_ME\" INTEGER NOT NULL ," + // 10: from_me
                "\"IS_SENDED\" INTEGER NOT NULL );"); // 11: is_sended
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBMESSAGE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DBMessage entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getMy_userId());
        stmt.bindString(3, entity.getMessage());
        stmt.bindString(4, entity.getDate());
        stmt.bindString(5, entity.getFromId());
        stmt.bindString(6, entity.getToId());
        stmt.bindString(7, entity.getChannelId());
        stmt.bindString(8, entity.getImage());
        stmt.bindString(9, entity.getFrom_name());
        stmt.bindString(10, entity.getChannal_name());
        stmt.bindLong(11, entity.getFrom_me() ? 1L: 0L);
        stmt.bindLong(12, entity.getIs_sended() ? 1L: 0L);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public DBMessage readEntity(Cursor cursor, int offset) {
        DBMessage entity = new DBMessage( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // my_userId
            cursor.getString(offset + 2), // message
            cursor.getString(offset + 3), // date
            cursor.getString(offset + 4), // fromId
            cursor.getString(offset + 5), // toId
            cursor.getString(offset + 6), // channelId
            cursor.getString(offset + 7), // image
            cursor.getString(offset + 8), // from_name
            cursor.getString(offset + 9), // channal_name
            cursor.getShort(offset + 10) != 0, // from_me
            cursor.getShort(offset + 11) != 0 // is_sended
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DBMessage entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMy_userId(cursor.getString(offset + 1));
        entity.setMessage(cursor.getString(offset + 2));
        entity.setDate(cursor.getString(offset + 3));
        entity.setFromId(cursor.getString(offset + 4));
        entity.setToId(cursor.getString(offset + 5));
        entity.setChannelId(cursor.getString(offset + 6));
        entity.setImage(cursor.getString(offset + 7));
        entity.setFrom_name(cursor.getString(offset + 8));
        entity.setChannal_name(cursor.getString(offset + 9));
        entity.setFrom_me(cursor.getShort(offset + 10) != 0);
        entity.setIs_sended(cursor.getShort(offset + 11) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DBMessage entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(DBMessage entity) {
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
