package com.stencilla.app.data.local.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StencillaDatabase_Impl extends StencillaDatabase {
  private volatile ClothingItemDao _clothingItemDao;

  private volatile OutfitDao _outfitDao;

  private volatile OutfitFeedbackDao _outfitFeedbackDao;

  private volatile StyleNoteDao _styleNoteDao;

  private volatile PlannerEventDao _plannerEventDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(7) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `clothing_items` (`id` TEXT NOT NULL, `localImagePath` TEXT NOT NULL, `onDeviceLabel` TEXT, `category` TEXT, `subcategory` TEXT, `colorPrimary` TEXT, `colorSecondary` TEXT, `pattern` TEXT, `formality` TEXT, `season` TEXT, `material` TEXT, `fit` TEXT, `brand` TEXT, `size` TEXT, `condition` TEXT, `availability` TEXT NOT NULL, `laundryState` TEXT NOT NULL, `additionalPhotoPaths` TEXT NOT NULL, `repairNote` TEXT, `aiImageDescription` TEXT, `needsClarification` INTEGER NOT NULL, `clarificationQuestion` TEXT, `aiTagged` INTEGER NOT NULL, `wearCount` INTEGER NOT NULL, `lastWornAt` INTEGER, `isFavorite` INTEGER NOT NULL, `purchasePriceCents` INTEGER, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `outfits` (`id` TEXT NOT NULL, `occasion` TEXT NOT NULL, `itemIds` TEXT NOT NULL, `reasoning` TEXT, `shoppingSuggestionsJson` TEXT NOT NULL, `avatarDescription` TEXT, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `outfit_feedback` (`outfitId` TEXT NOT NULL, `outcome` TEXT NOT NULL, `rating` INTEGER, `reason` TEXT, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`outfitId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `style_notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serverId` INTEGER, `title` TEXT NOT NULL, `body` TEXT, `tags` TEXT, `synced` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `planner_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serverId` INTEGER, `title` TEXT NOT NULL, `eventDate` TEXT NOT NULL, `eventTime` TEXT, `occasion` TEXT, `dressCode` TEXT, `notes` TEXT, `plannedOutfitIds` TEXT, `isTrip` INTEGER NOT NULL, `tripEndDate` TEXT, `synced` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '231d158688e33ce13c901649b6fda260')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `clothing_items`");
        db.execSQL("DROP TABLE IF EXISTS `outfits`");
        db.execSQL("DROP TABLE IF EXISTS `outfit_feedback`");
        db.execSQL("DROP TABLE IF EXISTS `style_notes`");
        db.execSQL("DROP TABLE IF EXISTS `planner_events`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsClothingItems = new HashMap<String, TableInfo.Column>(28);
        _columnsClothingItems.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("localImagePath", new TableInfo.Column("localImagePath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("onDeviceLabel", new TableInfo.Column("onDeviceLabel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("subcategory", new TableInfo.Column("subcategory", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("colorPrimary", new TableInfo.Column("colorPrimary", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("colorSecondary", new TableInfo.Column("colorSecondary", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("pattern", new TableInfo.Column("pattern", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("formality", new TableInfo.Column("formality", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("season", new TableInfo.Column("season", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("material", new TableInfo.Column("material", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("fit", new TableInfo.Column("fit", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("brand", new TableInfo.Column("brand", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("size", new TableInfo.Column("size", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("condition", new TableInfo.Column("condition", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("availability", new TableInfo.Column("availability", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("laundryState", new TableInfo.Column("laundryState", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("additionalPhotoPaths", new TableInfo.Column("additionalPhotoPaths", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("repairNote", new TableInfo.Column("repairNote", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("aiImageDescription", new TableInfo.Column("aiImageDescription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("needsClarification", new TableInfo.Column("needsClarification", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("clarificationQuestion", new TableInfo.Column("clarificationQuestion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("aiTagged", new TableInfo.Column("aiTagged", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("wearCount", new TableInfo.Column("wearCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("lastWornAt", new TableInfo.Column("lastWornAt", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("purchasePriceCents", new TableInfo.Column("purchasePriceCents", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothingItems.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClothingItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesClothingItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoClothingItems = new TableInfo("clothing_items", _columnsClothingItems, _foreignKeysClothingItems, _indicesClothingItems);
        final TableInfo _existingClothingItems = TableInfo.read(db, "clothing_items");
        if (!_infoClothingItems.equals(_existingClothingItems)) {
          return new RoomOpenHelper.ValidationResult(false, "clothing_items(com.stencilla.app.data.local.db.ClothingItemEntity).\n"
                  + " Expected:\n" + _infoClothingItems + "\n"
                  + " Found:\n" + _existingClothingItems);
        }
        final HashMap<String, TableInfo.Column> _columnsOutfits = new HashMap<String, TableInfo.Column>(7);
        _columnsOutfits.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("occasion", new TableInfo.Column("occasion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("itemIds", new TableInfo.Column("itemIds", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("reasoning", new TableInfo.Column("reasoning", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("shoppingSuggestionsJson", new TableInfo.Column("shoppingSuggestionsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("avatarDescription", new TableInfo.Column("avatarDescription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfits.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutfits = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutfits = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutfits = new TableInfo("outfits", _columnsOutfits, _foreignKeysOutfits, _indicesOutfits);
        final TableInfo _existingOutfits = TableInfo.read(db, "outfits");
        if (!_infoOutfits.equals(_existingOutfits)) {
          return new RoomOpenHelper.ValidationResult(false, "outfits(com.stencilla.app.data.local.db.OutfitEntity).\n"
                  + " Expected:\n" + _infoOutfits + "\n"
                  + " Found:\n" + _existingOutfits);
        }
        final HashMap<String, TableInfo.Column> _columnsOutfitFeedback = new HashMap<String, TableInfo.Column>(5);
        _columnsOutfitFeedback.put("outfitId", new TableInfo.Column("outfitId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfitFeedback.put("outcome", new TableInfo.Column("outcome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfitFeedback.put("rating", new TableInfo.Column("rating", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfitFeedback.put("reason", new TableInfo.Column("reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfitFeedback.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutfitFeedback = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutfitFeedback = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutfitFeedback = new TableInfo("outfit_feedback", _columnsOutfitFeedback, _foreignKeysOutfitFeedback, _indicesOutfitFeedback);
        final TableInfo _existingOutfitFeedback = TableInfo.read(db, "outfit_feedback");
        if (!_infoOutfitFeedback.equals(_existingOutfitFeedback)) {
          return new RoomOpenHelper.ValidationResult(false, "outfit_feedback(com.stencilla.app.data.local.db.OutfitFeedbackEntity).\n"
                  + " Expected:\n" + _infoOutfitFeedback + "\n"
                  + " Found:\n" + _existingOutfitFeedback);
        }
        final HashMap<String, TableInfo.Column> _columnsStyleNotes = new HashMap<String, TableInfo.Column>(8);
        _columnsStyleNotes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("serverId", new TableInfo.Column("serverId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("body", new TableInfo.Column("body", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStyleNotes.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStyleNotes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStyleNotes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStyleNotes = new TableInfo("style_notes", _columnsStyleNotes, _foreignKeysStyleNotes, _indicesStyleNotes);
        final TableInfo _existingStyleNotes = TableInfo.read(db, "style_notes");
        if (!_infoStyleNotes.equals(_existingStyleNotes)) {
          return new RoomOpenHelper.ValidationResult(false, "style_notes(com.stencilla.app.data.local.db.StyleNoteEntity).\n"
                  + " Expected:\n" + _infoStyleNotes + "\n"
                  + " Found:\n" + _existingStyleNotes);
        }
        final HashMap<String, TableInfo.Column> _columnsPlannerEvents = new HashMap<String, TableInfo.Column>(14);
        _columnsPlannerEvents.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("serverId", new TableInfo.Column("serverId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("eventDate", new TableInfo.Column("eventDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("eventTime", new TableInfo.Column("eventTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("occasion", new TableInfo.Column("occasion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("dressCode", new TableInfo.Column("dressCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("plannedOutfitIds", new TableInfo.Column("plannedOutfitIds", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("isTrip", new TableInfo.Column("isTrip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("tripEndDate", new TableInfo.Column("tripEndDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("synced", new TableInfo.Column("synced", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlannerEvents.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlannerEvents = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlannerEvents = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlannerEvents = new TableInfo("planner_events", _columnsPlannerEvents, _foreignKeysPlannerEvents, _indicesPlannerEvents);
        final TableInfo _existingPlannerEvents = TableInfo.read(db, "planner_events");
        if (!_infoPlannerEvents.equals(_existingPlannerEvents)) {
          return new RoomOpenHelper.ValidationResult(false, "planner_events(com.stencilla.app.data.local.db.PlannerEventEntity).\n"
                  + " Expected:\n" + _infoPlannerEvents + "\n"
                  + " Found:\n" + _existingPlannerEvents);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "231d158688e33ce13c901649b6fda260", "5d695cc53e7fceb4e30cfdea733abd2b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "clothing_items","outfits","outfit_feedback","style_notes","planner_events");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `clothing_items`");
      _db.execSQL("DELETE FROM `outfits`");
      _db.execSQL("DELETE FROM `outfit_feedback`");
      _db.execSQL("DELETE FROM `style_notes`");
      _db.execSQL("DELETE FROM `planner_events`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ClothingItemDao.class, ClothingItemDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OutfitDao.class, OutfitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OutfitFeedbackDao.class, OutfitFeedbackDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(StyleNoteDao.class, StyleNoteDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PlannerEventDao.class, PlannerEventDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ClothingItemDao clothingItemDao() {
    if (_clothingItemDao != null) {
      return _clothingItemDao;
    } else {
      synchronized(this) {
        if(_clothingItemDao == null) {
          _clothingItemDao = new ClothingItemDao_Impl(this);
        }
        return _clothingItemDao;
      }
    }
  }

  @Override
  public OutfitDao outfitDao() {
    if (_outfitDao != null) {
      return _outfitDao;
    } else {
      synchronized(this) {
        if(_outfitDao == null) {
          _outfitDao = new OutfitDao_Impl(this);
        }
        return _outfitDao;
      }
    }
  }

  @Override
  public OutfitFeedbackDao outfitFeedbackDao() {
    if (_outfitFeedbackDao != null) {
      return _outfitFeedbackDao;
    } else {
      synchronized(this) {
        if(_outfitFeedbackDao == null) {
          _outfitFeedbackDao = new OutfitFeedbackDao_Impl(this);
        }
        return _outfitFeedbackDao;
      }
    }
  }

  @Override
  public StyleNoteDao styleNoteDao() {
    if (_styleNoteDao != null) {
      return _styleNoteDao;
    } else {
      synchronized(this) {
        if(_styleNoteDao == null) {
          _styleNoteDao = new StyleNoteDao_Impl(this);
        }
        return _styleNoteDao;
      }
    }
  }

  @Override
  public PlannerEventDao plannerEventDao() {
    if (_plannerEventDao != null) {
      return _plannerEventDao;
    } else {
      synchronized(this) {
        if(_plannerEventDao == null) {
          _plannerEventDao = new PlannerEventDao_Impl(this);
        }
        return _plannerEventDao;
      }
    }
  }
}
