package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 implements sf4 {
    public final int a;
    public final boolean b;
    public final String c = am1.class.getName();

    public en1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.sf4
    public final f a(i iVar) {
        iVar.getClass();
        am1.b.C0003b c0003b = new am1.b.C0003b(this.a);
        am1.Companion.getClass();
        am1 am1Var = new am1();
        am1Var.setArguments(uy0.c(new js7("comments_params", c0003b)));
        return am1Var;
    }

    @Override // defpackage.sf4
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.z59
    public final String e() {
        return this.c;
    }
}
