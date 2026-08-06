package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
public final class d54 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ h27 v;
    public final /* synthetic */ h54 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ ArrayList t;
        public final /* synthetic */ t72 u;
        public final /* synthetic */ h54 v;

        public a(ArrayList arrayList, t72 t72Var, h54 h54Var) {
            this.t = arrayList;
            this.u = t72Var;
            this.v = h54Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            qg5 qg5Var = (qg5) obj;
            boolean z = qg5Var instanceof l35;
            ArrayList arrayList = this.t;
            if (z) {
                arrayList.add(qg5Var);
            } else if (qg5Var instanceof m35) {
                arrayList.remove(((m35) qg5Var).a);
            } else if (qg5Var instanceof v84) {
                arrayList.add(qg5Var);
            } else if (qg5Var instanceof w84) {
                arrayList.remove(((w84) qg5Var).a);
            } else if (qg5Var instanceof n88.b) {
                arrayList.add(qg5Var);
            } else if (qg5Var instanceof n88.c) {
                arrayList.remove(((n88.c) qg5Var).a);
            } else if (qg5Var instanceof n88.a) {
                arrayList.remove(((n88.a) qg5Var).a);
            }
            oy0.d(this.u, null, null, new c54(this.v, (qg5) th1.H(arrayList), null), 3);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d54(h27 h27Var, h54 h54Var, r02<? super d54> r02Var) {
        super(2, r02Var);
        this.v = h27Var;
        this.w = h54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        d54 d54Var = new d54(this.v, this.w, r02Var);
        d54Var.u = obj;
        return d54Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((d54) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return g2b.a;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        t72 t72Var = (t72) this.u;
        ArrayList arrayList = new ArrayList();
        am9 am9VarA = this.v.a();
        a aVar = new a(arrayList, t72Var, this.w);
        this.t = 1;
        am9VarA.collect(aVar, this);
        return v72.t;
    }
}
