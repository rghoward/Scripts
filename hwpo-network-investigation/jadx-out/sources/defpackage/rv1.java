package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 {
    public static final dp d = dp.d();
    public static volatile rv1 e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public a95 b = new a95();
    public final yy2 c = yy2.b();

    public static synchronized rv1 e() {
        try {
            if (e == null) {
                e = new rv1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean k(long j) {
        return j >= 0;
    }

    public static boolean l(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.5")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(long j) {
        return j >= 0;
    }

    public static boolean o(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final rk7<Boolean> a(ln4 ln4Var) {
        yy2 yy2Var = this.c;
        String strJ0 = ln4Var.J0();
        if (strJ0 == null) {
            yy2Var.getClass();
            yy2.c.a("Key is null when getting boolean value on device cache.");
            return new rk7<>();
        }
        if (yy2Var.a == null) {
            yy2Var.c(yy2.a());
            if (yy2Var.a == null) {
                return new rk7<>();
            }
        }
        if (!yy2Var.a.contains(strJ0)) {
            return new rk7<>();
        }
        try {
            return new rk7<>(Boolean.valueOf(yy2Var.a.getBoolean(strJ0, false)));
        } catch (ClassCastException e2) {
            yy2.c.b("Key %s from sharedPreferences has type other than long: %s", strJ0, e2.getMessage());
            return new rk7<>();
        }
    }

    public final rk7<Double> b(ln4 ln4Var) {
        yy2 yy2Var = this.c;
        String strJ0 = ln4Var.J0();
        if (strJ0 == null) {
            yy2Var.getClass();
            yy2.c.a("Key is null when getting double value on device cache.");
            return new rk7<>();
        }
        if (yy2Var.a == null) {
            yy2Var.c(yy2.a());
            if (yy2Var.a == null) {
                return new rk7<>();
            }
        }
        if (!yy2Var.a.contains(strJ0)) {
            return new rk7<>();
        }
        try {
            try {
                return new rk7<>(Double.valueOf(Double.longBitsToDouble(yy2Var.a.getLong(strJ0, 0L))));
            } catch (ClassCastException e2) {
                yy2.c.b("Key %s from sharedPreferences has type other than double: %s", strJ0, e2.getMessage());
                return new rk7<>();
            }
        } catch (ClassCastException unused) {
            return new rk7<>(Double.valueOf(Float.valueOf(yy2Var.a.getFloat(strJ0, 0.0f)).doubleValue()));
        }
    }

    public final rk7<Long> c(ln4 ln4Var) {
        yy2 yy2Var = this.c;
        String strJ0 = ln4Var.J0();
        if (strJ0 == null) {
            yy2Var.getClass();
            yy2.c.a("Key is null when getting long value on device cache.");
            return new rk7<>();
        }
        if (yy2Var.a == null) {
            yy2Var.c(yy2.a());
            if (yy2Var.a == null) {
                return new rk7<>();
            }
        }
        if (!yy2Var.a.contains(strJ0)) {
            return new rk7<>();
        }
        try {
            return new rk7<>(Long.valueOf(yy2Var.a.getLong(strJ0, 0L)));
        } catch (ClassCastException e2) {
            yy2.c.b("Key %s from sharedPreferences has type other than long: %s", strJ0, e2.getMessage());
            return new rk7<>();
        }
    }

    public final rk7<String> d(ln4 ln4Var) {
        yy2 yy2Var = this.c;
        String strJ0 = ln4Var.J0();
        if (strJ0 == null) {
            yy2Var.getClass();
            yy2.c.a("Key is null when getting String value on device cache.");
            return new rk7<>();
        }
        if (yy2Var.a == null) {
            yy2Var.c(yy2.a());
            if (yy2Var.a == null) {
                return new rk7<>();
            }
        }
        if (!yy2Var.a.contains(strJ0)) {
            return new rk7<>();
        }
        try {
            return new rk7<>(yy2Var.a.getString(strJ0, BuildConfig.FLAVOR));
        } catch (ClassCastException e2) {
            yy2.c.b("Key %s from sharedPreferences has type other than String: %s", strJ0, e2.getMessage());
            return new rk7<>();
        }
    }

    public final Boolean f() {
        vv1 vv1Var;
        wv1 wv1Var;
        synchronized (vv1.class) {
            try {
                if (vv1.x == null) {
                    vv1.x = new vv1();
                }
                vv1Var = vv1.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        rk7<Boolean> rk7VarG = g(vv1Var);
        if ((rk7VarG.b() ? rk7VarG.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (wv1.class) {
            try {
                if (wv1.x == null) {
                    wv1.x = new wv1();
                }
                wv1Var = wv1.x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        rk7<Boolean> rk7VarA = a(wv1Var);
        if (rk7VarA.b()) {
            return rk7VarA.a();
        }
        rk7<Boolean> rk7VarG2 = g(wv1Var);
        if (rk7VarG2.b()) {
            return rk7VarG2.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: ClassCastException -> 0x0034, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: ClassCastException -> 0x0034, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final rk7<Boolean> g(ln4 ln4Var) {
        boolean z;
        a95 a95Var = this.b;
        String strM0 = ln4Var.M0();
        if (strM0 != null) {
            z = a95Var.a.containsKey(strM0);
            if (!z) {
                return new rk7<>();
            }
            try {
                Boolean bool = (Boolean) a95Var.a.get(strM0);
                return bool == null ? new rk7<>() : new rk7<>(bool);
            } catch (ClassCastException e2) {
                a95.b.b("Metadata key %s contains type other than boolean: %s", strM0, e2.getMessage());
                return new rk7<>();
            }
        }
        a95Var.getClass();
        if (!z) {
            return new rk7<>();
        }
        Boolean bool2 = (Boolean) a95Var.a.get(strM0);
        if (bool2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final rk7<Double> h(ln4 ln4Var) {
        boolean z;
        Object obj;
        a95 a95Var = this.b;
        String strM0 = ln4Var.M0();
        if (strM0 != null) {
            z = a95Var.a.containsKey(strM0);
            if (!z) {
                return new rk7<>();
            }
            obj = a95Var.a.get(strM0);
            if (obj == null) {
                return new rk7<>();
            }
            if (obj instanceof Float) {
                return new rk7<>(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new rk7<>((Double) obj);
            }
            a95.b.b("Metadata key %s contains type other than double: %s", strM0);
            return new rk7<>();
        }
        a95Var.getClass();
        if (!z) {
            return new rk7<>();
        }
        obj = a95Var.a.get(strM0);
        if (obj == null) {
            return new rk7<>();
        }
        if (obj instanceof Float) {
            return new rk7<>(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new rk7<>((Double) obj);
        }
        a95.b.b("Metadata key %s contains type other than double: %s", strM0);
        return new rk7<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0035, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e A[Catch: ClassCastException -> 0x0035, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final rk7<Long> i(ln4 ln4Var) {
        boolean z;
        rk7 rk7Var;
        Integer num;
        a95 a95Var = this.b;
        String strM0 = ln4Var.M0();
        if (strM0 != null) {
            z = a95Var.a.containsKey(strM0);
            if (z) {
                try {
                    num = (Integer) a95Var.a.get(strM0);
                    if (num == null) {
                        rk7Var = new rk7();
                    } else {
                        rk7Var = new rk7(num);
                    }
                } catch (ClassCastException e2) {
                    a95.b.b("Metadata key %s contains type other than int: %s", strM0, e2.getMessage());
                    rk7Var = new rk7();
                }
            } else {
                rk7Var = new rk7();
            }
            return rk7Var.b() ? new rk7<>(Long.valueOf(((Integer) rk7Var.a()).intValue())) : new rk7<>();
        }
        a95Var.getClass();
        if (z) {
            rk7Var = new rk7();
        } else {
            num = (Integer) a95Var.a.get(strM0);
            if (num == null) {
                rk7Var = new rk7();
            } else {
                rk7Var = new rk7(num);
            }
        }
        if (rk7Var.b()) {
        }
    }

    public final long j() {
        dw1 dw1Var;
        synchronized (dw1.class) {
            try {
                if (dw1.x == null) {
                    dw1.x = new dw1();
                }
                dw1Var = dw1.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        dw1Var.getClass();
        rk7<Long> rk7Var = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (rk7Var.b() && rk7Var.a().longValue() > 0) {
            this.c.d(rk7Var.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
            return rk7Var.a().longValue();
        }
        rk7<Long> rk7VarC = c(dw1Var);
        if (!rk7VarC.b() || rk7VarC.a().longValue() <= 0) {
            return 600L;
        }
        return rk7VarC.a().longValue();
    }

    public final boolean n() {
        fw1 fw1Var;
        boolean zBooleanValue;
        ew1 ew1Var;
        boolean zL;
        Boolean boolF = f();
        if (boolF == null || boolF.booleanValue()) {
            synchronized (fw1.class) {
                try {
                    if (fw1.x == null) {
                        fw1.x = new fw1();
                    }
                    fw1Var = fw1.x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rk7<Boolean> rk7VarA = a(fw1Var);
            rk7<Boolean> rk7Var = this.a.getBoolean("fpr_enabled");
            if (!rk7Var.b()) {
                zBooleanValue = rk7VarA.b() ? rk7VarA.a().booleanValue() : true;
            } else if (this.a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean boolA = rk7Var.a();
                if (!rk7VarA.b() || rk7VarA.a() != boolA) {
                    this.c.g("com.google.firebase.perf.SdkEnabled", boolA.booleanValue());
                }
                zBooleanValue = boolA.booleanValue();
            }
            if (zBooleanValue) {
                synchronized (ew1.class) {
                    try {
                        if (ew1.x == null) {
                            ew1.x = new ew1();
                        }
                        ew1Var = ew1.x;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                rk7<String> rk7VarD = d(ew1Var);
                rk7<String> string = this.a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String strA = string.a();
                    if (!rk7VarD.b() || !rk7VarD.a().equals(strA)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", strA);
                    }
                    zL = l(strA);
                } else {
                    zL = rk7VarD.b() ? l(rk7VarD.a()) : l(BuildConfig.FLAVOR);
                }
                if (!zL) {
                    return true;
                }
            }
        }
        return false;
    }
}
