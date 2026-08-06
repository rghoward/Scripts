package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs5 implements f4a.a {
    public final /* synthetic */ xr5 a;
    public final /* synthetic */ Object b;

    public bs5(xr5 xr5Var, Object obj) {
        this.a = xr5Var;
        this.b = obj;
    }

    @Override // f4a.a
    public final boolean a(b88 b88Var) {
        xr5.b bVarB = b();
        pu7 pu7Var = bVarB != null ? bVarB.f : null;
        if (pu7Var == null || pu7Var.c()) {
            return true;
        }
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            boolean zE = pu7Var.e(b88Var);
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            return zE;
        } catch (Throwable th) {
            try {
                bVarB.getClass();
                throw th;
            } catch (Throwable th2) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th2;
            }
        }
    }

    @Override // f4a.a
    public final f4a.b apply() {
        xr5.b bVarB = b();
        xr5 xr5Var = this.a;
        if (bVarB != null) {
            xr5Var.c(bVarB, false);
        }
        return xr5Var.e(this.b);
    }

    public final xr5.b b() {
        xr5 xr5Var = this.a;
        qr5 qr5VarD = xr5Var.C.d(this.b);
        if (qr5VarD != null) {
            return xr5Var.y.d(qr5VarD);
        }
        return null;
    }

    @Override // f4a.a
    public final boolean c() {
        pu7 pu7Var;
        xr5.b bVarB = b();
        if (bVarB == null || (pu7Var = bVarB.f) == null) {
            return true;
        }
        return pu7Var.c();
    }

    @Override // f4a.a
    public final void cancel() {
        xr5.b bVarB = b();
        if ((bVarB != null ? bVarB.f : null) != null) {
            xr5.b(this.a, this.b);
        }
    }
}
