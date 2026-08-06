package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ygc extends dbc {
    public final /* synthetic */ chc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygc(chc chcVar, Context context) {
        super(context, "google_app_measurement_local.db");
        this.t = chcVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            chc chcVar = this.t;
            tkc tkcVar = chcVar.a;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Opening the local database failed, dropping and recreating it");
            if (!tkcVar.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                thc thcVar3 = chcVar.a.f;
                tkc.m(thcVar3);
                thcVar3.f.b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        thc thcVar = this.t.a.f;
        tkc.m(thcVar);
        r8c.b(thcVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        thc thcVar = this.t.a.f;
        tkc.m(thcVar);
        r8c.a(thcVar, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", chc.e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
