package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {998, 1007}, m = "invokeSuspend")
public final class bz0 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qt<y43, bw> u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ cz0 x;
    public final /* synthetic */ qg5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(qt<y43, bw> qtVar, float f, boolean z, cz0 cz0Var, qg5 qg5Var, r02<? super bz0> r02Var) {
        super(2, r02Var);
        this.u = qtVar;
        this.v = f;
        this.w = z;
        this.x = cz0Var;
        this.y = qg5Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new bz0(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((bz0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r9.e(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (defpackage.de3.a(r9, r4, r1, r8.y, r8) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.t
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L12:
            defpackage.dv8.b(r9)
            goto L83
        L16:
            defpackage.dv8.b(r9)
            qt<y43, bw> r9 = r8.u
            dt7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            y43 r0 = (defpackage.y43) r0
            float r0 = r0.t
            float r4 = r8.v
            boolean r0 = defpackage.y43.e(r0, r4)
            if (r0 != 0) goto L83
            boolean r0 = r8.w
            v72 r5 = defpackage.v72.t
            if (r0 != 0) goto L41
            y43 r0 = new y43
            r0.<init>(r4)
            r8.t = r3
            java.lang.Object r8 = r9.e(r8, r0)
            if (r8 != r5) goto L83
            goto L82
        L41:
            dt7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            y43 r0 = (defpackage.y43) r0
            float r0 = r0.t
            cz0 r3 = r8.x
            float r6 = r3.b
            boolean r6 = defpackage.y43.e(r0, r6)
            if (r6 == 0) goto L5d
            n88$b r1 = new n88$b
            r6 = 0
            r1.<init>(r6)
            goto L78
        L5d:
            float r6 = r3.d
            boolean r6 = defpackage.y43.e(r0, r6)
            if (r6 == 0) goto L6b
            l35 r1 = new l35
            r1.<init>()
            goto L78
        L6b:
            float r3 = r3.c
            boolean r0 = defpackage.y43.e(r0, r3)
            if (r0 == 0) goto L78
            v84 r1 = new v84
            r1.<init>()
        L78:
            r8.t = r2
            qg5 r0 = r8.y
            java.lang.Object r8 = defpackage.de3.a(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L83
        L82:
            return r5
        L83:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
