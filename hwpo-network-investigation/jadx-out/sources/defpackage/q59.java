package defpackage;

import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q59 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ q59(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                int i2 = ScoreInfoExpandableLayout.N;
                return new wm6(new mh2(1, (ScoreInfoExpandableLayout) obj));
            default:
                ioa ioaVar = (ioa) obj;
                if (xna.r(ioaVar)) {
                    ioaVar.a(ioaVar.g() - 12);
                }
                return g2b.a;
        }
    }
}
