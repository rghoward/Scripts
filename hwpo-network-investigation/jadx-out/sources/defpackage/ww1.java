package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ww1 extends g5b<g2b, g2b> {
    public final tv9 a;
    public final k55 b;
    public final wg9 c;

    public ww1(tv9 tv9Var, k55 k55Var, wg9 wg9Var) {
        tv9Var.getClass();
        k55Var.getClass();
        wg9Var.getClass();
        this.a = tv9Var;
        this.b = k55Var;
        this.c = wg9Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        String strD = this.c.d();
        if (strD == null || z2a.w(strD)) {
            return g2b.a;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme("wss");
        this.b.getClass();
        Uri uriBuild = builderScheme.authority("app.hwpo-training.com").appendPath("cable").appendQueryParameter("token", strD).build();
        jp8.a aVar = new jp8.a();
        aVar.b("Origin", "https://app.hwpo-training.com/");
        String string = uriBuild.toString();
        string.getClass();
        aVar.d(string);
        jp8 jp8Var = new jp8(aVar);
        tv9 tv9Var = this.a;
        tv9Var.getClass();
        tv9Var.v = 1;
        tv9Var.b(jp8Var);
        return g2b.a;
    }
}
