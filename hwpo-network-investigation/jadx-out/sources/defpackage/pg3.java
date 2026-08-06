package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
public final class pg3 extends p6a implements ci4<t72, r02<? super ig3.a>, Object> {
    public final /* synthetic */ ig3.a A;
    public final /* synthetic */ zk7 B;
    public final /* synthetic */ List<eva> C;
    public final /* synthetic */ nm3 D;
    public final /* synthetic */ k85 E;
    public List t;
    public zk7 u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ig3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pg3(ig3 ig3Var, ig3.a aVar, zk7 zk7Var, List<? extends eva> list, nm3 nm3Var, k85 k85Var, r02<? super pg3> r02Var) {
        super(2, r02Var);
        this.z = ig3Var;
        this.A = aVar;
        this.B = zk7Var;
        this.C = list;
        this.D = nm3Var;
        this.E = k85Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        pg3 pg3Var = new pg3(this.z, this.A, this.B, this.C, this.D, this.E, r02Var);
        pg3Var.y = obj;
        return pg3Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super ig3.a> r02Var) {
        return ((pg3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:22:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.x
            nm3 r1 = r11.D
            ig3$a r2 = r11.A
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L1c
            int r0 = r11.w
            int r4 = r11.v
            zk7 r5 = r11.u
            java.util.List r6 = r11.t
            java.lang.Object r7 = r11.y
            t72 r7 = (defpackage.t72) r7
            defpackage.dv8.b(r12)
            goto L86
        L1c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            r11 = 0
            return r11
        L23:
            defpackage.dv8.b(r12)
            java.lang.Object r12 = r11.y
            t72 r12 = (defpackage.t72) r12
            android.graphics.drawable.Drawable r0 = r2.a
            boolean r4 = r0 instanceof android.graphics.drawable.BitmapDrawable
            zk7 r5 = r11.B
            if (r4 == 0) goto L4a
            r4 = r0
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            android.graphics.Bitmap$Config r6 = r4.getConfig()
            if (r6 != 0) goto L41
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L41:
            android.graphics.Bitmap$Config[] r7 = defpackage.v.a
            boolean r6 = defpackage.u30.t(r6, r7)
            if (r6 == 0) goto L4a
            goto L56
        L4a:
            android.graphics.Bitmap$Config r4 = r5.b
            br9 r6 = r5.d
            s39 r7 = r5.e
            boolean r8 = r5.f
            android.graphics.Bitmap r4 = defpackage.e83.a(r0, r4, r6, r7, r8)
        L56:
            r1.getClass()
            java.util.List<eva> r0 = r11.C
            int r6 = r0.size()
            r7 = 0
            r10 = r7
            r7 = r12
            r12 = r4
            r4 = r10
            r10 = r6
            r6 = r0
            r0 = r10
        L67:
            if (r4 >= r0) goto L91
            java.lang.Object r8 = r6.get(r4)
            eva r8 = (defpackage.eva) r8
            br9 r9 = r5.d
            r11.y = r7
            r11.t = r6
            r11.u = r5
            r11.v = r4
            r11.w = r0
            r11.x = r3
            java.lang.Object r12 = r8.transform(r12, r9, r11)
            v72 r8 = defpackage.v72.t
            if (r12 != r8) goto L86
            return r8
        L86:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            h72 r8 = r7.getCoroutineContext()
            defpackage.sd.d(r8)
            int r4 = r4 + r3
            goto L67
        L91:
            r1.getClass()
            k85 r11 = r11.E
            android.content.Context r11 = r11.a
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r11, r12)
            boolean r11 = r2.b
            jf2 r12 = r2.c
            java.lang.String r1 = r2.d
            ig3$a r2 = new ig3$a
            r2.<init>(r0, r11, r12, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
