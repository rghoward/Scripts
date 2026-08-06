package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onLibraryAttachmentsSelected$1", f = "CommentsViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
public final class eo1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ ArrayList v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(qn1 qn1Var, ArrayList arrayList, r02 r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = arrayList;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new eo1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((eo1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            qn1 qn1Var = this.u;
            jb jbVar = qn1Var.C;
            jb.a aVar = new jb.a(qn1Var.U, this.v);
            this.t = 1;
            jbVar.getClass();
            Object objB = g5b.b(jbVar, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
