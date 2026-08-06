package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {324, 328}, m = "invokeSuspend", v = 1)
public final class ig2 extends p6a implements ci4<Boolean, r02<? super js7<? extends xz9<Object>, ? extends Boolean>>, Object> {
    public Throwable t;
    public int u;
    public /* synthetic */ boolean v;
    public final /* synthetic */ xf2<Object> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig2(xf2<Object> xf2Var, int i, r02<? super ig2> r02Var) {
        super(2, r02Var);
        this.w = xf2Var;
        this.x = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ig2 ig2Var = new ig2(this.w, this.x, r02Var);
        ig2Var.v = ((Boolean) obj).booleanValue();
        return ig2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Boolean bool, r02<? super js7<? extends xz9<Object>, ? extends Boolean>> r02Var) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ig2) create(bool2, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Throwable th;
        xz9 di8Var;
        boolean z;
        ?? r0;
        ?? r1;
        boolean z2 = this.u;
        xf2<Object> xf2Var = this.w;
        v72 v72Var = v72.t;
        try {
            if (z2 == 0) {
                dv8.b(obj);
                boolean z3 = this.v;
                this.v = z3;
                this.u = 1;
                obj = xf2.g(xf2Var, z3, this);
                z2 = z3;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (z2 != 1) {
                    if (z2 != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = this.v;
                    th = this.t;
                    dv8.b(obj);
                    r1 = z4;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r1;
                    di8Var = new di8(th, iIntValue);
                    z = r0;
                    return new js7(di8Var, Boolean.valueOf(z));
                }
                boolean z5 = this.v;
                dv8.b(obj);
                z2 = z5;
            }
            di8Var = (xz9) obj;
            z = z2;
        } catch (Throwable th2) {
            if (z2 != 0) {
                pg5 pg5VarH = xf2Var.h();
                this.t = th2;
                this.v = z2;
                this.u = 2;
                Object objA = pg5VarH.a(this);
                if (objA != v72Var) {
                    obj = objA;
                    th = th2;
                    r1 = z2;
                }
                return v72Var;
            }
            iIntValue = this.x;
            th = th2;
            r0 = z2;
        }
        return new js7(di8Var, Boolean.valueOf(z));
    }
}
