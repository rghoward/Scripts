package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {350, 351, 357}, m = "invokeSuspend", v = 1)
public final class ng2 extends p6a implements oh4<r02<Object>, Object> {
    public Object t;
    public int u;
    public final /* synthetic */ xf2<Object> v;
    public final /* synthetic */ h72 w;
    public final /* synthetic */ ci4<Object, r02<Object>, Object> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {351}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<Object>, Object> {
        public int t;
        public final /* synthetic */ ci4<Object, r02<Object>, Object> u;
        public final /* synthetic */ ne2<Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ci4<Object, ? super r02<Object>, ? extends Object> ci4Var, ne2<Object> ne2Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = ci4Var;
            this.v = ne2Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<Object> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            Object obj2 = this.v.b;
            this.t = 1;
            Object objInvoke = this.u.invoke(obj2, this);
            v72 v72Var = v72.t;
            return objInvoke == v72Var ? v72Var : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ng2(xf2<Object> xf2Var, h72 h72Var, ci4<Object, ? super r02<Object>, ? extends Object> ci4Var, r02<? super ng2> r02Var) {
        super(1, r02Var);
        this.v = xf2Var;
        this.w = h72Var;
        this.x = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new ng2(this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<Object> r02Var) {
        return ((ng2) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ne2 ne2Var;
        T t;
        int iHashCode;
        int i = this.u;
        xf2<Object> xf2Var = this.v;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            this.u = 1;
            obj = xf2.g(xf2Var, true, this);
            if (obj != v72Var) {
            }
            return v72Var;
        }
        if (i == 1) {
            dv8.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.t;
                dv8.b(obj);
                return obj2;
            }
            ne2Var = (ne2) this.t;
            dv8.b(obj);
        }
        t = ne2Var.b;
        if (t != 0) {
            iHashCode = t.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == ne2Var.c) {
            aa0.c("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!xj5.a(ne2Var.b, obj)) {
            this.t = obj;
            this.u = 3;
            if (xf2Var.j(obj, true, this) == v72Var) {
                return v72Var;
            }
        }
        return obj;
        ne2Var = (ne2) obj;
        a aVar = new a(this.x, ne2Var, null);
        this.t = ne2Var;
        this.u = 2;
        obj = oy0.g(this.w, aVar, this);
        if (obj != v72Var) {
            t = ne2Var.b;
            if (t != 0) {
                iHashCode = t.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == ne2Var.c) {
                aa0.c("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!xj5.a(ne2Var.b, obj)) {
                this.t = obj;
                this.u = 3;
                if (xf2Var.j(obj, true, this) == v72Var) {
                }
            }
            return obj;
        }
        return v72Var;
    }
}
