package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee5 {
    public static final void a(final gi4 gi4Var, final View view) {
        view.getClass();
        b(view, new ei4() { // from class: be5
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                umb umbVar = (umb) obj2;
                ec5 ec5Var = (ec5) obj3;
                ((View) obj).getClass();
                umbVar.getClass();
                ec5Var.getClass();
                umb.q qVar = umbVar.a;
                int i = qVar.i(8).d;
                int i2 = qVar.i(2).d;
                int i3 = qVar.i(1).b;
                gi4Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), view, ec5Var);
                return g2b.a;
            }
        });
    }

    public static final void b(View view, final ei4<? super View, ? super umb, ? super ec5, g2b> ei4Var) {
        view.getClass();
        final ec5 ec5Var = new ec5(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        pg7 pg7Var = new pg7() { // from class: ce5
            @Override // defpackage.pg7
            public final umb b(View view2, umb umbVar) {
                view2.getClass();
                ei4Var.invoke(view2, umbVar, ec5Var);
                return umbVar;
            }
        };
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(view, pg7Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new de5());
        }
    }
}
