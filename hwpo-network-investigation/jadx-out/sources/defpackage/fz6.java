package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fz6 implements oh4 {
    public final /* synthetic */ dz6 t;
    public final /* synthetic */ gl8 u;
    public final /* synthetic */ dl8 v;
    public final /* synthetic */ z79 w;
    public final /* synthetic */ cl8 x;

    public /* synthetic */ fz6(dz6 dz6Var, gl8 gl8Var, dl8 dl8Var, z79 z79Var, cl8 cl8Var) {
        this.t = dz6Var;
        this.u = gl8Var;
        this.v = dl8Var;
        this.w = z79Var;
        this.x = cl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, dz6$a] */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        dz6 dz6Var = this.t;
        dz6.a aVarG = dz6.g(dz6Var.g);
        if (aVarG != null) {
            r03 r03Var = dz6Var.e;
            long j = aVarG.b;
            long j2 = aVarG.a;
            ((tdb) r03Var.t).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((tdb) r03Var.u).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            gl8 gl8Var = this.u;
            ?? A = ((dz6.a) gl8Var.t).a(aVarG);
            gl8Var.t = A;
            long j3 = A.a;
            z79 z79Var = this.w;
            float fI = z79Var.i(z79Var.e(j3));
            this.v.t = fI;
            this.x.t = !y48.b(fI - fFloatValue);
        }
        return Boolean.valueOf(aVarG != null);
    }
}
