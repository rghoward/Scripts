package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae3 extends a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFA = a.a(tabLayout, view);
        RectF rectFA2 = a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        drawable.setBounds(aw.c((int) rectFA.left, fSin, (int) rectFA2.left), drawable.getBounds().top, aw.c((int) rectFA.right, fCos, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
