package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d79 {
    public static final v4 a = new v4(2);
    public static final b b = new b();
    public static final a c = new a();
    public static final c d = new c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements jy6 {
        @Override // defpackage.h72
        public final Object J(ci4 ci4Var, Object obj) {
            return ci4Var.invoke(obj, this);
        }

        @Override // defpackage.h72
        public final h72 N(h72.b<?> bVar) {
            return h72.a.C0100a.b(this, bVar);
        }

        @Override // defpackage.jy6
        public final float P() {
            return 1.0f;
        }

        @Override // defpackage.h72
        public final h72 c0(h72 h72Var) {
            return h72.a.C0100a.c(this, h72Var);
        }

        @Override // defpackage.h72
        public final <E extends h72.a> E d0(h72.b<E> bVar) {
            return (E) h72.a.C0100a.a(this, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements tx2 {
        @Override // defpackage.tx2
        public final float N0() {
            return 1.0f;
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(z79 z79Var, long j, u02 u02Var) throws Throwable {
        e79 e79Var;
        dl8 dl8Var;
        z79 z79Var2;
        if (u02Var instanceof e79) {
            e79Var = (e79) u02Var;
            int i = e79Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e79Var.w = i - Integer.MIN_VALUE;
            } else {
                e79Var = new e79(u02Var);
            }
        } else {
            e79Var = new e79(u02Var);
        }
        Object obj = e79Var.v;
        int i2 = e79Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            dl8Var = new dl8();
            g79 g79Var = new g79(z79Var, j, dl8Var, null);
            e79Var.t = z79Var;
            e79Var.u = dl8Var;
            e79Var.w = 1;
            Object objF = z79Var.f(o37.t, g79Var, e79Var);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
                return v72Var;
            }
            z79Var2 = z79Var;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dl8 dl8Var2 = e79Var.u;
            z79 z79Var3 = e79Var.t;
            dv8.b(obj);
            dl8Var = dl8Var2;
            z79Var2 = z79Var3;
        }
        return new vf7(z79Var2.h(dl8Var.t));
    }

    public static ox6 b(cga cgaVar, fl7 fl7Var, boolean z, boolean z2, h27 h27Var) {
        return new c79(cgaVar, fl7Var, z, z2, h27Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements t69 {
        @Override // defpackage.t69
        public final float f(float f) {
            return f;
        }
    }
}
