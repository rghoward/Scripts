package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ nm0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                aba.a aVar = (aba.a) obj;
                ((h37) obj2).setValue(aVar.c ? aVar.b : aVar.a);
                break;
            case 1:
                ((Integer) obj).getClass();
                o81.a aVar2 = o81.Companion;
                m91 m91VarW = ((o81) obj2).w();
                oy0.d(rhb.b(m91VarW), null, null, new j91(m91VarW, null), 3);
                break;
            default:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                aa6 aa6Var = (aa6) yaVar.u;
                aa6Var.b.setText(((x60.a) yaVar.t()).b);
                aa6Var.c.setVisibility(((x60.a) yaVar.t()).c ? 0 : 8);
                aa6Var.d.setVisibility(((x60.a) yaVar.t()).c ? 0 : 8);
                break;
        }
        return g2b.a;
    }
}
