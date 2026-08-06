package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenProgramsUpdates$2", f = "SessionsViewModel.kt", l = {445}, m = "invokeSuspend", v = 2)
public final class sj9 extends p6a implements ci4<id8, r02<? super g2b>, Object> {
    public lj9 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ lj9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj9(lj9 lj9Var, r02<? super sj9> r02Var) {
        super(2, r02Var);
        this.w = lj9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        sj9 sj9Var = new sj9(this.w, r02Var);
        sj9Var.v = obj;
        return sj9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(id8 id8Var, r02<? super g2b> r02Var) {
        return ((sj9) create(id8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        lj9 lj9Var;
        id8 id8Var = (id8) this.v;
        int i = this.u;
        if (i == 0) {
            dv8.b(obj);
            lj9.a aVar = lj9.Companion;
            lj9 lj9Var2 = this.w;
            bc8 bc8Var = lj9Var2.b().a;
            if (bc8Var != null) {
                Iterator<T> it = id8Var.c.a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((sc8) next).a != bc8Var.t);
                sc8 sc8Var = (sc8) next;
                if (sc8Var != null) {
                    bc8 bc8VarB = rc8.b(sc8Var, lj9Var2.H);
                    this.v = null;
                    this.t = lj9Var2;
                    this.u = 1;
                    Object objG = lj9.g(lj9Var2, bc8VarB, this);
                    v72 v72Var = v72.t;
                    if (objG == v72Var) {
                        return v72Var;
                    }
                    lj9Var = lj9Var2;
                }
            }
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lj9Var = this.t;
        dv8.b(obj);
        kj9.b bVar = kj9.b.a;
        lj9.a aVar2 = lj9.Companion;
        lj9Var.e(bVar);
        return g2b.a;
    }
}
