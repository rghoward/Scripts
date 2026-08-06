package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
public final class pi extends p6a implements oh4<r02<? super Object>, Object> {
    public int t;
    public final /* synthetic */ qi u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ wv<Float> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(qi qiVar, float f, boolean z, wv<Float> wvVar, r02<? super pi> r02Var) {
        super(1, r02Var);
        this.u = qiVar;
        this.v = f;
        this.w = z;
        this.x = wvVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new pi(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super Object> r02Var) {
        return ((pi) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r15.e(r14, r0) == r7) goto L34;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            qi r0 = r14.u
            ioa r1 = r0.a
            int r2 = r14.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L19
            if (r2 != r3) goto L12
            defpackage.dv8.b(r15)
            return r15
        L12:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            r14 = 0
            return r14
        L19:
            defpackage.dv8.b(r15)
            goto L98
        L1e:
            defpackage.dv8.b(r15)
            int r15 = r1.e()
            float r2 = r14.v
            if (r15 != 0) goto L55
            double r5 = (double) r2
            r7 = 4610932096582823192(0x3ffd524fe4442d18, double:1.8325957218792777)
            double r5 = r5 + r7
            r9 = 4602891378177867776(0x3fe0c15240000000, double:0.5235987901687622)
            double r5 = r5 / r9
            int r15 = (int) r5
            r5 = 12
            int r15 = r15 % r5
            int r15 = r15 % r5
            float r15 = (float) r15
            r6 = 1057360530(0x3f060a92, float:0.5235988)
            float r15 = r15 * r6
            r0.d = r15
            double r11 = (double) r15
            double r11 = r11 + r7
            double r11 = r11 / r9
            int r15 = (int) r11
            int r15 = r15 % r5
            int r15 = r15 % r5
            boolean r6 = defpackage.xna.r(r0)
            if (r6 == 0) goto L4f
            goto L50
        L4f:
            r5 = 0
        L50:
            int r15 = r15 + r5
            r1.a(r15)
            goto L75
        L55:
            double r5 = (double) r2
            r7 = 4609988864856304920(0x3ff9f872a4442d18, double:1.6231562058117728)
            double r5 = r5 + r7
            r9 = 4592210274475311104(0x3fbaceea00000000, double:0.10471975803375244)
            double r5 = r5 / r9
            int r15 = (int) r5
            int r15 = r15 % 60
            float r15 = (float) r15
            r5 = 1037465424(0x3dd67750, float:0.10471976)
            float r15 = r15 * r5
            r0.e = r15
            double r5 = (double) r15
            double r5 = r5 + r7
            double r5 = r5 / r9
            int r15 = (int) r5
            int r15 = r15 % 60
            r1.b(r15)
        L75:
            boolean r15 = r14.w
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r5 = 0
            r6 = 1070141403(0x3fc90fdb, float:1.5707964)
            v72 r7 = defpackage.v72.t
            if (r15 != 0) goto L9b
            qt<java.lang.Float, bw> r15 = r0.f
            float r2 = r2 + r6
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8a
            float r2 = r2 + r1
        L8a:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r14.t = r4
            java.lang.Object r14 = r15.e(r14, r0)
            if (r14 != r7) goto L98
            goto Lba
        L98:
            g2b r14 = defpackage.g2b.a
            return r14
        L9b:
            float r2 = r2 + r6
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 >= 0) goto La1
            float r2 = r2 + r1
        La1:
            float r15 = r0.h(r2)
            qt<java.lang.Float, bw> r8 = r0.f
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r15)
            r14.t = r3
            wv<java.lang.Float> r10 = r14.x
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.qt.c(r8, r9, r10, r11, r12, r13)
            if (r14 != r7) goto Lbb
        Lba:
            return r7
        Lbb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
