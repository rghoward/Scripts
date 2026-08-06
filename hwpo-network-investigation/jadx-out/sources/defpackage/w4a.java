package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w4a extends on2 implements r4a {
    public r4a w;
    public long x;

    @Override // defpackage.r4a
    public final int a(long j) {
        r4a r4aVar = this.w;
        r4aVar.getClass();
        return r4aVar.a(j - this.x);
    }

    @Override // defpackage.r4a
    public final long e(int i) {
        r4a r4aVar = this.w;
        r4aVar.getClass();
        return r4aVar.e(i) + this.x;
    }

    @Override // defpackage.r4a
    public final List<ec2> f(long j) {
        r4a r4aVar = this.w;
        r4aVar.getClass();
        return r4aVar.f(j - this.x);
    }

    @Override // defpackage.r4a
    public final int g() {
        r4a r4aVar = this.w;
        r4aVar.getClass();
        return r4aVar.g();
    }

    @Override // defpackage.on2
    public final void j() {
        super.j();
        this.w = null;
    }
}
