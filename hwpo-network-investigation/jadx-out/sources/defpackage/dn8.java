package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
public final class dn8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ en8 u;
    public final /* synthetic */ Map<String, String> v;
    public final /* synthetic */ cn8.b w;
    public final /* synthetic */ cn8.c x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn8(en8 en8Var, Map map, cn8.b bVar, cn8.c cVar, r02 r02Var) {
        super(2, r02Var);
        this.u = en8Var;
        this.v = map;
        this.w = bVar;
        this.x = cVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dn8(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dn8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r1.invoke(r9, r8) == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (r1.invoke(r0, r8) == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.String] */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
