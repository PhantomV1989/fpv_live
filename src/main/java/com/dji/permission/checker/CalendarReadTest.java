package com.dji.permission.checker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import android.support.annotation.RequiresApi;
import android.support.annotation.RequiresPermission;
import com.dji.permission.Permission;
import com.dji.permission.checker.PermissionTest;

class CalendarReadTest implements PermissionTest {
    private ContentResolver mResolver;

    CalendarReadTest(Context context) {
        this.mResolver = context.getContentResolver();
    }

    /* JADX INFO: finally extract failed */
    @RequiresApi(14)
    @RequiresPermission(Permission.READ_CALENDAR)
    public boolean test() throws Throwable {
        Cursor cursor = this.mResolver.query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id", "name"}, null, null, null);
        if (cursor == null) {
            return false;
        }
        try {
            PermissionTest.CursorTest.read(cursor);
            cursor.close();
            return true;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }
}
