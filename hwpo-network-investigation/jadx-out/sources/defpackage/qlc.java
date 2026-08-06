package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qlc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ zmc u;

    public qlc(zmc zmcVar, q1d q1dVar) {
        this.t = q1dVar;
        this.u = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zmc zmcVar = this.u;
        zmcVar.b.W();
        lzc lzcVar = zmcVar.b;
        if (lzcVar.y != null) {
            ArrayList arrayList = new ArrayList();
            lzcVar.z = arrayList;
            arrayList.addAll(lzcVar.y);
        }
        p8c p8cVar = lzcVar.c;
        lzc.U(p8cVar);
        tkc tkcVar = p8cVar.a;
        q1d q1dVar = this.t;
        String str = q1dVar.t;
        a78.g(str);
        a78.d(str);
        p8cVar.g();
        p8cVar.h();
        try {
            SQLiteDatabase sQLiteDatabaseX = p8cVar.X();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseX.delete("apps", "app_id=?", strArr) + sQLiteDatabaseX.delete("events", "app_id=?", strArr) + sQLiteDatabaseX.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseX.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseX.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseX.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseX.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseX.delete("queue", "app_id=?", strArr) + sQLiteDatabaseX.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseX.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseX.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseX.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseX.delete("upload_queue", "app_id=?", strArr);
            if (tkcVar.d.r(null, wfc.c1)) {
                iDelete += sQLiteDatabaseX.delete("no_data_mode_events", "app_id=?", strArr);
            }
            int iDelete2 = iDelete + sQLiteDatabaseX.delete("diagnostic_signals", "app_id=?", strArr);
            if (iDelete2 > 0) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.n.c(str, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.c(thc.o(str), e, "Error resetting analytics data. appId, error");
        }
        if (q1dVar.A) {
            lzcVar.Z(q1dVar);
        }
    }
}
