package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.intercom.twig.BuildConfig;
import ea7.c;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 implements cj0, yua {
    public static final ul8 p = k95.u(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ul8 q = k95.u(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ul8 r = k95.u(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ul8 s = k95.u(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ul8 t = k95.u(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ul8 u = k95.u(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static hq2 v;
    public final Context a;
    public final m95<Integer, Long> b;
    public final cj0.a.C0040a c;
    public final z7a d;
    public final boolean e;
    public final wr9 f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public hq2() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [gq2] */
    public hq2(Context context, HashMap map) {
        boolean z;
        z7a z7aVar = vf1.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = m95.b(map);
        this.c = new cj0.a.C0040a();
        this.f = new wr9();
        this.d = z7aVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        ea7 ea7VarA = ea7.a(context);
        int iB = ea7VarA.b();
        this.n = iB;
        this.l = h(iB);
        ?? r6 = new ea7.b() { // from class: gq2
            /* JADX WARN: Code duplicated, block: B:32:0x0048 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0013, B:17:0x0019, B:23:0x0025, B:25:0x0029, B:27:0x002f, B:29:0x0039, B:31:0x0043, B:33:0x0054, B:32:0x0048, B:34:0x0056, B:36:0x006a, B:38:0x0072), top: B:45:0x0003 }] */
            @Override // ea7.b
            public final void a(int i) {
                String strG;
                TelephonyManager telephonyManager;
                hq2 hq2Var = this.a;
                synchronized (hq2Var) {
                    int i2 = hq2Var.n;
                    if (i2 == 0 || hq2Var.e) {
                        if (i2 != i || hq2Var.o == null) {
                            hq2Var.n = i;
                            if (i != 1 && i != 0 && i != 8) {
                                if (hq2Var.o == null) {
                                    Context context2 = hq2Var.a;
                                    String str = n6b.a;
                                    if (context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService(AttributeType.PHONE)) == null) {
                                        strG = h40.g(Locale.getDefault().getCountry());
                                    } else {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (TextUtils.isEmpty(networkCountryIso)) {
                                            strG = h40.g(Locale.getDefault().getCountry());
                                        } else {
                                            strG = h40.g(networkCountryIso);
                                        }
                                    }
                                    hq2Var.o = strG;
                                }
                                hq2Var.l = hq2Var.h(i);
                                hq2Var.d.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                hq2Var.i(hq2Var.i, hq2Var.g > 0 ? (int) (jElapsedRealtime - hq2Var.h) : 0, hq2Var.l);
                                hq2Var.h = jElapsedRealtime;
                                hq2Var.i = 0L;
                                hq2Var.k = 0L;
                                hq2Var.j = 0L;
                                wr9 wr9Var = hq2Var.f;
                                wr9Var.a.clear();
                                wr9Var.c = -1;
                                wr9Var.d = 0;
                                wr9Var.e = 0;
                            }
                        }
                    }
                }
            }
        };
        Executor executorA = fi0.a();
        CopyOnWriteArrayList<ea7.c> copyOnWriteArrayList = ea7VarA.b;
        for (ea7.c cVar : copyOnWriteArrayList) {
            if (cVar.a.get() == null) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
        ea7.c cVar2 = ea7VarA.new c(r6, executorA);
        synchronized (ea7VarA.c) {
            ea7VarA.b.add(cVar2);
            z = ea7VarA.e;
        }
        if (z) {
            cVar2.b.execute(new fa7(cVar2));
        }
    }

    @Override // defpackage.cj0
    public final void a(Handler handler, cj0.a aVar) {
        aVar.getClass();
        cj0.a.C0040a c0040a = this.c;
        c0040a.getClass();
        CopyOnWriteArrayList<cj0.a.C0040a.C0041a> copyOnWriteArrayList = c0040a.a;
        for (cj0.a.C0040a.C0041a c0041a : copyOnWriteArrayList) {
            if (c0041a.b == aVar) {
                c0041a.c = true;
                copyOnWriteArrayList.remove(c0041a);
            }
        }
        copyOnWriteArrayList.add(new cj0.a.C0040a.C0041a(handler, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0014 A[Catch: all -> 0x000d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:15:0x0014), top: B:20:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0012, please report this as an issue */
    @Override // defpackage.yua
    public final synchronized void c(of2 of2Var, boolean z, int i) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                this.i += (long) i;
                return;
            }
            return;
        }
        if ((of2Var.g & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        this.i += (long) i;
        return;
        throw th;
    }

    @Override // defpackage.cj0
    public final void d(cj0.a aVar) {
        CopyOnWriteArrayList<cj0.a.C0040a.C0041a> copyOnWriteArrayList = this.c.a;
        for (cj0.a.C0040a.C0041a c0041a : copyOnWriteArrayList) {
            if (c0041a.b == aVar) {
                c0041a.c = true;
                copyOnWriteArrayList.remove(c0041a);
            }
        }
    }

    @Override // defpackage.cj0
    public final synchronized long e() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x001d  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x002a, B:23:0x003e, B:30:0x0069, B:29:0x0060), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #2 {all -> 0x007b, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x002a, B:23:0x003e, B:30:0x0069, B:29:0x0060), top: B:48:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0017, please report this as an issue */
    @Override // defpackage.yua
    public final synchronized void f(of2 of2Var, boolean z) throws Throwable {
        Throwable th;
        boolean z2;
        long jElapsedRealtime;
        int i;
        long j;
        hq2 hq2Var;
        try {
            if (!z) {
                z2 = false;
                if (z2) {
                    xl7.r(this.g > 0);
                    this.d.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    i = (int) (jElapsedRealtime - this.h);
                    this.j += (long) i;
                    long j2 = this.k;
                    j = this.i;
                    this.k = j2 + j;
                    if (i > 0) {
                        this.f.a((j * 8000.0f) / i, (int) Math.sqrt(j));
                        if (this.j < 2000) {
                            this.l = (long) this.f.b();
                        } else {
                            this.l = (long) this.f.b();
                        }
                        hq2Var = this;
                        hq2Var.i(this.i, i, this.l);
                        hq2Var.h = jElapsedRealtime;
                        hq2Var.i = 0L;
                    } else {
                        hq2Var = this;
                    }
                    hq2Var.g--;
                    return;
                }
                return;
            }
            try {
                if ((of2Var.g & 8) == 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return;
                }
                try {
                    xl7.r(this.g > 0);
                    try {
                        this.d.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        i = (int) (jElapsedRealtime - this.h);
                        this.j += (long) i;
                        long j3 = this.k;
                        j = this.i;
                        this.k = j3 + j;
                        if (i > 0) {
                            this.f.a((j * 8000.0f) / i, (int) Math.sqrt(j));
                            if (this.j < 2000 || this.k >= 524288) {
                                this.l = (long) this.f.b();
                            }
                            hq2Var = this;
                            hq2Var.i(this.i, i, this.l);
                            hq2Var.h = jElapsedRealtime;
                            hq2Var.i = 0L;
                        } else {
                            hq2Var = this;
                        }
                        hq2Var.g--;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    /* JADX WARN: Code duplicated, block: B:14:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0024), top: B:24:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0024), top: B:24:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0013, please report this as an issue */
    @Override // defpackage.yua
    public final synchronized void g(of2 of2Var, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                if (this.g == 0) {
                    this.d.getClass();
                    this.h = SystemClock.elapsedRealtime();
                }
                this.g++;
                return;
            }
            return;
        }
        if ((of2Var.g & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.g == 0) {
            this.d.getClass();
            this.h = SystemClock.elapsedRealtime();
        }
        this.g++;
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:1149:0x1216  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final long h(int i) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i);
        m95<Integer, Long> m95Var = this.b;
        Long lValueOf = m95Var.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = m95Var.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.o;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            byte b = -1;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        b = 0;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        b = 1;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        b = 2;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        b = 3;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        b = 4;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        b = 5;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        b = 6;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        b = 7;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        b = 8;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        b = 9;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        b = 10;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        b = 11;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        b = 12;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        b = 13;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        b = 14;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        b = 15;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        b = 16;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        b = 17;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        b = 18;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        b = 19;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        b = 20;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        b = 21;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        b = 22;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        b = 23;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        b = 24;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        b = 25;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        b = 26;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        b = 27;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        b = 28;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        b = 29;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        b = 30;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        b = 31;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        b = 32;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        b = 33;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        b = 34;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        b = 35;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        b = 36;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        b = 37;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        b = 38;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        b = 39;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        b = 40;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        b = 41;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        b = 42;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        b = 43;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        b = 44;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        b = 45;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        b = 46;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        b = 47;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        b = 48;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        b = 49;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        b = 50;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        b = 51;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        b = 52;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        b = 53;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        b = 54;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        b = 55;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        b = 56;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        b = 57;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        b = 58;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        b = 59;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        b = 60;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        b = 61;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        b = 62;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        b = 63;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        b = 64;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        b = 65;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        b = 66;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        b = 67;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        b = 68;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        b = 69;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        b = 70;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        b = 71;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        b = 72;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        b = 73;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        b = 74;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        b = 75;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        b = 76;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        b = 77;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        b = 78;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        b = 79;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        b = 80;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        b = 81;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        b = 82;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        b = 83;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        b = 84;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        b = 85;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        b = 86;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        b = 87;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        b = 88;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        b = 89;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        b = 90;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        b = 91;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        b = 92;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        b = 93;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        b = 94;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        b = 95;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        b = 96;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        b = 97;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        b = 98;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        b = 99;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        b = 100;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        b = 101;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        b = 102;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        b = 103;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        b = 104;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        b = 105;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        b = 106;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        b = 107;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        b = 108;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        b = 109;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        b = 110;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        b = 111;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        b = 112;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        b = 113;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        b = 114;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        b = 115;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        b = 116;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        b = 117;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        b = 118;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        b = 119;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        b = 120;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        b = 121;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        b = 122;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        b = 123;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        b = 124;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        b = 125;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        b = 126;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        b = 127;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        b = 128;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        b = 129;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        b = 130;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        b = 131;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        b = 132;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        b = 133;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        b = 134;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        b = 135;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        b = 136;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        b = 137;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        b = 138;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        b = 139;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        b = 140;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        b = 141;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        b = 142;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        b = 143;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        b = MessagePack.Code.FIXARRAY_PREFIX;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        b = 145;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        b = 146;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        b = 147;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        b = 148;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        b = 149;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        b = 150;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        b = 151;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        b = 152;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        b = 153;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        b = 154;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        b = 155;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        b = 156;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        b = 157;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        b = 158;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        b = 159;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        b = MessagePack.Code.FIXSTR_PREFIX;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        b = 161;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        b = 162;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        b = 163;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        b = 164;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        b = 165;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        b = 166;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        b = 167;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        b = 168;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        b = 169;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        b = 170;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        b = 171;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        b = 172;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        b = 173;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        b = 174;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        b = 175;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        b = 176;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        b = 177;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        b = 178;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        b = 179;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        b = 180;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        b = 181;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        b = 182;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        b = 183;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        b = 184;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        b = 185;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        b = 186;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        b = 187;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        b = 188;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        b = 189;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        b = 190;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        b = 191;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        b = MessagePack.Code.NIL;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        b = MessagePack.Code.NEVER_USED;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        b = MessagePack.Code.FALSE;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        b = MessagePack.Code.TRUE;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        b = MessagePack.Code.BIN8;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        b = MessagePack.Code.BIN16;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        b = MessagePack.Code.BIN32;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        b = MessagePack.Code.EXT8;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        b = MessagePack.Code.EXT16;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        b = MessagePack.Code.EXT32;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        b = MessagePack.Code.FLOAT32;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        b = MessagePack.Code.FLOAT64;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        b = MessagePack.Code.UINT8;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        b = MessagePack.Code.UINT16;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        b = MessagePack.Code.UINT32;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        b = MessagePack.Code.UINT64;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        b = MessagePack.Code.INT8;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        b = MessagePack.Code.INT16;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        b = MessagePack.Code.INT32;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        b = MessagePack.Code.INT64;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        b = MessagePack.Code.FIXEXT1;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        b = MessagePack.Code.FIXEXT2;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        b = MessagePack.Code.FIXEXT4;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        b = MessagePack.Code.FIXEXT8;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        b = MessagePack.Code.FIXEXT16;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        b = MessagePack.Code.STR8;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        b = MessagePack.Code.STR16;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        b = MessagePack.Code.STR32;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        b = MessagePack.Code.ARRAY16;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        b = MessagePack.Code.ARRAY32;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        b = MessagePack.Code.MAP16;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        b = MessagePack.Code.MAP32;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        b = MessagePack.Code.NEGFIXINT_PREFIX;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        b = 225;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        b = 226;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        b = 227;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        b = 228;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        b = 229;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        b = 230;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        b = 231;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        b = 232;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        b = 233;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        b = 234;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        b = 235;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        b = 236;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        b = 237;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        b = 238;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 4:
                case 17:
                case 29:
                case 50:
                case 57:
                case 113:
                case 116:
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case 41:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case 63:
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case 10:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case 61:
                case 93:
                case 102:
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case 12:
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case 51:
                case 121:
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case h4c.e /* 15 */:
                case 55:
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                case 106:
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 84:
                case 92:
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case 32:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case 33:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case 34:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case 35:
                case 42:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case 36:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case 37:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case 38:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case 39:
                case 62:
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case 40:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case 43:
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case 45:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case 46:
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case 47:
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case 48:
                case 111:
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case 49:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case 52:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case 53:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case 54:
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case 56:
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case 58:
                case 123:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case 59:
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 60:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 65:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 66:
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 67:
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 68:
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 69:
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 70:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 72:
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 74:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 75:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 76:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 77:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 78:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 79:
                case 97:
                case 104:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case Defaults.PORT /* 80 */:
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 81:
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 83:
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case SurveyViewModel.ENTITY_TYPE /* 85 */:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 86:
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 87:
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 88:
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 89:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 90:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case 91:
                case 115:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case 94:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case 95:
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case 96:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 98:
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case Log.NONE /* 99 */:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 101:
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 103:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 105:
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 107:
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 108:
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 109:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 110:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 112:
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 114:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 117:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 118:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 119:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 120:
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 122:
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case 124:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case 125:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case 126:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 185 */:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i == 2) {
                jLongValue = ((Long) p.get(iArr[0])).longValue();
            } else if (i == 3) {
                jLongValue = ((Long) q.get(iArr[1])).longValue();
            } else if (i == 4) {
                jLongValue = ((Long) r.get(iArr[2])).longValue();
            } else if (i == 5) {
                jLongValue = ((Long) s.get(iArr[3])).longValue();
            } else if (i == 7) {
                jLongValue = ((Long) p.get(iArr[0])).longValue();
            } else if (i != 9) {
                jLongValue = i != 10 ? 1000000L : ((Long) t.get(iArr[4])).longValue();
            } else {
                jLongValue = ((Long) u.get(iArr[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public final void i(long j, int i, long j2) {
        final long j3;
        final int i2;
        final long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (final cj0.a.C0040a.C0041a c0041a : this.c.a) {
            if (c0041a.c) {
                j3 = j;
                i2 = i;
                j4 = j2;
            } else {
                j3 = j;
                i2 = i;
                j4 = j2;
                c0041a.a.post(new Runnable() { // from class: bj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0041a.b.a0(j3, i2, j4);
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    @Override // defpackage.cj0
    public final hq2 b() {
        return this;
    }
}
