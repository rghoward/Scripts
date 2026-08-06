package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tvc extends dgc {
    public final hvc c;
    public jgc d;
    public volatile Boolean e;
    public final rtc f;
    public ScheduledExecutorService g;
    public final ixc h;
    public final ArrayList i;
    public final ytc j;

    public tvc(tkc tkcVar) {
        super(tkcVar);
        this.i = new ArrayList();
        this.h = new ixc(tkcVar.k);
        this.c = new hvc(this);
        this.f = new rtc(this, tkcVar);
        this.j = new ytc(this, tkcVar);
    }

    @Override // defpackage.dgc
    public final boolean j() {
        return false;
    }

    public final void k(AtomicReference atomicReference) {
        g();
        h();
        u(new jtc(this, atomicReference, w(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    public final void l(Bundle bundle) {
        boolean z;
        boolean zN;
        g();
        h();
        v9c v9cVar = new v9c(bundle);
        s();
        tkc tkcVar = this.a;
        if (tkcVar.d.r(null, wfc.W0)) {
            chc chcVarO = tkcVar.o();
            tkc tkcVar2 = chcVarO.a;
            yzc yzcVar = tkcVar2.i;
            thc thcVar = tkcVar2.f;
            tkc.k(yzcVar);
            byte[] bArrQ = yzc.Q(v9cVar);
            if (bArrQ == null) {
                tkc.m(thcVar);
                thcVar.g.a("Null default event parameters; not writing to database");
            } else {
                if (bArrQ.length > 131072) {
                    tkc.m(thcVar);
                    thcVar.g.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zN = chcVarO.n(bArrQ, 4);
                }
                if (zN) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zN = false;
            if (zN) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        u(new utc(this, w(false), z, v9cVar, bundle));
    }

    public final void m() {
        g();
        h();
        if (x()) {
            return;
        }
        if (n()) {
            hvc hvcVar = this.c;
            tvc tvcVar = hvcVar.v;
            tvcVar.g();
            Context context = tvcVar.a.a;
            synchronized (hvcVar) {
                try {
                    if (hvcVar.t) {
                        thc thcVar = hvcVar.v.a.f;
                        tkc.m(thcVar);
                        thcVar.n.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (hvcVar.u != null && (hvcVar.u.d() || hvcVar.u.i())) {
                            thc thcVar2 = hvcVar.v.a.f;
                            tkc.m(thcVar2);
                            thcVar2.n.a("Already awaiting connection attempt");
                            return;
                        }
                        hvcVar.u = new hhc(context, Looper.getMainLooper(), ln4.K0(context), xn4.b, 93, hvcVar, hvcVar, null);
                        thc thcVar3 = hvcVar.v.a.f;
                        tkc.m(thcVar3);
                        thcVar3.n.a("Connecting to remote service");
                        hvcVar.t = true;
                        a78.g(hvcVar.u);
                        hvcVar.u.q();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        tkc tkcVar = this.a;
        if (tkcVar.d.j()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = tkcVar.a.getPackageManager().queryIntentServices(new Intent().setClassName(tkcVar.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            thc thcVar4 = tkcVar.f;
            tkc.m(thcVar4);
            thcVar4.f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(tkcVar.a, "com.google.android.gms.measurement.AppMeasurementService"));
        hvc hvcVar2 = this.c;
        tvc tvcVar2 = hvcVar2.v;
        tvcVar2.g();
        Context context2 = tvcVar2.a.a;
        fx1 fx1VarB = fx1.b();
        synchronized (hvcVar2) {
            try {
                boolean z = hvcVar2.t;
                tvc tvcVar3 = hvcVar2.v;
                if (z) {
                    thc thcVar5 = tvcVar3.a.f;
                    tkc.m(thcVar5);
                    thcVar5.n.a("Connection attempt already in progress");
                } else {
                    thc thcVar6 = tvcVar3.a.f;
                    tkc.m(thcVar6);
                    thcVar6.n.a("Using local app measurement service");
                    hvcVar2.t = true;
                    fx1VarB.a(context2, intent, tvcVar3.c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n() {
        g();
        h();
        if (this.e == null) {
            g();
            h();
            tkc tkcVar = this.a;
            zic zicVar = tkcVar.e;
            tkc.k(zicVar);
            zicVar.g();
            boolean z = false;
            Boolean boolValueOf = !zicVar.k().contains("use_service") ? null : Boolean.valueOf(zicVar.k().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                wgc wgcVarR = this.a.r();
                wgcVarR.h();
                if (wgcVarR.n == 1) {
                    z = true;
                } else {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.n.a("Checking service availability");
                    yzc yzcVar = tkcVar.i;
                    tkc.k(yzcVar);
                    int iB = xn4.b.b(yzcVar.a.a, 12451000);
                    if (iB == 0) {
                        thc thcVar2 = tkcVar.f;
                        tkc.m(thcVar2);
                        thcVar2.n.a("Service available");
                    } else if (iB == 1) {
                        thc thcVar3 = tkcVar.f;
                        tkc.m(thcVar3);
                        thcVar3.n.a("Service missing");
                    } else if (iB != 2) {
                        if (iB != 3) {
                            thc thcVar4 = tkcVar.f;
                            if (iB == 9) {
                                tkc.m(thcVar4);
                                thcVar4.i.a("Service invalid");
                            } else if (iB != 18) {
                                tkc.m(thcVar4);
                                thcVar4.i.b(Integer.valueOf(iB), "Unexpected service status");
                            } else {
                                tkc.m(thcVar4);
                                thcVar4.i.a("Service updating");
                            }
                        } else {
                            thc thcVar5 = tkcVar.f;
                            tkc.m(thcVar5);
                            thcVar5.i.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        thc thcVar6 = tkcVar.f;
                        tkc.m(thcVar6);
                        thcVar6.m.a("Service container out of date");
                        yzc yzcVar2 = tkcVar.i;
                        tkc.k(yzcVar2);
                        if (yzcVar2.S() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && tkcVar.d.j()) {
                    thc thcVar7 = tkcVar.f;
                    tkc.m(thcVar7);
                    thcVar7.f.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    zic zicVar2 = tkcVar.e;
                    tkc.k(zicVar2);
                    zicVar2.g();
                    SharedPreferences.Editor editorEdit = zicVar2.k().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    public final void o() {
        g();
        h();
        hvc hvcVar = this.c;
        if (hvcVar.u != null && (hvcVar.u.i() || hvcVar.u.d())) {
            hvcVar.u.h();
        }
        hvcVar.u = null;
        try {
            fx1.b().c(this.a.a, hvcVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final boolean p() {
        g();
        h();
        if (!n()) {
            return true;
        }
        yzc yzcVar = this.a.i;
        tkc.k(yzcVar);
        return yzcVar.S() >= ((Integer) wfc.J0.a(null)).intValue();
    }

    public final boolean q() {
        g();
        h();
        if (!n()) {
            return true;
        }
        yzc yzcVar = this.a.i;
        tkc.k(yzcVar);
        return yzcVar.S() >= 241200;
    }

    public final void r(ComponentName componentName) {
        g();
        if (this.d != null) {
            this.d = null;
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.n.b(componentName, "Disconnected from device MeasurementService");
            g();
            m();
        }
    }

    public final void s() {
        this.a.getClass();
    }

    public final void t() {
        g();
        ixc ixcVar = this.h;
        ixcVar.a.getClass();
        ixcVar.b = SystemClock.elapsedRealtime();
        this.a.getClass();
        this.f.b(((Long) wfc.Y.a(null)).longValue());
    }

    public final void u(Runnable runnable) {
        g();
        if (x()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.i;
        long size = arrayList.size();
        tkc tkcVar = this.a;
        tkcVar.getClass();
        if (size >= 1000) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.j.b(60000L);
            m();
        }
    }

    public final void v() {
        g();
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        phc phcVar = thcVar.n;
        ArrayList arrayList = this.i;
        phcVar.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.j.c();
    }

    public final q1d w(boolean z) {
        long jAbs;
        Pair pair;
        tkc tkcVar = this.a;
        tkcVar.getClass();
        wgc wgcVarR = tkcVar.r();
        String strA = null;
        if (z) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            tkc tkcVar2 = thcVar.a;
            zic zicVar = tkcVar2.e;
            tkc.k(zicVar);
            if (zicVar.e != null) {
                zic zicVar2 = tkcVar2.e;
                tkc.k(zicVar2);
                vic vicVar = zicVar2.e;
                zic zicVar3 = vicVar.e;
                zicVar3.g();
                zicVar3.g();
                long j = vicVar.e.k().getLong(vicVar.a, 0L);
                if (j == 0) {
                    vicVar.a();
                    jAbs = 0;
                } else {
                    zicVar3.a.k.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = vicVar.d;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    vicVar.a();
                    pair = null;
                } else {
                    String string = zicVar3.k().getString(vicVar.c, null);
                    long j3 = zicVar3.k().getLong(vicVar.b, 0L);
                    vicVar.a();
                    pair = (string == null || j3 <= 0) ? zic.z : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != zic.z) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strA = w27.a(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return wgcVarR.k(strA);
    }

    public final boolean x() {
        g();
        h();
        return this.d != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0432 A[Catch: all -> 0x046e, TRY_ENTER, TryCatch #51 {all -> 0x046e, blocks: (B:268:0x045e, B:258:0x0432, B:260:0x0438, B:261:0x043b, B:278:0x047f, B:207:0x0369, B:209:0x0373, B:214:0x0384), top: B:395:0x045e }] */
    /* JADX WARN: Code duplicated, block: B:263:0x044a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0465  */
    /* JADX WARN: Code duplicated, block: B:273:0x046a A[PHI: r4 r6 r23 r24 r26 r36 r37
      0x046a: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
      (r4v12 android.database.sqlite.SQLiteDatabase)
      (r4v13 android.database.sqlite.SQLiteDatabase)
      (r4v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x046a: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x044d, B:281:0x0491, B:272:0x0468] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x048e  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:287:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:302:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:304:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:305:0x0587  */
    /* JADX WARN: Code duplicated, block: B:316:0x05b4 A[Catch: RemoteException -> 0x05e2, TRY_LEAVE, TryCatch #43 {RemoteException -> 0x05e2, blocks: (B:314:0x05a9, B:316:0x05b4), top: B:389:0x05a9 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:337:0x061e  */
    /* JADX WARN: Code duplicated, block: B:339:0x0622  */
    /* JADX WARN: Code duplicated, block: B:341:0x0643  */
    /* JADX WARN: Code duplicated, block: B:347:0x0662  */
    /* JADX WARN: Code duplicated, block: B:353:0x067a  */
    /* JADX WARN: Code duplicated, block: B:361:0x069d  */
    /* JADX WARN: Code duplicated, block: B:385:0x064f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0666 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x058f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0494 A[SYNTHETIC] */
    public final void y(jgc jgcVar, p2 p2Var, q1d q1dVar) throws Throwable {
        ArrayList arrayList;
        tkc tkcVar;
        Context context;
        thc thcVar;
        int i;
        SQLiteDatabase sQLiteDatabaseM;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        v9c v9cVarCreateFromParcel;
        int i5;
        e5c e5cVarCreateFromParcel;
        szc szcVarCreateFromParcel;
        int size;
        int size2;
        int i6;
        ahc ahcVar;
        p2 p2Var2;
        ufc ufcVar;
        tkc tkcVar2;
        Context context2;
        thc thcVar2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        g();
        h();
        s();
        tkc tkcVar3 = this.a;
        tkcVar3.getClass();
        Context context3 = tkcVar3.a;
        t7c t7cVar = tkcVar3.d;
        thc thcVar3 = tkcVar3.f;
        mq2 mq2Var = tkcVar3.k;
        int i7 = 100;
        q1d q1dVar2 = q1dVar;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            chc chcVarO = tkcVar3.o();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            mq2 mq2Var2 = mq2Var;
            tkc tkcVar4 = chcVarO.a;
            chcVarO.g();
            int i11 = i8;
            if (chcVarO.d) {
                tkcVar = tkcVar3;
                context = context3;
                thcVar = thcVar3;
            } else {
                arrayList = new ArrayList();
                tkcVar = tkcVar3;
                if (chcVarO.a.a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    thcVar = thcVar3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM = chcVarO.m();
                                if (sQLiteDatabaseM == null) {
                                    try {
                                        try {
                                            chcVarO.d = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        thc thcVar4 = tkcVar4.f;
                                        tkc.m(thcVar4);
                                        thcVar4.f.b(e, "Error reading entries from local database");
                                        chcVarO.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM != null && sQLiteDatabaseM.inTransaction()) {
                                            sQLiteDatabaseM.endTransaction();
                                        }
                                        thc thcVar5 = tkcVar4.f;
                                        tkc.m(thcVar5);
                                        thcVar5.f.b(e, "Error reading entries from local database");
                                        chcVarO.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseM.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        thc thcVar6 = tkcVar4.f;
                                                        tkc.m(thcVar6);
                                                        thcVar6.f.b(e, "Error reading entries from local database");
                                                        chcVarO.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.endTransaction();
                                                        }
                                                        thc thcVar7 = tkcVar4.f;
                                                        tkc.m(thcVar7);
                                                        thcVar7.f.b(e, "Error reading entries from local database");
                                                        chcVarO.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            thc thcVar8 = tkcVar4.f;
                                                            tkc.m(thcVar8);
                                                            thcVar8.f.b(e, "Error reading entries from local database");
                                                            chcVarO.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.endTransaction();
                                                            }
                                                            thc thcVar9 = tkcVar4.f;
                                                            tkc.m(thcVar9);
                                                            thcVar9.f.b(e, "Error reading entries from local database");
                                                            chcVarO.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                t7c t7cVar2 = tkcVar4.d;
                                                ufc ufcVar2 = wfc.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (t7cVar2.r(null, ufcVar2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                thc thcVar10 = tkcVar4.f;
                                                                tkc.m(thcVar10);
                                                                thcVar10.f.b(e, "Error reading entries from local database");
                                                                chcVarO.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                thc thcVar11 = tkcVar4.f;
                                                                tkc.m(thcVar11);
                                                                thcVar11.f.b(e, "Error reading entries from local database");
                                                                chcVarO.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (tkcVar4.d.r(null, ufcVar2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                thc thcVar12 = tkcVar4.f;
                                                                                                tkc.m(thcVar12);
                                                                                                thcVar12.f.b(e, "Error reading entries from local database");
                                                                                                chcVarO.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                }
                                                                                                thc thcVar13 = tkcVar4.f;
                                                                                                tkc.m(thcVar13);
                                                                                                thcVar13.f.b(e, "Error reading entries from local database");
                                                                                                chcVarO.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            z9c z9cVarCreateFromParcel = z9c.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (z9cVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new ahc(z9cVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (sz8.a unused6) {
                                                                                                            thc thcVar14 = tkcVar4.f;
                                                                                                            tkc.m(thcVar14);
                                                                                                            thcVar14.f.a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM != null) {
                                                                                                        sQLiteDatabaseM.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e11) {
                                                                                                e = e11;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                thc thcVar15 = tkcVar4.f;
                                                                                                tkc.m(thcVar15);
                                                                                                thcVar15.f.b(e, "Error reading entries from local database");
                                                                                                chcVarO.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                }
                                                                                                thc thcVar16 = tkcVar4.f;
                                                                                                tkc.m(thcVar16);
                                                                                                thcVar16.f.b(e, "Error reading entries from local database");
                                                                                                chcVarO.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        szcVarCreateFromParcel = szc.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (sz8.a unused8) {
                                                                                                    thc thcVar17 = tkcVar4.f;
                                                                                                    tkc.m(thcVar17);
                                                                                                    thcVar17.f.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    szcVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (szcVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new ahc(szcVarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            e5cVarCreateFromParcel = e5c.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (sz8.a unused9) {
                                                                                                            thc thcVar18 = tkcVar4.f;
                                                                                                            tkc.m(thcVar18);
                                                                                                            thcVar18.f.a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            e5cVarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (e5cVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new ahc(e5cVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    v9cVarCreateFromParcel = v9c.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (v9cVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new ahc(v9cVarCreateFromParcel, string, j2));
                                                                                                                        }
                                                                                                                        i5 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        thc thcVar19 = tkcVar4.f;
                                                                                                                        tkc.m(thcVar19);
                                                                                                                        thcVar19.f.b(e, "Error reading entries from local database");
                                                                                                                        chcVarO.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                                        }
                                                                                                                        thc thcVar110 = tkcVar4.f;
                                                                                                                        tkc.m(thcVar110);
                                                                                                                        thcVar110.f.b(e, "Error reading entries from local database");
                                                                                                                        chcVarO.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (sz8.a unused11) {
                                                                                                                thc thcVar20 = tkcVar4.f;
                                                                                                                tkc.m(thcVar20);
                                                                                                                thcVar20.f.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                v9cVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (sz8.a unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        thc thcVar111 = tkcVar4.f;
                                                                                                        tkc.m(thcVar111);
                                                                                                        thcVar111.f.b(e, "Error reading entries from local database");
                                                                                                        chcVarO.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                        }
                                                                                                        thc thcVar112 = tkcVar4.f;
                                                                                                        tkc.m(thcVar112);
                                                                                                        thcVar112.f.b(e, "Error reading entries from local database");
                                                                                                        chcVarO.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    thc thcVar21 = tkcVar4.f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        tkc.m(thcVar21);
                                                                                                        thcVar21.n.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        tkc.m(thcVar21);
                                                                                                        thcVar21.f.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                ufcVar2 = ufcVar2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        ufcVar2 = ufcVar2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    thc thcVar113 = tkcVar4.f;
                                                                                    tkc.m(thcVar113);
                                                                                    thcVar113.f.b(e, "Error reading entries from local database");
                                                                                    chcVarO.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.endTransaction();
                                                                                    }
                                                                                    thc thcVar114 = tkcVar4.f;
                                                                                    tkc.m(thcVar114);
                                                                                    thcVar114.f.b(e, "Error reading entries from local database");
                                                                                    chcVarO.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            try {
                                                                if (sQLiteDatabaseM.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    thc thcVar22 = tkcVar4.f;
                                                                    tkc.m(thcVar22);
                                                                    thcVar22.f.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM.setTransactionSuccessful();
                                                                sQLiteDatabaseM.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                thc thcVar115 = tkcVar4.f;
                                                                tkc.m(thcVar115);
                                                                thcVar115.f.b(e, "Error reading entries from local database");
                                                                chcVarO.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                thc thcVar116 = tkcVar4.f;
                                                                tkc.m(thcVar116);
                                                                thcVar116.f.b(e, "Error reading entries from local database");
                                                                chcVarO.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str3 = str3;
                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    str3 = str3;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    thc thcVar117 = tkcVar4.f;
                                                    tkc.m(thcVar117);
                                                    thcVar117.f.b(e, "Error reading entries from local database");
                                                    chcVarO.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    str3 = str3;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.endTransaction();
                                                    }
                                                    thc thcVar118 = tkcVar4.f;
                                                    tkc.m(thcVar118);
                                                    thcVar118.f.b(e, "Error reading entries from local database");
                                                    chcVarO.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseM = null;
                            }
                        } else {
                            i = 0;
                            thc thcVar23 = tkcVar4.f;
                            tkc.m(thcVar23);
                            thcVar23.i.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    thcVar = thcVar3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (p2Var != null && size < i10) {
                    arrayList2.add(new ahc(p2Var, q1dVar2.v, q1dVar2.C));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    ahcVar = (ahc) arrayList2.get(i6);
                    p2Var2 = ahcVar.a;
                    ufcVar = wfc.W0;
                    if (t7cVar.r(null, ufcVar)) {
                        str2 = ahcVar.b;
                        if (!TextUtils.isEmpty(str2)) {
                            q1dVar2 = new q1d(q1dVar2.t, q1dVar2.u, str2, ahcVar.c, q1dVar2.w, q1dVar2.x, q1dVar2.y, q1dVar2.z, q1dVar2.A, q1dVar2.B, q1dVar2.D, q1dVar2.E, q1dVar2.F, q1dVar2.G, q1dVar2.H, q1dVar2.I, q1dVar2.J, q1dVar2.K, q1dVar2.L, q1dVar2.M, q1dVar2.N, q1dVar2.O, q1dVar2.P, q1dVar2.Q, q1dVar2.R, q1dVar2.S, q1dVar2.T, q1dVar2.U, q1dVar2.V, q1dVar2.W, q1dVar2.X, q1dVar2.Y);
                        }
                    }
                    if (p2Var2 instanceof z9c) {
                        try {
                            mq2Var2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                mq2Var2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        jgcVar.o((z9c) p2Var2, q1dVar2);
                                        tkc.m(thcVar);
                                        thcVar2 = thcVar;
                                        try {
                                            thcVar2.n.a("Logging telemetry for logEvent from database");
                                            if (lhc.d == null) {
                                                tkcVar2 = tkcVar;
                                                context2 = context;
                                                try {
                                                    lhc.d = new lhc(context2, tkcVar2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    tkc.m(thcVar2);
                                                    thcVar2.f.b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (lhc.d == null) {
                                                            lhc.d = new lhc(context2, tkcVar2);
                                                        }
                                                        lhc lhcVar = lhc.d;
                                                        mq2Var2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        mq2Var2.getClass();
                                                        lhcVar.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                tkcVar2 = tkcVar;
                                                context2 = context;
                                            }
                                            lhc lhcVar2 = lhc.d;
                                            mq2Var2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            mq2Var2.getClass();
                                            lhcVar2.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            tkcVar2 = tkcVar;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        tkcVar2 = tkcVar;
                                        context2 = context;
                                        thcVar2 = thcVar;
                                        j3 = jCurrentTimeMillis;
                                        tkc.m(thcVar2);
                                        thcVar2.f.b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (lhc.d == null) {
                                                lhc.d = new lhc(context2, tkcVar2);
                                            }
                                            lhc lhcVar3 = lhc.d;
                                            mq2Var2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            mq2Var2.getClass();
                                            lhcVar3.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        thcVar = thcVar2;
                                        context = context2;
                                        tkcVar = tkcVar2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                tkcVar2 = tkcVar;
                                context2 = context;
                                thcVar2 = thcVar;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            tkcVar2 = tkcVar;
                            context2 = context;
                            thcVar2 = thcVar;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        tkcVar2 = tkcVar;
                        context2 = context;
                        thcVar2 = thcVar;
                        if (p2Var2 instanceof szc) {
                            try {
                                jgcVar.u((szc) p2Var2, q1dVar2);
                            } catch (RemoteException e41) {
                                tkc.m(thcVar2);
                                thcVar2.f.b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (p2Var2 instanceof e5c) {
                                try {
                                    jgcVar.J((e5c) p2Var2, q1dVar2);
                                } catch (RemoteException e42) {
                                    tkc.m(thcVar2);
                                    thcVar2.f.b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (t7cVar.r(null, ufcVar) || !(p2Var2 instanceof v9c)) {
                                tkc.m(thcVar2);
                                thcVar2.f.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    jgcVar.I(((v9c) p2Var2).v(), q1dVar2);
                                } catch (RemoteException e43) {
                                    tkc.m(thcVar2);
                                    thcVar2.f.b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            thcVar = thcVar2;
                            context = context2;
                            tkcVar = tkcVar2;
                            size = size;
                        }
                    }
                    i6++;
                    thcVar = thcVar2;
                    context = context2;
                    tkcVar = tkcVar2;
                    size = size;
                }
                thcVar3 = thcVar;
                context3 = context;
                tkcVar3 = tkcVar;
                mq2Var = mq2Var2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (p2Var != null) {
                arrayList2.add(new ahc(p2Var, q1dVar2.v, q1dVar2.C));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                ahcVar = (ahc) arrayList2.get(i6);
                p2Var2 = ahcVar.a;
                ufcVar = wfc.W0;
                if (t7cVar.r(null, ufcVar)) {
                    str2 = ahcVar.b;
                    if (!TextUtils.isEmpty(str2)) {
                        q1dVar2 = new q1d(q1dVar2.t, q1dVar2.u, str2, ahcVar.c, q1dVar2.w, q1dVar2.x, q1dVar2.y, q1dVar2.z, q1dVar2.A, q1dVar2.B, q1dVar2.D, q1dVar2.E, q1dVar2.F, q1dVar2.G, q1dVar2.H, q1dVar2.I, q1dVar2.J, q1dVar2.K, q1dVar2.L, q1dVar2.M, q1dVar2.N, q1dVar2.O, q1dVar2.P, q1dVar2.Q, q1dVar2.R, q1dVar2.S, q1dVar2.T, q1dVar2.U, q1dVar2.V, q1dVar2.W, q1dVar2.X, q1dVar2.Y);
                    }
                }
                if (p2Var2 instanceof z9c) {
                    mq2Var2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    mq2Var2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    jgcVar.o((z9c) p2Var2, q1dVar2);
                    tkc.m(thcVar);
                    thcVar2 = thcVar;
                    thcVar2.n.a("Logging telemetry for logEvent from database");
                    if (lhc.d == null) {
                        tkcVar2 = tkcVar;
                        context2 = context;
                        lhc.d = new lhc(context2, tkcVar2);
                    } else {
                        tkcVar2 = tkcVar;
                        context2 = context;
                    }
                    lhc lhcVar4 = lhc.d;
                    mq2Var2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    mq2Var2.getClass();
                    lhcVar4.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    tkcVar2 = tkcVar;
                    context2 = context;
                    thcVar2 = thcVar;
                    if (p2Var2 instanceof szc) {
                        jgcVar.u((szc) p2Var2, q1dVar2);
                    } else {
                        if (p2Var2 instanceof e5c) {
                            jgcVar.J((e5c) p2Var2, q1dVar2);
                        } else if (t7cVar.r(null, ufcVar)) {
                            tkc.m(thcVar2);
                            thcVar2.f.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            tkc.m(thcVar2);
                            thcVar2.f.a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        thcVar = thcVar2;
                        context = context2;
                        tkcVar = tkcVar2;
                        size = size;
                    }
                }
                i6++;
                thcVar = thcVar2;
                context = context2;
                tkcVar = tkcVar2;
                size = size;
            }
            thcVar3 = thcVar;
            context3 = context;
            tkcVar3 = tkcVar;
            mq2Var = mq2Var2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    public final void z(e5c e5cVar) {
        boolean zN;
        g();
        h();
        tkc tkcVar = this.a;
        tkcVar.getClass();
        chc chcVarO = tkcVar.o();
        tkc tkcVar2 = chcVarO.a;
        tkc.k(tkcVar2.i);
        byte[] bArrQ = yzc.Q(e5cVar);
        if (bArrQ.length > 131072) {
            thc thcVar = tkcVar2.f;
            tkc.m(thcVar);
            thcVar.g.a("Conditional user property too long for local database. Sending directly to service");
            zN = false;
        } else {
            zN = chcVarO.n(bArrQ, 2);
        }
        u(new fuc(this, w(true), zN, new e5c(e5cVar)));
    }
}
