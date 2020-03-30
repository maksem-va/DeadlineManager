package com.maksem_va.dm.data;

import android.provider.BaseColumns;

public final class EventData {

    private EventData() {
    };

    public static final class DataEntry implements BaseColumns {
        public final static String TABLE_NAME = "events";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_CITY = "description";
        public final static String COLUMN_GENDER = "priority";
        public final static String COLUMN_AGE = "date";

        public static final int PRIORITY_LOW = 0;
        public static final int PRIORITY_MEDIUM = 1;
        public static final int PRIORITY_HIGH = 2;
    }
}