package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hq9<R> implements kp8, kr9 {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public boolean A;
    public final RuntimeException B;
    public final String a;
    public final p0a.a b;
    public final Object c;
    public final wp8 d;
    public final Context e;
    public final c f;
    public final Object g;
    public final Class<R> h;
    public final vk0<?> i;
    public final int j;
    public final int k;
    public final p98 l;
    public final j9a<R> m;
    public final List<kq8<R>> n;
    public final awa<? super R> o;
    public final sn3.a p;
    public kt8<R> q;
    public hg3.d r;
    public long s;
    public volatile hg3 t;
    public a u;
    public Drawable v;
    public Drawable w;
    public Drawable x;
    public int y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final /* synthetic */ a[] z;

        static {
            a aVar = new a("PENDING", 0);
            t = aVar;
            a aVar2 = new a("RUNNING", 1);
            u = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            v = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            w = aVar4;
            a aVar5 = new a("FAILED", 4);
            x = aVar5;
            a aVar6 = new a("CLEARED", 5);
            y = aVar6;
            z = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) z.clone();
        }
    }

    public hq9(Context context, c cVar, Object obj, Object obj2, Class cls, vk0 vk0Var, int i, int i2, p98 p98Var, j9a j9aVar, ArrayList arrayList, wp8 wp8Var, hg3 hg3Var, awa awaVar) {
        sn3.a aVar = sn3.a;
        this.a = C ? String.valueOf(hashCode()) : null;
        this.b = new p0a.a();
        this.c = obj;
        this.e = context;
        this.f = cVar;
        this.g = obj2;
        this.h = cls;
        this.i = vk0Var;
        this.j = i;
        this.k = i2;
        this.l = p98Var;
        this.m = j9aVar;
        this.n = arrayList;
        this.d = wp8Var;
        this.t = hg3Var;
        this.o = awaVar;
        this.p = aVar;
        this.u = a.t;
        if (this.B == null && cVar.h.a.containsKey(b.c.class)) {
            this.B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.kp8
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.u == a.w;
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void b() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.u == a.w;
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                a aVar = this.u;
                a aVar2 = a.y;
                if (aVar == aVar2) {
                    return;
                }
                f();
                kt8<R> kt8Var = this.q;
                if (kt8Var != null) {
                    this.q = null;
                } else {
                    kt8Var = null;
                }
                wp8 wp8Var = this.d;
                if (wp8Var == null || wp8Var.g(this)) {
                    this.m.j(g());
                }
                this.u = aVar2;
                if (kt8Var != null) {
                    this.t.getClass();
                    hg3.f(kt8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean d(kp8 kp8Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        vk0<?> vk0Var;
        p98 p98Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        vk0<?> vk0Var2;
        p98 p98Var2;
        int size2;
        boolean zA;
        boolean zE;
        if (kp8Var instanceof hq9) {
            synchronized (this.c) {
                try {
                    i = this.j;
                    i2 = this.k;
                    obj = this.g;
                    cls = this.h;
                    vk0Var = this.i;
                    p98Var = this.l;
                    List<kq8<R>> list = this.n;
                    size = list != null ? list.size() : 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hq9 hq9Var = (hq9) kp8Var;
            synchronized (hq9Var.c) {
                try {
                    i3 = hq9Var.j;
                    i4 = hq9Var.k;
                    obj2 = hq9Var.g;
                    cls2 = hq9Var.h;
                    vk0Var2 = hq9Var.i;
                    p98Var2 = hq9Var.l;
                    List<kq8<R>> list2 = hq9Var.n;
                    size2 = list2 != null ? list2.size() : 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i == i3 && i2 == i4) {
                if (obj == null) {
                    zA = obj2 == null;
                } else {
                    zA = obj instanceof hx6 ? ((hx6) obj).a() : obj.equals(obj2);
                }
                if (zA && cls.equals(cls2)) {
                    if (vk0Var == null) {
                        zE = vk0Var2 == null;
                    } else {
                        zE = vk0Var.e(vk0Var2);
                    }
                    if (zE && p98Var == p98Var2 && size == size2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kr9
    public final void e(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        h("Got onSizeReady in " + vd6.a(this.s));
                    }
                    if (this.u != a.v) {
                        return;
                    }
                    a aVar = a.u;
                    this.u = aVar;
                    this.i.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.y = iRound;
                    this.z = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        h("finished setup for calling load in " + vd6.a(this.s));
                    }
                    hg3 hg3Var = this.t;
                    c cVar = this.f;
                    Object obj3 = this.g;
                    vk0<?> vk0Var = this.i;
                    try {
                        try {
                            try {
                                try {
                                    this.r = hg3Var.b(cVar, obj3, vk0Var.A, this.y, this.z, vk0Var.F, this.h, this.l, vk0Var.u, vk0Var.E, vk0Var.B, vk0Var.I, vk0Var.D, vk0Var.x, vk0Var.J, this, this.p);
                                    if (this.u != aVar) {
                                        this.r = null;
                                    }
                                    if (z) {
                                        h("finished onSizeReady in " + vd6.a(this.s));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    public final void f() {
        if (this.A) {
            aa0.c("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.m.c(this);
        hg3.d dVar = this.r;
        if (dVar != null) {
            synchronized (hg3.this) {
                dVar.a.h(dVar.b);
            }
            this.r = null;
        }
    }

    public final Drawable g() {
        if (this.w == null) {
            vk0<?> vk0Var = this.i;
            vk0Var.getClass();
            this.w = null;
            int i = vk0Var.w;
            if (i > 0) {
                vk0Var.getClass();
                Context context = this.e;
                this.w = n73.a(context, context, i, context.getTheme());
            }
        }
        return this.w;
    }

    public final void h(String str) {
        StringBuilder sbB = tn2.b(str, " this: ");
        sbB.append(this.a);
        Log.v("GlideRequest", sbB.toString());
    }

    public final void i(rm4 rm4Var, int i) {
        Drawable drawableG;
        this.b.a();
        synchronized (this.c) {
            try {
                rm4Var.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.y + "x" + this.z + "]", rm4Var);
                    if (i2 <= 4) {
                        rm4Var.d();
                    }
                }
                this.r = null;
                this.u = a.x;
                wp8 wp8Var = this.d;
                if (wp8Var != null) {
                    wp8Var.e(this);
                }
                boolean z = true;
                this.A = true;
                try {
                    List<kq8<R>> list = this.n;
                    if (list != null) {
                        for (kq8<R> kq8Var : list) {
                            j9a<R> j9aVar = this.m;
                            wp8 wp8Var2 = this.d;
                            if (wp8Var2 != null) {
                                wp8Var2.getRoot().a();
                            }
                            kq8Var.b(j9aVar);
                        }
                    }
                    wp8 wp8Var3 = this.d;
                    if (wp8Var3 != null && !wp8Var3.h(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.g == null) {
                            if (this.x == null) {
                                this.i.getClass();
                                this.x = null;
                            }
                            drawableG = this.x;
                        } else {
                            drawableG = null;
                        }
                        if (drawableG == null) {
                            if (this.v == null) {
                                this.i.getClass();
                                this.v = null;
                            }
                            drawableG = this.v;
                        }
                        if (drawableG == null) {
                            drawableG = g();
                        }
                        this.m.g(drawableG);
                    }
                    this.A = false;
                } catch (Throwable th) {
                    this.A = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            try {
                a aVar = this.u;
                z = aVar == a.u || aVar == a.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = this.u == a.y;
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void k() {
        synchronized (this.c) {
            try {
                if (this.A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = vd6.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (l6b.i(this.j, this.k)) {
                        this.y = this.j;
                        this.z = this.k;
                    }
                    if (this.x == null) {
                        this.i.getClass();
                        this.x = null;
                    }
                    i(new rm4("Received null model"), this.x == null ? 5 : 3);
                    return;
                }
                a aVar = this.u;
                if (aVar == a.u) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.w) {
                    l(this.q, kf2.x, false);
                    return;
                }
                List<kq8<R>> list = this.n;
                if (list != null) {
                    for (kq8<R> kq8Var : list) {
                    }
                }
                a aVar2 = a.v;
                this.u = aVar2;
                if (l6b.i(this.j, this.k)) {
                    e(this.j, this.k);
                } else {
                    this.m.d(this);
                }
                a aVar3 = this.u;
                if (aVar3 == a.u || aVar3 == aVar2) {
                    wp8 wp8Var = this.d;
                    if (wp8Var == null || wp8Var.h(this)) {
                        this.m.h(g());
                    }
                }
                if (C) {
                    h("finished run method in " + vd6.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(kt8<?> kt8Var, kf2 kf2Var, boolean z) {
        this.b.a();
        kt8<?> kt8Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (kt8Var == null) {
                        i(new rm4("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = kt8Var.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(kt8Var);
                            sb.append("}.");
                            sb.append(obj != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new rm4(sb.toString()), 5);
                        } else {
                            wp8 wp8Var = this.d;
                            if (wp8Var == null || wp8Var.i(this)) {
                                m(kt8Var, obj, kf2Var, z);
                                return;
                            } else {
                                this.q = null;
                                this.u = a.w;
                            }
                        }
                        this.t.getClass();
                        hg3.f(kt8Var);
                    } catch (Throwable th) {
                        kt8Var2 = kt8Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (kt8Var2 != null) {
                this.t.getClass();
                hg3.f(kt8Var2);
            }
            throw th3;
        }
    }

    public final void m(kt8<R> kt8Var, R r, kf2 kf2Var, boolean z) {
        boolean zC;
        wp8 wp8Var = this.d;
        if (wp8Var != null) {
            wp8Var.getRoot().a();
        }
        this.u = a.w;
        this.q = kt8Var;
        int i = this.f.i;
        Object obj = this.g;
        if (i <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + kf2Var + " for " + obj + " with size [" + this.y + "x" + this.z + "] in " + vd6.a(this.s) + " ms");
        }
        if (wp8Var != null) {
            wp8Var.f(this);
        }
        this.A = true;
        try {
            List<kq8<R>> list = this.n;
            if (list != null) {
                zC = false;
                for (kq8<R> kq8Var : list) {
                    kq8Var.a(r, obj, kf2Var);
                    if (kq8Var instanceof qq3) {
                        zC |= ((qq3) kq8Var).c();
                    }
                }
            } else {
                zC = false;
            }
            if (!zC) {
                this.m.i(r, this.o.a(kf2Var));
            }
        } finally {
            this.A = false;
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
