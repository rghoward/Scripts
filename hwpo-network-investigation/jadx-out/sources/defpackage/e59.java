package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e59 extends SQLiteOpenHelper {
    public static final String v = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int w = 7;
    public static final List<a> x = Arrays.asList(new x49(), new y49(), new z49(), new a59(), new b59(), new c59(), new d59());
    public final int t;
    public boolean u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public e59(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.u = false;
        this.t = i;
    }

    public static void h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = x;
        if (i2 <= list.size()) {
            while (i < i2) {
                list.get(i).a(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder sbB = u43.b("Migration from ", " to ", " was requested, but cannot be performed. Only ", i, i2);
            sbB.append(list.size());
            sbB.append(" migrations are provided");
            throw new IllegalArgumentException(sbB.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.u = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.u) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, 0, this.t);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.u) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.u) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.u) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, i, i2);
    }
}
