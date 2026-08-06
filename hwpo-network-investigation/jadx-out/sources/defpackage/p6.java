package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.d;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ p6(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.t) {
            case 0:
                gz2 gz2Var = (gz2) this.u;
                q6 q6Var = (q6) this.v;
                q6.a aVar = q6.Companion;
                ConstraintLayout constraintLayout = gz2Var.a;
                constraintLayout.getClass();
                q6Var.p().K(q6Var.v().a.getHeight() + ((int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding)));
                break;
            default:
                h90 h90Var = (h90) this.u;
                ln2 ln2Var = (ln2) this.v;
                synchronized (ln2Var) {
                }
                d.b bVar = h90Var.b;
                String str = n6b.a;
                d.this.s.y(ln2Var);
                break;
        }
    }
}
