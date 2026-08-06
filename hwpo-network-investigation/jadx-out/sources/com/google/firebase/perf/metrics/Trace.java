package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.asa;
import defpackage.b82;
import defpackage.ce9;
import defpackage.dp;
import defpackage.f20;
import defpackage.g20;
import defpackage.gv7;
import defpackage.hv7;
import defpackage.oh7;
import defpackage.oxa;
import defpackage.p51;
import defpackage.rv1;
import defpackage.sk0;
import defpackage.uu3;
import defpackage.z90;
import defpackage.zoa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class Trace extends g20 implements Parcelable, ce9 {
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final dp F = dp.d();
    public final ArrayList A;
    public final oxa B;
    public final oh7 C;
    public zoa D;
    public zoa E;
    public final WeakReference<ce9> t;
    public final Trace u;
    public final GaugeManager v;
    public final String w;
    public final ConcurrentHashMap x;
    public final ConcurrentHashMap y;
    public final List<hv7> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : f20.a());
        this.t = new WeakReference<>(this);
        this.u = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.w = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.x = concurrentHashMap;
        this.y = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, b82.class.getClassLoader());
        this.D = (zoa) parcel.readParcelable(zoa.class.getClassLoader());
        this.E = (zoa) parcel.readParcelable(zoa.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.z = listSynchronizedList;
        parcel.readList(listSynchronizedList, hv7.class.getClassLoader());
        if (z) {
            this.B = null;
            this.C = null;
            this.v = null;
        } else {
            this.B = oxa.L;
            this.C = new oh7();
            this.v = GaugeManager.getInstance();
        }
    }

    @Override // defpackage.ce9
    public final void a(hv7 hv7Var) {
        if (hv7Var == null) {
            F.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.D == null || b()) {
                return;
            }
            this.z.add(hv7Var);
        }
    }

    public final boolean b() {
        return this.E != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.D != null) && !b()) {
                F.g("Trace '%s' is started but not stopped when it is destructed!", this.w);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.y.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.y);
    }

    public long getLongMetric(String str) {
        b82 b82Var = str != null ? (b82) this.x.get(str.trim()) : null;
        if (b82Var == null) {
            return 0L;
        }
        return b82Var.u.get();
    }

    public void incrementMetric(String str, long j) {
        String strC = gv7.c(str);
        dp dpVar = F;
        if (strC != null) {
            dpVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        zoa zoaVar = this.D;
        String str2 = this.w;
        if (zoaVar == null) {
            dpVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            dpVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.x;
        b82 b82Var = (b82) concurrentHashMap.get(strTrim);
        if (b82Var == null) {
            b82Var = new b82(strTrim);
            concurrentHashMap.put(strTrim, b82Var);
        }
        AtomicLong atomicLong = b82Var.u;
        atomicLong.addAndGet(j);
        dpVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.y;
        dp dpVar = F;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zB = b();
            String str3 = this.w;
            if (zB) {
                Locale locale = Locale.ENGLISH;
                z90.a(sk0.c("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                gv7.b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                z90.a("Exceeds max limit of number of attributes - 5");
            }
            dpVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            dpVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String strC = gv7.c(str);
        dp dpVar = F;
        if (strC != null) {
            dpVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        zoa zoaVar = this.D;
        String str2 = this.w;
        if (zoaVar == null) {
            dpVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            dpVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.x;
        b82 b82Var = (b82) concurrentHashMap.get(strTrim);
        if (b82Var == null) {
            b82Var = new b82(strTrim);
            concurrentHashMap.put(strTrim, b82Var);
        }
        b82Var.u.set(j);
        dpVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    public void removeAttribute(String str) {
        if (!b()) {
            this.y.remove(str);
            return;
        }
        dp dpVar = F;
        if (dpVar.b) {
            dpVar.a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public void start() {
        String str;
        String str2;
        boolean zN = rv1.e().n();
        dp dpVar = F;
        if (!zN) {
            dpVar.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = gv7.a;
        String str3 = this.w;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] iArrB = uu3.b(6);
            int length = iArrB.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrB[i]) {
                        case 1:
                            str2 = "_as";
                            break;
                        case 2:
                            str2 = "_astui";
                            break;
                        case 3:
                            str2 = "_astfd";
                            break;
                        case 4:
                            str2 = "_asti";
                            break;
                        case 5:
                            str2 = "_fs";
                            break;
                        case 6:
                            str2 = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str2.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str = "Trace name must not start with '_'";
                }
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            dpVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.D != null) {
            dpVar.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.C.getClass();
        this.D = new zoa();
        registerForAppState();
        hv7 hv7VarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.t);
        a(hv7VarPerfSession);
        if (hv7VarPerfSession.v) {
            this.v.collectGaugeMetricOnce(hv7VarPerfSession.u);
        }
    }

    public void stop() {
        zoa zoaVar = this.D;
        String str = this.w;
        dp dpVar = F;
        if (zoaVar == null) {
            dpVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (b()) {
            dpVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.t);
        unregisterForAppState();
        this.C.getClass();
        zoa zoaVar2 = new zoa();
        this.E = zoaVar2;
        if (this.u == null) {
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) p51.b(1, arrayList);
                if (trace.E == null) {
                    trace.E = zoaVar2;
                }
            }
            if (str.isEmpty()) {
                if (dpVar.b) {
                    dpVar.a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.B.c(new asa(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().v) {
                this.v.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().u);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.u, 0);
        parcel.writeString(this.w);
        parcel.writeList(this.A);
        parcel.writeMap(this.x);
        parcel.writeParcelable(this.D, 0);
        parcel.writeParcelable(this.E, 0);
        synchronized (this.z) {
            parcel.writeList(this.z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, oxa oxaVar, oh7 oh7Var, f20 f20Var) {
        super(f20Var);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.t = new WeakReference<>(this);
        this.u = null;
        this.w = str.trim();
        this.A = new ArrayList();
        this.x = new ConcurrentHashMap();
        this.y = new ConcurrentHashMap();
        this.C = oh7Var;
        this.B = oxaVar;
        this.z = Collections.synchronizedList(new ArrayList());
        this.v = gaugeManager;
    }
}
