package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dj9 extends ViewPager2.g {
    public final /* synthetic */ cj9 a;
    public final /* synthetic */ ViewPager2 b;

    public dj9(cj9 cj9Var, ViewPager2 viewPager2) {
        this.a = cj9Var;
        this.b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i) {
        if (i == 0) {
            cj9.a aVar = cj9.Companion;
            ij9 ij9VarQ = this.a.q();
            sh9.a aVarA = th9.a(ij9VarQ.b().a.t, this.b.getCurrentItem());
            if (aVarA == null) {
                return;
            }
            i7a i7aVar = ij9VarQ.y;
            LocalDate localDateA = aVarA.a.a();
            i7aVar.getClass();
            localDateA.getClass();
            i7aVar.a = localDateA;
        }
    }
}
