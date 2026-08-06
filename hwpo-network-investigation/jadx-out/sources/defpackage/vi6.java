package defpackage;

import androidx.media3.exoplayer.g;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vi6 implements up6, up6.a {
    public long A = -9223372036854775807L;
    public final bq6.b t;
    public final long u;
    public final ki v;
    public bq6 w;
    public up6 x;
    public up6.a y;
    public boolean z;

    public vi6(bq6.b bVar, ki kiVar, long j) {
        this.t = bVar;
        this.v = kiVar;
        this.u = j;
    }

    @Override // up6.a
    public final void a(up6 up6Var) {
        up6.a aVar = this.y;
        String str = n6b.a;
        aVar.a(this);
    }

    @Override // bd9.a
    public final void b(bd9 bd9Var) {
        up6.a aVar = this.y;
        String str = n6b.a;
        aVar.b(this);
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        up6 up6Var = this.x;
        return up6Var != null && up6Var.c(gVar);
    }

    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) {
        long j2 = this.A;
        if (j2 != -9223372036854775807L && j == this.u) {
            j = j2;
        }
        this.A = -9223372036854775807L;
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.d(fq3VarArr, zArr, xz8VarArr, zArr2, j);
    }

    @Override // defpackage.bd9
    public final long e() {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.e();
    }

    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.f(j, u89Var);
    }

    @Override // defpackage.up6
    public final void g() throws IOException {
        try {
            up6 up6Var = this.x;
            if (up6Var != null) {
                up6Var.g();
                return;
            }
            bq6 bq6Var = this.w;
            if (bq6Var != null) {
                bq6Var.j();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final void h(bq6.b bVar) {
        long j = this.A;
        if (j == -9223372036854775807L) {
            j = this.u;
        }
        bq6 bq6Var = this.w;
        bq6Var.getClass();
        up6 up6VarC = bq6Var.c(bVar, this.v, j);
        this.x = up6VarC;
        if (this.y != null) {
            up6VarC.m(this, j);
        }
    }

    @Override // defpackage.up6
    public final long i(long j) {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.i(j);
    }

    @Override // defpackage.bd9
    public final boolean j() {
        up6 up6Var = this.x;
        return up6Var != null && up6Var.j();
    }

    @Override // defpackage.up6
    public final long l() {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.l();
    }

    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) {
        this.y = aVar;
        up6 up6Var = this.x;
        if (up6Var != null) {
            long j2 = this.A;
            if (j2 == -9223372036854775807L) {
                j2 = this.u;
            }
            up6Var.m(this, j2);
        }
    }

    @Override // defpackage.up6
    public final gsa n() {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.n();
    }

    @Override // defpackage.bd9
    public final long q() {
        up6 up6Var = this.x;
        String str = n6b.a;
        return up6Var.q();
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) {
        up6 up6Var = this.x;
        String str = n6b.a;
        up6Var.s(j, z);
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        up6 up6Var = this.x;
        String str = n6b.a;
        up6Var.v(j);
    }
}
