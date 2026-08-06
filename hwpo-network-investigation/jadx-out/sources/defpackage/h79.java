package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h79 implements b97 {
    public final z79 t;
    public boolean u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {1008}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends u02 {
        public long t;
        public /* synthetic */ Object u;
        public int w;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return h79.this.g0(0L, 0L, this);
        }
    }

    public h79(z79 z79Var, boolean z) {
        this.t = z79Var;
        this.u = z;
    }

    @Override // defpackage.b97
    public final long f0(long j, int i, long j2) {
        if (!this.u) {
            return 0L;
        }
        z79 z79Var = this.t;
        if (z79Var.a.a()) {
            return 0L;
        }
        return z79Var.h(z79Var.d(z79Var.a.e(z79Var.d(z79Var.g(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b97
    public final Object g0(long j, long j2, r02<? super rdb> r02Var) throws Throwable {
        a aVar;
        long jD;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        Object objA = aVar.u;
        int i2 = aVar.w;
        if (i2 == 0) {
            dv8.b(objA);
            jD = 0;
            if (this.u) {
                z79 z79Var = this.t;
                if (!z79Var.i) {
                    aVar.t = j2;
                    aVar.w = 1;
                    objA = z79Var.a(j2, aVar);
                    v72 v72Var = v72.t;
                    if (objA == v72Var) {
                        return v72Var;
                    }
                }
                jD = rdb.d(j2, jD);
            }
            return new rdb(jD);
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = aVar.t;
        dv8.b(objA);
        jD = ((rdb) objA).a;
        jD = rdb.d(j2, jD);
        return new rdb(jD);
    }
}
