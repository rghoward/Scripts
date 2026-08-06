package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
public final class se6 extends p6a implements ci4<t72, r02<? super el5>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ i58 u;
    public final /* synthetic */ lda v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ i58 u;
        public final /* synthetic */ lda v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i58 i58Var, lda ldaVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = i58Var;
            this.v = ldaVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
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
                this.t = 1;
                Object objB = cc4.b(this.u, new te6(this.v, null), this);
                Object obj2 = v72.t;
                if (objB != obj2) {
                    objB = g2b.a;
                }
                if (objB == obj2) {
                    return obj2;
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
    @xm2(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ i58 u;
        public final /* synthetic */ lda v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i58 i58Var, lda ldaVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = i58Var;
            this.v = ldaVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, this.v, r02Var);
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
                this.t = 1;
                final lda ldaVar = this.v;
                Object objD = x53.d(this.u, new zk3(1, ldaVar), new mh4() { // from class: qe6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ldaVar.a();
                        return g2b.a;
                    }
                }, new u22(2, ldaVar), new ci4() { // from class: re6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        ldaVar.e(((vf7) obj3).a);
                        return g2b.a;
                    }
                }, this);
                Object obj2 = v72.t;
                if (objD != obj2) {
                    objD = g2b.a;
                }
                if (objD == obj2) {
                    return obj2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se6(i58 i58Var, lda ldaVar, r02<? super se6> r02Var) {
        super(2, r02Var);
        this.u = i58Var;
        this.v = ldaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        se6 se6Var = new se6(this.u, this.v, r02Var);
        se6Var.t = obj;
        return se6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super el5> r02Var) {
        return ((se6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        t72 t72Var = (t72) this.t;
        i58 i58Var = this.u;
        lda ldaVar = this.v;
        a aVar = new a(i58Var, ldaVar, null);
        x72 x72Var = x72.w;
        oy0.d(t72Var, null, x72Var, aVar, 1);
        return oy0.d(t72Var, null, x72Var, new b(i58Var, ldaVar, null), 1);
    }
}
