package defpackage;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oxa implements f20.b {
    public static final dp K = dp.d();
    public static final oxa L = new oxa();
    public f44 A;
    public Context C;
    public rv1 D;
    public wh8 E;
    public f20 F;
    public k20.a G;
    public String H;
    public String I;
    public final ConcurrentHashMap t;
    public e04 w;
    public n14 x;
    public t04 y;
    public of8<fxa> z;
    public final ConcurrentLinkedQueue<bv7> u = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean v = new AtomicBoolean(false);
    public boolean J = false;
    public final ThreadPoolExecutor B = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public oxa() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.t = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(fv7 fv7Var) {
        if (fv7Var.f()) {
            zra zraVarG = fv7Var.g();
            long jM = zraVarG.M();
            Locale locale = Locale.ENGLISH;
            return op3.a("trace metric: ", zraVarG.N(), " (duration: ", new DecimalFormat("#.####").format(jM / 1000.0d), "ms)");
        }
        if (fv7Var.h()) {
            z97 z97VarI = fv7Var.i();
            long jT = z97VarI.c0() ? z97VarI.T() : 0L;
            String strValueOf = z97VarI.Y() ? String.valueOf(z97VarI.O()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return av.a(vb0.a("network request trace: ", z97VarI.V(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jT / 1000.0d), "ms)");
        }
        if (!fv7Var.d()) {
            return "log";
        }
        tj4 tj4VarJ = fv7Var.j();
        Locale locale3 = Locale.ENGLISH;
        boolean zG = tj4VarJ.G();
        int iD = tj4VarJ.D();
        int iC = tj4VarJ.C();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zG);
        sb.append(", cpuGaugeCount: ");
        sb.append(iD);
        sb.append(", memoryGaugeCount: ");
        return i34.b(iC, ")", sb);
    }

    public final void b(ev7 ev7Var) {
        if (ev7Var.f()) {
            this.F.b("_fstec");
        } else if (ev7Var.h()) {
            this.F.b("_fsntc");
        }
    }

    public final void c(final zra zraVar, final o20 o20Var) {
        this.B.execute(new Runnable() { // from class: lxa
            @Override // java.lang.Runnable
            public final void run() {
                ev7.a aVarE = ev7.E();
                aVarE.n();
                ev7.A((ev7) aVarE.u, zraVar);
                this.t.d(aVarE, o20Var);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x0346  */
    /* JADX WARN: Code duplicated, block: B:141:0x0380  */
    /* JADX WARN: Code duplicated, block: B:143:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d2 A[Catch: all -> 0x03da, TryCatch #3 {all -> 0x03da, blocks: (B:159:0x03ce, B:161:0x03d2, B:164:0x03dd), top: B:232:0x03ce }] */
    /* JADX WARN: Code duplicated, block: B:168:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:171:0x041d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0427  */
    /* JADX WARN: Code duplicated, block: B:176:0x0442  */
    /* JADX WARN: Code duplicated, block: B:178:0x044a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0452  */
    /* JADX WARN: Code duplicated, block: B:189:0x0481  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:212:0x0509  */
    /* JADX WARN: Code duplicated, block: B:213:0x0525  */
    /* JADX WARN: Code duplicated, block: B:215:0x0548  */
    /* JADX WARN: Code duplicated, block: B:218:0x055d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0567  */
    /* JADX WARN: Code duplicated, block: B:221:0x057c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0585  */
    /* JADX WARN: Code duplicated, block: B:225:0x0597  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x045e, code lost:
    
        if (defpackage.wh8.a(r0.i().P()) == false) goto L184;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:212:0x0509, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:213:0x0525, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ev7.a r18, defpackage.o20 r19) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxa.d(ev7$a, o20):void");
    }

    @Override // f20.b
    public final void onUpdateAppState(o20 o20Var) {
        this.J = o20Var == o20.FOREGROUND;
        if (this.v.get()) {
            this.B.execute(new Runnable() { // from class: jxa
                @Override // java.lang.Runnable
                public final void run() {
                    oxa oxaVar = this.t;
                    wh8 wh8Var = oxaVar.E;
                    boolean z = oxaVar.J;
                    wh8Var.d.a(z);
                    wh8Var.e.a(z);
                }
            });
        }
    }
}
