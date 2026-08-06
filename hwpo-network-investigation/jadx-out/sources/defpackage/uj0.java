package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uj0 implements s80 {
    public s80.a b;
    public s80.a c;
    public s80.a d;
    public s80.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public uj0() {
        ByteBuffer byteBuffer = s80.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        s80.a aVar = s80.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public abstract s80.a a(s80.a aVar);

    @Override // defpackage.s80
    public boolean d() {
        return this.h && this.g == s80.a;
    }

    public final ByteBuffer f(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.s80
    @Deprecated
    public final void flush() {
        j(s80.b.b);
    }

    @Override // defpackage.s80
    public boolean h() {
        return this.e != s80.a.e;
    }

    @Override // defpackage.s80
    public ByteBuffer i() {
        ByteBuffer byteBuffer = this.g;
        this.g = s80.a;
        return byteBuffer;
    }

    @Override // defpackage.s80
    public final void j(s80.b bVar) {
        this.g = s80.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.s80
    public final s80.a l(s80.a aVar) {
        this.d = aVar;
        this.e = a(aVar);
        return h() ? this.e : s80.a.e;
    }

    @Override // defpackage.s80
    public final void m() {
        this.h = true;
        c();
    }

    @Override // defpackage.s80
    public final void reset() {
        ByteBuffer byteBuffer = s80.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        s80.a aVar = s80.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        e();
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }
}
