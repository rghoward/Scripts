package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kpb extends ViewPager2.g {
    public final /* synthetic */ jpb a;
    public final /* synthetic */ ViewPager2 b;

    public kpb(jpb jpbVar, ViewPager2 viewPager2) {
        this.a = jpbVar;
        this.b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i) {
        if (i == 0) {
            ho5<Object>[] ho5VarArr = jpb.F;
            jpb jpbVar = this.a;
            yp7 yp7Var = (yp7) jpbVar.B.getValue();
            yp7Var.h = true;
            yp7Var.i = 0;
            wpb wpbVarQ = jpbVar.q();
            LocalDate localDateB = kz0.b(wpbVarQ.b().c, this.b.getCurrentItem());
            qm2.Companion.getClass();
            wpbVarQ.e(new vpb.c(qm2.a.a(localDateB)));
            oy0.d(rhb.b(wpbVarQ), null, null, new cqb(wpbVarQ, localDateB, null), 3);
        }
    }
}
