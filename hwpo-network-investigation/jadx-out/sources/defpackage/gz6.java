package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollingLogic.kt", l = {228, 241, 261}, m = "invokeSuspend", v = 1)
public final class gz6 extends p6a implements ci4<k97, r02<? super g2b>, Object> {
    public final /* synthetic */ gl8<dz6.a> A;
    public final /* synthetic */ float B;
    public final /* synthetic */ dz6 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ z79 E;
    public cl8 t;
    public cl8 u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ dl8 y;
    public final /* synthetic */ gl8<yv<Float, bw>> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz6(dl8 dl8Var, gl8<yv<Float, bw>> gl8Var, gl8<dz6.a> gl8Var2, float f, dz6 dz6Var, float f2, z79 z79Var, r02<? super gz6> r02Var) {
        super(2, r02Var);
        this.y = dl8Var;
        this.z = gl8Var;
        this.A = gl8Var2;
        this.B = f;
        this.C = dz6Var;
        this.D = f2;
        this.E = z79Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        gz6 gz6Var = new gz6(this.y, this.z, this.A, this.B, this.C, this.D, this.E, r02Var);
        gz6Var.x = obj;
        return gz6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
        return ((gz6) create(k97Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x008f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x013b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0140  */
    /* JADX WARN: Code duplicated, block: B:33:0x0146  */
    /* JADX WARN: Code duplicated, block: B:36:0x0164  */
    /* JADX WARN: Code duplicated, block: B:43:0x0193  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, yv] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0164 -> B:37:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0172 -> B:38:0x016f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
