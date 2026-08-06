package defpackage;

import android.util.AndroidRuntimeException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qy9 extends t93<qy9> {
    public ry9 s;
    public float t;
    public boolean u;

    public final void d(float f) {
        if (this.f) {
            this.t = f;
            return;
        }
        if (this.s == null) {
            this.s = new ry9(f);
        }
        ry9 ry9Var = this.s;
        double d = f;
        ry9Var.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            ru3.f("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.h) {
            ru3.f("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        ry9Var.d = dAbs;
        ry9Var.e = dAbs * 62.5d;
        ov.d dVar = t93.b().e;
        dVar.getClass();
        if (Thread.currentThread() != dVar.b.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.Q0(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            z90.a("Starting value need to be in between min value and max value");
        } else {
            t93.b().a(this);
        }
    }
}
