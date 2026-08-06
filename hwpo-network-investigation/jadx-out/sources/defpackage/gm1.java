package defpackage;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 implements oh4<ld5, g2b> {
    public final /* synthetic */ am1 t;

    public gm1(am1 am1Var) {
        this.t = am1Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(ld5 ld5Var) {
        ld5 ld5Var2 = ld5Var;
        am1.a aVar = am1.Companion;
        am1 am1Var = this.t;
        je4 je4VarR = am1Var.r();
        ColorStateList colorStateListB = vz1.b(am1Var.requireContext(), ld5Var2.c);
        MaterialButton materialButton = je4VarR.b;
        materialButton.setIconTint(colorStateListB);
        materialButton.setRippleColor(colorStateListB);
        xgb.a(materialButton, new im1(ld5Var2, null));
        AppCompatEditText appCompatEditText = je4VarR.g;
        appCompatEditText.setHint(ld5Var2.b);
        appCompatEditText.setFocusable(ld5Var2.a);
        mh4<g2b> mh4Var = ld5Var2.e;
        if (mh4Var != null) {
            xgb.a(appCompatEditText, new jm1(mh4Var, null));
        } else {
            appCompatEditText.setOnClickListener(null);
            g2b g2bVar = g2b.a;
        }
        return g2b.a;
    }
}
