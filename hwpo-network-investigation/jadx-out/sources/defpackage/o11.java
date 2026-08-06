package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 implements r54<sr7<Object>> {
    public final /* synthetic */ oz8 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: o11$a$a, reason: collision with other inner class name */
        @xm2(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {50}, m = "emit", v = 1)
        public static final class C0209a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0209a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var) {
            this.t = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0209a c0209a;
            if (r02Var instanceof C0209a) {
                c0209a = (C0209a) r02Var;
                int i = c0209a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0209a.u = i - Integer.MIN_VALUE;
                } else {
                    c0209a = new C0209a(r02Var);
                }
            } else {
                c0209a = new C0209a(r02Var);
            }
            Object obj2 = c0209a.t;
            int i2 = c0209a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                final i17 i17Var = (i17) obj;
                l64 l64Var = new l64(new m64(i17Var.b.e, new g17(i17Var, null)), new h17(i17Var, null));
                sr7<T> sr7Var = i17Var.a;
                sr7 sr7Var2 = new sr7(l64Var, sr7Var.b, sr7Var.c, new mh4() { // from class: f17
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oo7 oo7Var = (oo7) th1.A(i17Var.b.a.a.b());
                        if (oo7Var == null || !(oo7Var instanceof oo7.b)) {
                            return null;
                        }
                        oo7.b bVar = (oo7.b) oo7Var;
                        if (bVar.a == wb6.t) {
                            return bVar;
                        }
                        return null;
                    }
                });
                c0209a.u = 1;
                Object objEmit = this.t.emit(sr7Var2, c0209a);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj2);
            }
            return g2b.a;
        }
    }

    public o11(oz8 oz8Var) {
        this.t = oz8Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super sr7<Object>> s54Var, r02 r02Var) throws Throwable {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
