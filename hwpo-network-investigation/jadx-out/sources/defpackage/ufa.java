package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ufa extends xk0<ufa> {
    public final kha h;
    public final sia i;

    public ufa(kha khaVar, ag7 ag7Var, sia siaVar, kja kjaVar) {
        super(khaVar.a, khaVar.b, siaVar != null ? siaVar.a : null, ag7Var, kjaVar);
        this.h = khaVar;
        this.i = siaVar;
    }

    public final List<ra3> q(oh4<? super ufa, ? extends ra3> oh4Var) {
        if (!lja.c(this.f)) {
            return ws0.i(new lo1(BuildConfig.FLAVOR, 0), new ek9(lja.f(this.f), lja.f(this.f)));
        }
        ra3 ra3VarInvoke = oh4Var.invoke(this);
        if (ra3VarInvoke != null) {
            return ws0.h(ra3VarInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int r(sia siaVar, int i) {
        sk8 sk8VarZ;
        qq5 qq5Var = siaVar.b;
        ria riaVar = siaVar.a;
        if (qq5Var == null) {
            sk8VarZ = sk8.e;
        } else {
            qq5 qq5Var2 = siaVar.c;
            sk8VarZ = qq5Var2 != null ? qq5Var2.Z(qq5Var, true) : null;
            if (sk8VarZ == null) {
                sk8VarZ = sk8.e;
            }
        }
        long j = this.h.b;
        int i2 = lja.c;
        ag7 ag7Var = this.d;
        sk8 sk8VarC = riaVar.c(ag7Var.b((int) (j & 4294967295L)));
        float f = sk8VarC.a;
        return ag7Var.a(riaVar.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (sk8VarZ.c() & 4294967295L)) * i) + sk8VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }
}
