package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
public final class v79 extends p6a implements ci4<k97, r02<? super g2b>, Object> {
    public final /* synthetic */ long A;
    public z79 t;
    public fl8 u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z79 y;
    public final /* synthetic */ fl8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements t69 {
        public final /* synthetic */ z79 a;
        public final /* synthetic */ k97 b;

        public a(k97 k97Var, z79 z79Var) {
            this.a = z79Var;
            this.b = k97Var;
        }

        @Override // defpackage.t69
        public final float f(float f) {
            float fAbs = Math.abs(f);
            z79 z79Var = this.a;
            if (fAbs != 0.0f && !((Boolean) z79Var.h.invoke()).booleanValue()) {
                throw new k44("The fling animation was cancelled", 0);
            }
            return z79Var.d(z79Var.g(this.b.b(2, z79Var.e(z79Var.h(f)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v79(z79 z79Var, fl8 fl8Var, long j, r02<? super v79> r02Var) {
        super(2, r02Var);
        this.y = z79Var;
        this.z = fl8Var;
        this.A = j;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        v79 v79Var = new v79(this.y, this.z, this.A, r02Var);
        v79Var.x = obj;
        return v79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
        return ((v79) create(k97Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        z79 z79Var;
        fl8 fl8Var;
        z79 z79Var2;
        long j;
        int i = this.w;
        fl7 fl7Var = fl7.u;
        if (i == 0) {
            dv8.b(obj);
            k97 k97Var = (k97) this.x;
            z79Var = this.y;
            a aVar = new a(k97Var, z79Var);
            g44 g44Var = z79Var.c;
            fl8 fl8Var2 = this.z;
            long j2 = fl8Var2.t;
            fl7 fl7Var2 = z79Var.d;
            long j3 = this.A;
            float fD = z79Var.d(fl7Var2 == fl7Var ? rdb.b(j3) : rdb.c(j3));
            this.x = z79Var;
            this.t = z79Var;
            this.u = fl8Var2;
            this.v = j2;
            this.w = 1;
            obj = g44Var.a(aVar, fD, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
            fl8Var = fl8Var2;
            z79Var2 = z79Var;
            j = j2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.v;
            fl8Var = this.u;
            z79Var = this.t;
            z79Var2 = (z79) this.x;
            dv8.b(obj);
        }
        float fD2 = z79Var2.d(((Number) obj).floatValue());
        fl8Var.t = z79Var.d == fl7Var ? rdb.a(fD2, 0.0f, 2, j) : rdb.a(0.0f, fD2, 1, j);
        return g2b.a;
    }
}
