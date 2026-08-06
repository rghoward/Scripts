package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class opb implements oh4<qm2, g2b> {
    public final /* synthetic */ jpb t;

    public opb(jpb jpbVar) {
        this.t = jpbVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(qm2 qm2Var) {
        qm2 qm2Var2 = qm2Var;
        ho5<Object>[] ho5VarArr = jpb.F;
        jpb jpbVar = this.t;
        RecyclerView.f adapter = jpbVar.p().b.getAdapter();
        final sm2 sm2Var = adapter instanceof sm2 ? (sm2) adapter : null;
        if (sm2Var != null) {
            qm2Var2.getClass();
            sm2Var.m = qm2Var2;
            jpbVar.p().b.post(new Runnable() { // from class: epb
                @Override // java.lang.Runnable
                public final void run() {
                    ho5<Object>[] ho5VarArr2 = jpb.F;
                    sm2Var.a.b();
                }
            });
            jpbVar.p().b.c(1, false);
        }
        return g2b.a;
    }
}
