package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class de3 {
    public static final xya<y43> a;
    public static final xya<y43> b;
    public static final xya<y43> c;

    static {
        dc2 dc2Var = new dc2(0.4f, 0.0f, 0.6f, 1.0f);
        a = new xya<>(120, ca3.a, 2);
        b = new xya<>(150, dc2Var, 2);
        c = new xya<>(120, dc2Var, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 xya<y43>) = (r1v0 xya<y43>), (r1v0 xya<y43>), (r1v0 xya<y43>), (r1v4 xya<y43>), (r1v4 xya<y43>), (r1v4 xya<y43>), (r1v4 xya<y43>) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(qt qtVar, float f, qg5 qg5Var, qg5 qg5Var2, u02 u02Var) {
        xya<y43> xyaVar;
        xya<y43> xyaVar2 = null;
        if (qg5Var2 != null) {
            boolean z = qg5Var2 instanceof n88.b;
            xyaVar = a;
            if (z || (qg5Var2 instanceof d63) || (qg5Var2 instanceof l35) || (qg5Var2 instanceof v84)) {
                xyaVar2 = xyaVar;
            }
        } else if (qg5Var != null) {
            boolean z2 = qg5Var instanceof n88.b;
            xyaVar = b;
            if (z2 || (qg5Var instanceof d63)) {
                xyaVar2 = xyaVar;
            } else if (qg5Var instanceof l35) {
                xyaVar2 = c;
            } else if (qg5Var instanceof v84) {
                xyaVar2 = xyaVar;
            }
        }
        xya<y43> xyaVar3 = xyaVar2;
        v72 v72Var = v72.t;
        if (xyaVar3 != null) {
            Object objC = qt.c(qtVar, new y43(f), xyaVar3, null, u02Var, 12);
            return objC == v72Var ? objC : g2b.a;
        }
        Object objE = qtVar.e(u02Var, new y43(f));
        return objE == v72Var ? objE : g2b.a;
    }
}
