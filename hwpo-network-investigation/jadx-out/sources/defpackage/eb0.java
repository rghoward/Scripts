package defpackage;

import io.intercom.android.sdk.models.Participant;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 implements ge7<u92.e> {
    public static final eb0 a = new eb0();
    public static final ou3 b = ou3.a("generator");
    public static final ou3 c = ou3.a("identifier");
    public static final ou3 d = ou3.a("appQualitySessionId");
    public static final ou3 e = ou3.a("startedAt");
    public static final ou3 f = ou3.a("endedAt");
    public static final ou3 g = ou3.a("crashed");
    public static final ou3 h = ou3.a("app");
    public static final ou3 i = ou3.a(Participant.USER_TYPE);
    public static final ou3 j = ou3.a("os");
    public static final ou3 k = ou3.a("device");
    public static final ou3 l = ou3.a("events");
    public static final ou3 m = ou3.a("generatorType");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e eVar = (u92.e) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, eVar.f());
        he7Var2.a(c, eVar.h().getBytes(u92.a));
        he7Var2.a(d, eVar.b());
        he7Var2.g(e, eVar.j());
        he7Var2.a(f, eVar.d());
        he7Var2.d(g, eVar.l());
        he7Var2.a(h, eVar.a());
        he7Var2.a(i, eVar.k());
        he7Var2.a(j, eVar.i());
        he7Var2.a(k, eVar.c());
        he7Var2.a(l, eVar.e());
        he7Var2.e(m, eVar.g());
    }
}
