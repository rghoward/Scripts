package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f29 implements ci4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        pw pwVar;
        Object objA;
        k19 k19Var = (k19) obj;
        iw.c cVar = (iw.c) obj2;
        T t = cVar.a;
        if (t instanceof ss7) {
            pwVar = pw.t;
        } else if (t instanceof ww9) {
            pwVar = pw.u;
        } else if (t instanceof xdb) {
            pwVar = pw.v;
        } else if (t instanceof c5b) {
            pwVar = pw.w;
        } else if (t instanceof l86.b) {
            pwVar = pw.x;
        } else if (t instanceof l86.a) {
            pwVar = pw.y;
        } else {
            if (!(t instanceof d2a)) {
                e44.b();
                return null;
            }
            pwVar = pw.z;
        }
        switch (pwVar.ordinal()) {
            case 0:
                t.getClass();
                objA = t29.a((ss7) t, t29.h, k19Var);
                break;
            case 1:
                t.getClass();
                objA = t29.a((ww9) t, t29.i, k19Var);
                break;
            case 2:
                t.getClass();
                objA = t29.a((xdb) t, t29.d, k19Var);
                break;
            case 3:
                t.getClass();
                objA = t29.a((c5b) t, t29.e, k19Var);
                break;
            case 4:
                t.getClass();
                objA = t29.a((l86.b) t, t29.f, k19Var);
                break;
            case 5:
                t.getClass();
                objA = t29.a((l86.a) t, t29.g, k19Var);
                break;
            case 6:
                t.getClass();
                objA = ((d2a) t).a;
                break;
            default:
                u.b();
                return null;
        }
        return ws0.c(pwVar, objA, Integer.valueOf(cVar.b), Integer.valueOf(cVar.c), cVar.d);
    }
}
