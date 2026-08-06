package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.PathInterpolator;
import defpackage.pp2;
import defpackage.qe8;
import defpackage.xd5;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final int a;
    public final C0012a b;
    public xd5 c;
    public xd5 d;
    public qe8 e;

    /* JADX INFO: renamed from: androidx.core.view.insets.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0012a {
        public int a;
        public int b;
        public xd5 c;
        public boolean d;
        public ColorDrawable e;
        public float f;
        public float g;
        public float h;
        public InterfaceC0013a i;

        /* JADX INFO: renamed from: androidx.core.view.insets.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface InterfaceC0013a {
        }
    }

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i) {
        C0012a c0012a = new C0012a();
        c0012a.a = -1;
        c0012a.b = -1;
        xd5 xd5Var = xd5.e;
        c0012a.c = xd5Var;
        c0012a.d = false;
        c0012a.e = null;
        c0012a.f = 0.0f;
        c0012a.g = 0.0f;
        c0012a.h = 1.0f;
        this.b = c0012a;
        this.c = xd5Var;
        this.d = xd5Var;
        this.e = null;
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            this.a = i;
        } else {
            z90.a(pp2.a(i, "Unexpected side: "));
            throw null;
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        C0012a c0012a = this.b;
        if (c0012a.h != f2) {
            c0012a.h = f2;
            C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
            if (interfaceC0013a != null) {
                ((b) interfaceC0013a).b.setAlpha(f2);
            }
        }
    }

    public final void c(float f) {
        float f2 = f * 1.0f;
        C0012a c0012a = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * c0012a.a;
            if (c0012a.f != f3) {
                c0012a.f = f3;
                C0012a.InterfaceC0013a interfaceC0013a = c0012a.i;
                if (interfaceC0013a != null) {
                    ((b) interfaceC0013a).b.setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * c0012a.b;
            if (c0012a.g != f4) {
                c0012a.g = f4;
                C0012a.InterfaceC0013a interfaceC0013a2 = c0012a.i;
                if (interfaceC0013a2 != null) {
                    ((b) interfaceC0013a2).b.setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * c0012a.a;
            if (c0012a.f != f5) {
                c0012a.f = f5;
                C0012a.InterfaceC0013a interfaceC0013a3 = c0012a.i;
                if (interfaceC0013a3 != null) {
                    ((b) interfaceC0013a3).b.setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * c0012a.b;
        if (c0012a.g != f6) {
            c0012a.g = f6;
            C0012a.InterfaceC0013a interfaceC0013a4 = c0012a.i;
            if (interfaceC0013a4 != null) {
                ((b) interfaceC0013a4).b.setTranslationY(f6);
            }
        }
    }

    public void a(int i) {
    }
}
