package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k85 {
    public final ys7 A;
    public final Integer B;
    public final Drawable C;
    public final Integer D;
    public final Drawable E;
    public final xv2 F;
    public final at2 G;
    public final Context a;
    public final Object b;
    public final k9a c;
    public final b d;
    public final ar6.a e;
    public final String f;
    public final Bitmap.Config g;
    public final x68 h;
    public final List<eva> i;
    public final xva.a j;
    public final nu4 k;
    public final l8a l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final v01 q;
    public final v01 r;
    public final v01 s;
    public final n72 t;
    public final n72 u;
    public final n72 v;
    public final n72 w;
    public final s66 x;
    public final lr9 y;
    public final s39 z;

    public k85() {
        throw null;
    }

    public k85(Context context, Object obj, k9a k9aVar, b bVar, ar6.a aVar, String str, Bitmap.Config config, x68 x68Var, List list, xva.a aVar2, nu4 nu4Var, l8a l8aVar, boolean z, boolean z2, boolean z3, boolean z4, v01 v01Var, v01 v01Var2, v01 v01Var3, n72 n72Var, n72 n72Var2, n72 n72Var3, n72 n72Var4, s66 s66Var, lr9 lr9Var, s39 s39Var, ys7 ys7Var, Integer num, Drawable drawable, Integer num2, Drawable drawable2, xv2 xv2Var, at2 at2Var) {
        this.a = context;
        this.b = obj;
        this.c = k9aVar;
        this.d = bVar;
        this.e = aVar;
        this.f = str;
        this.g = config;
        this.h = x68Var;
        this.i = list;
        this.j = aVar2;
        this.k = nu4Var;
        this.l = l8aVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = v01Var;
        this.r = v01Var2;
        this.s = v01Var3;
        this.t = n72Var;
        this.u = n72Var2;
        this.v = n72Var3;
        this.w = n72Var4;
        this.x = s66Var;
        this.y = lr9Var;
        this.z = s39Var;
        this.A = ys7Var;
        this.B = num;
        this.C = drawable;
        this.D = num2;
        this.E = drawable2;
        this.F = xv2Var;
        this.G = at2Var;
    }

    public static a a(k85 k85Var) {
        Context context = k85Var.a;
        k85Var.getClass();
        return new a(context, k85Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k85)) {
            return false;
        }
        k85 k85Var = (k85) obj;
        return xj5.a(this.a, k85Var.a) && xj5.a(this.b, k85Var.b) && xj5.a(this.c, k85Var.c) && xj5.a(this.d, k85Var.d) && xj5.a(this.e, k85Var.e) && xj5.a(this.f, k85Var.f) && this.g == k85Var.g && this.h == k85Var.h && xj5.a(this.i, k85Var.i) && xj5.a(this.j, k85Var.j) && xj5.a(this.k, k85Var.k) && xj5.a(this.l, k85Var.l) && this.m == k85Var.m && this.n == k85Var.n && this.o == k85Var.o && this.p == k85Var.p && this.q == k85Var.q && this.r == k85Var.r && this.s == k85Var.s && xj5.a(this.t, k85Var.t) && xj5.a(this.u, k85Var.u) && xj5.a(this.v, k85Var.v) && xj5.a(this.w, k85Var.w) && xj5.a(this.B, k85Var.B) && xj5.a(this.C, k85Var.C) && xj5.a(this.D, k85Var.D) && xj5.a(this.E, k85Var.E) && xj5.a(this.x, k85Var.x) && xj5.a(this.y, k85Var.y) && this.z == k85Var.z && xj5.a(this.A, k85Var.A) && xj5.a(this.F, k85Var.F) && xj5.a(this.G, k85Var.G);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k9a k9aVar = this.c;
        int iHashCode2 = (iHashCode + (k9aVar != null ? k9aVar.hashCode() : 0)) * 31;
        b bVar = this.d;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        ar6.a aVar = this.e;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f;
        int iHashCode5 = (this.A.t.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + uo2.a(uo2.a(uo2.a(uo2.a((this.l.a.hashCode() + ((((this.j.hashCode() + ho2.a((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31, this.i)) * 31) + Arrays.hashCode(this.k.t)) * 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.p, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        Integer num = this.B;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.C;
        int iHashCode7 = (iHashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.D;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.E;
        return this.G.hashCode() + ((this.F.hashCode() + ((iHashCode8 + (drawable2 != null ? drawable2.hashCode() : 0)) * 29791)) * 31);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        default void onCancel(k85 k85Var) {
        }

        default void onStart(k85 k85Var) {
        }

        default void onError(k85 k85Var, dm3 dm3Var) {
        }

        default void onSuccess(k85 k85Var, f5a f5aVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;
        public at2 b;
        public Object c;
        public k9a d;
        public b e;
        public ar6.a f;
        public String g;
        public x68 h;
        public List<? extends eva> i;
        public xva.a j;
        public final nu4.a k;
        public final LinkedHashMap l;
        public final boolean m;
        public final boolean n;
        public ys7.a o;
        public Integer p;
        public Drawable q;
        public Integer r;
        public Drawable s;
        public lr9 t;
        public s39 u;
        public s66 v;
        public lr9 w;
        public s39 x;

        public a(Context context, k85 k85Var) {
            this.a = context;
            this.b = k85Var.G;
            this.c = k85Var.b;
            this.d = k85Var.c;
            this.e = k85Var.d;
            this.f = k85Var.e;
            this.g = k85Var.f;
            xv2 xv2Var = k85Var.F;
            xv2Var.getClass();
            this.h = xv2Var.d;
            this.i = k85Var.i;
            this.j = xv2Var.c;
            this.k = k85Var.k.f();
            this.l = qi6.m(k85Var.l.a);
            this.m = k85Var.m;
            this.n = k85Var.p;
            ys7 ys7Var = k85Var.A;
            ys7Var.getClass();
            this.o = new ys7.a(ys7Var);
            this.p = k85Var.B;
            this.q = k85Var.C;
            this.r = k85Var.D;
            this.s = k85Var.E;
            this.t = xv2Var.a;
            this.u = xv2Var.b;
            if (k85Var.a == context) {
                this.v = k85Var.x;
                this.w = k85Var.y;
                this.x = k85Var.z;
            } else {
                this.v = null;
                this.w = null;
                this.x = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:94:0x0149  */
        public final k85 a() {
            n72 n72Var;
            Object obj;
            View viewA;
            lr9 kj8Var;
            Object obj2 = this.c;
            if (obj2 == null) {
                obj2 = pd7.b;
            }
            Object obj3 = obj2;
            k9a k9aVar = this.d;
            b bVar = this.e;
            ar6.a aVar = this.f;
            String str = this.g;
            at2 at2Var = this.b;
            Bitmap.Config config = at2Var.g;
            x68 x68Var = this.h;
            if (x68Var == null) {
                x68Var = at2Var.f;
            }
            x68 x68Var2 = x68Var;
            List<? extends eva> list = this.i;
            xva.a aVar2 = this.j;
            if (aVar2 == null) {
                aVar2 = at2Var.e;
            }
            xva.a aVar3 = aVar2;
            nu4.a aVar4 = this.k;
            nu4 nu4VarD = aVar4 != null ? aVar4.d() : null;
            if (nu4VarD == null) {
                nu4VarD = v.c;
            } else {
                Bitmap.Config[] configArr = v.a;
            }
            nu4 nu4Var = nu4VarD;
            LinkedHashMap linkedHashMap = this.l;
            l8a l8aVar = linkedHashMap != null ? new l8a(e.b(linkedHashMap)) : null;
            if (l8aVar == null) {
                l8aVar = l8a.b;
            }
            l8a l8aVar2 = l8aVar;
            at2 at2Var2 = this.b;
            boolean z = at2Var2.h;
            boolean z2 = at2Var2.i;
            v01 v01Var = at2Var2.m;
            v01 v01Var2 = at2Var2.n;
            v01 v01Var3 = at2Var2.o;
            n72 n72Var2 = at2Var2.a;
            n72 n72Var3 = at2Var2.b;
            n72 n72Var4 = at2Var2.c;
            n72 n72Var5 = at2Var2.d;
            s66 lifecycle = this.v;
            Context context = this.a;
            if (lifecycle == null) {
                k9a k9aVar2 = this.d;
                n72Var = n72Var5;
                Object context2 = k9aVar2 instanceof pib ? ((pib) k9aVar2).a().getContext() : context;
                while (true) {
                    if (context2 instanceof m76) {
                        lifecycle = ((m76) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = ym4.b;
                }
            } else {
                n72Var = n72Var5;
            }
            s66 s66Var = lifecycle;
            lr9 r23Var = this.t;
            if (r23Var == null && (r23Var = this.w) == null) {
                k9a k9aVar3 = this.d;
                if (k9aVar3 instanceof pib) {
                    View viewA2 = ((pib) k9aVar3).a();
                    if (viewA2 != null) {
                        ImageView.ScaleType scaleType = ((ImageView) viewA2).getScaleType();
                        obj = obj3;
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            kj8Var = new hj8(br9.c);
                        }
                        r23Var = kj8Var;
                    } else {
                        obj = obj3;
                    }
                    kj8Var = new kj8(viewA2);
                    r23Var = kj8Var;
                } else {
                    obj = obj3;
                    r23Var = new r23(context);
                }
            } else {
                obj = obj3;
            }
            lr9 lr9Var = r23Var;
            s39 s39Var = this.u;
            if (s39Var == null && (s39Var = this.x) == null) {
                lr9 lr9Var2 = this.t;
                mib mibVar = lr9Var2 instanceof mib ? (mib) lr9Var2 : null;
                if (mibVar == null || (viewA = mibVar.a()) == null) {
                    k9a k9aVar4 = this.d;
                    pib pibVar = k9aVar4 instanceof pib ? (pib) k9aVar4 : null;
                    viewA = pibVar != null ? pibVar.a() : null;
                }
                boolean z3 = viewA instanceof ImageView;
                s39 s39Var2 = s39.u;
                if (z3) {
                    Bitmap.Config[] configArr2 = v.a;
                    ImageView.ScaleType scaleType2 = ((ImageView) viewA).getScaleType();
                    int i = scaleType2 == null ? -1 : v.a.a[scaleType2.ordinal()];
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        s39Var = s39Var2;
                    } else {
                        s39Var = s39.t;
                    }
                } else {
                    s39Var = s39Var2;
                }
            }
            s39 s39Var3 = s39Var;
            ys7.a aVar5 = this.o;
            ys7 ys7Var = aVar5 != null ? new ys7(e.b(aVar5.a)) : null;
            if (ys7Var == null) {
                ys7Var = ys7.u;
            }
            return new k85(context, obj, k9aVar, bVar, aVar, str, config, x68Var2, list, aVar3, nu4Var, l8aVar2, this.m, z, z2, this.n, v01Var, v01Var2, v01Var3, n72Var2, n72Var3, n72Var4, n72Var, s66Var, lr9Var, s39Var3, ys7Var, this.p, this.q, this.r, this.s, new xv2(this.t, this.u, this.j, this.h), this.b);
        }

        public final void b() {
            this.j = new bc2.a(100, 2);
        }

        public final void c(int i) {
            this.r = Integer.valueOf(i);
            this.s = null;
        }

        public final void d() {
            this.v = null;
            this.w = null;
            this.x = null;
        }

        public final void e(int i, int i2) {
            this.t = new hj8(new br9(new s03.a(i), new s03.a(i2)));
            d();
        }

        public final void f(ImageView imageView) {
            this.d = new q85(imageView);
            d();
        }

        public a(Context context) {
            this.a = context;
            this.b = q.a;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = hf3.t;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = true;
            this.n = true;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
        }
    }
}
