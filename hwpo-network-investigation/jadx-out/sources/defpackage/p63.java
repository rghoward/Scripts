package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p63 extends y53 {
    public q63 c0;
    public fl7 d0;
    public boolean e0;
    public ei4<? super t72, ? super vf7, ? super r02<? super g2b>, ? extends Object> f0;
    public ei4<? super t72, ? super Float, ? super r02<? super g2b>, ? extends Object> g0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {332}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ long w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, r02<? super a> r02Var) {
            super(2, r02Var);
            this.w = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = p63.this.new a(this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                ei4<? super t72, ? super vf7, ? super r02<? super g2b>, ? extends Object> ei4Var = p63.this.f0;
                vf7 vf7Var = new vf7(this.w);
                this.t = 1;
                Object objInvoke = ei4Var.invoke(t72Var, vf7Var, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {339}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ n53.d w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n53.d dVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.w = dVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = p63.this.new b(this.w, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                p63 p63Var = p63.this;
                ei4<? super t72, ? super Float, ? super r02<? super g2b>, ? extends Object> ei4Var = p63Var.g0;
                long jF = rdb.f(1.0f, this.w.a);
                fl7 fl7Var = p63Var.d0;
                m63.a aVar = m63.a;
                Float f = new Float(fl7Var == fl7.t ? rdb.c(jF) : rdb.b(jF));
                this.t = 1;
                Object objInvoke = ei4Var.invoke(t72Var, f, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public p63() {
        throw null;
    }

    @Override // defpackage.y53
    public final Object j2(y53.b.a aVar, y53.b bVar) {
        Object objA = this.c0.a(new o63(aVar, this, null), bVar);
        return objA == v72.t ? objA : g2b.a;
    }

    @Override // defpackage.y53
    public final void o2(long j) {
        if (!this.G || xj5.a(this.f0, m63.a)) {
            return;
        }
        oy0.d(Q1(), null, x72.w, new a(j, null), 1);
    }

    @Override // defpackage.y53
    public final void p2(n53.d dVar) {
        if (!this.G || xj5.a(this.g0, m63.b)) {
            return;
        }
        oy0.d(Q1(), null, x72.w, new b(dVar, null), 1);
    }

    @Override // defpackage.y53
    public final boolean u2() {
        return this.e0;
    }
}
