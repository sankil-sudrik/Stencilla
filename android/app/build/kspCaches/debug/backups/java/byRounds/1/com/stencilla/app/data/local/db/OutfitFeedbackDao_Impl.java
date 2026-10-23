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
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class OutfitFeedbackDao_Impl implements OutfitFeedbackDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OutfitFeedbackEntity> __insertionAdapterOfOutfitFeedbackEntity;

  private final EntityDeletionOrUpdateAdapter<OutfitFeedbackEntity> __deletionAdapterOfOutfitFeedbackEntity;

  public OutfitFeedbackDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutfitFeedbackEntity = new EntityInsertionAdapter<OutfitFeedbackEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `outfit_feedback` (`outfitId`,`outcome`,`rating`,`reason`,`createdAt`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OutfitFeedbackEntity entity) {
        statement.bindString(1, entity.getOutfitId());
        statement.bindString(2, entity.getOutcome());
        if (entity.getRating() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getRating());
        }
        if (entity.getReason() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getReason());
        }
        statement.bindLong(5, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfOutfitFeedbackEntity = new EntityDeletionOrUpdateAdapter<OutfitFeedbackEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `outfit_feedback` WHERE `outfitId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OutfitFeedbackEntity entity) {
        statement.bindString(1, entity.getOutfitId());
      }
    };
  }

  @Override
  public Object upsert(final OutfitFeedbackEntity feedback,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOutfitFeedbackEntity.insert(feedback);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final OutfitFeedbackEntity feedback,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOutfitFeedbackEntity.handle(feedback);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object recent(final int n,
      final Continuation<? super List<OutfitFeedbackEntity>> $completion) {
    final String _sql = "SELECT * FROM outfit_feedback ORDER BY createdAt DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, n);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OutfitFeedbackEntity>>() {
      @Override
      @NonNull
      public List<OutfitFeedbackEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOutfitId = CursorUtil.getColumnIndexOrThrow(_cursor, "outfitId");
          final int _cursorIndexOfOutcome = CursorUtil.getColumnIndexOrThrow(_cursor, "outcome");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReason = CursorUtil.getColumnIndexOrThrow(_cursor, "reason");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<OutfitFeedbackEntity> _result = new ArrayList<OutfitFeedbackEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OutfitFeedbackEntity _item;
            final String _tmpOutfitId;
            _tmpOutfitId = _cursor.getString(_cursorIndexOfOutfitId);
            final String _tmpOutcome;
            _tmpOutcome = _cursor.getString(_cursorIndexOfOutcome);
            final Integer _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            }
            final String _tmpReason;
            if (_cursor.isNull(_cursorIndexOfReason)) {
              _tmpReason = null;
            } else {
              _tmpReason = _cursor.getString(_cursorIndexOfReason);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OutfitFeedbackEntity(_tmpOutfitId,_tmpOutcome,_tmpRating,_tmpReason,_tmpCreatedAt);
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
  public Object getByOutfitId(final String id,
      final Continuation<? super OutfitFeedbackEntity> $completion) {
    final String _sql = "SELECT * FROM outfit_feedback WHERE outfitId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<OutfitFeedbackEntity>() {
      @Override
      @Nullable
      public OutfitFeedbackEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOutfitId = CursorUtil.getColumnIndexOrThrow(_cursor, "outfitId");
          final int _cursorIndexOfOutcome = CursorUtil.getColumnIndexOrThrow(_cursor, "outcome");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReason = CursorUtil.getColumnIndexOrThrow(_cursor, "reason");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final OutfitFeedbackEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpOutfitId;
            _tmpOutfitId = _cursor.getString(_cursorIndexOfOutfitId);
            final String _tmpOutcome;
            _tmpOutcome = _cursor.getString(_cursorIndexOfOutcome);
            final Integer _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            }
            final String _tmpReason;
            if (_cursor.isNull(_cursorIndexOfReason)) {
              _tmpReason = null;
            } else {
              _tmpReason = _cursor.getString(_cursorIndexOfReason);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new OutfitFeedbackEntity(_tmpOutfitId,_tmpOutcome,_tmpRating,_tmpReason,_tmpCreatedAt);
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
