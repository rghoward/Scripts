package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import io.ably.lib.rest.Auth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p8c extends fyc {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final n8c d;
    public final ixc e;

    public p8c(lzc lzcVar) {
        super(lzcVar);
        this.e = new ixc(this.a.k);
        this.a.getClass();
        this.d = new n8c(this, this.a.a);
    }

    public static final String L(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : sk0.c(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void T(ContentValues contentValues, Object obj) {
        a78.d("value");
        a78.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            z90.a("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [anc, fyc, p8c] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final nnc A(String str) {
        Throwable th;
        SQLiteException e;
        tkc tkcVar = this.a;
        a78.g(str);
        g();
        h();
        ?? r2 = 0;
        nncVarC = null;
        nncVarC = null;
        nnc nncVarC = null;
        try {
            try {
                this = X().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        nncVarC = nnc.c(this.getInt(1), this.getString(0));
                    } else {
                        thc thcVar = tkcVar.f;
                        tkc.m(thcVar);
                        thcVar.n.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (nncVarC == null) {
                        return nnc.c;
                    }
                    return nncVarC;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (nncVarC == null) {
            return nnc.c;
        }
        return nncVarC;
    }

    public final void B(String str, kxc kxcVar) {
        g();
        h();
        a78.d(str);
        tkc tkcVar = this.a;
        mq2 mq2Var = tkcVar.k;
        thc thcVar = tkcVar.f;
        mq2Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ufc ufcVar = wfc.u0;
        long jLongValue = jCurrentTimeMillis - ((Long) ufcVar.a(null)).longValue();
        long j2 = kxcVar.u;
        if (j2 < jLongValue || j2 > ((Long) ufcVar.a(null)).longValue() + jCurrentTimeMillis) {
            tkc.m(thcVar);
            thcVar.i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", thc.o(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        tkc.m(thcVar);
        thcVar.n.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", kxcVar.t);
        contentValues.put("source", Integer.valueOf(kxcVar.v));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (X().insert("trigger_uris", null, contentValues) == -1) {
                tkc.m(thcVar);
                thcVar.f.b(thc.o(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            tkc.m(thcVar);
            thcVar.f.c(thc.o(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long C(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = X().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                thc thcVar = this.a.f;
                tkc.m(thcVar);
                thcVar.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long D(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = X().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                thc thcVar = this.a.f;
                tkc.m(thcVar);
                thcVar.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String E(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = X().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                thc thcVar = this.a.f;
                tkc.m(thcVar);
                thcVar.f.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void F(ContentValues contentValues) {
        tkc tkcVar = this.a;
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.h.b(thc.o("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseX.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseX.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.c(thc.o("consent_settings"), thc.o("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.f.d("Error storing into table. key", thc.o("consent_settings"), thc.o("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final r9c G(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        tkc tkcVar = this.a;
        a78.d(str2);
        a78.d(str3);
        g();
        h();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = X().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = 0;
                        long j6 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j5 = cursorQuery.getLong(8);
                        }
                        r9c r9cVar = new r9c(str2, str3, j2, j3, j5, j4, j6, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.f.b(thc.o(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return r9cVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.d("Error querying events. appId", thc.o(str2), tkcVar.j.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void H(String str, r9c r9cVar) {
        tkc tkcVar = this.a;
        a78.g(r9cVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        String str2 = r9cVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", r9cVar.b);
        contentValues.put("lifetime_count", Long.valueOf(r9cVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(r9cVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(r9cVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(r9cVar.g));
        contentValues.put("last_bundled_day", r9cVar.h);
        contentValues.put("last_sampled_complex_event_id", r9cVar.i);
        contentValues.put("last_sampling_rate", r9cVar.j);
        contentValues.put("current_session_count", Long.valueOf(r9cVar.e));
        Boolean bool = r9cVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (X().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.f.b(thc.o(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.c(thc.o(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void I(String str, String str2) {
        a78.d(str2);
        g();
        h();
        try {
            X().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.c(thc.o(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final pzc J(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        asc ascVar;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        tkc tkcVar = this.a;
        if (zIsEmpty) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.m.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            gkc gkcVar = (gkc) qzc.R(skc.E(), bArr);
            asc[] ascVarArrValues = asc.values();
            int length = ascVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    ascVar = asc.UNKNOWN;
                    break;
                }
                ascVar = ascVarArrValues[i4];
                if (ascVar.t == i2) {
                    break;
                }
                i4++;
            }
            if (ascVar != asc.GOOGLE_SIGNAL && ascVar != asc.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((skc) gkcVar.u).x()).iterator();
                while (it.hasNext()) {
                    ukc ukcVar = (ukc) ((wkc) it.next()).p();
                    ukcVar.h();
                    ((wkc) ukcVar.u).b1(i3);
                    arrayList.add((wkc) ukcVar.j());
                }
                gkcVar.h();
                ((skc) gkcVar.u).J();
                gkcVar.h();
                ((skc) gkcVar.u).I(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        thc thcVar2 = tkcVar.f;
                        tkc.m(thcVar2);
                        thcVar2.f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new pzc(j2, (skc) gkcVar.j(), str2, map, ascVar, j3, j4, j5, i3);
        } catch (IOException e) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.f.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String K() {
        this.a.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l2 = (Long) wfc.S.a(null);
        l2.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l2 + ")";
        String strA = jp2.a(((Long) wfc.R.a(null)).longValue(), ")", ao3.b("(upload_type != 1 AND ABS(creation_timestamp - ", jCurrentTimeMillis, ") > "));
        StringBuilder sb = new StringBuilder(str.length() + 5 + strA.length() + 1);
        ux1.b(sb, "(", str, " OR ", strA);
        sb.append(")");
        return sb.toString();
    }

    public final void M(String str, nnc nncVar) {
        a78.g(str);
        a78.g(nncVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", nncVar.g());
        contentValues.put("consent_source", Integer.valueOf(nncVar.b));
        F(contentValues);
    }

    public final List N(String str) {
        List list;
        String string;
        tkc tkcVar = this.a;
        g();
        h();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            sQLiteDatabaseX.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseX.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = BuildConfig.FLAVOR;
                            } else {
                                string = cursorQuery.getString(1);
                                a78.g(string);
                            }
                            if (string2 == null) {
                                thc thcVar = tkcVar.f;
                                tkc.m(thcVar);
                                thcVar.f.b(thc.o(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j2 = cursorQuery.getLong(2);
                                yec yecVarX = zec.x();
                                yecVarX.h();
                                ((zec) yecVarX.u).y(string2);
                                yecVarX.h();
                                ((zec) yecVarX.u).B(j2);
                                yecVarX.h();
                                ((zec) yecVarX.u).A(string);
                                if (zIsEmpty) {
                                    yecVarX.h();
                                    ((zec) yecVarX.u).z();
                                }
                                arrayList.add((zec) yecVarX.j());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseX.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseX.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseX.setTransactionSuccessful();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    sQLiteDatabaseX.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.c(thc.o(str), e, "Error querying or deleting diagnostic signals. appId");
                list = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                list = arrayList;
                cursorQuery.close();
            }
            list = arrayList;
            sQLiteDatabaseX.endTransaction();
            return list;
        } catch (SQLiteException e2) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.f.c(thc.o(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void O(String str, nnc nncVar) {
        a78.g(str);
        g();
        h();
        M(str, A(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", nncVar.g());
        F(contentValues);
    }

    public final nnc P(String str) {
        a78.g(str);
        g();
        h();
        return nnc.c(100, E("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r9c Q(String str, tjc tjcVar, String str2) {
        r9c r9cVarG = G("events", str, tjcVar.C());
        if (r9cVarG != null) {
            long j2 = r9cVarG.e + 1;
            long j3 = r9cVarG.d + 1;
            return new r9c(r9cVarG.a, r9cVarG.b, r9cVarG.c + 1, j3, j2, r9cVarG.f, r9cVarG.g, r9cVarG.h, r9cVarG.i, r9cVarG.j, r9cVarG.k);
        }
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.i.c(thc.o(str), tkcVar.j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new r9c(str, tjcVar.C(), 1L, 1L, 1L, tjcVar.E(), 0L, null, null, null, null);
    }

    public final boolean R() {
        return this.a.a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a A[Catch: all -> 0x0077, SQLiteException -> 0x007a, LOOP:0: B:66:0x018a->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e0 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void S(String str, long j2, long j3, ezc ezcVar) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jD;
        long j4;
        String[] strArr2;
        String str3;
        long j5;
        rjc rjcVar;
        tkc tkcVar = this.a;
        g();
        h();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = BuildConfig.FLAVOR;
                if (IsEmpty != 0) {
                    String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                    if (j3 != -1) {
                        str4 = "rowid <= ? and ";
                    }
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseX.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseX.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        wkc wkcVar = (wkc) ((ukc) qzc.R(wkc.c0(), cursorRawQuery.getBlob(0))).j();
                                        if (cursorRawQuery.moveToNext()) {
                                            thc thcVar = tkcVar.f;
                                            tkc.m(thcVar);
                                            thcVar.i.b(thc.o(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        ezcVar.a = wkcVar;
                                        jD = D("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j3 == -1) {
                                            if (jD != -1) {
                                                j4 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j5 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j6 = cursorRawQuery.getLong(4);
                                                    try {
                                                        rjcVar = (rjc) qzc.R(tjc.N(), blob);
                                                        rjcVar.u(cursorRawQuery.getString(1));
                                                        long j7 = cursorRawQuery.getLong(2);
                                                        rjcVar.h();
                                                        ((tjc) rjcVar.u).U(j7);
                                                        rjcVar.h();
                                                        ((tjc) rjcVar.u).x(j6);
                                                        if (!ezcVar.a(j5, (tjc) rjcVar.j())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        thc thcVar2 = tkcVar.f;
                                                        tkc.m(thcVar2);
                                                        thcVar2.f.c(thc.o(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                thc thcVar3 = tkcVar.f;
                                                tkc.m(thcVar3);
                                                thcVar3.i.b(thc.o(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j4 = j3;
                                        }
                                        if (j4 == -1 && jD != -1) {
                                            jD = Math.min(j4, jD);
                                        } else if (j4 != -1) {
                                            jD = j4;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jD)};
                                        cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j5 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j8 = cursorRawQuery.getLong(4);
                                                rjcVar = (rjc) qzc.R(tjc.N(), blob2);
                                                rjcVar.u(cursorRawQuery.getString(1));
                                                long j9 = cursorRawQuery.getLong(2);
                                                rjcVar.h();
                                                ((tjc) rjcVar.u).U(j9);
                                                rjcVar.h();
                                                ((tjc) rjcVar.u).x(j8);
                                                if (!ezcVar.a(j5, (tjc) rjcVar.j())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            thc thcVar4 = tkcVar.f;
                                            tkc.m(thcVar4);
                                            thcVar4.i.b(thc.o(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        thc thcVar5 = tkcVar.f;
                                        tkc.m(thcVar5);
                                        thcVar5.f.c(thc.o(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    thc thcVar6 = tkcVar.f;
                                    tkc.m(thcVar6);
                                    thcVar6.f.b(thc.o(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                thc thcVar7 = tkcVar.f;
                                tkc.m(thcVar7);
                                thcVar7.f.c(thc.o(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j3 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j3)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j3 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseX.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseX.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                thc thcVar8 = tkcVar.f;
                                tkc.m(thcVar8);
                                thcVar8.f.b(thc.o(r3), "Raw event metadata record is missing. appId");
                            } else {
                                wkc wkcVar2 = (wkc) ((ukc) qzc.R(wkc.c0(), cursorRawQuery.getBlob(0))).j();
                                if (cursorRawQuery.moveToNext()) {
                                    thc thcVar9 = tkcVar.f;
                                    tkc.m(thcVar9);
                                    thcVar9.i.b(thc.o(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                ezcVar.a = wkcVar2;
                                jD = D("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j3 == -1) {
                                    if (jD != -1) {
                                        j4 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j5 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j10 = cursorRawQuery.getLong(4);
                                            rjcVar = (rjc) qzc.R(tjc.N(), blob3);
                                            rjcVar.u(cursorRawQuery.getString(1));
                                            long j11 = cursorRawQuery.getLong(2);
                                            rjcVar.h();
                                            ((tjc) rjcVar.u).U(j11);
                                            rjcVar.h();
                                            ((tjc) rjcVar.u).x(j10);
                                            if (!ezcVar.a(j5, (tjc) rjcVar.j())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        thc thcVar10 = tkcVar.f;
                                        tkc.m(thcVar10);
                                        thcVar10.i.b(thc.o(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j4 = j3;
                                }
                                if (j4 == -1) {
                                    if (j4 != -1) {
                                        jD = j4;
                                    }
                                } else if (j4 != -1) {
                                    jD = j4;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jD)};
                                cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j5 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j12 = cursorRawQuery.getLong(4);
                                        rjcVar = (rjc) qzc.R(tjc.N(), blob4);
                                        rjcVar.u(cursorRawQuery.getString(1));
                                        long j13 = cursorRawQuery.getLong(2);
                                        rjcVar.h();
                                        ((tjc) rjcVar.u).U(j13);
                                        rjcVar.h();
                                        ((tjc) rjcVar.u).x(j12);
                                        if (!ezcVar.a(j5, (tjc) rjcVar.j())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    thc thcVar11 = tkcVar.f;
                                    tkc.m(thcVar11);
                                    thcVar11.i.b(thc.o(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        thc thcVar12 = tkcVar.f;
                        tkc.m(thcVar12);
                        thcVar12.f.c(thc.o(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    public final void U() {
        h();
        X().beginTransaction();
    }

    public final void V() {
        h();
        X().setTransactionSuccessful();
    }

    public final void W() {
        h();
        X().endTransaction();
    }

    public final SQLiteDatabase X() {
        g();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.b(e, "Error opening database");
            throw e;
        }
    }

    public final void Y(String str) {
        r9c r9cVarG;
        I("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = X().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (r9cVarG = G("events", str, string)) != null) {
                            H("events_snapshot", r9cVarG);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                thc thcVar = this.a.f;
                tkc.m(thcVar);
                thcVar.f.c(thc.o(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void Z(String str) throws Throwable {
        boolean z;
        r9c r9cVarG;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r9c r9cVarG2 = G("events", str, "_f");
        r9c r9cVarG3 = G("events", str, "_v");
        I("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = X().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (r9cVarG = G("events_snapshot", str, string)) != null) {
                            H("events", r9cVarG);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            thc thcVar = this.a.f;
                            tkc.m(thcVar);
                            thcVar.f.c(thc.o(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && r9cVarG2 != null) {
                                H("events", r9cVarG2);
                            } else if (!z && r9cVarG3 != null) {
                                H("events", r9cVarG3);
                            }
                            I("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                H("events", r9cVarG3);
                            }
                        } else if (!z) {
                            H("events", r9cVarG3);
                        }
                        I("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && r9cVarG2 != null) {
                    H("events", r9cVarG2);
                } else if (!z && r9cVarG3 != null) {
                    H("events", r9cVarG3);
                }
            } else {
                cursorQuery.close();
                if (r9cVarG2 != null) {
                    H("events", r9cVarG2);
                } else if (r9cVarG3 != null) {
                    H("events", r9cVarG3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        I("events_snapshot", str);
    }

    public final void a0(String str, String str2) {
        a78.d(str);
        a78.d(str2);
        g();
        h();
        try {
            X().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            tkc tkcVar = this.a;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.d("Error deleting user property. appId", thc.o(str), tkcVar.j.c(str2), e);
        }
    }

    public final boolean b0(vzc vzcVar) {
        String str = vzcVar.b;
        g();
        h();
        String str2 = vzcVar.a;
        String str3 = vzcVar.c;
        vzc vzcVarC0 = c0(str2, str3);
        tkc tkcVar = this.a;
        if (vzcVarC0 == null) {
            if (yzc.h0(str3)) {
                if (C("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(tkcVar.d.p(str2, wfc.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jC = C("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                tkcVar.getClass();
                if (jC >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(vzcVar.d));
        T(contentValues, vzcVar.e);
        try {
            if (X().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(thc.o(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.c(thc.o(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final vzc c0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        tkc tkcVar = this.a;
        a78.d(str);
        a78.d(str2);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Object objT = t(cursorQuery, 1);
                        if (objT != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                vzc vzcVar = new vzc(str3, cursorQuery.getString(2), str4, j2, objT);
                                if (cursorQuery.moveToNext()) {
                                    thc thcVar = tkcVar.f;
                                    tkc.m(thcVar);
                                    thcVar.f.b(thc.o(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return vzcVar;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        thc thcVar2 = tkcVar.f;
                        tkc.m(thcVar2);
                        thcVar2.f.d("Error querying user property. appId", thc.o(str3), tkcVar.j.c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List d0(String str) {
        String str2;
        SQLiteException sQLiteException;
        tkc tkcVar = this.a;
        a78.d(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                tkcVar.getClass();
                cursorQuery = X().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = BuildConfig.FLAVOR;
                        }
                        String str3 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objT = t(cursorQuery, 3);
                        if (objT == null) {
                            try {
                                thc thcVar = tkcVar.f;
                                tkc.m(thcVar);
                                thcVar.f.b(thc.o(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                thc thcVar2 = tkcVar.f;
                                tkc.m(thcVar2);
                                thcVar2.f.c(thc.o(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new vzc(str2, str3, string, j2, objT));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            thc thcVar3 = tkcVar.f;
                            tkc.m(thcVar3);
                            thcVar3.f.c(thc.o(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List e0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        tkc tkcVar = this.a;
        a78.d(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append(Auth.WILDCARD_CLIENTID);
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            tkcVar.getClass();
            thc thcVar = tkcVar.f;
            cursorQuery = X().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    tkc.m(thcVar);
                                    thcVar.f.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j2 = cursorQuery.getLong(1);
                                Object objT = t(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objT == null) {
                                    try {
                                        tkc.m(thcVar);
                                        thcVar.f.d("(2)Read invalid user property value, ignoring it", thc.o(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            thc thcVar2 = tkcVar.f;
                                            tkc.m(thcVar2);
                                            thcVar2.f.d("(2)Error querying user properties", thc.o(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new vzc(str, str5, string2, j2, objT));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    thc thcVar3 = tkcVar.f;
                                    tkc.m(thcVar3);
                                    thcVar3.f.d("(2)Error querying user properties", thc.o(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                thc thcVar4 = tkcVar.f;
                                tkc.m(thcVar4);
                                thcVar4.f.d("(2)Error querying user properties", thc.o(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean f0(e5c e5cVar) {
        g();
        h();
        String str = e5cVar.t;
        a78.g(str);
        vzc vzcVarC0 = c0(str, e5cVar.v.u);
        tkc tkcVar = this.a;
        if (vzcVarC0 == null) {
            long jC = C("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            tkcVar.getClass();
            if (jC >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", e5cVar.u);
        contentValues.put("name", e5cVar.v.u);
        Object objJ = e5cVar.v.j();
        a78.g(objJ);
        T(contentValues, objJ);
        contentValues.put("active", Boolean.valueOf(e5cVar.x));
        contentValues.put("trigger_event_name", e5cVar.y);
        contentValues.put("trigger_timeout", Long.valueOf(e5cVar.A));
        z9c z9cVar = e5cVar.z;
        yzc yzcVar = tkcVar.i;
        thc thcVar = tkcVar.f;
        tkc.k(yzcVar);
        contentValues.put("timed_out_event", yzc.Q(z9cVar));
        contentValues.put("creation_timestamp", Long.valueOf(e5cVar.w));
        tkc.k(yzcVar);
        contentValues.put("triggered_event", yzc.Q(e5cVar.B));
        contentValues.put("triggered_timestamp", Long.valueOf(e5cVar.v.v));
        contentValues.put("time_to_live", Long.valueOf(e5cVar.C));
        contentValues.put("expired_event", yzc.Q(e5cVar.D));
        try {
            if (X().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            tkc.m(thcVar);
            thcVar.f.b(thc.o(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            tkc.m(thcVar);
            thcVar.f.c(thc.o(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00ed: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:238), block:B:29:0x00ed */
    public final e5c g0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        tkc tkcVar = this.a;
        a78.d(str);
        a78.d(str2);
        g();
        h();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = X().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = BuildConfig.FLAVOR;
                    }
                    String str4 = string;
                    Object objT = t(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    qzc qzcVar = this.b.g;
                    lzc.U(qzcVar);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<z9c> creator = z9c.CREATOR;
                    z9c z9cVar = (z9c) qzcVar.J(blob, creator);
                    long j3 = cursorQuery.getLong(6);
                    lzc.U(qzcVar);
                    z9c z9cVar2 = (z9c) qzcVar.J(cursorQuery.getBlob(7), creator);
                    long j4 = cursorQuery.getLong(8);
                    long j5 = cursorQuery.getLong(9);
                    lzc.U(qzcVar);
                    str3 = str2;
                    try {
                        e5c e5cVar = new e5c(str, str4, new szc(j4, objT, str3, str4), j3, z, string2, z9cVar, j2, z9cVar2, j5, (z9c) qzcVar.J(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.f.c(thc.o(str), tkcVar.j.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return e5cVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.f.d("Error querying conditional property", thc.o(str), tkcVar.j.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void h0(String str, String str2) {
        a78.d(str);
        a78.d(str2);
        g();
        h();
        try {
            X().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            tkc tkcVar = this.a;
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.d("Error deleting conditional property", thc.o(str), tkcVar.j.c(str2), e);
        }
    }

    public final List i0(String str, String str2, String str3) {
        a78.d(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Auth.WILDCARD_CLIENTID));
            sb.append(" and name glob ?");
        }
        return j0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.fyc
    public final void j() {
        tkc tkcVar = this.a;
        if (tkcVar.d.r(null, wfc.e1)) {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.p(new Runnable() { // from class: h8c
                @Override // java.lang.Runnable
                public final void run() {
                    p8c p8cVar = this.t;
                    try {
                        SQLiteDatabase sQLiteDatabaseX = p8cVar.X();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("elapsed_time", (Long) 0L);
                        sQLiteDatabaseX.update("raw_events", contentValues, null, null);
                    } catch (SQLiteException e) {
                        thc thcVar = p8cVar.a.f;
                        tkc.m(thcVar);
                        thcVar.f.b(e, "Failed to remove elapsed times from raw events table");
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List j0(String str, String[] strArr) {
        tkc tkcVar = this.a;
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                tkcVar.getClass();
                cursorQuery = X().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objT = t(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j2 = cursorQuery.getLong(6);
                        qzc qzcVar = this.b.g;
                        lzc.U(qzcVar);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<z9c> creator = z9c.CREATOR;
                        z9c z9cVar = (z9c) qzcVar.J(blob, creator);
                        long j3 = cursorQuery.getLong(8);
                        lzc.U(qzcVar);
                        z9c z9cVar2 = (z9c) qzcVar.J(cursorQuery.getBlob(9), creator);
                        long j4 = cursorQuery.getLong(10);
                        long j5 = cursorQuery.getLong(11);
                        lzc.U(qzcVar);
                        arrayList.add(new e5c(string, string2, new szc(j4, objT, string3, string2), j3, z, string4, z9cVar, j2, z9cVar2, j5, (z9c) qzcVar.J(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long k(String str, skc skcVar, String str2, Map map, asc ascVar, Long l2) {
        int iDelete;
        g();
        h();
        a78.g(skcVar);
        a78.d(str);
        g();
        h();
        boolean zR = R();
        tkc tkcVar = this.a;
        if (zR) {
            lzc lzcVar = this.b;
            long jA = lzcVar.i.f.a();
            mq2 mq2Var = tkcVar.k;
            thc thcVar = tkcVar.f;
            mq2Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) wfc.M.a(null)).longValue()) {
                lzcVar.i.f.b(jElapsedRealtime);
                g();
                h();
                if (R() && (iDelete = X().delete("upload_queue", K(), new String[0])) > 0) {
                    tkc.m(thcVar);
                    thcVar.n.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                a78.d(str);
                g();
                h();
                try {
                    int iP = tkcVar.d.p(str, wfc.A);
                    if (iP > 0) {
                        X().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iP)});
                    }
                } catch (SQLiteException e) {
                    tkc.m(thcVar);
                    thcVar.f.c(thc.o(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrG = skcVar.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrG);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(ascVar.t));
        mq2 mq2Var2 = tkcVar.k;
        thc thcVar2 = tkcVar.f;
        mq2Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = X().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            tkc.m(thcVar2);
            thcVar2.f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            tkc.m(thcVar2);
            thcVar2.f.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0405  */
    public final hic k0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        tkc tkcVar = this.a;
        a78.d(str);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        lzc lzcVar = this.b;
                        hic hicVar = new hic(lzcVar.l, str);
                        tkc tkcVar2 = hicVar.a;
                        nnc nncVarD = lzcVar.d(str);
                        lnc lncVar = lnc.ANALYTICS_STORAGE;
                        if (nncVarD.i(lncVar)) {
                            hicVar.G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        hicVar.I(cursorQuery.getString(1));
                        if (lzcVar.d(str).i(lnc.AD_STORAGE)) {
                            hicVar.J(cursorQuery.getString(2));
                        }
                        hicVar.e(cursorQuery.getLong(3));
                        hicVar.M(cursorQuery.getLong(4));
                        hicVar.N(cursorQuery.getLong(5));
                        hicVar.P(cursorQuery.getString(6));
                        hicVar.S(cursorQuery.getString(7));
                        hicVar.T(cursorQuery.getLong(8));
                        hicVar.a(cursorQuery.getLong(9));
                        hicVar.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        hicVar.i(cursorQuery.getLong(11));
                        hicVar.j(cursorQuery.getLong(12));
                        hicVar.k(cursorQuery.getLong(13));
                        hicVar.l(cursorQuery.getLong(14));
                        hicVar.f(cursorQuery.getLong(15));
                        hicVar.g(cursorQuery.getLong(16));
                        hicVar.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        hicVar.L(cursorQuery.getString(18));
                        hicVar.n(cursorQuery.getLong(19));
                        hicVar.m(cursorQuery.getLong(20));
                        hicVar.w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        fkc fkcVar = tkcVar2.g;
                        tkc.m(fkcVar);
                        fkcVar.g();
                        hicVar.R |= hicVar.p != z2;
                        hicVar.p = z2;
                        hicVar.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            hicVar.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (lzcVar.d(str).i(lncVar)) {
                            String string2 = cursorQuery.getString(28);
                            fkc fkcVar2 = tkcVar2.g;
                            tkc.m(fkcVar2);
                            fkcVar2.g();
                            hicVar.R |= !Objects.equals(hicVar.t, string2);
                            hicVar.t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        fkc fkcVar3 = tkcVar2.g;
                        tkc.m(fkcVar3);
                        fkcVar3.g();
                        hicVar.R |= hicVar.u != z3;
                        hicVar.u = z3;
                        hicVar.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        fkc fkcVar4 = tkcVar2.g;
                        tkc.m(fkcVar4);
                        fkcVar4.g();
                        hicVar.R |= hicVar.C != string3;
                        hicVar.C = string3;
                        hicVar.A(cursorQuery.getLong(30));
                        hicVar.B(cursorQuery.getLong(31));
                        o6c.a();
                        if (tkcVar.d.r(str, wfc.O0)) {
                            int i2 = cursorQuery.getInt(32);
                            fkc fkcVar5 = tkcVar2.g;
                            tkc.m(fkcVar5);
                            fkcVar5.g();
                            hicVar.R |= hicVar.x != i2;
                            hicVar.x = i2;
                            hicVar.C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        fkc fkcVar6 = tkcVar2.g;
                        tkc.m(fkcVar6);
                        fkcVar6.g();
                        hicVar.R |= hicVar.y != z4;
                        hicVar.y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        fkc fkcVar7 = tkcVar2.g;
                        tkc.m(fkcVar7);
                        fkcVar7.g();
                        hicVar.R |= !Objects.equals(hicVar.q, boolValueOf);
                        hicVar.q = boolValueOf;
                        hicVar.p(cursorQuery.getInt(37));
                        hicVar.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = BuildConfig.FLAVOR;
                        } else {
                            string = cursorQuery.getString(40);
                            a78.g(string);
                        }
                        fkc fkcVar8 = tkcVar2.g;
                        tkc.m(fkcVar8);
                        fkcVar8.g();
                        hicVar.R |= hicVar.G != string;
                        hicVar.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            fkc fkcVar9 = tkcVar2.g;
                            tkc.m(fkcVar9);
                            fkcVar9.g();
                            hicVar.R |= !Objects.equals(hicVar.z, lValueOf);
                            hicVar.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            fkc fkcVar10 = tkcVar2.g;
                            tkc.m(fkcVar10);
                            fkcVar10.g();
                            hicVar.R |= !Objects.equals(hicVar.A, lValueOf2);
                            hicVar.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        fkc fkcVar11 = tkcVar2.g;
                        tkc.m(fkcVar11);
                        fkcVar11.g();
                        hicVar.R |= hicVar.H != blob;
                        hicVar.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i3 = cursorQuery.getInt(44);
                            fkc fkcVar12 = tkcVar2.g;
                            tkc.m(fkcVar12);
                            fkcVar12.g();
                            boolean z5 = hicVar.R;
                            if (hicVar.I == i3) {
                                z = false;
                            }
                            hicVar.R = z | z5;
                            hicVar.I = i3;
                        }
                        if (tkcVar.d.r(str, wfc.j1) && !cursorQuery.isNull(45)) {
                            hicVar.u(cursorQuery.getLong(45));
                        }
                        fkc fkcVar13 = tkcVar2.g;
                        tkc.m(fkcVar13);
                        fkcVar13.g();
                        hicVar.R = false;
                        if (cursorQuery.moveToNext()) {
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.f.b(thc.o(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return hicVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.c(thc.o(str), e, "Error querying app. appId");
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List l(String str, yxc yxcVar, int i2) {
        ?? arrayList;
        a78.d(str);
        g();
        h();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strL = L(yxcVar.t);
            String strK = K();
            StringBuilder sb = new StringBuilder(strL.length() + 17 + strK.length());
            sb.append("app_id=?");
            sb.append(strL);
            sb.append(" AND NOT ");
            sb.append(strK);
            cursorQuery = sQLiteDatabaseX.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                pzc pzcVarJ = J(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (pzcVarJ != null) {
                    arrayList.add(pzcVarJ);
                }
            }
        } catch (SQLiteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void l0(hic hicVar, boolean z) {
        tkc tkcVar = hicVar.a;
        g();
        h();
        String strE = hicVar.E();
        a78.g(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        lnc lncVar = lnc.ANALYTICS_STORAGE;
        lzc lzcVar = this.b;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (lzcVar.d(strE).i(lncVar)) {
            contentValues.put("app_instance_id", hicVar.F());
        }
        contentValues.put("gmp_app_id", hicVar.H());
        if (lzcVar.d(strE).i(lnc.AD_STORAGE)) {
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            fkcVar.g();
            contentValues.put("resettable_device_id_hash", hicVar.e);
        }
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.g();
        contentValues.put("last_bundle_index", Long.valueOf(hicVar.g));
        fkc fkcVar3 = tkcVar.g;
        tkc.m(fkcVar3);
        fkcVar3.g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(hicVar.h));
        fkc fkcVar4 = tkcVar.g;
        tkc.m(fkcVar4);
        fkcVar4.g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(hicVar.i));
        contentValues.put("app_version", hicVar.O());
        fkc fkcVar5 = tkcVar.g;
        tkc.m(fkcVar5);
        fkcVar5.g();
        contentValues.put("app_store", hicVar.l);
        fkc fkcVar6 = tkcVar.g;
        tkc.m(fkcVar6);
        fkcVar6.g();
        contentValues.put("gmp_version", Long.valueOf(hicVar.m));
        fkc fkcVar7 = tkcVar.g;
        tkc.m(fkcVar7);
        fkcVar7.g();
        contentValues.put("dev_cert_hash", Long.valueOf(hicVar.n));
        fkc fkcVar8 = tkcVar.g;
        tkc.m(fkcVar8);
        fkcVar8.g();
        contentValues.put("measurement_enabled", Boolean.valueOf(hicVar.o));
        fkc fkcVar9 = tkcVar.g;
        fkc fkcVar10 = tkcVar.g;
        tkc.m(fkcVar9);
        fkcVar9.g();
        contentValues.put("day", Long.valueOf(hicVar.K));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_public_events_count", Long.valueOf(hicVar.L));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_events_count", Long.valueOf(hicVar.M));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_conversions_count", Long.valueOf(hicVar.N));
        fkc fkcVar11 = tkcVar.g;
        tkc.m(fkcVar11);
        fkcVar11.g();
        contentValues.put("config_fetched_time", Long.valueOf(hicVar.S));
        fkc fkcVar12 = tkcVar.g;
        tkc.m(fkcVar12);
        fkcVar12.g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(hicVar.T));
        contentValues.put("app_version_int", Long.valueOf(hicVar.Q()));
        contentValues.put("firebase_instance_id", hicVar.K());
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_error_events_count", Long.valueOf(hicVar.O));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(hicVar.P));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("health_monitor_sample", hicVar.Q);
        contentValues.put("android_id", (Long) 0L);
        fkc fkcVar13 = tkcVar.g;
        tkc.m(fkcVar13);
        fkcVar13.g();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(hicVar.p));
        contentValues.put("dynamite_version", Long.valueOf(hicVar.b()));
        if (lzcVar.d(strE).i(lncVar)) {
            fkc fkcVar14 = tkcVar.g;
            tkc.m(fkcVar14);
            fkcVar14.g();
            contentValues.put("session_stitching_token", hicVar.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(hicVar.z()));
        fkc fkcVar15 = tkcVar.g;
        tkc.m(fkcVar15);
        fkcVar15.g();
        contentValues.put("target_os_version", Long.valueOf(hicVar.v));
        fkc fkcVar16 = tkcVar.g;
        tkc.m(fkcVar16);
        fkcVar16.g();
        contentValues.put("session_stitching_token_hash", Long.valueOf(hicVar.w));
        o6c.a();
        tkc tkcVar2 = this.a;
        t7c t7cVar = tkcVar2.d;
        thc thcVar = tkcVar2.f;
        if (t7cVar.r(strE, wfc.O0)) {
            fkc fkcVar17 = tkcVar.g;
            tkc.m(fkcVar17);
            fkcVar17.g();
            contentValues.put("ad_services_version", Integer.valueOf(hicVar.x));
            fkc fkcVar18 = tkcVar.g;
            tkc.m(fkcVar18);
            fkcVar18.g();
            contentValues.put("attribution_eligibility_status", Long.valueOf(hicVar.B));
        }
        fkc fkcVar19 = tkcVar.g;
        tkc.m(fkcVar19);
        fkcVar19.g();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(hicVar.y));
        contentValues.put("npa_metadata_value", hicVar.x());
        fkc fkcVar20 = tkcVar.g;
        tkc.m(fkcVar20);
        fkcVar20.g();
        contentValues.put("bundle_delivery_index", Long.valueOf(hicVar.F));
        contentValues.put("sgtm_preview_key", hicVar.D());
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("dma_consent_state", Integer.valueOf(hicVar.D));
        tkc.m(fkcVar10);
        fkcVar10.g();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(hicVar.E));
        contentValues.put("serialized_npa_metadata", hicVar.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(hicVar.t()));
        fkc fkcVar21 = tkcVar.g;
        tkc.m(fkcVar21);
        fkcVar21.g();
        ArrayList arrayList = hicVar.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                tkc.m(thcVar);
                thcVar.i.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (t7cVar.r(null, wfc.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        fkc fkcVar22 = tkcVar.g;
        tkc.m(fkcVar22);
        fkcVar22.g();
        contentValues.put("unmatched_pfo", hicVar.z);
        fkc fkcVar23 = tkcVar.g;
        tkc.m(fkcVar23);
        fkcVar23.g();
        contentValues.put("unmatched_uwa", hicVar.A);
        fkc fkcVar24 = tkcVar.g;
        tkc.m(fkcVar24);
        fkcVar24.g();
        contentValues.put("ad_campaign_info", hicVar.H);
        if (t7cVar.r(strE, wfc.j1)) {
            fkc fkcVar25 = tkcVar.g;
            tkc.m(fkcVar25);
            fkcVar25.g();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(hicVar.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            if (sQLiteDatabaseX.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseX.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                tkc.m(thcVar);
                thcVar.f.b(thc.o(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            tkc.m(thcVar);
            thcVar.f.c(thc.o(strE), e, "Error storing app. appId");
        }
    }

    public final boolean m(String str) {
        asc[] ascVarArr = {asc.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ascVarArr[0].t));
        String strL = L(arrayList);
        String strK = K();
        return C(ao2.a(new StringBuilder((strL.length() + 61) + strK.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strL, " AND NOT ", strK), new String[]{str}) != 0;
    }

    public final f8c m0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return n0(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void n(Long l2) {
        tkc tkcVar = this.a;
        g();
        h();
        try {
            if (X().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final f8c n0(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        tkc tkcVar = this.a;
        a78.d(str);
        g();
        h();
        String[] strArr = {str};
        f8c f8cVar = new f8c();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                cursorQuery = sQLiteDatabaseX.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        f8cVar.b = cursorQuery.getLong(1);
                        f8cVar.a = cursorQuery.getLong(2);
                        f8cVar.c = cursorQuery.getLong(3);
                        f8cVar.d = cursorQuery.getLong(4);
                        f8cVar.e = cursorQuery.getLong(5);
                        f8cVar.f = cursorQuery.getLong(6);
                        f8cVar.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        f8cVar.b += j3;
                    }
                    if (z2) {
                        f8cVar.a += j3;
                    }
                    if (z3) {
                        f8cVar.c += j3;
                    }
                    if (z4) {
                        f8cVar.d += j3;
                    }
                    if (z5) {
                        f8cVar.e += j3;
                    }
                    if (z6) {
                        f8cVar.f += j3;
                    }
                    if (z7) {
                        f8cVar.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(f8cVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(f8cVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(f8cVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(f8cVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(f8cVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(f8cVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(f8cVar.g));
                    sQLiteDatabaseX.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.i.b(thc.o(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.c(thc.o(str), e, "Error updating daily counts. appId");
            }
            return f8cVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String o() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseX = X();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseX.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    thc thcVar = this.a.f;
                    tkc.m(thcVar);
                    thcVar.f.b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseX;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    public final d8c o0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        tkc tkcVar = this.a;
        a78.d(str);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            thc thcVar = tkcVar.f;
                            tkc.m(thcVar);
                            thcVar.f.b(thc.o(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            d8c d8cVar = new d8c(string, string2, blob);
                            cursorQuery.close();
                            return d8cVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    thc thcVar2 = tkcVar.f;
                    tkc.m(thcVar2);
                    thcVar2.f.c(thc.o(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void p(long j2) {
        g();
        h();
        try {
            if (X().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void p0(wkc wkcVar, boolean z) {
        g();
        h();
        a78.d(wkcVar.x());
        if (!wkcVar.k2()) {
            d43.c();
            return;
        }
        q();
        tkc tkcVar = this.a;
        mq2 mq2Var = tkcVar.k;
        thc thcVar = tkcVar.f;
        mq2Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jL2 = wkcVar.l2();
        ufc ufcVar = wfc.R;
        if (jL2 < jCurrentTimeMillis - ((Long) ufcVar.a(null)).longValue() || wkcVar.l2() > ((Long) ufcVar.a(null)).longValue() + jCurrentTimeMillis) {
            tkc.m(thcVar);
            thcVar.i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", thc.o(wkcVar.x()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(wkcVar.l2()));
        }
        byte[] bArrG = wkcVar.g();
        try {
            qzc qzcVar = this.b.g;
            lzc.U(qzcVar);
            byte[] bArrQ = qzcVar.Q(bArrG);
            tkc.m(thcVar);
            thcVar.n.b(Integer.valueOf(bArrQ.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", wkcVar.x());
            contentValues.put("bundle_end_timestamp", Long.valueOf(wkcVar.l2()));
            contentValues.put("data", bArrQ);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (wkcVar.x0()) {
                contentValues.put("retry_count", Integer.valueOf(wkcVar.y0()));
            }
            try {
                if (X().insert("queue", null, contentValues) == -1) {
                    tkc.m(thcVar);
                    thcVar.f.b(thc.o(wkcVar.x()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                tkc.m(thcVar);
                thcVar.f.c(thc.o(wkcVar.x()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            tkc.m(thcVar);
            thcVar.f.c(thc.o(wkcVar.x()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void q() {
        g();
        h();
        if (R()) {
            lzc lzcVar = this.b;
            long jA = lzcVar.i.e.a();
            tkc tkcVar = this.a;
            tkcVar.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) wfc.M.a(null)).longValue()) {
                lzcVar.i.e.b(jElapsedRealtime);
                g();
                h();
                if (R()) {
                    SQLiteDatabase sQLiteDatabaseX = X();
                    tkcVar.k.getClass();
                    int iDelete = sQLiteDatabaseX.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) wfc.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        thc thcVar = tkcVar.f;
                        tkc.m(thcVar);
                        thcVar.n.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void r(ArrayList arrayList) {
        g();
        h();
        a78.g(arrayList);
        if (arrayList.size() == 0) {
            z90.a("Given Integer is zero");
            return;
        }
        if (R()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strA = w27.a(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            long jC = C(w27.a(new StringBuilder(strA.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strA, " AND retry_count =  2147483647 LIMIT 1"), null);
            tkc tkcVar = this.a;
            if (jC > 0) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                StringBuilder sb = new StringBuilder(strA.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strA);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseX.execSQL(sb.toString());
            } catch (SQLiteException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void s(Long l2) {
        g();
        h();
        if (R()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            long jC = C(sb.toString(), null);
            tkc tkcVar = this.a;
            if (jC > 0) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                tkcVar.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l2.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l2);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseX.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                thc thcVar2 = tkcVar.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object t(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        tkc tkcVar = this.a;
        if (type == 0) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        thc thcVar3 = tkcVar.f;
        tkc.m(thcVar3);
        thcVar3.f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091 A[Catch: all -> 0x006b, SQLiteException -> 0x00a2, TryCatch #0 {SQLiteException -> 0x00a2, blocks: (B:15:0x0070, B:17:0x0091, B:20:0x00a4), top: B:30:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4 A[Catch: all -> 0x006b, SQLiteException -> 0x00a2, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a2, blocks: (B:15:0x0070, B:17:0x0091, B:20:0x00a4), top: B:30:0x0070 }] */
    public final long u(String str) {
        long j2;
        ContentValues contentValues;
        tkc tkcVar = this.a;
        a78.d(str);
        a78.d("first_open_count");
        g();
        h();
        SQLiteDatabase sQLiteDatabaseX = X();
        sQLiteDatabaseX.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j2 = -1;
                long jD = D(sb.toString(), new String[]{str}, -1L);
                if (jD == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseX.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        thc thcVar = tkcVar.f;
                        tkc.m(thcVar);
                        thcVar.f.c(thc.o(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jD = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jD));
                            if (sQLiteDatabaseX.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                thc thcVar2 = tkcVar.f;
                                tkc.m(thcVar2);
                                thcVar2.f.c(thc.o(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseX.setTransactionSuccessful();
                                j2 = jD;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j3 = jD;
                            thc thcVar3 = tkcVar.f;
                            tkc.m(thcVar3);
                            thcVar3.f.d("Error inserting column. appId", thc.o(str), "first_open_count", e);
                            j2 = j3;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jD));
                    if (sQLiteDatabaseX.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        thc thcVar4 = tkcVar.f;
                        tkc.m(thcVar4);
                        thcVar4.f.c(thc.o(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseX.setTransactionSuccessful();
                        j2 = jD;
                    }
                }
            } finally {
                sQLiteDatabaseX.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j2;
    }

    public final boolean v(String str, String str2) {
        return C("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void w(List list) {
        a78.g(list);
        g();
        h();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int iDelete = X().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long x(String str) {
        a78.d(str);
        return D("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void y(String str, Long l2, long j2, tjc tjcVar) {
        g();
        h();
        a78.g(tjcVar);
        a78.d(str);
        byte[] bArrG = tjcVar.g();
        tkc tkcVar = this.a;
        thc thcVar = tkcVar.f;
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar);
        thcVar.n.c(tkcVar.j.a(str), Integer.valueOf(bArrG.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrG);
        try {
            if (X().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                tkc.m(thcVar2);
                thcVar2.f.b(thc.o(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            tkc.m(thcVar2);
            thcVar2.f.c(thc.o(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fa->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    public final void z(String str, Long l2, String str2, Bundle bundle) throws Throwable {
        thc thcVar;
        Bundle bundle2;
        long j2;
        String str3;
        ContentValues contentValues;
        thc thcVar2;
        wkc wkcVar;
        Iterator<E> it;
        p8c p8cVar = this;
        String str4 = str;
        a78.g(bundle);
        p8cVar.g();
        p8cVar.h();
        l8c l8cVar = l2 != null ? new l8c(p8cVar, str4, l2.longValue()) : new l8c(p8cVar, str4);
        List<j8c> listA = l8cVar.a();
        while (!listA.isEmpty()) {
            for (j8c j8cVar : listA) {
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                tkc tkcVar = p8cVar.a;
                try {
                    if (!zIsEmpty) {
                        Cursor cursor = null;
                        wkc wkcVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = p8cVar.X().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(j8cVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                wkcVar = (wkc) ((ukc) qzc.R(wkc.c0(), cursorQuery.getBlob(0))).j();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        thc thcVar3 = tkcVar.f;
                                                        tkc.m(thcVar3);
                                                        thcVar3.i.b(thc.o(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor2 = cursorQuery;
                                                    thc thcVar4 = tkcVar.f;
                                                    tkc.m(thcVar4);
                                                    thcVar4.f.c(thc.o(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                wkcVar2 = wkcVar;
                                            } catch (IOException e2) {
                                                thc thcVar5 = tkcVar.f;
                                                tkc.m(thcVar5);
                                                thcVar5.f.c(thc.o(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (wkcVar2 != null) {
                                                it = wkcVar2.d2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((bmc) it.next()).z().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            thc thcVar6 = tkcVar.f;
                                            tkc.m(thcVar6);
                                            thcVar6.f.b(thc.o(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    wkcVar = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                wkcVar = null;
                            }
                            if (wkcVar2 != null) {
                                it = wkcVar2.d2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((bmc) it.next()).z().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = X().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        tkc.m(thcVar);
                        thcVar2 = thcVar;
                        try {
                            thcVar2.f.c(thc.o(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            tkc.m(thcVar2);
                            thcVar2.f.c(thc.o(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    thcVar2 = thcVar;
                }
                lzc lzcVar = p8cVar.b;
                qzc qzcVar = lzcVar.g;
                lzc.U(qzcVar);
                tjc tjcVar = j8cVar.d;
                Bundle bundle3 = new Bundle();
                for (akc akcVar : tjcVar.z()) {
                    if (akcVar.F()) {
                        bundle3.putDouble(akcVar.y(), akcVar.G());
                    } else if (akcVar.D()) {
                        bundle3.putFloat(akcVar.y(), akcVar.E());
                    } else if (akcVar.B()) {
                        bundle3.putLong(akcVar.y(), akcVar.C());
                    } else if (akcVar.z()) {
                        bundle3.putString(akcVar.y(), akcVar.A());
                    } else if (akcVar.H().isEmpty()) {
                        thc thcVar7 = qzcVar.a.f;
                        tkc.m(thcVar7);
                        thcVar7.f.b(akcVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(akcVar.y(), qzc.T(akcVar.H()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strC = tjcVar.C();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                yzc yzcVar = tkcVar.i;
                thcVar = tkcVar.f;
                tkc.k(yzcVar);
                if (strC.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        j8c j8cVar2 = j8cVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        j8cVar = j8cVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                j8c j8cVar3 = j8cVar;
                yzcVar.t(bundle3, bundle2);
                p9c p9cVar = new p9c(p8cVar.a, string, str4, tjcVar.C(), tjcVar.E(), tjcVar.M(), tjcVar.G(), bundle3);
                j2 = j8cVar3.a;
                long j3 = j8cVar3.b;
                boolean z = j8cVar3.c;
                g();
                h();
                str3 = p9cVar.a;
                a78.d(str3);
                qzc qzcVar2 = lzcVar.g;
                lzc.U(qzcVar2);
                byte[] bArrG = qzcVar2.G(p9cVar).g();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", p9cVar.b);
                contentValues.put("timestamp", Long.valueOf(p9cVar.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put("data", bArrG);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(p9cVar.e));
                p8cVar = this;
                str4 = str;
            }
            listA = l8cVar.a();
            p8cVar = this;
            str4 = str;
        }
    }
}
