package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hf8<T> {
    public final k26 a;

    public hf8() {
        throw null;
    }

    public hf8(mh4 mh4Var) {
        this.a = new k26(mh4Var);
    }

    public abstract kf8<T> a(T t);

    public oab<Object> b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 java.lang.Object) = (r4v6 java.lang.Object), (r4v7 java.lang.Object) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final oab<T> c(kf8<T> kf8Var, oab<T> oabVar) {
        vu1 vu1Var;
        Object obj;
        b1a b1aVar;
        v93 v93Var = null;
        if (oabVar instanceof v93) {
            if (kf8Var.d) {
                v93Var = (v93) oabVar;
                v93Var.a.setValue(kf8Var.a());
            }
        } else if (oabVar instanceof b1a) {
            if ((kf8Var.b || kf8Var.e != null) && !kf8Var.d) {
                b1aVar = (b1a) oabVar;
                if (xj5.a(kf8Var.a(), b1aVar.a)) {
                    obj = vu1Var;
                    obj = b1aVar;
                    v93Var = (oab<T>) obj;
                }
            }
        } else if (oabVar instanceof vu1) {
            kf8Var.getClass();
            vu1Var = (vu1) oabVar;
            if (vu1Var.a == null) {
                obj = vu1Var;
                obj = b1aVar;
                v93Var = (oab<T>) obj;
            }
        }
        if (v93Var != null) {
            return v93Var;
        }
        if (!kf8Var.d) {
            return new b1a(kf8Var.a());
        }
        T t = kf8Var.e;
        wu9 wu9Var = kf8Var.c;
        if (wu9Var == null) {
            wu9Var = d3a.u;
        }
        return new v93(new dt7(t, wu9Var));
    }
}
