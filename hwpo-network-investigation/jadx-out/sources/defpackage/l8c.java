package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l8c {
    public final String a;
    public long b;
    public final /* synthetic */ p8c c;

    public l8c(p8c p8cVar, String str, long j) {
        this.c = p8cVar;
        a78.d(str);
        this.a = str;
        this.b = p8cVar.D("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public final List a() {
        List list;
        List list2;
        p8c p8cVar = this.c;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.b);
        String str = this.a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = p8cVar.X().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            rjc rjcVar = (rjc) qzc.R(tjc.N(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            rjcVar.u(string);
                            long j4 = cursorQuery.getLong(2);
                            rjcVar.h();
                            ((tjc) rjcVar.u).U(j4);
                            rjcVar.h();
                            ((tjc) rjcVar.u).x(j3);
                            arrayList.add(new j8c(j, j2, z, (tjc) rjcVar.j()));
                        } catch (IOException e) {
                            thc thcVar = p8cVar.a.f;
                            tkc.m(thcVar);
                            thcVar.f.c(thc.o(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                thc thcVar2 = p8cVar.a.f;
                tkc.m(thcVar2);
                thcVar2.f.c(thc.o(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public l8c(p8c p8cVar, String str) {
        this.c = p8cVar;
        a78.d(str);
        this.a = str;
        this.b = -1L;
    }
}
