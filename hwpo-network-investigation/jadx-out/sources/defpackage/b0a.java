package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b0a implements jac {
    public static final k7a t = new k7a("NONE");
    public static final k7a u = new k7a("PENDING");
    public static final dza v = new dza(new pcb(), new d21(2));
    public static final dza w = new dza(new m57(1), new fga(1));
    public static final dza x = new dza(new o57(3), new wz4(1));
    public static final dza y = new dza(new s57(1), new yz4(1));
    public static final dza z = new dza(new zz4(1), new qcb());
    public static final dza A = new dza(new rcb(), new scb());
    public static final dza B = new dza(new lua(1), new mua(1));
    public static final dza C = new dza(new tcb(), new ucb());
    public static final dza D = new dza(new y57(1), new z57(1));
    public static final /* synthetic */ b0a E = new b0a();

    public static final a0a b(Object obj) {
        if (obj == null) {
            obj = rd7.a;
        }
        return new a0a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.yg0 r6, defpackage.ak0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mw8
            if (r0 == 0) goto L13
            r0 = r7
            mw8 r0 = (defpackage.mw8) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mw8 r0 = new mw8
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yg0 r6 = r0.t
            defpackage.dv8.b(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.dv8.b(r7)
        L31:
            r0.t = r6
            r0.v = r2
            s48 r7 = defpackage.s48.u
            java.lang.Object r7 = r6.h1(r7, r0)
            v72 r1 = defpackage.v72.t
            if (r7 != r1) goto L40
            return r1
        L40:
            r48 r7 = (defpackage.r48) r7
            int r1 = r7.d
            java.util.List<a58> r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            a58 r5 = (defpackage.a58) r5
            boolean r5 = defpackage.z69.d(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0a.c(yg0, ak0):java.lang.Object");
    }

    public static final yg2 d(String str) {
        Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.FLAVOR);
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("d{1,2}");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
        strReplaceAll2.getClass();
        Pattern patternCompile3 = Pattern.compile("M{1,2}");
        patternCompile3.getClass();
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
        strReplaceAll3.getClass();
        Pattern patternCompile4 = Pattern.compile("y{1,4}");
        patternCompile4.getClass();
        String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
        strReplaceAll4.getClass();
        String strD = z2a.D(w2a.l(strReplaceAll4, "My", "M/y"), ".");
        Pattern patternCompile5 = Pattern.compile("[/\\-.]");
        patternCompile5.getClass();
        Matcher matcher = patternCompile5.matcher(strD);
        matcher.getClass();
        aj6 aj6VarB = t2.b(matcher, 0, strD);
        aj6VarB.getClass();
        xi6 xi6VarE = aj6VarB.c.e(0);
        xi6VarE.getClass();
        return new yg2(strD, xi6VarE.a.charAt(0));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().u0());
    }
}
