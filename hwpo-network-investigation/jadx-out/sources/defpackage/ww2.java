package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ww2 extends gp9 implements s4a {
    public final z4a n;

    public ww2(z4a z4aVar) {
        super(new v4a[2], new w4a[2]);
        int i = this.g;
        nn2[] nn2VarArr = this.e;
        xl7.r(i == nn2VarArr.length);
        for (nn2 nn2Var : nn2VarArr) {
            nn2Var.l(1024);
        }
        this.n = z4aVar;
    }

    @Override // defpackage.gp9
    public final nn2 g() {
        return new v4a();
    }

    @Override // defpackage.gp9
    public final on2 h() {
        return new sp9(this);
    }

    @Override // defpackage.gp9
    public final mn2 i(Throwable th) {
        return new t4a("Unexpected decode error", th);
    }

    @Override // defpackage.gp9
    public final mn2 j(nn2 nn2Var, on2 on2Var, boolean z) {
        v4a v4aVar = (v4a) nn2Var;
        w4a w4aVar = (w4a) on2Var;
        try {
            ByteBuffer byteBuffer = v4aVar.w;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            z4a z4aVar = this.n;
            if (z) {
                z4aVar.reset();
            }
            r4a r4aVarA = z4aVar.a(bArrArray, 0, iLimit);
            long j = v4aVar.y;
            long j2 = v4aVar.B;
            w4aVar.u = j;
            w4aVar.w = r4aVarA;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            w4aVar.x = j;
            w4aVar.v = false;
            return null;
        } catch (t4a e) {
            return e;
        }
    }

    @Override // defpackage.s4a
    public final void c(long j) {
    }
}
