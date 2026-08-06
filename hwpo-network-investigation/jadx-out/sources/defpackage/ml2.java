package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ml2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ml2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ql2.a aVar = ql2.Companion;
                ql2.b bVar = new ql2.b(1, ((ql2) obj).q(), cm2.class, "onProgramClick", "onProgramClick(Lcom/hwpo_training_app/core/presentation/entity/program/Program;)V", 0);
                xob xobVar = new xob(new xob.a());
                e93 e93Var = new e93(new dc8(), new ec8(3), new h82(1, bVar), fc8.u);
                za<List<T>> zaVar = xobVar.d;
                zaVar.getClass();
                zaVar.b(e93Var);
                zaVar.b(new e93(new dq5(0), new fq5(3), new eq5(), gq5.u));
                return xobVar;
            case 1:
                cw cwVar = eb9.a;
                return new vf7(((vf7) ((yz9) obj).getValue()).a);
            default:
                return new y43(vk6.c(24.0f, 16.0f, ((yea.b) obj).invoke()));
        }
    }
}
