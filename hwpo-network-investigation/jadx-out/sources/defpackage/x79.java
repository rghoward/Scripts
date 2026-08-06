package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
public final class x79 extends p6a implements ci4<rdb, r02<? super rdb>, Object> {
    public long t;
    public int u;
    public /* synthetic */ long v;
    public final /* synthetic */ z79 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x79(z79 z79Var, r02<? super x79> r02Var) {
        super(2, r02Var);
        this.w = z79Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        x79 x79Var = new x79(this.w, r02Var);
        x79Var.v = ((rdb) obj).a;
        return x79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(rdb rdbVar, r02<? super rdb> r02Var) {
        long j = rdbVar.a;
        x79 x79Var = new x79(this.w, r02Var);
        x79Var.v = j;
        return x79Var.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.u;
        z79 z79Var = this.w;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            j = this.v;
            c97 c97Var = z79Var.f;
            this.v = j;
            this.u = 1;
            obj = c97Var.b(j, this);
            if (obj != v72Var) {
            }
            return v72Var;
        }
        if (i == 1) {
            j = this.v;
            dv8.b(obj);
        } else {
            if (i == 2) {
                j2 = this.t;
                j = this.v;
                dv8.b(obj);
                j3 = ((rdb) obj).a;
                c97 c97Var2 = z79Var.f;
                long jD = rdb.d(j2, j3);
                this.v = j;
                this.t = j3;
                this.u = 3;
                obj = c97Var2.a(jD, j3, this);
                if (obj != v72Var) {
                    j4 = j;
                    j5 = j3;
                }
                return v72Var;
            }
            if (i != 3) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.t;
            j4 = this.v;
            dv8.b(obj);
        }
        return new rdb(rdb.d(j4, rdb.d(j5, ((rdb) obj).a)));
        long jD2 = rdb.d(j, ((rdb) obj).a);
        this.v = j;
        this.t = jD2;
        this.u = 2;
        obj = z79Var.a(jD2, this);
        if (obj != v72Var) {
            j2 = jD2;
            j3 = ((rdb) obj).a;
            c97 c97Var3 = z79Var.f;
            long jD3 = rdb.d(j2, j3);
            this.v = j;
            this.t = j3;
            this.u = 3;
            obj = c97Var3.a(jD3, j3, this);
            if (obj != v72Var) {
                j4 = j;
                j5 = j3;
                return new rdb(rdb.d(j4, rdb.d(j5, ((rdb) obj).a)));
            }
        }
        return v72Var;
    }
}
