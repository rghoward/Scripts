package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q69 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ q69 u = new q69();

    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[Catch: pk5 -> 0x01a7, TryCatch #7 {pk5 -> 0x01a7, blocks: (B:35:0x00c2, B:37:0x00c6, B:39:0x00cc, B:54:0x00f5, B:56:0x010f, B:60:0x0124, B:64:0x012c), top: B:120:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [ox5] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v5, types: [ox5] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, yv] */
    /* JADX WARN: Type inference failed for: r9v14, types: [T, yv] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x017c -> B:122:0x0187). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.dz5 r28, int r29, int r30, int r31, defpackage.tx2 r32, defpackage.u02 r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q69.b(dz5, int, int, int, tx2, u02):java.lang.Object");
    }

    public static final boolean c(boolean z, ox5 ox5Var, int i, int i2) {
        if (z) {
            if (ox5Var.g() > i) {
                return true;
            }
            return ox5Var.g() == i && ox5Var.d() > i2;
        }
        if (ox5Var.g() < i) {
            return true;
        }
        return ox5Var.g() == i && ox5Var.d() < i2;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final boolean e(ox5 ox5Var, int i) {
        return i <= ox5Var.a() && ox5Var.g() <= i;
    }

    public static final x69 f(jt1 jt1Var) {
        Object[] objArr = new Object[0];
        boolean zH = jt1Var.h(0);
        Object objF = jt1Var.f();
        if (zH || objF == jt1.a.a) {
            objF = new p69();
            jt1Var.C(objF);
        }
        return (x69) mm8.e(objArr, x69.j, (mh4) objF, jt1Var, 0);
    }

    public static String g(long j) {
        if (d(j, 12884901888L)) {
            return "Rgb";
        }
        if (d(j, 12884901889L)) {
            return "Xyz";
        }
        if (d(j, 12884901890L)) {
            return "Lab";
        }
        return d(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static ox6 h(ox6 ox6Var, x69 x69Var, int i) {
        return ox6Var.H(uma.a(ox6.a.t, leb.a)).H(new y69(null, null, x69Var.d, fl7.t, null, x69Var, true, true)).H(new t79(x69Var));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return u4c.u.get().p();
    }
}
