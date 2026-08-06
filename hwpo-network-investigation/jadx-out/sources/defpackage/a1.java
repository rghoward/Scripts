package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a1<T> implements r54<T> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect", v = 1)
    public static final class a extends u02 {
        public kz8 t;
        public /* synthetic */ Object u;
        public final /* synthetic */ a1<T> v;
        public int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1<T> a1Var, r02<? super a> r02Var) {
            super(r02Var);
            this.v = a1Var;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return this.v.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        kz8 kz8Var;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, r02Var);
            }
        } else {
            aVar = new a(this, r02Var);
        }
        Object obj = aVar.u;
        int i2 = aVar.w;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kz8Var = aVar.t;
            try {
                dv8.b(obj);
                kz8Var.releaseIntercepted();
                return g2b.a;
            } catch (Throwable th) {
                th = th;
                kz8Var.releaseIntercepted();
                throw th;
            }
        }
        dv8.b(obj);
        kz8 kz8Var2 = new kz8(s54Var, aVar.getContext());
        try {
            aVar.t = kz8Var2;
            aVar.w = 1;
            try {
                Object objInvoke = ((oz8) this).t.invoke(kz8Var2, aVar);
                v72 v72Var = v72.t;
                if (objInvoke != v72Var) {
                    objInvoke = g2b.a;
                }
                if (objInvoke == v72Var) {
                    return v72Var;
                }
                kz8Var = kz8Var2;
                kz8Var.releaseIntercepted();
                return g2b.a;
            } catch (Throwable th2) {
                th = th2;
                kz8Var = kz8Var2;
                kz8Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
