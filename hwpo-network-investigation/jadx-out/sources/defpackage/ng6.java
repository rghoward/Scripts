package defpackage;

import android.content.res.ColorStateList;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ng6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ng6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                og6 og6Var = (og6) obj2;
                ho5<Object>[] ho5VarArr = og6.F;
                if (iIntValue == 0) {
                    w77 w77Var = og6Var.p().b.u;
                    w77Var.getClass();
                    w77.h();
                    r77 r77VarG = w77Var.g();
                    if (r77VarG != null) {
                        ImageView imageView = r77VarG.M;
                        if (r77VarG.t0 != null) {
                            if (imageView != null) {
                                r77VarG.setClipChildren(true);
                                r77VarG.setClipToPadding(true);
                                ti0 ti0Var = r77VarG.t0;
                                if (ti0Var != null) {
                                    if (ti0Var.e() != null) {
                                        ti0Var.e().setForeground(null);
                                    } else {
                                        imageView.getOverlay().remove(ti0Var);
                                    }
                                }
                            }
                            r77VarG.t0 = null;
                        }
                    }
                    w77Var.O.put(R.id.notificaions, null);
                } else {
                    w77 w77Var2 = og6Var.p().b.u;
                    w77Var2.getClass();
                    w77.h();
                    SparseArray<ti0> sparseArray = w77Var2.O;
                    ti0 ti0Var2 = sparseArray.get(R.id.notificaions);
                    if (ti0Var2 == null) {
                        ti0 ti0Var3 = new ti0(w77Var2.getContext(), null);
                        sparseArray.put(R.id.notificaions, ti0Var3);
                        ti0Var2 = ti0Var3;
                    }
                    mda mdaVar = ti0Var2.v;
                    zi0 zi0Var = ti0Var2.x;
                    r77 r77VarG2 = w77Var2.g();
                    if (r77VarG2 != null) {
                        r77VarG2.setBadge(ti0Var2);
                    }
                    int color = og6Var.requireContext().getColor(R.color.iconAlert);
                    zi0.a aVar = zi0Var.a;
                    zi0.a aVar2 = zi0Var.b;
                    aVar.u = Integer.valueOf(color);
                    aVar2.u = Integer.valueOf(color);
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(zi0Var.b.u.intValue());
                    kk6 kk6Var = ti0Var2.u;
                    if (kk6Var.u.c != colorStateListValueOf) {
                        kk6Var.p(colorStateListValueOf);
                        ti0Var2.invalidateSelf();
                    }
                    int color2 = og6Var.requireContext().getColor(R.color.labelQuinary);
                    if (mdaVar.a.getColor() != color2) {
                        aVar.v = Integer.valueOf(color2);
                        aVar2.v = Integer.valueOf(color2);
                        ti0Var2.j();
                    }
                    int iMax = Math.max(0, iIntValue);
                    if (aVar2.D != iMax) {
                        aVar.D = iMax;
                        aVar2.D = iMax;
                        if (!zi0Var.a()) {
                            mdaVar.e = true;
                            ti0Var2.i();
                            ti0Var2.l();
                            ti0Var2.invalidateSelf();
                        }
                    }
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((View) ((spa) obj2).receiver).setVisibility(bool.booleanValue() ? 0 : 8);
                break;
        }
        return g2b.a;
    }
}
