package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vd4 extends voa {
    public voa e;

    public vd4(voa voaVar) {
        voaVar.getClass();
        this.e = voaVar;
    }

    @Override // defpackage.voa
    public final voa a() {
        return this.e.a();
    }

    @Override // defpackage.voa
    public final voa b() {
        return this.e.b();
    }

    @Override // defpackage.voa
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.voa
    public final voa d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.voa
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.voa
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.voa
    public final voa g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.voa
    public final long h() {
        return this.e.h();
    }
}
