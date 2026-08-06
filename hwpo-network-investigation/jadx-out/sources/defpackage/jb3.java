package defpackage;

import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ jb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj2;
                gm3 gm3Var = (gm3) obj;
                rb3.a aVar = rb3.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof uc3) {
                    rb3Var.n(((uc3) gm3Var).b);
                } else if (gm3Var instanceof tc3) {
                    rb3Var.m(((tc3) gm3Var).b);
                } else if (gm3Var instanceof sc3) {
                    de1 de1Var = (de1) rb3Var.F.getValue();
                    l childFragmentManager = rb3Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    de1Var.getClass();
                    de1Var.o(childFragmentManager, de1.class.getName());
                } else if (gm3Var instanceof qc3) {
                    rb3Var.r().e.postDelayed(new ec3(rb3Var), 200L);
                } else if (gm3Var instanceof rc3) {
                    rb3Var.r().d.postDelayed(new fc3(0, rb3Var), 200L);
                } else if (gm3Var instanceof vc3) {
                    vo6 vo6Var = new vo6();
                    l childFragmentManager2 = rb3Var.getChildFragmentManager();
                    childFragmentManager2.getClass();
                    vo6Var.s(childFragmentManager2);
                } else if (gm3Var instanceof wc3) {
                    yy3.Companion.getClass();
                    yy3 yy3Var = new yy3();
                    l childFragmentManager3 = rb3Var.getChildFragmentManager();
                    childFragmentManager3.getClass();
                    yy3Var.r(childFragmentManager3);
                }
                break;
            default:
                String str = (String) obj;
                int i2 = qf9.Y;
                str.getClass();
                ((qf9) obj2).f(new atb(str));
                break;
        }
        return g2b.a;
    }
}
