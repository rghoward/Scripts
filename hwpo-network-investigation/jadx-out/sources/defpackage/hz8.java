package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz8 implements an3, n7a, kf1 {
    public static final ag3 y = new ag3("proto");
    public final e59 t;
    public final uf1 u;
    public final uf1 v;
    public final ce0 w;
    public final nf8<String> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T, U> {
        U apply(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public hz8(uf1 uf1Var, uf1 uf1Var2, ce0 ce0Var, e59 e59Var, nf8<String> nf8Var) {
        this.t = e59Var;
        this.u = uf1Var;
        this.v = uf1Var2;
        this.w = ce0Var;
        this.x = nf8Var;
    }

    public static String B(Iterable<gw7> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<gw7> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T E(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long u(SQLiteDatabase sQLiteDatabase, ef0 ef0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ef0Var.a, String.valueOf(r98.a(ef0Var.c))));
        byte[] bArr = ef0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.an3
    public final Iterable<exa> A() {
        return (Iterable) v(new uo2());
    }

    @Override // defpackage.an3
    public final long C(exa exaVar) {
        Cursor cursorRawQuery = t().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{exaVar.a(), String.valueOf(r98.a(exaVar.c()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // defpackage.an3
    public final boolean D(ef0 ef0Var) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            Long lU = u(sQLiteDatabaseT, ef0Var);
            if (lU == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = t().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lU.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseT.setTransactionSuccessful();
            sQLiteDatabaseT.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseT.endTransaction();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.close();
    }

    @Override // defpackage.kf1
    public final void h() {
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            sQLiteDatabaseT.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseT.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.u.getTime()).execute();
            sQLiteDatabaseT.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseT.endTransaction();
        }
    }

    @Override // defpackage.an3
    public final Iterable h0(final ef0 ef0Var) {
        return (Iterable) v(new a() { // from class: bz8
            @Override // hz8.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                hz8 hz8Var = this.t;
                ce0 ce0Var = hz8Var.w;
                int iC = ce0Var.c();
                ef0 ef0Var2 = ef0Var;
                ArrayList arrayListY = hz8Var.y(sQLiteDatabase, ef0Var2, iC);
                for (o98 o98Var : o98.values()) {
                    if (o98Var != ef0Var2.c) {
                        int iC2 = ce0Var.c() - arrayListY.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListY.addAll(hz8Var.y(sQLiteDatabase, ef0Var2.d(o98Var), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayListY.size(); i++) {
                    sb.append(((gw7) arrayListY.get(i)).b());
                    if (i < arrayListY.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        long j = cursorQuery.getLong(0);
                        Set hashSet = (Set) map.get(Long.valueOf(j));
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(Long.valueOf(j), hashSet);
                        }
                        hashSet.add(new hz8.b(cursorQuery.getString(1), cursorQuery.getString(2)));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                ListIterator listIterator = arrayListY.listIterator();
                while (listIterator.hasNext()) {
                    gw7 gw7Var = (gw7) listIterator.next();
                    if (map.containsKey(Long.valueOf(gw7Var.b()))) {
                        be0.a aVarM = gw7Var.a().m();
                        for (hz8.b bVar : (Set) map.get(Long.valueOf(gw7Var.b()))) {
                            aVarM.a(bVar.a, bVar.b);
                        }
                        listIterator.set(new pe0(gw7Var.b(), gw7Var.c(), aVarM.b()));
                    }
                }
                return arrayListY;
            }
        });
    }

    @Override // defpackage.kf1
    public final mf1 k() {
        int i = mf1.e;
        final mf1.a aVar = new mf1.a();
        aVar.a = null;
        aVar.b = new ArrayList();
        aVar.c = null;
        aVar.d = BuildConfig.FLAVOR;
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            mf1 mf1Var = (mf1) E(sQLiteDatabaseT.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a() { // from class: gz8
                @Override // hz8.a
                public final Object apply(Object obj) {
                    HashMap map2;
                    mf1.a aVar2 = aVar;
                    ArrayList arrayList = aVar2.b;
                    Cursor cursor = (Cursor) obj;
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        map2 = map;
                        if (!zMoveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i2 = cursor.getInt(1);
                        pd6.a aVar3 = pd6.a.REASON_UNKNOWN;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                aVar3 = pd6.a.MESSAGE_TOO_OLD;
                            } else if (i2 == 2) {
                                aVar3 = pd6.a.CACHE_FULL;
                            } else if (i2 == 3) {
                                aVar3 = pd6.a.PAYLOAD_TOO_BIG;
                            } else if (i2 == 4) {
                                aVar3 = pd6.a.MAX_RETRIES_REACHED;
                            } else if (i2 == 5) {
                                aVar3 = pd6.a.INVALID_PAYLOD;
                            } else if (i2 == 6) {
                                aVar3 = pd6.a.SERVER_ERROR;
                            } else {
                                be6.a("SQLiteEventStore", Integer.valueOf(i2), "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!map2.containsKey(string)) {
                            map2.put(string, new ArrayList());
                        }
                        ((List) map2.get(string)).add(new pd6(j, aVar3));
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        int i3 = ud6.c;
                        new ArrayList();
                        arrayList.add(new ud6((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                    hz8 hz8Var = this.t;
                    long time = hz8Var.u.getTime();
                    SQLiteDatabase sQLiteDatabaseT2 = hz8Var.t();
                    sQLiteDatabaseT2.beginTransaction();
                    try {
                        Cursor cursorRawQuery = sQLiteDatabaseT2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            cursorRawQuery.moveToNext();
                            roa roaVar = new roa(cursorRawQuery.getLong(0), time);
                            cursorRawQuery.close();
                            sQLiteDatabaseT2.setTransactionSuccessful();
                            sQLiteDatabaseT2.endTransaction();
                            aVar2.a = roaVar;
                            aVar2.c = new zm4(new i1a(hz8Var.t().compileStatement("PRAGMA page_size").simpleQueryForLong() * hz8Var.t().compileStatement("PRAGMA page_count").simpleQueryForLong(), ce0.f.a));
                            aVar2.d = hz8Var.x.get();
                            return new mf1(aVar2.a, Collections.unmodifiableList(arrayList), aVar2.c, aVar2.d);
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        sQLiteDatabaseT2.endTransaction();
                        throw th2;
                    }
                }
            });
            sQLiteDatabaseT.setTransactionSuccessful();
            return mf1Var;
        } finally {
            sQLiteDatabaseT.endTransaction();
        }
    }

    @Override // defpackage.an3
    public final void l(final long j, final ef0 ef0Var) {
        v(new a() { // from class: dz8
            @Override // hz8.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                ef0 ef0Var2 = ef0Var;
                String str = ef0Var2.a;
                o98 o98Var = ef0Var2.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(r98.a(o98Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(r98.a(o98Var)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.n7a
    public final <T> T m(n7a.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseT = t();
        uf1 uf1Var = this.v;
        long time = uf1Var.getTime();
        while (true) {
            try {
                sQLiteDatabaseT.beginTransaction();
                try {
                    T tExecute = aVar.execute();
                    sQLiteDatabaseT.setTransactionSuccessful();
                    return tExecute;
                } finally {
                    sQLiteDatabaseT.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (uf1Var.getTime() >= ((long) this.w.a()) + time) {
                    throw new m7a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.an3
    public final void m0(Iterable<gw7> iterable) {
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(B(iterable));
            SQLiteDatabase sQLiteDatabaseT = t();
            sQLiteDatabaseT.beginTransaction();
            try {
                sQLiteDatabaseT.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseT.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        p(cursorRawQuery.getInt(0), pd6.a.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseT.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseT.setTransactionSuccessful();
                sQLiteDatabaseT.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseT.endTransaction();
                throw th2;
            }
        }
    }

    @Override // defpackage.an3
    public final int n() {
        long time = this.u.getTime() - this.w.b();
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            String[] strArr = {String.valueOf(time)};
            Cursor cursorRawQuery = sQLiteDatabaseT.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    p(cursorRawQuery.getInt(0), pd6.a.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseT.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseT.setTransactionSuccessful();
            sQLiteDatabaseT.endTransaction();
            return iDelete;
        } catch (Throwable th2) {
            sQLiteDatabaseT.endTransaction();
            throw th2;
        }
    }

    @Override // defpackage.an3
    public final void o(Iterable<gw7> iterable) {
        if (iterable.iterator().hasNext()) {
            t().compileStatement("DELETE FROM events WHERE _id in ".concat(B(iterable))).execute();
        }
    }

    @Override // defpackage.kf1
    public final void p(final long j, final pd6.a aVar, final String str) {
        v(new a() { // from class: ez8
            @Override // hz8.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i = aVar.t;
                String string = Integer.toString(i);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final SQLiteDatabase t() {
        e59 e59Var = this.t;
        Objects.requireNonNull(e59Var);
        uf1 uf1Var = this.v;
        long time = uf1Var.getTime();
        while (true) {
            try {
                return e59Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (uf1Var.getTime() >= ((long) this.w.a()) + time) {
                    throw new m7a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final <T> T v(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseT = t();
        sQLiteDatabaseT.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseT);
            sQLiteDatabaseT.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseT.endTransaction();
        }
    }

    @Override // defpackage.an3
    public final pe0 w(final ef0 ef0Var, final mm3 mm3Var) {
        o98 o98Var = ef0Var.c;
        String strK = mm3Var.k();
        String str = ef0Var.a;
        String strC = be6.c("SQLiteEventStore");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, "Storing event with priority=" + o98Var + ", name=" + strK + " for destination " + str);
        }
        long jLongValue = ((Long) v(new a() { // from class: cz8
            @Override // hz8.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                hz8 hz8Var = this.t;
                long jSimpleQueryForLong = hz8Var.t().compileStatement("PRAGMA page_size").simpleQueryForLong() * hz8Var.t().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ce0 ce0Var = hz8Var.w;
                long jE = ce0Var.e();
                mm3 mm3Var2 = mm3Var;
                if (jSimpleQueryForLong >= jE) {
                    hz8Var.p(1L, pd6.a.CACHE_FULL, mm3Var2.k());
                    return -1L;
                }
                ef0 ef0Var2 = ef0Var;
                Long lU = hz8.u(sQLiteDatabase, ef0Var2);
                if (lU != null) {
                    jInsert = lU.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ef0Var2.a);
                    contentValues.put("priority", Integer.valueOf(r98.a(ef0Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ef0Var2.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = ce0Var.d();
                byte[] bArr2 = mm3Var2.d().b;
                boolean z = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", mm3Var2.k());
                contentValues2.put("timestamp_ms", Long.valueOf(mm3Var2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(mm3Var2.l()));
                contentValues2.put("payload_encoding", mm3Var2.d().a.a);
                contentValues2.put("code", mm3Var2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", mm3Var2.i());
                contentValues2.put("pseudonymous_id", mm3Var2.j());
                contentValues2.put("experiment_ids_clear_blob", mm3Var2.f());
                contentValues2.put("experiment_ids_encrypted_blob", mm3Var2.g());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iD));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iD, Math.min(i * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(mm3Var2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new pe0(jLongValue, ef0Var, mm3Var);
    }

    public final ArrayList y(SQLiteDatabase sQLiteDatabase, final ef0 ef0Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lU = u(sQLiteDatabase, ef0Var);
        if (lU == null) {
            return arrayList;
        }
        E(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lU.toString()}, null, null, null, String.valueOf(i)), new a() { // from class: fz8
            @Override // hz8.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    be0.a aVar = new be0.a();
                    aVar.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        ac4.c("Null transportName");
                        break;
                    }
                    aVar.a = string;
                    aVar.d = Long.valueOf(cursor.getLong(2));
                    aVar.e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        aVar.c = new vf3(string2 == null ? hz8.y : new ag3(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        ag3 ag3Var = string3 == null ? hz8.y : new ag3(string3);
                        Cursor cursorQuery = this.t.t().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int length2 = 0;
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i2);
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                            }
                            cursorQuery.close();
                            aVar.c = new vf3(ag3Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        aVar.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        aVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        aVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        aVar.j = cursor.getBlob(11);
                    }
                    arrayList.add(new pe0(j, ef0Var, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }
}
