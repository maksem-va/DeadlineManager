package com.maksem_va.dm.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


class EventDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = EventDbHelper.class.getSimpleName();

    /**
     * Имя файла базы данных
     */
    private static final String DATABASE_NAME = "events.db";

    /**
     * Версия базы данных. При изменении схемы увеличить на единицу
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Конструктор {@link EventDbHelper}.
     *
     * @param context Контекст приложения
     */
    public EventDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Вызывается при создании базы данных
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Строка для создания таблицы
        String SQL_CREATE_GUESTS_TABLE = "CREATE TABLE " + EventData.DataEntry.TABLE_NAME + " ("
                + EventData.DataEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + EventData.DataEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + EventData.DataEntry.COLUMN_CITY + " TEXT NOT NULL, "
                + EventData.DataEntry.COLUMN_GENDER + " INTEGER NOT NULL DEFAULT 3, "
                + EventData.DataEntry.COLUMN_AGE + " INTEGER NOT NULL DEFAULT 0);";

        // Запускаем создание таблицы
        db.execSQL(SQL_CREATE_GUESTS_TABLE);
    }

    /**
     * Вызывается при обновлении схемы базы данных
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}