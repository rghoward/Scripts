package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fn1 implements sf4 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final String g;

    public fn1(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
        this.f = z;
        this.g = am1.class.getName();
    }

    @Override // defpackage.sf4
    public final f a(i iVar) {
        iVar.getClass();
        String str = this.d;
        am1.b.a aVar = new am1.b.a(this.a, this.b, this.e, this.c, str);
        am1.Companion.getClass();
        am1 am1Var = new am1();
        am1Var.setArguments(uy0.c(new js7("comments_params", aVar)));
        return am1Var;
    }

    @Override // defpackage.sf4
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.z59
    public final String e() {
        return this.g;
    }
}
