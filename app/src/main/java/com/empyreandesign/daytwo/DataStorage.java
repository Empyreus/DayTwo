package com.empyreandesign.daytwo;

import android.provider.BaseColumns;

/**
 * Created by rjsouza on 5/15/16.
 */
public final class DataStorage {
    public DataStorage() {
    }

    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "Notes";
        public static final String COLUMN_NAME_ENTRY_ID = "entryID";
        public static final String COLUMN_NAME_TITLE = "NoteTitle";
        public static final String COLUMN_NAME_SUBTITLE = "NoteBody";
        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";


        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;


    }
}

