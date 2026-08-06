package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zra extends fk4<zra, a> implements bu6 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final zra DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile st7<zra> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private uh6<String, Long> counters_;
    private uh6<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private zi5.c<iv7> perfSessions_;
    private zi5.c<zra> subtraces_;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends fk4.a<zra, a> implements bu6 {
        public a() {
            super(zra.DEFAULT_INSTANCE);
        }

        public final void o(zra zraVar) {
            n();
            zra.A((zra) this.u, zraVar);
        }

        public final void p(long j, String str) {
            str.getClass();
            n();
            zra.z((zra) this.u).put(str, Long.valueOf(j));
        }

        public final void q(long j) {
            n();
            zra.F((zra) this.u, j);
        }

        public final void r(long j) {
            n();
            zra.G((zra) this.u, j);
        }

        public final void s(String str) {
            n();
            zra.y((zra) this.u, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final sh6<String, Long> a = new sh6<>(gob.w, gob.v, 0L);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static final sh6<String, String> a;

        static {
            gob.a aVar = gob.w;
            a = new sh6<>(aVar, aVar, BuildConfig.FLAVOR);
        }
    }

    static {
        zra zraVar = new zra();
        DEFAULT_INSTANCE = zraVar;
        fk4.w(zra.class, zraVar);
    }

    public zra() {
        uh6 uh6Var = uh6.u;
        this.counters_ = uh6Var;
        this.customAttributes_ = uh6Var;
        this.name_ = BuildConfig.FLAVOR;
        ze8<Object> ze8Var = ze8.w;
        this.subtraces_ = ze8Var;
        this.perfSessions_ = ze8Var;
    }

    public static void A(zra zraVar, zra zraVar2) {
        zraVar.getClass();
        zraVar2.getClass();
        zi5.c<zra> cVar = zraVar.subtraces_;
        if (!cVar.s()) {
            zraVar.subtraces_ = fk4.u(cVar);
        }
        zraVar.subtraces_.add(zraVar2);
    }

    public static void B(zra zraVar, ArrayList arrayList) {
        zi5.c<zra> cVar = zraVar.subtraces_;
        if (!cVar.s()) {
            zraVar.subtraces_ = fk4.u(cVar);
        }
        a2.k(arrayList, zraVar.subtraces_);
    }

    public static uh6 C(zra zraVar) {
        uh6<String, String> uh6Var = zraVar.customAttributes_;
        if (!uh6Var.t) {
            zraVar.customAttributes_ = uh6Var.c();
        }
        return zraVar.customAttributes_;
    }

    public static void D(zra zraVar, iv7 iv7Var) {
        zraVar.getClass();
        zi5.c<iv7> cVar = zraVar.perfSessions_;
        if (!cVar.s()) {
            zraVar.perfSessions_ = fk4.u(cVar);
        }
        zraVar.perfSessions_.add(iv7Var);
    }

    public static void E(zra zraVar, List list) {
        zi5.c<iv7> cVar = zraVar.perfSessions_;
        if (!cVar.s()) {
            zraVar.perfSessions_ = fk4.u(cVar);
        }
        a2.k(list, zraVar.perfSessions_);
    }

    public static void F(zra zraVar, long j) {
        zraVar.bitField0_ |= 4;
        zraVar.clientStartTimeUs_ = j;
    }

    public static void G(zra zraVar, long j) {
        zraVar.bitField0_ |= 8;
        zraVar.durationUs_ = j;
    }

    public static zra L() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(zra zraVar, String str) {
        zraVar.getClass();
        str.getClass();
        zraVar.bitField0_ |= 1;
        zraVar.name_ = str;
    }

    public static uh6 z(zra zraVar) {
        uh6<String, Long> uh6Var = zraVar.counters_;
        if (!uh6Var.t) {
            zraVar.counters_ = uh6Var.c();
        }
        return zraVar.counters_;
    }

    public final boolean H() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int I() {
        return this.counters_.size();
    }

    public final Map<String, Long> J() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> K() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long M() {
        return this.durationUs_;
    }

    public final String N() {
        return this.name_;
    }

    public final zi5.c O() {
        return this.perfSessions_;
    }

    public final zi5.c P() {
        return this.subtraces_;
    }

    public final boolean Q() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.fk4
    public final Object p(fk4.e eVar) {
        st7 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new xh8(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", b.a, "subtraces_", zra.class, "customAttributes_", c.a, "perfSessions_", iv7.class});
            case 3:
                return new zra();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<zra> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (zra.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new fk4.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                e44.b();
                return null;
        }
    }
}
