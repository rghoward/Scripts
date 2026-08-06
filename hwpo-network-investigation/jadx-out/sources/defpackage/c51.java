package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {727, 737}, m = "invokeSuspend")
public final class c51 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qt<y43, bw> u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ d51 x;
    public final /* synthetic */ qg5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(qt<y43, bw> qtVar, float f, boolean z, d51 d51Var, qg5 qg5Var, r02<? super c51> r02Var) {
        super(2, r02Var);
        this.u = qtVar;
        this.v = f;
        this.w = z;
        this.x = d51Var;
        this.y = qg5Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new c51(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((c51) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r9.e(r8, r0) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (defpackage.de3.a(r9, r4, r1, r8.y, r8) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
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
            if (r0 == 0) goto L17
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L12:
            defpackage.dv8.b(r9)
            goto L8f
        L17:
            defpackage.dv8.b(r9)
            qt<y43, bw> r9 = r8.u
            dt7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            y43 r0 = (defpackage.y43) r0
            float r0 = r0.t
            float r4 = r8.v
            boolean r0 = defpackage.y43.e(r0, r4)
            if (r0 != 0) goto L8f
            boolean r0 = r8.w
            v72 r5 = defpackage.v72.t
            if (r0 != 0) goto L42
            y43 r0 = new y43
            r0.<init>(r4)
            r8.t = r3
            java.lang.Object r8 = r9.e(r8, r0)
            if (r8 != r5) goto L8f
            goto L8e
        L42:
            dt7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            y43 r0 = (defpackage.y43) r0
            float r0 = r0.t
            r3 = 0
            boolean r6 = defpackage.y43.e(r0, r3)
            if (r6 == 0) goto L5b
            n88$b r1 = new n88$b
            r6 = 0
            r1.<init>(r6)
            goto L84
        L5b:
            d51 r6 = r8.x
            float r7 = r6.b
            boolean r7 = defpackage.y43.e(r0, r7)
            if (r7 == 0) goto L6b
            l35 r1 = new l35
            r1.<init>()
            goto L84
        L6b:
            boolean r3 = defpackage.y43.e(r0, r3)
            if (r3 == 0) goto L77
            v84 r1 = new v84
            r1.<init>()
            goto L84
        L77:
            float r3 = r6.c
            boolean r0 = defpackage.y43.e(r0, r3)
            if (r0 == 0) goto L84
            d63 r1 = new d63
            r1.<init>()
        L84:
            r8.t = r2
            qg5 r0 = r8.y
            java.lang.Object r8 = defpackage.de3.a(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L8f
        L8e:
            return r5
        L8f:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
