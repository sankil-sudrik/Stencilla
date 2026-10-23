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
public final class OutfitDao_Impl implements OutfitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OutfitEntity> __insertionAdapterOfOutfitEntity;

  private final EntityDeletionOrUpdateAdapter<OutfitEntity> __deletionAdapterOfOutfitEntity;

  private final SharedSQLiteStatement __preparedStmtOfPruneOldOutfits;

  public OutfitDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutfitEntity = new EntityInsertionAdapter<OutfitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `outfits` (`id`,`occasion`,`itemIds`,`reasoning`,`shoppingSuggestionsJson`,`avatarDescription`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OutfitEntity entity) {
        statement.bindString(1, entity.getId());
        statement.bindString(2, entity.getOccasion());
        statement.bindString(3, entity.getItemIds());
        if (entity.getReasoning() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getReasoning());
        }
        statement.bindString(5, entity.getShoppingSuggestionsJson());
        if (entity.getAvatarDescription() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAvatarDescription());
        }
        statement.bindLong(7, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfOutfitEntity = new EntityDeletionOrUpdateAdapter<OutfitEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `outfits` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OutfitEntity entity) {
        statement.bindString(1, entity.getId());
      }
    };
    this.__preparedStmtOfPruneOldOutfits = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM outfits WHERE id NOT IN (SELECT id FROM outfits ORDER BY createdAt DESC LIMIT 50)";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final OutfitEntity outfit, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOutfitEntity.insert(outfit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final OutfitEntity outfit, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOutfitEntity.handle(outfit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object pruneOldOutfits(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfPruneOldOutfits.acquire();
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
          __preparedStmtOfPruneOldOutfits.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<OutfitEntity>> observeAll() {
    final String _sql = "SELECT * FROM outfits ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"outfits"}, new Callable<List<OutfitEntity>>() {
      @Override
      @NonNull
      public List<OutfitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfItemIds = CursorUtil.getColumnIndexOrThrow(_cursor, "itemIds");
          final int _cursorIndexOfReasoning = CursorUtil.getColumnIndexOrThrow(_cursor, "reasoning");
          final int _cursorIndexOfShoppingSuggestionsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "shoppingSuggestionsJson");
          final int _cursorIndexOfAvatarDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarDescription");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<OutfitEntity> _result = new ArrayList<OutfitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OutfitEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpOccasion;
            _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            final String _tmpItemIds;
            _tmpItemIds = _cursor.getString(_cursorIndexOfItemIds);
            final String _tmpReasoning;
            if (_cursor.isNull(_cursorIndexOfReasoning)) {
              _tmpReasoning = null;
            } else {
              _tmpReasoning = _cursor.getString(_cursorIndexOfReasoning);
            }
            final String _tmpShoppingSuggestionsJson;
            _tmpShoppingSuggestionsJson = _cursor.getString(_cursorIndexOfShoppingSuggestionsJson);
            final String _tmpAvatarDescription;
            if (_cursor.isNull(_cursorIndexOfAvatarDescription)) {
              _tmpAvatarDescription = null;
            } else {
              _tmpAvatarDescription = _cursor.getString(_cursorIndexOfAvatarDescription);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OutfitEntity(_tmpId,_tmpOccasion,_tmpItemIds,_tmpReasoning,_tmpShoppingSuggestionsJson,_tmpAvatarDescription,_tmpCreatedAt);
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
  public Object getAll(final Continuation<? super List<OutfitEntity>> $completion) {
    final String _sql = "SELECT * FROM outfits ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OutfitEntity>>() {
      @Override
      @NonNull
      public List<OutfitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfItemIds = CursorUtil.getColumnIndexOrThrow(_cursor, "itemIds");
          final int _cursorIndexOfReasoning = CursorUtil.getColumnIndexOrThrow(_cursor, "reasoning");
          final int _cursorIndexOfShoppingSuggestionsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "shoppingSuggestionsJson");
          final int _cursorIndexOfAvatarDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarDescription");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<OutfitEntity> _result = new ArrayList<OutfitEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OutfitEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpOccasion;
            _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            final String _tmpItemIds;
            _tmpItemIds = _cursor.getString(_cursorIndexOfItemIds);
            final String _tmpReasoning;
            if (_cursor.isNull(_cursorIndexOfReasoning)) {
              _tmpReasoning = null;
            } else {
              _tmpReasoning = _cursor.getString(_cursorIndexOfReasoning);
            }
            final String _tmpShoppingSuggestionsJson;
            _tmpShoppingSuggestionsJson = _cursor.getString(_cursorIndexOfShoppingSuggestionsJson);
            final String _tmpAvatarDescription;
            if (_cursor.isNull(_cursorIndexOfAvatarDescription)) {
              _tmpAvatarDescription = null;
            } else {
              _tmpAvatarDescription = _cursor.getString(_cursorIndexOfAvatarDescription);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OutfitEntity(_tmpId,_tmpOccasion,_tmpItemIds,_tmpReasoning,_tmpShoppingSuggestionsJson,_tmpAvatarDescription,_tmpCreatedAt);
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
  public Object getById(final String id, final Continuation<? super OutfitEntity> $completion) {
    final String _sql = "SELECT * FROM outfits WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<OutfitEntity>() {
      @Override
      @Nullable
      public OutfitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOccasion = CursorUtil.getColumnIndexOrThrow(_cursor, "occasion");
          final int _cursorIndexOfItemIds = CursorUtil.getColumnIndexOrThrow(_cursor, "itemIds");
          final int _cursorIndexOfReasoning = CursorUtil.getColumnIndexOrThrow(_cursor, "reasoning");
          final int _cursorIndexOfShoppingSuggestionsJson = CursorUtil.getColumnIndexOrThrow(_cursor, "shoppingSuggestionsJson");
          final int _cursorIndexOfAvatarDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarDescription");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final OutfitEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpOccasion;
            _tmpOccasion = _cursor.getString(_cursorIndexOfOccasion);
            final String _tmpItemIds;
            _tmpItemIds = _cursor.getString(_cursorIndexOfItemIds);
            final String _tmpReasoning;
            if (_cursor.isNull(_cursorIndexOfReasoning)) {
              _tmpReasoning = null;
            } else {
              _tmpReasoning = _cursor.getString(_cursorIndexOfReasoning);
            }
            final String _tmpShoppingSuggestionsJson;
            _tmpShoppingSuggestionsJson = _cursor.getString(_cursorIndexOfShoppingSuggestionsJson);
            final String _tmpAvatarDescription;
            if (_cursor.isNull(_cursorIndexOfAvatarDescription)) {
              _tmpAvatarDescription = null;
            } else {
              _tmpAvatarDescription = _cursor.getString(_cursorIndexOfAvatarDescription);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new OutfitEntity(_tmpId,_tmpOccasion,_tmpItemIds,_tmpReasoning,_tmpShoppingSuggestionsJson,_tmpAvatarDescription,_tmpCreatedAt);
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
