package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li0 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ li0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                final ni0 ni0Var = (ni0) obj2;
                final ?? Apply = ((vp3) obj).apply(ni0Var.e);
                ni0Var.e = Apply;
                Runnable runnable = new Runnable() { // from class: mi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ni0 ni0Var2 = ni0Var;
                        int i2 = ni0Var2.f - 1;
                        ni0Var2.f = i2;
                        if (i2 == 0) {
                            ni0Var2.b(Apply);
                        }
                    }
                };
                kt4 kt4Var = ni0Var.b;
                if (kt4Var.n().getThread().isAlive()) {
                    kt4Var.e(runnable);
                    break;
                }
                break;
            default:
                vo6 vo6Var = (vo6) obj;
                vo6.a aVar = vo6.Companion;
                ConstraintLayout constraintLayout = ((zz2) obj2).a;
                constraintLayout.getClass();
                vo6Var.p().K(vo6Var.v().a.getHeight() + ((int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding)));
                break;
        }
    }
}
