package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 implements sf4 {
    public final String a;
    public final boolean b;
    public final String c;

    public p52(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = tx7.class.getName();
    }

    @Override // defpackage.sf4
    public final f a(i iVar) {
        iVar.getClass();
        tx7.Companion.getClass();
        String str = this.a;
        str.getClass();
        tx7 tx7Var = new tx7();
        tx7Var.setArguments(uy0.c(new js7("PHOTO_KEY", str)));
        return tx7Var;
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
