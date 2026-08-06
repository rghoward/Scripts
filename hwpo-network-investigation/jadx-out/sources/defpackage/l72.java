package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l72 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    public static final h72 a(h72 h72Var, h72 h72Var2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) h72Var.J(new i72(), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) h72Var2.J(new i72(), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return h72Var.c0(h72Var2);
        }
        final gl8 gl8Var = new gl8();
        gl8Var.t = h72Var2;
        ci4 ci4Var = new ci4() { // from class: j72
            /* JADX WARN: Type inference failed for: r3v3, types: [T, h72] */
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                h72 h72Var3 = (h72) obj;
                h72.a aVar = (h72.a) obj2;
                if (!(aVar instanceof k52)) {
                    return h72Var3.c0(aVar);
                }
                gl8 gl8Var2 = gl8Var;
                if (((h72) gl8Var2.t).d0(aVar.getKey()) == null) {
                    return h72Var3.c0(z ? ((k52) aVar).Z() : (k52) aVar);
                }
                gl8Var2.t = ((h72) gl8Var2.t).N(aVar.getKey());
                return h72Var3.c0(((k52) aVar).l0());
            }
        };
        ff3 ff3Var = ff3.t;
        h72 h72Var3 = (h72) h72Var.J(ci4Var, ff3Var);
        if (zBooleanValue2) {
            gl8Var.t = ((h72) gl8Var.t).J(new k72(), ff3Var);
        }
        return h72Var3.c0((h72) gl8Var.t);
    }

    public static final h72 b(t72 t72Var, h72 h72Var) {
        h72 h72VarA = a(t72Var.getCoroutineContext(), h72Var, true);
        et2 et2Var = i23.a;
        return (h72VarA == et2Var || h72VarA.d0(v02.a.t) != null) ? h72VarA : h72VarA.c0(et2Var);
    }

    public static final x1b<?> c(r02<?> r02Var, h72 h72Var, Object obj) {
        x1b<?> x1bVar = null;
        if ((r02Var instanceof w72) && h72Var.d0(y1b.t) != null) {
            w72 callerFrame = (w72) r02Var;
            while (!(callerFrame instanceof c23) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof x1b) {
                    x1bVar = (x1b) callerFrame;
                    break;
                }
            }
            if (x1bVar != null) {
                x1bVar.H0(h72Var, obj);
            }
        }
        return x1bVar;
    }
}
