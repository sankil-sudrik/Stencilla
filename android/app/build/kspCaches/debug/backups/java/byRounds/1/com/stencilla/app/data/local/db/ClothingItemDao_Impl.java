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
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
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
public final class ClothingItemDao_Impl implements ClothingItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClothingItemEntity> __insertionAdapterOfClothingItemEntity;

  private final EntityDeletionOrUpdateAdapter<ClothingItemEntity> __deletionAdapterOfClothingItemEntity;

  private final EntityDeletionOrUpdateAdapter<ClothingItemEntity> __updateAdapterOfClothingItemEntity;

  private final SharedSQLiteStatement __preparedStmtOfRecordWear;

  private final SharedSQLiteStatement __preparedStmtOfSetFavorite;

  public ClothingItemDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClothingItemEntity = new EntityInsertionAdapter<ClothingItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `clothing_items` (`id`,`localImagePath`,`onDeviceLabel`,`category`,`subcategory`,`colorPrimary`,`colorSecondary`,`pattern`,`formality`,`season`,`material`,`fit`,`brand`,`size`,`condition`,`availability`,`laundryState`,`additionalPhotoPaths`,`repairNote`,`aiImageDescription`,`needsClarification`,`clarificationQuestion`,`aiTagged`,`wearCount`,`lastWornAt`,`isFavorite`,`purchasePriceCents`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClothingItemEntity entity) {
        statement.bindString(1, entity.getId());
        statement.bindString(2, entity.getLocalImagePath());
        if (entity.getOnDeviceLabel() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOnDeviceLabel());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCategory());
        }
        if (entity.getSubcategory() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSubcategory());
        }
        if (entity.getColorPrimary() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getColorPrimary());
        }
        if (entity.getColorSecondary() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getColorSecondary());
        }
        if (entity.getPattern() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getPattern());
        }
        if (entity.getFormality() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getFormality());
        }
        if (entity.getSeason() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getSeason());
        }
        if (entity.getMaterial() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMaterial());
        }
        if (entity.getFit() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getFit());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getBrand());
        }
        if (entity.getSize() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getSize());
        }
        if (entity.getCondition() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getCondition());
        }
        statement.bindString(16, entity.getAvailability());
        statement.bindString(17, entity.getLaundryState());
        statement.bindString(18, entity.getAdditionalPhotoPaths());
        if (entity.getRepairNote() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getRepairNote());
        }
        if (entity.getAiImageDescription() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getAiImageDescription());
        }
        final int _tmp = entity.getNeedsClarification() ? 1 : 0;
        statement.bindLong(21, _tmp);
        if (entity.getClarificationQuestion() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getClarificationQuestion());
        }
        final int _tmp_1 = entity.getAiTagged() ? 1 : 0;
        statement.bindLong(23, _tmp_1);
        statement.bindLong(24, entity.getWearCount());
        if (entity.getLastWornAt() == null) {
          statement.bindNull(25);
        } else {
          statement.bindLong(25, entity.getLastWornAt());
        }
        final int _tmp_2 = entity.isFavorite() ? 1 : 0;
        statement.bindLong(26, _tmp_2);
        if (entity.getPurchasePriceCents() == null) {
          statement.bindNull(27);
        } else {
          statement.bindLong(27, entity.getPurchasePriceCents());
        }
        statement.bindLong(28, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfClothingItemEntity = new EntityDeletionOrUpdateAdapter<ClothingItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `clothing_items` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClothingItemEntity entity) {
        statement.bindString(1, entity.getId());
      }
    };
    this.__updateAdapterOfClothingItemEntity = new EntityDeletionOrUpdateAdapter<ClothingItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `clothing_items` SET `id` = ?,`localImagePath` = ?,`onDeviceLabel` = ?,`category` = ?,`subcategory` = ?,`colorPrimary` = ?,`colorSecondary` = ?,`pattern` = ?,`formality` = ?,`season` = ?,`material` = ?,`fit` = ?,`brand` = ?,`size` = ?,`condition` = ?,`availability` = ?,`laundryState` = ?,`additionalPhotoPaths` = ?,`repairNote` = ?,`aiImageDescription` = ?,`needsClarification` = ?,`clarificationQuestion` = ?,`aiTagged` = ?,`wearCount` = ?,`lastWornAt` = ?,`isFavorite` = ?,`purchasePriceCents` = ?,`createdAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClothingItemEntity entity) {
        statement.bindString(1, entity.getId());
        statement.bindString(2, entity.getLocalImagePath());
        if (entity.getOnDeviceLabel() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOnDeviceLabel());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCategory());
        }
        if (entity.getSubcategory() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSubcategory());
        }
        if (entity.getColorPrimary() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getColorPrimary());
        }
        if (entity.getColorSecondary() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getColorSecondary());
        }
        if (entity.getPattern() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getPattern());
        }
        if (entity.getFormality() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getFormality());
        }
        if (entity.getSeason() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getSeason());
        }
        if (entity.getMaterial() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getMaterial());
        }
        if (entity.getFit() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getFit());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getBrand());
        }
        if (entity.getSize() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getSize());
        }
        if (entity.getCondition() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getCondition());
        }
        statement.bindString(16, entity.getAvailability());
        statement.bindString(17, entity.getLaundryState());
        statement.bindString(18, entity.getAdditionalPhotoPaths());
        if (entity.getRepairNote() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getRepairNote());
        }
        if (entity.getAiImageDescription() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getAiImageDescription());
        }
        final int _tmp = entity.getNeedsClarification() ? 1 : 0;
        statement.bindLong(21, _tmp);
        if (entity.getClarificationQuestion() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getClarificationQuestion());
        }
        final int _tmp_1 = entity.getAiTagged() ? 1 : 0;
        statement.bindLong(23, _tmp_1);
        statement.bindLong(24, entity.getWearCount());
        if (entity.getLastWornAt() == null) {
          statement.bindNull(25);
        } else {
          statement.bindLong(25, entity.getLastWornAt());
        }
        final int _tmp_2 = entity.isFavorite() ? 1 : 0;
        statement.bindLong(26, _tmp_2);
        if (entity.getPurchasePriceCents() == null) {
          statement.bindNull(27);
        } else {
          statement.bindLong(27, entity.getPurchasePriceCents());
        }
        statement.bindLong(28, entity.getCreatedAt());
        statement.bindString(29, entity.getId());
      }
    };
    this.__preparedStmtOfRecordWear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE clothing_items SET wearCount = wearCount + 1, lastWornAt = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetFavorite = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE clothing_items SET isFavorite = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ClothingItemEntity item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClothingItemEntity.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final ClothingItemEntity item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfClothingItemEntity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final ClothingItemEntity item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfClothingItemEntity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object recordWear(final String id, final long wornAt,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRecordWear.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, wornAt);
        _argIndex = 2;
        _stmt.bindString(_argIndex, id);
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
          __preparedStmtOfRecordWear.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setFavorite(final String id, final boolean favorite,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetFavorite.acquire();
        int _argIndex = 1;
        final int _tmp = favorite ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindString(_argIndex, id);
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
          __preparedStmtOfSetFavorite.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ClothingItemEntity>> observeAll() {
    final String _sql = "SELECT * FROM clothing_items ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"clothing_items"}, new Callable<List<ClothingItemEntity>>() {
      @Override
      @NonNull
      public List<ClothingItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ClothingItemEntity> _result = new ArrayList<ClothingItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClothingItemEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
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
  public Object getAll(final Continuation<? super List<ClothingItemEntity>> $completion) {
    final String _sql = "SELECT * FROM clothing_items ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ClothingItemEntity>>() {
      @Override
      @NonNull
      public List<ClothingItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ClothingItemEntity> _result = new ArrayList<ClothingItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClothingItemEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
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
  public Flow<List<ClothingItemEntity>> observeByCategory(final String category) {
    final String _sql = "SELECT * FROM clothing_items WHERE category = ? ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, category);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"clothing_items"}, new Callable<List<ClothingItemEntity>>() {
      @Override
      @NonNull
      public List<ClothingItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ClothingItemEntity> _result = new ArrayList<ClothingItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClothingItemEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
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
  public Object getByIds(final List<String> ids,
      final Continuation<? super List<ClothingItemEntity>> $completion) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM clothing_items WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : ids) {
      _statement.bindString(_argIndex, _item);
      _argIndex++;
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ClothingItemEntity>>() {
      @Override
      @NonNull
      public List<ClothingItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ClothingItemEntity> _result = new ArrayList<ClothingItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClothingItemEntity _item_1;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item_1 = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
            _result.add(_item_1);
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
  public Object getById(final String id,
      final Continuation<? super ClothingItemEntity> $completion) {
    final String _sql = "SELECT * FROM clothing_items WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ClothingItemEntity>() {
      @Override
      @Nullable
      public ClothingItemEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final ClothingItemEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
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

  @Override
  public Object getAllForAnalytics(
      final Continuation<? super List<ClothingItemEntity>> $completion) {
    final String _sql = "SELECT * FROM clothing_items ORDER BY wearCount ASC, lastWornAt ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ClothingItemEntity>>() {
      @Override
      @NonNull
      public List<ClothingItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLocalImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "localImagePath");
          final int _cursorIndexOfOnDeviceLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "onDeviceLabel");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfSubcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "subcategory");
          final int _cursorIndexOfColorPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorPrimary");
          final int _cursorIndexOfColorSecondary = CursorUtil.getColumnIndexOrThrow(_cursor, "colorSecondary");
          final int _cursorIndexOfPattern = CursorUtil.getColumnIndexOrThrow(_cursor, "pattern");
          final int _cursorIndexOfFormality = CursorUtil.getColumnIndexOrThrow(_cursor, "formality");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfFit = CursorUtil.getColumnIndexOrThrow(_cursor, "fit");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfCondition = CursorUtil.getColumnIndexOrThrow(_cursor, "condition");
          final int _cursorIndexOfAvailability = CursorUtil.getColumnIndexOrThrow(_cursor, "availability");
          final int _cursorIndexOfLaundryState = CursorUtil.getColumnIndexOrThrow(_cursor, "laundryState");
          final int _cursorIndexOfAdditionalPhotoPaths = CursorUtil.getColumnIndexOrThrow(_cursor, "additionalPhotoPaths");
          final int _cursorIndexOfRepairNote = CursorUtil.getColumnIndexOrThrow(_cursor, "repairNote");
          final int _cursorIndexOfAiImageDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "aiImageDescription");
          final int _cursorIndexOfNeedsClarification = CursorUtil.getColumnIndexOrThrow(_cursor, "needsClarification");
          final int _cursorIndexOfClarificationQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "clarificationQuestion");
          final int _cursorIndexOfAiTagged = CursorUtil.getColumnIndexOrThrow(_cursor, "aiTagged");
          final int _cursorIndexOfWearCount = CursorUtil.getColumnIndexOrThrow(_cursor, "wearCount");
          final int _cursorIndexOfLastWornAt = CursorUtil.getColumnIndexOrThrow(_cursor, "lastWornAt");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfPurchasePriceCents = CursorUtil.getColumnIndexOrThrow(_cursor, "purchasePriceCents");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<ClothingItemEntity> _result = new ArrayList<ClothingItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClothingItemEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpLocalImagePath;
            _tmpLocalImagePath = _cursor.getString(_cursorIndexOfLocalImagePath);
            final String _tmpOnDeviceLabel;
            if (_cursor.isNull(_cursorIndexOfOnDeviceLabel)) {
              _tmpOnDeviceLabel = null;
            } else {
              _tmpOnDeviceLabel = _cursor.getString(_cursorIndexOfOnDeviceLabel);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpSubcategory;
            if (_cursor.isNull(_cursorIndexOfSubcategory)) {
              _tmpSubcategory = null;
            } else {
              _tmpSubcategory = _cursor.getString(_cursorIndexOfSubcategory);
            }
            final String _tmpColorPrimary;
            if (_cursor.isNull(_cursorIndexOfColorPrimary)) {
              _tmpColorPrimary = null;
            } else {
              _tmpColorPrimary = _cursor.getString(_cursorIndexOfColorPrimary);
            }
            final String _tmpColorSecondary;
            if (_cursor.isNull(_cursorIndexOfColorSecondary)) {
              _tmpColorSecondary = null;
            } else {
              _tmpColorSecondary = _cursor.getString(_cursorIndexOfColorSecondary);
            }
            final String _tmpPattern;
            if (_cursor.isNull(_cursorIndexOfPattern)) {
              _tmpPattern = null;
            } else {
              _tmpPattern = _cursor.getString(_cursorIndexOfPattern);
            }
            final String _tmpFormality;
            if (_cursor.isNull(_cursorIndexOfFormality)) {
              _tmpFormality = null;
            } else {
              _tmpFormality = _cursor.getString(_cursorIndexOfFormality);
            }
            final String _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getString(_cursorIndexOfSeason);
            }
            final String _tmpMaterial;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmpMaterial = null;
            } else {
              _tmpMaterial = _cursor.getString(_cursorIndexOfMaterial);
            }
            final String _tmpFit;
            if (_cursor.isNull(_cursorIndexOfFit)) {
              _tmpFit = null;
            } else {
              _tmpFit = _cursor.getString(_cursorIndexOfFit);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final String _tmpSize;
            if (_cursor.isNull(_cursorIndexOfSize)) {
              _tmpSize = null;
            } else {
              _tmpSize = _cursor.getString(_cursorIndexOfSize);
            }
            final String _tmpCondition;
            if (_cursor.isNull(_cursorIndexOfCondition)) {
              _tmpCondition = null;
            } else {
              _tmpCondition = _cursor.getString(_cursorIndexOfCondition);
            }
            final String _tmpAvailability;
            _tmpAvailability = _cursor.getString(_cursorIndexOfAvailability);
            final String _tmpLaundryState;
            _tmpLaundryState = _cursor.getString(_cursorIndexOfLaundryState);
            final String _tmpAdditionalPhotoPaths;
            _tmpAdditionalPhotoPaths = _cursor.getString(_cursorIndexOfAdditionalPhotoPaths);
            final String _tmpRepairNote;
            if (_cursor.isNull(_cursorIndexOfRepairNote)) {
              _tmpRepairNote = null;
            } else {
              _tmpRepairNote = _cursor.getString(_cursorIndexOfRepairNote);
            }
            final String _tmpAiImageDescription;
            if (_cursor.isNull(_cursorIndexOfAiImageDescription)) {
              _tmpAiImageDescription = null;
            } else {
              _tmpAiImageDescription = _cursor.getString(_cursorIndexOfAiImageDescription);
            }
            final boolean _tmpNeedsClarification;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfNeedsClarification);
            _tmpNeedsClarification = _tmp != 0;
            final String _tmpClarificationQuestion;
            if (_cursor.isNull(_cursorIndexOfClarificationQuestion)) {
              _tmpClarificationQuestion = null;
            } else {
              _tmpClarificationQuestion = _cursor.getString(_cursorIndexOfClarificationQuestion);
            }
            final boolean _tmpAiTagged;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfAiTagged);
            _tmpAiTagged = _tmp_1 != 0;
            final int _tmpWearCount;
            _tmpWearCount = _cursor.getInt(_cursorIndexOfWearCount);
            final Long _tmpLastWornAt;
            if (_cursor.isNull(_cursorIndexOfLastWornAt)) {
              _tmpLastWornAt = null;
            } else {
              _tmpLastWornAt = _cursor.getLong(_cursorIndexOfLastWornAt);
            }
            final boolean _tmpIsFavorite;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_2 != 0;
            final Integer _tmpPurchasePriceCents;
            if (_cursor.isNull(_cursorIndexOfPurchasePriceCents)) {
              _tmpPurchasePriceCents = null;
            } else {
              _tmpPurchasePriceCents = _cursor.getInt(_cursorIndexOfPurchasePriceCents);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ClothingItemEntity(_tmpId,_tmpLocalImagePath,_tmpOnDeviceLabel,_tmpCategory,_tmpSubcategory,_tmpColorPrimary,_tmpColorSecondary,_tmpPattern,_tmpFormality,_tmpSeason,_tmpMaterial,_tmpFit,_tmpBrand,_tmpSize,_tmpCondition,_tmpAvailability,_tmpLaundryState,_tmpAdditionalPhotoPaths,_tmpRepairNote,_tmpAiImageDescription,_tmpNeedsClarification,_tmpClarificationQuestion,_tmpAiTagged,_tmpWearCount,_tmpLastWornAt,_tmpIsFavorite,_tmpPurchasePriceCents,_tmpCreatedAt);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
