package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.vk0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vk0<T extends vk0<T>> implements Cloneable {
    public boolean B;
    public boolean G;
    public boolean H;
    public boolean J;
    public int t;
    public int w;
    public k13 u = k13.d;
    public p98 v = p98.v;
    public boolean x = true;
    public int y = -1;
    public int z = -1;
    public ko5 A = pf3.b;
    public boolean C = true;
    public xk7 D = new xk7();
    public g11 E = new g11();
    public Class<?> F = Object.class;
    public boolean I = true;

    public static boolean f(int i, int i2) {
        return (i & i2) != 0;
    }

    public T a(vk0<?> vk0Var) {
        if (this.H) {
            return (T) clone().a(vk0Var);
        }
        int i = vk0Var.t;
        if (f(vk0Var.t, 1048576)) {
            this.J = vk0Var.J;
        }
        if (f(vk0Var.t, 4)) {
            this.u = vk0Var.u;
        }
        if (f(vk0Var.t, 8)) {
            this.v = vk0Var.v;
        }
        if (f(vk0Var.t, 16)) {
            this.t &= -33;
        }
        if (f(vk0Var.t, 32)) {
            this.t &= -17;
        }
        if (f(vk0Var.t, 64)) {
            this.w = 0;
            this.t &= -129;
        }
        if (f(vk0Var.t, 128)) {
            this.w = vk0Var.w;
            this.t &= -65;
        }
        if (f(vk0Var.t, 256)) {
            this.x = vk0Var.x;
        }
        if (f(vk0Var.t, 512)) {
            this.z = vk0Var.z;
            this.y = vk0Var.y;
        }
        if (f(vk0Var.t, 1024)) {
            this.A = vk0Var.A;
        }
        if (f(vk0Var.t, 4096)) {
            this.F = vk0Var.F;
        }
        if (f(vk0Var.t, 8192)) {
            this.t &= -16385;
        }
        if (f(vk0Var.t, 16384)) {
            this.t &= -8193;
        }
        if (f(vk0Var.t, 65536)) {
            this.C = vk0Var.C;
        }
        if (f(vk0Var.t, 131072)) {
            this.B = vk0Var.B;
        }
        if (f(vk0Var.t, AudioConstants.AUDIO_FILE_BUFFER_SIZE)) {
            this.E.putAll(vk0Var.E);
            this.I = vk0Var.I;
        }
        if (!this.C) {
            this.E.clear();
            int i2 = this.t;
            this.B = false;
            this.t = i2 & (-133121);
            this.I = true;
        }
        this.t |= vk0Var.t;
        this.D.b.g(vk0Var.D.b);
        l();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            xk7 xk7Var = new xk7();
            t.D = xk7Var;
            xk7Var.b.g(this.D.b);
            g11 g11Var = new g11();
            t.E = g11Var;
            g11Var.putAll(this.E);
            t.G = false;
            t.H = false;
            return t;
        } catch (CloneNotSupportedException e) {
            d55.a(e);
            return null;
        }
    }

    public final T c(Class<?> cls) {
        if (this.H) {
            return (T) clone().c(cls);
        }
        this.F = cls;
        this.t |= 4096;
        l();
        return this;
    }

    public final T d(k13 k13Var) {
        if (this.H) {
            return (T) clone().d(k13Var);
        }
        ov9.d(k13Var, "Argument must not be null");
        this.u = k13Var;
        this.t |= 4;
        l();
        return this;
    }

    public final boolean e(vk0<?> vk0Var) {
        vk0Var.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.w == vk0Var.w && this.x == vk0Var.x && this.y == vk0Var.y && this.z == vk0Var.z && this.B == vk0Var.B && this.C == vk0Var.C && this.u.equals(vk0Var.u) && this.v == vk0Var.v && this.D.equals(vk0Var.D) && this.E.equals(vk0Var.E) && this.F.equals(vk0Var.F) && l6b.b(this.A, vk0Var.A);
    }

    public boolean equals(Object obj) {
        if (obj instanceof vk0) {
            return e((vk0) obj);
        }
        return false;
    }

    public final vk0 g(q43 q43Var, tq0 tq0Var) {
        if (this.H) {
            return clone().g(q43Var, tq0Var);
        }
        mk7 mk7Var = q43.f;
        ov9.d(q43Var, "Argument must not be null");
        m(mk7Var, q43Var);
        return q(tq0Var, false);
    }

    public final T h(int i, int i2) {
        if (this.H) {
            return (T) clone().h(i, i2);
        }
        this.z = i;
        this.y = i2;
        this.t |= 512;
        l();
        return this;
    }

    public int hashCode() {
        return l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(l6b.g(0, l6b.g(0, l6b.g(this.C ? 1 : 0, l6b.g(this.B ? 1 : 0, l6b.g(this.z, l6b.g(this.y, l6b.g(this.x ? 1 : 0, l6b.h(l6b.g(0, l6b.h(l6b.g(this.w, l6b.h(l6b.g(0, l6b.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.u), this.v), this.D), this.E), this.F), this.A), null);
    }

    public final T i(int i) {
        if (this.H) {
            return (T) clone().i(i);
        }
        this.w = i;
        this.t = (this.t | 128) & (-65);
        l();
        return this;
    }

    public final vk0 j() {
        if (this.H) {
            return clone().j();
        }
        this.v = p98.w;
        this.t |= 8;
        l();
        return this;
    }

    public final void l() {
        if (this.G) {
            aa0.c("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T m(mk7<Y> mk7Var, Y y) {
        if (this.H) {
            return (T) clone().m(mk7Var, y);
        }
        ov9.c(mk7Var);
        ov9.c(y);
        this.D.b.put(mk7Var, y);
        l();
        return this;
    }

    public final vk0 n(ke7 ke7Var) {
        if (this.H) {
            return clone().n(ke7Var);
        }
        this.A = ke7Var;
        this.t |= 1024;
        l();
        return this;
    }

    public final vk0 o() {
        if (this.H) {
            return clone().o();
        }
        this.x = false;
        this.t |= 256;
        l();
        return this;
    }

    public final vk0 p(q43 q43Var, z51 z51Var) {
        if (this.H) {
            return clone().p(q43Var, z51Var);
        }
        mk7 mk7Var = q43.f;
        ov9.d(q43Var, "Argument must not be null");
        m(mk7Var, q43Var);
        return q(z51Var, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T q(dva<Bitmap> dvaVar, boolean z) {
        if (this.H) {
            return (T) clone().q(dvaVar, z);
        }
        w73 w73Var = new w73(dvaVar, z);
        r(Bitmap.class, dvaVar, z);
        r(Drawable.class, w73Var, z);
        r(BitmapDrawable.class, w73Var, z);
        r(xl4.class, new am4(dvaVar), z);
        l();
        return this;
    }

    public final <Y> T r(Class<Y> cls, dva<Y> dvaVar, boolean z) {
        if (this.H) {
            return (T) clone().r(cls, dvaVar, z);
        }
        ov9.c(dvaVar);
        this.E.put(cls, dvaVar);
        int i = this.t;
        this.C = true;
        this.t = 67584 | i;
        this.I = false;
        if (z) {
            this.t = i | 198656;
            this.B = true;
        }
        l();
        return this;
    }

    public final vk0 s() {
        if (this.H) {
            return clone().s();
        }
        this.J = true;
        this.t |= 1048576;
        l();
        return this;
    }
}
