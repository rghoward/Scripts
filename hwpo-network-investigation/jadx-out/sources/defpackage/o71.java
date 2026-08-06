package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o71 implements r54<xd3<? extends Exception, ? extends rsa>> {
    public final /* synthetic */ e84 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: o71$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$observeTrackingActions$$inlined$filter$1$2", f = "ChallengeEntryDetailsViewModel.kt", l = {217}, m = "emit", v = 2)
        public static final class C0211a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0211a(r02 r02Var) {
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
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0211a c0211a;
            if (r02Var instanceof C0211a) {
                c0211a = (C0211a) r02Var;
                int i = c0211a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0211a.u = i - Integer.MIN_VALUE;
                } else {
                    c0211a = new C0211a(r02Var);
                }
            } else {
                c0211a = new C0211a(r02Var);
            }
            Object obj2 = c0211a.t;
            int i2 = c0211a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                xd3 xd3Var = (xd3) obj;
                if (xd3Var instanceof xd3.b) {
                    R r = ((xd3.b) xd3Var).a;
                    if ((r instanceof rsa.b) && ((rsa) r).a() == ebb.CHALLENGES) {
                        c0211a.u = 1;
                        Object objEmit = this.t.emit(obj, c0211a);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    }
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

    public o71(e84 e84Var) {
        this.t = e84Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super xd3<? extends Exception, ? extends rsa>> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
