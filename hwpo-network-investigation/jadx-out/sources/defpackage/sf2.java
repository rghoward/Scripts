package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ sf2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                xf2 xf2Var = (xf2) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    xf2Var.h.b(new yz3(th));
                }
                if (xf2Var.j.u != b1b.a) {
                    ((g1a) xf2Var.j.getValue()).close();
                }
                return g2b.a;
            default:
                return ((fj3) obj2).G.b(R.string.note_symbols_count, Integer.valueOf(((oj3) obj).j));
        }
    }
}
