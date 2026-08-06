package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zmc extends igc {
    public final lzc b;
    public Boolean c;
    public String d;

    public zmc(lzc lzcVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        a78.g(lzcVar);
        this.b = lzcVar;
        this.d = null;
    }

    @Override // defpackage.jgc
    public final List A(String str, String str2, q1d q1dVar) {
        i(q1dVar);
        String str3 = q1dVar.t;
        a78.g(str3);
        lzc lzcVar = this.b;
        try {
            return (List) lzcVar.e().n(new llc(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            lzcVar.b().f.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.jgc
    public final byte[] B(String str, z9c z9cVar) {
        a78.d(str);
        a78.g(z9cVar);
        O(str, true);
        lzc lzcVar = this.b;
        phc phcVar = lzcVar.b().m;
        tkc tkcVar = lzcVar.l;
        fhc fhcVar = tkcVar.j;
        String str2 = z9cVar.t;
        phcVar.b(fhcVar.a(str2), "Log and bundle. event");
        lzcVar.c().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) lzcVar.e().o(new ylc(this, z9cVar, str)).get();
            if (bArr == null) {
                lzcVar.b().f.b(thc.o(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            lzcVar.c().getClass();
            lzcVar.b().m.d("Log and bundle processed. event, size, time_ms", tkcVar.j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            lzcVar.b().f.d("Failed to log and bundle. appId, event, error", thc.o(str), tkcVar.j.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            lzcVar.b().f.d("Failed to log and bundle. appId, event, error", thc.o(str), tkcVar.j.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.jgc
    public final void C(q1d q1dVar) {
        i(q1dVar);
        P(new zkc(this, q1dVar));
    }

    @Override // defpackage.jgc
    public final void E(q1d q1dVar) {
        a78.d(q1dVar.t);
        a78.g(q1dVar.L);
        g(new slc(this, q1dVar));
    }

    @Override // defpackage.jgc
    public final void F(final q1d q1dVar, final c3c c3cVar) {
        i(q1dVar);
        P(new Runnable() { // from class: tmc
            /* JADX WARN: Code duplicated, block: B:41:0x0124  */
            /* JADX WARN: Code duplicated, block: B:43:0x012a  */
            /* JADX WARN: Code duplicated, block: B:44:0x013b  */
            /* JADX WARN: Code duplicated, block: B:46:0x0141  */
            /* JADX WARN: Code duplicated, block: B:48:0x0147  */
            /* JADX WARN: Code duplicated, block: B:51:0x0169  */
            /* JADX WARN: Code duplicated, block: B:54:0x01bb A[Catch: SQLiteException -> 0x01c6, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01c6, blocks: (B:52:0x019c, B:54:0x01bb), top: B:79:0x019c }] */
            /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
            /* JADX WARN: Code duplicated, block: B:63:0x01ef  */
            /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
            /* JADX WARN: Code duplicated, block: B:66:0x0200  */
            /* JADX WARN: Code duplicated, block: B:73:0x024a  */
            /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i;
                long j;
                int i2;
                Cursor cursorQuery;
                pzc pzcVar;
                String str;
                int i3;
                lzc lzcVar;
                hzc hzcVar;
                lzc lzcVar2;
                p8c p8cVar;
                Long lValueOf;
                ContentValues contentValues;
                thc thcVar;
                lzc lzcVar3 = this.t.b;
                lzcVar3.W();
                String str2 = q1dVar.t;
                a78.g(str2);
                HashMap map = lzcVar3.E;
                lzcVar3.e().g();
                lzcVar3.m0();
                p8c p8cVar2 = lzcVar3.c;
                lzc.U(p8cVar2);
                c3c c3cVar2 = c3cVar;
                long j2 = c3cVar2.t;
                long j3 = c3cVar2.v;
                p8cVar2.g();
                p8cVar2.h();
                Cursor cursor = null;
                pzcVarJ = null;
                pzc pzcVarJ = null;
                try {
                    cursorQuery = p8cVar2.X().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                a78.g(string);
                                j = j3;
                                try {
                                    try {
                                        try {
                                            lzcVar3 = lzcVar3;
                                            i2 = 1;
                                            cursorQuery = cursorQuery;
                                            i = 4;
                                            j = j;
                                            try {
                                                pzcVarJ = p8cVar2.J(string, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursorQuery.close();
                                            } catch (SQLiteException e) {
                                                e = e;
                                                cursorQuery = cursorQuery;
                                                try {
                                                    thc thcVar2 = p8cVar2.a.f;
                                                    tkc.m(thcVar2);
                                                    thcVar2.f.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = 1;
                                            i = 4;
                                            cursorQuery = cursorQuery;
                                            thc thcVar3 = p8cVar2.a.f;
                                            tkc.m(thcVar3);
                                            thcVar3.f.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            pzcVar = pzcVarJ;
                                            if (pzcVar == null) {
                                                lzcVar3.b().i.c(str2, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                                return;
                                            }
                                            str = pzcVar.c;
                                            i3 = c3cVar2.u;
                                            if (i3 == i2) {
                                                lzcVar = lzcVar3;
                                                if (i3 == 3) {
                                                    hzcVar = (hzc) map.get(str);
                                                    if (hzcVar == null) {
                                                        hzcVar = new hzc(lzcVar);
                                                        map.put(str, hzcVar);
                                                    } else {
                                                        hzcVar.b += i2;
                                                        hzcVar.c = hzcVar.a();
                                                    }
                                                    lzcVar.c().getClass();
                                                    lzcVar.b().n.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str2, str, Long.valueOf((hzcVar.c - System.currentTimeMillis()) / 1000));
                                                }
                                                p8c p8cVar3 = lzcVar.c;
                                                lzc.U(p8cVar3);
                                                Long lValueOf2 = Long.valueOf(c3cVar2.t);
                                                p8cVar3.s(lValueOf2);
                                                lzcVar.b().n.c(str2, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            lzcVar2 = lzcVar3;
                                            p8c p8cVar4 = lzcVar2.c;
                                            lzc.U(p8cVar4);
                                            Long lValueOf3 = Long.valueOf(j2);
                                            p8cVar4.n(lValueOf3);
                                            lzcVar2.b().n.c(str2, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                            if (j > 0) {
                                                p8cVar = lzcVar2.c;
                                                lzc.U(p8cVar);
                                                tkc tkcVar = p8cVar.a;
                                                p8cVar.g();
                                                p8cVar.h();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(i2));
                                                mq2 mq2Var = tkcVar.k;
                                                thcVar = tkcVar.f;
                                                mq2Var.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (p8cVar.X().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                                                        tkc.m(thcVar);
                                                        thcVar.i.c(str2, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                                    }
                                                    lzcVar2.b().n.c(str2, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                                    lzcVar2.t(str2);
                                                } catch (SQLiteException e3) {
                                                    tkc.m(thcVar);
                                                    thcVar.f.d("Failed to update google Signal pending batch. appid, rowId", str2, Long.valueOf(j), e3);
                                                    throw e3;
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        i2 = 1;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    lzcVar3 = lzcVar3;
                                    i = 4;
                                    i2 = 1;
                                    cursorQuery = cursorQuery;
                                    j = j;
                                }
                            } else {
                                lzcVar3 = lzcVar3;
                                i = 4;
                                j = j3;
                                i2 = 1;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            lzcVar3 = lzcVar3;
                            i = 4;
                            j = j3;
                            i2 = 1;
                            cursorQuery = cursorQuery;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursorQuery = cursorQuery;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    lzcVar3 = lzcVar3;
                    i = 4;
                    j = j3;
                    i2 = 1;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                pzcVar = pzcVarJ;
                if (pzcVar == null) {
                    lzcVar3.b().i.c(str2, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                str = pzcVar.c;
                i3 = c3cVar2.u;
                if (i3 == i2) {
                    lzcVar = lzcVar3;
                    if (i3 == 3) {
                        hzcVar = (hzc) map.get(str);
                        if (hzcVar == null) {
                            hzcVar = new hzc(lzcVar);
                            map.put(str, hzcVar);
                        } else {
                            hzcVar.b += i2;
                            hzcVar.c = hzcVar.a();
                        }
                        lzcVar.c().getClass();
                        lzcVar.b().n.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str2, str, Long.valueOf((hzcVar.c - System.currentTimeMillis()) / 1000));
                    }
                    p8c p8cVar5 = lzcVar.c;
                    lzc.U(p8cVar5);
                    Long lValueOf4 = Long.valueOf(c3cVar2.t);
                    p8cVar5.s(lValueOf4);
                    lzcVar.b().n.c(str2, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                lzcVar2 = lzcVar3;
                p8c p8cVar6 = lzcVar2.c;
                lzc.U(p8cVar6);
                Long lValueOf5 = Long.valueOf(j2);
                p8cVar6.n(lValueOf5);
                lzcVar2.b().n.c(str2, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j > 0) {
                    p8cVar = lzcVar2.c;
                    lzc.U(p8cVar);
                    tkc tkcVar2 = p8cVar.a;
                    p8cVar.g();
                    p8cVar.h();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(i2));
                    mq2 mq2Var2 = tkcVar2.k;
                    thcVar = tkcVar2.f;
                    mq2Var2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (p8cVar.X().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                        tkc.m(thcVar);
                        thcVar.i.c(str2, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                    }
                    lzcVar2.b().n.c(str2, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                    lzcVar2.t(str2);
                }
            }
        });
    }

    @Override // defpackage.jgc
    public final String G(q1d q1dVar) {
        i(q1dVar);
        lzc lzcVar = this.b;
        try {
            return (String) lzcVar.e().n(new tyc(lzcVar, q1dVar)).get(AudioConstants.TRANSCRIPTION_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            lzcVar.b().f.c(thc.o(q1dVar.t), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.jgc
    public final void I(final Bundle bundle, final q1d q1dVar) {
        i(q1dVar);
        final String str = q1dVar.t;
        a78.g(str);
        P(new Runnable() { // from class: vmc
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Bundle bundle2 = bundle;
                boolean zIsEmpty = bundle2.isEmpty();
                lzc lzcVar = this.t.b;
                String str2 = str;
                if (zIsEmpty) {
                    p8c p8cVar = lzcVar.c;
                    lzc.U(p8cVar);
                    p8cVar.g();
                    p8cVar.h();
                    try {
                        p8cVar.X().execSQL("delete from default_event_params where app_id=?", new String[]{str2});
                        return;
                    } catch (SQLiteException e) {
                        thc thcVar = p8cVar.a.f;
                        tkc.m(thcVar);
                        thcVar.f.b(e, "Error clearing default event params");
                        return;
                    }
                }
                p8c p8cVar2 = lzcVar.c;
                lzc.U(p8cVar2);
                tkc tkcVar = p8cVar2.a;
                p8cVar2.g();
                p8cVar2.h();
                p9c p9cVar = new p9c(p8cVar2.a, BuildConfig.FLAVOR, str2, "dep", 0L, 0L, 0L, bundle2);
                qzc qzcVar = p8cVar2.b.g;
                lzc.U(qzcVar);
                byte[] bArrG = qzcVar.G(p9cVar).g();
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.n.c(str2, Integer.valueOf(bArrG.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrG);
                try {
                    if (p8cVar2.X().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        tkc.m(thcVar2);
                        thcVar2.f.b(thc.o(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e2) {
                    tkc.m(thcVar2);
                    thcVar2.f.c(thc.o(str2), e2, "Error storing default event parameters. appId");
                }
                p8c p8cVar3 = lzcVar.c;
                lzc.U(p8cVar3);
                long j = q1dVar.W;
                try {
                    if (p8cVar3.D("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) <= 0 && p8cVar3.D("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) > 0) {
                        p8c p8cVar4 = lzcVar.c;
                        lzc.U(p8cVar4);
                        p8cVar4.z(str2, Long.valueOf(j), null, bundle2);
                    }
                } catch (SQLiteException e3) {
                    thc thcVar3 = p8cVar3.a.f;
                    tkc.m(thcVar3);
                    thcVar3.f.b(e3, "Error checking backfill conditions");
                }
            }
        });
    }

    @Override // defpackage.jgc
    public final void J(e5c e5cVar, q1d q1dVar) {
        a78.g(e5cVar);
        a78.g(e5cVar.v);
        i(q1dVar);
        e5c e5cVar2 = new e5c(e5cVar);
        e5cVar2.t = q1dVar.t;
        P(new dlc(this, e5cVar2, q1dVar));
    }

    @Override // defpackage.jgc
    public final void M(final q1d q1dVar, final Bundle bundle, final pgc pgcVar) {
        i(q1dVar);
        final String str = q1dVar.t;
        a78.g(str);
        this.b.e().p(new Runnable() { // from class: hmc
            @Override // java.lang.Runnable
            public final void run() {
                pgc pgcVar2 = pgcVar;
                lzc lzcVar = this.t.b;
                lzcVar.W();
                try {
                    pgcVar2.L(lzcVar.e0(bundle, q1dVar));
                } catch (RemoteException e) {
                    lzcVar.b().f.c(str, e, "Failed to return trigger URIs for app");
                }
            }
        });
    }

    @Override // defpackage.jgc
    public final void N(q1d q1dVar) {
        String str = q1dVar.t;
        a78.d(str);
        O(str, false);
        P(new qlc(this, q1dVar));
    }

    public final void O(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        lzc lzcVar = this.b;
        if (zIsEmpty) {
            lzcVar.b().f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.c == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.d) && !p1b.a(lzcVar.l.a, Binder.getCallingUid()) && !do4.a(lzcVar.l.a).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.c = Boolean.valueOf(z2);
                }
                if (this.c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                lzcVar.b().f.b(thc.o(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.d == null) {
            Context context = lzcVar.l.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = co4.a;
            if (p1b.b(context, str, callingUid)) {
                this.d = str;
            }
        }
        if (str.equals(this.d)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void P(Runnable runnable) {
        lzc lzcVar = this.b;
        if (lzcVar.e().m()) {
            runnable.run();
        } else {
            lzcVar.e().p(runnable);
        }
    }

    public final void g(Runnable runnable) {
        lzc lzcVar = this.b;
        if (lzcVar.e().m()) {
            runnable.run();
        } else {
            lzcVar.e().r(runnable);
        }
    }

    public final void i(q1d q1dVar) {
        a78.g(q1dVar);
        String str = q1dVar.t;
        a78.d(str);
        O(str, false);
        this.b.l0().m(q1dVar.u);
    }

    @Override // defpackage.jgc
    public final List k(String str, String str2, String str3, boolean z) {
        O(str, true);
        lzc lzcVar = this.b;
        try {
            List<vzc> list = (List) lzcVar.e().n(new jlc(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (vzc vzcVar : list) {
                if (z || !yzc.L(vzcVar.c)) {
                    arrayList.add(new szc(vzcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            lzcVar.b().f.c(thc.o(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            lzcVar.b().f.c(thc.o(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.jgc
    public final void m(final q1d q1dVar) {
        a78.d(q1dVar.t);
        a78.g(q1dVar.L);
        g(new Runnable() { // from class: xmc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                lzc lzcVar = this.t.b;
                lzcVar.W();
                lzcVar.n0(q1dVar);
            }
        });
    }

    @Override // defpackage.jgc
    public final void n(String str, long j, String str2, String str3) {
        P(new blc(this, str2, str3, str, j));
    }

    @Override // defpackage.jgc
    public final void o(z9c z9cVar, q1d q1dVar) {
        a78.g(z9cVar);
        i(q1dVar);
        P(new vlc(this, z9cVar, q1dVar));
    }

    @Override // defpackage.jgc
    public final List q(String str, String str2, boolean z, q1d q1dVar) {
        i(q1dVar);
        String str3 = q1dVar.t;
        a78.g(str3);
        lzc lzcVar = this.b;
        try {
            List<vzc> list = (List) lzcVar.e().n(new hlc(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (vzc vzcVar : list) {
                if (z || !yzc.L(vzcVar.c)) {
                    arrayList.add(new szc(vzcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            lzcVar.b().f.c(thc.o(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            lzcVar.b().f.c(thc.o(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.jgc
    public final void r(q1d q1dVar) {
        i(q1dVar);
        P(new plc(this, q1dVar));
    }

    @Override // defpackage.jgc
    public final void s(q1d q1dVar, final yxc yxcVar, final ugc ugcVar) {
        i(q1dVar);
        final String str = q1dVar.t;
        a78.g(str);
        this.b.e().p(new Runnable() { // from class: jmc
            @Override // java.lang.Runnable
            public final void run() {
                ugc ugcVar2 = ugcVar;
                lzc lzcVar = this.t.b;
                lzcVar.W();
                lzcVar.e().g();
                lzcVar.m0();
                p8c p8cVar = lzcVar.c;
                lzc.U(p8cVar);
                int iIntValue = ((Integer) wfc.B.a(null)).intValue();
                String str2 = str;
                List<pzc> listL = p8cVar.l(str2, yxcVar, iIntValue);
                ArrayList arrayList = new ArrayList();
                for (pzc pzcVar : listL) {
                    String str3 = pzcVar.c;
                    long j = pzcVar.h;
                    long j2 = pzcVar.a;
                    if (lzcVar.s(str2, str3)) {
                        int i = pzcVar.i;
                        if (i > 0) {
                            if (i <= ((Integer) wfc.z.a(null)).intValue()) {
                                long jMin = Math.min(((Long) wfc.x.a(null)).longValue() * (1 << (i - 1)), ((Long) wfc.y.a(null)).longValue());
                                lzcVar.c().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                }
                            }
                            lzcVar.b().n.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str2, Long.valueOf(j2), Long.valueOf(j));
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : pzcVar.d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j3 = pzcVar.a;
                        skc skcVar = pzcVar.b;
                        uxc uxcVar = new uxc(j3, skcVar.g(), pzcVar.c, bundle, pzcVar.e.t, pzcVar.g, BuildConfig.FLAVOR);
                        try {
                            gkc gkcVar = (gkc) qzc.R(skc.E(), uxcVar.u);
                            for (int i2 = 0; i2 < ((skc) gkcVar.u).y(); i2++) {
                                ukc ukcVar = (ukc) ((skc) gkcVar.u).z(i2).p();
                                lzcVar.c().getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                ukcVar.h();
                                ((wkc) ukcVar.u).n0(jCurrentTimeMillis);
                                gkcVar.h();
                                ((skc) gkcVar.u).G(i2, (wkc) ukcVar.j());
                            }
                            uxcVar.u = ((skc) gkcVar.j()).g();
                            if (Log.isLoggable(lzcVar.b().q(), 2)) {
                                qzc qzcVar = lzcVar.g;
                                lzc.U(qzcVar);
                                uxcVar.z = qzcVar.H((skc) gkcVar.j());
                            }
                            arrayList.add(uxcVar);
                        } catch (k2c unused) {
                            lzcVar.b().i.b(str2, "Failed to parse queued batch. appId");
                        }
                    } else {
                        lzcVar.b().n.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str2, Long.valueOf(j2), pzcVar.c);
                    }
                }
                byc bycVar = new byc(arrayList);
                try {
                    ugcVar2.H(bycVar);
                    lzcVar.b().n.c(str2, Integer.valueOf(bycVar.t.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                } catch (RemoteException e) {
                    lzcVar.b().f.c(str2, e, "[sgtm] Failed to return upload batches for app");
                }
            }
        });
    }

    @Override // defpackage.jgc
    public final void t(q1d q1dVar) {
        a78.d(q1dVar.t);
        a78.g(q1dVar.L);
        g(new t8c(this, q1dVar));
    }

    @Override // defpackage.jgc
    public final void u(szc szcVar, q1d q1dVar) {
        a78.g(szcVar);
        i(q1dVar);
        P(new amc(this, szcVar, q1dVar));
    }

    @Override // defpackage.jgc
    public final List w(String str, String str2, String str3) {
        O(str, true);
        lzc lzcVar = this.b;
        try {
            return (List) lzcVar.e().n(new nlc(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            lzcVar.b().f.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.jgc
    public final z7c x(q1d q1dVar) {
        i(q1dVar);
        String str = q1dVar.t;
        a78.d(str);
        lzc lzcVar = this.b;
        try {
            return (z7c) lzcVar.e().o(new tlc(this, q1dVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            lzcVar.b().f.c(thc.o(str), e, "Failed to get consent. appId");
            return new z7c(null);
        }
    }

    @Override // defpackage.jgc
    public final void z(q1d q1dVar) {
        i(q1dVar);
        P(new xkc(this, q1dVar));
    }
}
