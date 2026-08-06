package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rf4 implements sf4 {
    public final String a;
    public final boolean b;
    public final /* synthetic */ mb2<i, f> c;

    public rf4(String str, mb2<i, f> mb2Var, boolean z) {
        this.c = mb2Var;
        this.a = str == null ? mb2Var.getClass().getName() : str;
        this.b = z;
    }

    @Override // defpackage.sf4
    public final f a(i iVar) {
        iVar.getClass();
        return (f) this.c.c(iVar);
    }

    @Override // defpackage.sf4
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.z59
    public final String e() {
        return this.a;
    }
}
