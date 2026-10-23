package com.stencilla.app.data.local.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PlannerEventDao_Impl implements PlannerEventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlannerEventEntity> __insertionAdapterOfPlannerEventEntity;

  private final EntityDeletionOrUpdateAdapter<PlannerEventEntity> __deletionAdapterOfPlannerEventEntity;

  private final EntityDeletionOrUpdateAdapter<PlannerEventEntity> __updateAdapterOfPlannerEventEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  private final SharedSQLiteStatement __preparedStmtOfSetPlannedOutfitIds;

  public PlannerEventDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlannerEventEntity = new EntityInsertionAdapter<PlannerEventEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `planner_events` (`id`,`serverId`,`title`,`eventDate`,`eventTime`,`occasion`,`dressCode`,`notes`,`plannedOutfitIds`,`isTrip`,`tripEndDate`,`synced`,`createdAt`,`updatedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PlannerEventEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getServerId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getServerId());
        }
        statement.bindString(3, entity.getTitle());
        statement.bindString(4, entity.getEventDate());
        if (entity.getEventTime() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getEventTime());
        }
        if (entity.getOccasion() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getOccasion());
        }
        if (entity.getDressCode() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getDressCode());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNotes());
        }
        if (entity.getPlannedOutfitIds() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getPlannedOutfitIds());
        }
        final int _tmp = entity.isTrip() ? 1 : 0;
        statement.bindLong(10, _tmp);
        if (entity.getTripEndDate() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getTripEndDate());
        }
        final int _tmp_1 = entity.getSynced() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        statement.bindLong(13, entity.getCreatedAt());
        statement.bindLong(14, entity.getUpdatedAt());
      }
    };
    this.__deletionAdapterOfPlannerEventEntity = new EntityDeletionOrUpdateAdapter<PlannerEventEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `planner_events` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PlannerEventEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfPlannerEventEntity = new EntityDeletionOrUpdateAdapter<PlannerEventEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `planner_events` SET `id` = ?,`serverId` = ?,`title` = ?,`eventDate` = ?,`eventTime` = ?,`occasion` = ?,`dressCode` = ?,`notes` = ?,`plannedOutfitIds` = ?,`isTrip` = ?,`tripEndDate` = ?,`synced` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PlannerEventEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getServerId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindLong(2, entity.getServerId());
        }
        statement.bindString(3, entity.getTitle());
        statement.bindString(4, entity.getEventDate());
        if (entity.getEventTime() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getEventTime());
        }
        if (entity.getOccasion() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getOccasion());
        }
        if (entity.getDressCode() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getDressCode());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getNotes());
        }
        if (entity.getPlannedOutfitIds() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getPlannedOutfitIds());
        }
        final int _tmp = entity.isTrip() ? 1 : 0;
        statement.bindLong(10, _tmp);
        if (entity.getTripEndDate() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getTripEndDate());
        }
        final int _tmp_1 = entity.getSynced() ? 1 : 0;
        statement.bindLong(12, _tmp_1);
        statement.bindLong(13, entity.getCreatedAt());
        statement.bindLong(14, entity.getUpdatedAt());
        statement.bindLong(15, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM planner_events WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetPlannedOutfitIds = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE planner_events SET plannedOutfitIds = ?, synced = 0, updatedAt = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final PlannerEventEntity event,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfPlannerEventEntity.insertAndReturnId(event);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final PlannerEventEntity event,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPlannerEventEntity.handle(event);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final PlannerEventEntity event,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPlannerEventEntity.handle(event);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteById(final int id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setPlannedOutfitIds(final int id, final String ids, final long now,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetPlannedOutfitIds.acquire();
        int _argIndex = 1;
        _stmt.bindString(_argIndex, ids);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, now);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, id);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfSetPlannedOutfitIds.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<PlannerEventEntity>> observeAll() {
    final String _sql = "SELECT * FROM planner_events ORDER BY eventDate ASC, eventTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"planner_events"}, new Callable<List<PlannerEventEntity>>() {
      @Override
      @NonNull
      public List<PlannerEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "serverId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
          final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfDressCode = CursorUtil.getColumnIndexOrThrow(_cursor, "dressCode");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfPlannedOutfitIds = CursorUtil.getColumnIndexOrThrow(_cursor, "plannedOutfitIds");
          final int _cursorIndexOfIsTrip = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrip");
          final int _cursorIndexOfTripEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "tripEndDate");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<PlannerEventEntity> _result = new ArrayList<PlannerEventEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PlannerEventEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpServerId;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServerId = null;
            } else {
              _tmpServerId = _cursor.getInt(_cursorIndexOfServerId);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpEventDate;
            _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
            final String _tmpEventTime;
            if (_cursor.isNull(_cursorIndexOfEventTime)) {
              _tmpEventTime = null;
            } else {
              _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
            }
            final String _tmpOccasion;
            if (_cursor.isNull(_cursorIndexOfOccasion)) {
              _tmpOccasion = null;
            } else {
              _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            }
            final String _tmpDressCode;
            if (_cursor.isNull(_cursorIndexOfDressCode)) {
              _tmpDressCode = null;
            } else {
              _tmpDressCode = _cursor.getString(_cursorIndexOfDressCode);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final String _tmpPlannedOutfitIds;
            if (_cursor.isNull(_cursorIndexOfPlannedOutfitIds)) {
              _tmpPlannedOutfitIds = null;
            } else {
              _tmpPlannedOutfitIds = _cursor.getString(_cursorIndexOfPlannedOutfitIds);
            }
            final boolean _tmpIsTrip;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTrip);
            _tmpIsTrip = _tmp != 0;
            final String _tmpTripEndDate;
            if (_cursor.isNull(_cursorIndexOfTripEndDate)) {
              _tmpTripEndDate = null;
            } else {
              _tmpTripEndDate = _cursor.getString(_cursorIndexOfTripEndDate);
            }
            final boolean _tmpSynced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            _tmpSynced = _tmp_1 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new PlannerEventEntity(_tmpId,_tmpServerId,_tmpTitle,_tmpEventDate,_tmpEventTime,_tmpOccasion,_tmpDressCode,_tmpNotes,_tmpPlannedOutfitIds,_tmpIsTrip,_tmpTripEndDate,_tmpSynced,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAll(final Continuation<? super List<PlannerEventEntity>> $completion) {
    final String _sql = "SELECT * FROM planner_events ORDER BY eventDate ASC, eventTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PlannerEventEntity>>() {
      @Override
      @NonNull
      public List<PlannerEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "serverId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
          final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfDressCode = CursorUtil.getColumnIndexOrThrow(_cursor, "dressCode");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfPlannedOutfitIds = CursorUtil.getColumnIndexOrThrow(_cursor, "plannedOutfitIds");
          final int _cursorIndexOfIsTrip = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrip");
          final int _cursorIndexOfTripEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "tripEndDate");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<PlannerEventEntity> _result = new ArrayList<PlannerEventEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PlannerEventEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpServerId;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServerId = null;
            } else {
              _tmpServerId = _cursor.getInt(_cursorIndexOfServerId);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpEventDate;
            _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
            final String _tmpEventTime;
            if (_cursor.isNull(_cursorIndexOfEventTime)) {
              _tmpEventTime = null;
            } else {
              _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
            }
            final String _tmpOccasion;
            if (_cursor.isNull(_cursorIndexOfOccasion)) {
              _tmpOccasion = null;
            } else {
              _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            }
            final String _tmpDressCode;
            if (_cursor.isNull(_cursorIndexOfDressCode)) {
              _tmpDressCode = null;
            } else {
              _tmpDressCode = _cursor.getString(_cursorIndexOfDressCode);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final String _tmpPlannedOutfitIds;
            if (_cursor.isNull(_cursorIndexOfPlannedOutfitIds)) {
              _tmpPlannedOutfitIds = null;
            } else {
              _tmpPlannedOutfitIds = _cursor.getString(_cursorIndexOfPlannedOutfitIds);
            }
            final boolean _tmpIsTrip;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTrip);
            _tmpIsTrip = _tmp != 0;
            final String _tmpTripEndDate;
            if (_cursor.isNull(_cursorIndexOfTripEndDate)) {
              _tmpTripEndDate = null;
            } else {
              _tmpTripEndDate = _cursor.getString(_cursorIndexOfTripEndDate);
            }
            final boolean _tmpSynced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            _tmpSynced = _tmp_1 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new PlannerEventEntity(_tmpId,_tmpServerId,_tmpTitle,_tmpEventDate,_tmpEventTime,_tmpOccasion,_tmpDressCode,_tmpNotes,_tmpPlannedOutfitIds,_tmpIsTrip,_tmpTripEndDate,_tmpSynced,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getUpcoming(final String fromDate,
      final Continuation<? super List<PlannerEventEntity>> $completion) {
    final String _sql = "SELECT * FROM planner_events WHERE eventDate >= ? ORDER BY eventDate ASC, eventTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, fromDate);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PlannerEventEntity>>() {
      @Override
      @NonNull
      public List<PlannerEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "serverId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
          final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfDressCode = CursorUtil.getColumnIndexOrThrow(_cursor, "dressCode");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfPlannedOutfitIds = CursorUtil.getColumnIndexOrThrow(_cursor, "plannedOutfitIds");
          final int _cursorIndexOfIsTrip = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrip");
          final int _cursorIndexOfTripEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "tripEndDate");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<PlannerEventEntity> _result = new ArrayList<PlannerEventEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PlannerEventEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpServerId;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServerId = null;
            } else {
              _tmpServerId = _cursor.getInt(_cursorIndexOfServerId);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpEventDate;
            _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
            final String _tmpEventTime;
            if (_cursor.isNull(_cursorIndexOfEventTime)) {
              _tmpEventTime = null;
            } else {
              _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
            }
            final String _tmpOccasion;
            if (_cursor.isNull(_cursorIndexOfOccasion)) {
              _tmpOccasion = null;
            } else {
              _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            }
            final String _tmpDressCode;
            if (_cursor.isNull(_cursorIndexOfDressCode)) {
              _tmpDressCode = null;
            } else {
              _tmpDressCode = _cursor.getString(_cursorIndexOfDressCode);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final String _tmpPlannedOutfitIds;
            if (_cursor.isNull(_cursorIndexOfPlannedOutfitIds)) {
              _tmpPlannedOutfitIds = null;
            } else {
              _tmpPlannedOutfitIds = _cursor.getString(_cursorIndexOfPlannedOutfitIds);
            }
            final boolean _tmpIsTrip;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTrip);
            _tmpIsTrip = _tmp != 0;
            final String _tmpTripEndDate;
            if (_cursor.isNull(_cursorIndexOfTripEndDate)) {
              _tmpTripEndDate = null;
            } else {
              _tmpTripEndDate = _cursor.getString(_cursorIndexOfTripEndDate);
            }
            final boolean _tmpSynced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            _tmpSynced = _tmp_1 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new PlannerEventEntity(_tmpId,_tmpServerId,_tmpTitle,_tmpEventDate,_tmpEventTime,_tmpOccasion,_tmpDressCode,_tmpNotes,_tmpPlannedOutfitIds,_tmpIsTrip,_tmpTripEndDate,_tmpSynced,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByMonth(final String yearMonth,
      final Continuation<? super List<PlannerEventEntity>> $completion) {
    final String _sql = "SELECT * FROM planner_events WHERE eventDate LIKE ? || '%' ORDER BY eventDate ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, yearMonth);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PlannerEventEntity>>() {
      @Override
      @NonNull
      public List<PlannerEventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "serverId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
          final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfDressCode = CursorUtil.getColumnIndexOrThrow(_cursor, "dressCode");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfPlannedOutfitIds = CursorUtil.getColumnIndexOrThrow(_cursor, "plannedOutfitIds");
          final int _cursorIndexOfIsTrip = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrip");
          final int _cursorIndexOfTripEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "tripEndDate");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final List<PlannerEventEntity> _result = new ArrayList<PlannerEventEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final PlannerEventEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpServerId;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServerId = null;
            } else {
              _tmpServerId = _cursor.getInt(_cursorIndexOfServerId);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpEventDate;
            _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
            final String _tmpEventTime;
            if (_cursor.isNull(_cursorIndexOfEventTime)) {
              _tmpEventTime = null;
            } else {
              _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
            }
            final String _tmpOccasion;
            if (_cursor.isNull(_cursorIndexOfOccasion)) {
              _tmpOccasion = null;
            } else {
              _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            }
            final String _tmpDressCode;
            if (_cursor.isNull(_cursorIndexOfDressCode)) {
              _tmpDressCode = null;
            } else {
              _tmpDressCode = _cursor.getString(_cursorIndexOfDressCode);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final String _tmpPlannedOutfitIds;
            if (_cursor.isNull(_cursorIndexOfPlannedOutfitIds)) {
              _tmpPlannedOutfitIds = null;
            } else {
              _tmpPlannedOutfitIds = _cursor.getString(_cursorIndexOfPlannedOutfitIds);
            }
            final boolean _tmpIsTrip;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTrip);
            _tmpIsTrip = _tmp != 0;
            final String _tmpTripEndDate;
            if (_cursor.isNull(_cursorIndexOfTripEndDate)) {
              _tmpTripEndDate = null;
            } else {
              _tmpTripEndDate = _cursor.getString(_cursorIndexOfTripEndDate);
            }
            final boolean _tmpSynced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            _tmpSynced = _tmp_1 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new PlannerEventEntity(_tmpId,_tmpServerId,_tmpTitle,_tmpEventDate,_tmpEventTime,_tmpOccasion,_tmpDressCode,_tmpNotes,_tmpPlannedOutfitIds,_tmpIsTrip,_tmpTripEndDate,_tmpSynced,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final int id, final Continuation<? super PlannerEventEntity> $completion) {
    final String _sql = "SELECT * FROM planner_events WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PlannerEventEntity>() {
      @Override
      @Nullable
      public PlannerEventEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfServerId = CursorUtil.getColumnIndexOrThrow(_cursor, "serverId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
          final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfDressCode = CursorUtil.getColumnIndexOrThrow(_cursor, "dressCode");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfPlannedOutfitIds = CursorUtil.getColumnIndexOrThrow(_cursor, "plannedOutfitIds");
          final int _cursorIndexOfIsTrip = CursorUtil.getColumnIndexOrThrow(_cursor, "isTrip");
          final int _cursorIndexOfTripEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "tripEndDate");
          final int _cursorIndexOfSynced = CursorUtil.getColumnIndexOrThrow(_cursor, "synced");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final PlannerEventEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpServerId;
            if (_cursor.isNull(_cursorIndexOfServerId)) {
              _tmpServerId = null;
            } else {
              _tmpServerId = _cursor.getInt(_cursorIndexOfServerId);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpEventDate;
            _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
            final String _tmpEventTime;
            if (_cursor.isNull(_cursorIndexOfEventTime)) {
              _tmpEventTime = null;
            } else {
              _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
            }
            final String _tmpOccasion;
            if (_cursor.isNull(_cursorIndexOfOccasion)) {
              _tmpOccasion = null;
            } else {
              _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            }
            final String _tmpDressCode;
            if (_cursor.isNull(_cursorIndexOfDressCode)) {
              _tmpDressCode = null;
            } else {
              _tmpDressCode = _cursor.getString(_cursorIndexOfDressCode);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final String _tmpPlannedOutfitIds;
            if (_cursor.isNull(_cursorIndexOfPlannedOutfitIds)) {
              _tmpPlannedOutfitIds = null;
            } else {
              _tmpPlannedOutfitIds = _cursor.getString(_cursorIndexOfPlannedOutfitIds);
            }
            final boolean _tmpIsTrip;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTrip);
            _tmpIsTrip = _tmp != 0;
            final String _tmpTripEndDate;
            if (_cursor.isNull(_cursorIndexOfTripEndDate)) {
              _tmpTripEndDate = null;
            } else {
              _tmpTripEndDate = _cursor.getString(_cursorIndexOfTripEndDate);
            }
            final boolean _tmpSynced;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfSynced);
            _tmpSynced = _tmp_1 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _result = new PlannerEventEntity(_tmpId,_tmpServerId,_tmpTitle,_tmpEventDate,_tmpEventTime,_tmpOccasion,_tmpDressCode,_tmpNotes,_tmpPlannedOutfitIds,_tmpIsTrip,_tmpTripEndDate,_tmpSynced,_tmpCreatedAt,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
