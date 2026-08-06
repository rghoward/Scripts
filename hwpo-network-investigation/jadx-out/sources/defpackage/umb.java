package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class umb {
    public static final umb b;
    public final q a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            z90.a(pp2.a(i, "type needs to be >= FIRST and <= LAST, type="));
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class s {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class t {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            b = o.x;
        } else if (i2 >= 30) {
            b = m.w;
        } else {
            b = q.b;
        }
    }

    public umb(umb umbVar) {
        if (umbVar == null) {
            this.a = new q(this);
            return;
        }
        q qVar = umbVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 && (qVar instanceof p)) {
            this.a = new p(this, (p) qVar);
        } else if (i2 >= 34 && (qVar instanceof o)) {
            this.a = new o(this, (o) qVar);
        } else if (i2 >= 31 && (qVar instanceof n)) {
            this.a = new n(this, (n) qVar);
        } else if (i2 >= 30 && (qVar instanceof m)) {
            this.a = new m(this, (m) qVar);
        } else if (i2 >= 29 && (qVar instanceof l)) {
            this.a = new l(this, (l) qVar);
        } else if (i2 >= 28 && (qVar instanceof k)) {
            this.a = new k(this, (k) qVar);
        } else if (qVar instanceof j) {
            this.a = new j(this, (j) qVar);
        } else if (qVar instanceof i) {
            this.a = new i(this, (i) qVar);
        } else {
            this.a = new q(this);
        }
        qVar.e(this);
    }

    public static xd5 e(xd5 xd5Var, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, xd5Var.a - i2);
        int iMax2 = Math.max(0, xd5Var.b - i3);
        int iMax3 = Math.max(0, xd5Var.c - i4);
        int iMax4 = Math.max(0, xd5Var.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? xd5Var : xd5.c(iMax, iMax2, iMax3, iMax4);
    }

    public static umb h(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        umb umbVar = new umb(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            umb umbVarA = egb.e.a(view);
            q qVar = umbVar.a;
            qVar.y(umbVarA);
            View rootView = view.getRootView();
            qVar.d(rootView);
            qVar.p(rootView);
            qVar.q();
            qVar.A(view.getWindowSystemUiVisibility());
        }
        return umbVar;
    }

    @Deprecated
    public final int a() {
        return this.a.n().d;
    }

    @Deprecated
    public final int b() {
        return this.a.n().a;
    }

    @Deprecated
    public final int c() {
        return this.a.n().c;
    }

    @Deprecated
    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof umb) {
            return Objects.equals(this.a, ((umb) obj).a);
        }
        return false;
    }

    @Deprecated
    public final umb f(int i2, int i3, int i4, int i5) {
        h bVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 36) {
            bVar = new g(this);
        } else if (i6 >= 35) {
            bVar = new f(this);
        } else if (i6 >= 34) {
            bVar = new e(this);
        } else if (i6 >= 31) {
            bVar = new d(this);
        } else if (i6 >= 30) {
            bVar = new c(this);
        } else {
            bVar = i6 >= 29 ? new b(this) : new a(this);
        }
        bVar.h(xd5.c(i2, i3, i4, i5));
        return bVar.b();
    }

    public final WindowInsets g() {
        q qVar = this.a;
        if (qVar instanceof i) {
            return ((i) qVar).c;
        }
        return null;
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends b {
        public c() {
        }

        @Override // umb.h
        public void d(int i, xd5 xd5Var) {
            this.e.setInsets(s.a(i), xd5Var.e());
        }

        public c(umb umbVar) {
            super(umbVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends c {
        public d() {
        }

        public d(umb umbVar) {
            super(umbVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends d {
        public e() {
        }

        @Override // umb.c, umb.h
        public void d(int i, xd5 xd5Var) {
            this.e.setInsets(t.a(i), xd5Var.e());
        }

        public e(umb umbVar) {
            super(umbVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends f {
        public g() {
        }

        public g(umb umbVar) {
            super(umbVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class k extends j {
        public k(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
        }

        @Override // umb.q
        public umb a() {
            return umb.h(this.c.consumeDisplayCutout(), null);
        }

        @Override // umb.i, umb.q
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Objects.equals(this.c, kVar.c) && Objects.equals(this.g, kVar.g) && i.M(this.h, kVar.h);
        }

        @Override // umb.q
        public l23 h() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new l23(displayCutout);
        }

        @Override // umb.q
        public int hashCode() {
            return this.c.hashCode();
        }

        public k(umb umbVar, k kVar) {
            super(umbVar, kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class m extends l {
        public static final umb w = umb.h(WindowInsets.CONSUMED, null);

        public m(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
        }

        @Override // umb.i, umb.q
        public xd5 i(int i) {
            return xd5.d(this.c.getInsets(s.a(i)));
        }

        @Override // umb.i, umb.q
        public xd5 j(int i) {
            return xd5.d(this.c.getInsetsIgnoringVisibility(s.a(i)));
        }

        @Override // umb.i, umb.q
        public boolean u(int i) {
            return this.c.isVisible(s.a(i));
        }

        public m(umb umbVar, m mVar) {
            super(umbVar, mVar);
        }

        @Override // umb.i, umb.q
        public final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class n extends m {
        public n(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
        }

        public n(umb umbVar, n nVar) {
            super(umbVar, nVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class o extends n {
        public static final umb x = umb.h(WindowInsets.CONSUMED, null);

        public o(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
        }

        @Override // umb.m, umb.i, umb.q
        public xd5 i(int i) {
            return xd5.d(this.c.getInsets(t.a(i)));
        }

        @Override // umb.m, umb.i, umb.q
        public xd5 j(int i) {
            return xd5.d(this.c.getInsetsIgnoringVisibility(t.a(i)));
        }

        @Override // umb.m, umb.i, umb.q
        public boolean u(int i) {
            return this.c.isVisible(t.a(i));
        }

        public o(umb umbVar, o oVar) {
            super(umbVar, oVar);
        }

        @Override // umb.i, umb.q
        public void p(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class p extends o {
        public p(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
        }

        @Override // umb.i, umb.q
        public List<Rect> f(int i) {
            return this.c.getBoundingRects(t.a(i));
        }

        @Override // umb.i, umb.q
        public List<Rect> g(int i) {
            return this.c.getBoundingRectsIgnoringVisibility(t.a(i));
        }

        public p(umb umbVar, p pVar) {
            super(umbVar, pVar);
        }

        @Override // umb.i, umb.q
        public void q() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f extends e {
        public f(umb umbVar) {
            super(umbVar);
            umbVar.a.s();
        }

        @Override // umb.e, umb.c, umb.h
        public void d(int i, xd5 xd5Var) {
            super.d(i, xd5Var);
        }

        public f() {
        }

        @Override // umb.h
        public void c(umb umbVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends h {
        public static Field g = null;
        public static boolean h = false;
        public static Constructor<WindowInsets> i = null;
        public static boolean j = false;
        public WindowInsets e;
        public xd5 f;

        public a() {
            this.e = j();
        }

        private static WindowInsets j() {
            if (!h) {
                try {
                    g = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                h = true;
            }
            Field field = g;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!j) {
                try {
                    i = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                j = true;
            }
            Constructor<WindowInsets> constructor = i;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // umb.h
        public umb b() {
            a();
            umb umbVarH = umb.h(this.e, null);
            xd5[] xd5VarArr = this.b;
            q qVar = umbVarH.a;
            qVar.w(xd5VarArr);
            qVar.z(this.f);
            qVar.v(null);
            qVar.B(this.c);
            qVar.C(this.d);
            return umbVarH;
        }

        @Override // umb.h
        public void f(xd5 xd5Var) {
            this.f = xd5Var;
        }

        @Override // umb.h
        public void h(xd5 xd5Var) {
            WindowInsets windowInsets = this.e;
            if (windowInsets != null) {
                this.e = windowInsets.replaceSystemWindowInsets(xd5Var.a, xd5Var.b, xd5Var.c, xd5Var.d);
            }
        }

        public a(umb umbVar) {
            super(umbVar);
            this.e = umbVar.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class j extends i {
        public xd5 s;

        public j(umb umbVar, j jVar) {
            super(umbVar, jVar);
            this.s = null;
            this.s = jVar.s;
        }

        @Override // umb.q
        public umb b() {
            return umb.h(this.c.consumeStableInsets(), null);
        }

        @Override // umb.q
        public umb c() {
            return umb.h(this.c.consumeSystemWindowInsets(), null);
        }

        @Override // umb.q
        public final xd5 l() {
            if (this.s == null) {
                WindowInsets windowInsets = this.c;
                this.s = xd5.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.s;
        }

        @Override // umb.q
        public boolean s() {
            return this.c.isConsumed();
        }

        @Override // umb.q
        public void z(xd5 xd5Var) {
            this.s = xd5Var;
        }

        public j(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
            this.s = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class l extends k {
        public xd5 t;
        public xd5 u;
        public xd5 v;

        public l(umb umbVar, WindowInsets windowInsets) {
            super(umbVar, windowInsets);
            this.t = null;
            this.u = null;
            this.v = null;
        }

        @Override // umb.q
        public xd5 k() {
            if (this.u == null) {
                this.u = xd5.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.u;
        }

        @Override // umb.q
        public xd5 m() {
            if (this.t == null) {
                this.t = xd5.d(this.c.getSystemGestureInsets());
            }
            return this.t;
        }

        @Override // umb.q
        public xd5 o() {
            if (this.v == null) {
                this.v = xd5.d(this.c.getTappableElementInsets());
            }
            return this.v;
        }

        @Override // umb.i, umb.q
        public umb r(int i, int i2, int i3, int i4) {
            return umb.h(this.c.inset(i, i2, i3, i4), null);
        }

        public l(umb umbVar, l lVar) {
            super(umbVar, lVar);
            this.t = null;
            this.u = null;
            this.v = null;
        }

        @Override // umb.j, umb.q
        public void z(xd5 xd5Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h {
        public final umb a;
        public xd5[] b;
        public final Rect[][] c;
        public final Rect[][] d;

        public h(umb umbVar) {
            this.c = new Rect[10][];
            this.d = new Rect[10][];
            this.a = umbVar;
            c(umbVar);
        }

        public final void a() {
            xd5[] xd5VarArr = this.b;
            if (xd5VarArr != null) {
                xd5 xd5VarI = xd5VarArr[0];
                xd5 xd5VarI2 = xd5VarArr[1];
                umb umbVar = this.a;
                if (xd5VarI2 == null) {
                    xd5VarI2 = umbVar.a.i(2);
                }
                if (xd5VarI == null) {
                    xd5VarI = umbVar.a.i(1);
                }
                h(xd5.a(xd5VarI, xd5VarI2));
                xd5 xd5Var = this.b[r.a(16)];
                if (xd5Var != null) {
                    g(xd5Var);
                }
                xd5 xd5Var2 = this.b[r.a(32)];
                if (xd5Var2 != null) {
                    e(xd5Var2);
                }
                xd5 xd5Var3 = this.b[r.a(64)];
                if (xd5Var3 != null) {
                    i(xd5Var3);
                }
            }
        }

        public umb b() {
            throw null;
        }

        public void c(umb umbVar) {
            for (int i = 1; i <= 512; i <<= 1) {
                List<Rect> listF = umbVar.a.f(i);
                int iA = r.a(i);
                this.c[iA] = (Rect[]) listF.toArray(new Rect[listF.size()]);
                if (i != 8) {
                    List<Rect> listG = umbVar.a.g(i);
                    this.d[iA] = (Rect[]) listG.toArray(new Rect[listG.size()]);
                }
            }
        }

        public void d(int i, xd5 xd5Var) {
            if (this.b == null) {
                this.b = new xd5[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[r.a(i2)] = xd5Var;
                }
            }
        }

        public void f(xd5 xd5Var) {
            throw null;
        }

        public void h(xd5 xd5Var) {
            throw null;
        }

        public h() {
            this(new umb((umb) null));
        }

        public void e(xd5 xd5Var) {
        }

        public void g(xd5 xd5Var) {
        }

        public void i(xd5 xd5Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i extends q {
        public static boolean n = false;
        public static Method o;
        public static Class<?> p;
        public static Field q;
        public static Field r;
        public final WindowInsets c;
        public xd5[] d;
        public xd5 e;
        public umb f;
        public xd5 g;
        public int h;
        public q23 i;
        public int j;
        public int k;
        public Rect[][] l;
        public Rect[][] m;

        public i(umb umbVar, WindowInsets windowInsets) {
            super(umbVar);
            this.e = null;
            this.l = new Rect[10][];
            this.m = new Rect[10][];
            this.c = windowInsets;
        }

        private q23 D(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.a.a.t()) {
                return q23.a(point.x, point.y, true, 0, 0, 0, 0);
            }
            yx8 yx8VarA = j23.a(display, 0);
            yx8 yx8VarA2 = j23.a(display, 1);
            yx8 yx8VarA3 = j23.a(display, 2);
            yx8 yx8VarA4 = j23.a(display, 3);
            return q23.a(point.x, point.y, false, yx8VarA != null ? yx8VarA.b : 0, yx8VarA2 != null ? yx8VarA2.b : 0, yx8VarA3 != null ? yx8VarA3.b : 0, yx8VarA4 != null ? yx8VarA4.b : 0);
        }

        private static List<Rect> E(Rect[][] rectArr, int i) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && (rectArr2 = rectArr[r.a(i2)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] F(xd5 xd5Var) {
            ArrayList arrayList = new ArrayList();
            int i = xd5Var.a;
            int i2 = xd5Var.d;
            int i3 = xd5Var.c;
            int i4 = xd5Var.b;
            if (i != 0) {
                arrayList.add(new Rect(0, 0, xd5Var.a, this.j));
            }
            if (i4 != 0) {
                arrayList.add(new Rect(0, 0, this.k, i4));
            }
            if (i3 != 0) {
                int i5 = this.k;
                arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
            }
            if (i2 != 0) {
                int i6 = this.j;
                arrayList.add(new Rect(0, i6 - i2, this.k, i6));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private xd5 G(int i, boolean z) {
            xd5 xd5VarA = xd5.e;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    xd5VarA = xd5.a(xd5VarA, H(i2, z));
                }
            }
            return xd5VarA;
        }

        private xd5 I() {
            umb umbVar = this.f;
            return umbVar != null ? umbVar.a.l() : xd5.e;
        }

        private xd5 J(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                ru3.f("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!n) {
                L();
            }
            Method method = o;
            if (method != null && p != null && q != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) q.get(r.get(objInvoke));
                    if (rect != null) {
                        return xd5.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        private static void L() {
            try {
                o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                p = cls;
                q = cls.getDeclaredField("mVisibleInsets");
                r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                q.setAccessible(true);
                r.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            n = true;
        }

        public static boolean M(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        @Override // umb.q
        public void A(int i) {
            this.h = i;
        }

        @Override // umb.q
        public void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.l = (Rect[][]) rectArr.clone();
        }

        @Override // umb.q
        public void C(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.m = (Rect[][]) rectArr.clone();
        }

        public xd5 H(int i, boolean z) {
            xd5 xd5VarL;
            int i2;
            xd5 xd5Var = xd5.e;
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        xd5[] xd5VarArr = this.d;
                        xd5VarL = xd5VarArr != null ? xd5VarArr[r.a(8)] : null;
                        if (xd5VarL != null) {
                            return xd5VarL;
                        }
                        xd5 xd5VarN = n();
                        xd5 xd5VarI = I();
                        int i3 = xd5VarN.d;
                        if (i3 > xd5VarI.d) {
                            return xd5.c(0, 0, 0, i3);
                        }
                        xd5 xd5Var2 = this.g;
                        if (xd5Var2 != null && !xd5Var2.equals(xd5Var) && (i2 = this.g.d) > xd5VarI.d) {
                            return xd5.c(0, 0, 0, i2);
                        }
                    } else {
                        if (i == 16) {
                            return m();
                        }
                        if (i == 32) {
                            return k();
                        }
                        if (i == 64) {
                            return o();
                        }
                        if (i == 128) {
                            umb umbVar = this.f;
                            l23 l23VarH = umbVar != null ? umbVar.a.h() : h();
                            if (l23VarH != null) {
                                int i4 = Build.VERSION.SDK_INT;
                                return xd5.c(i4 >= 28 ? l23.a.c(l23VarH.a) : 0, i4 >= 28 ? l23.a.e(l23VarH.a) : 0, i4 >= 28 ? l23.a.d(l23VarH.a) : 0, i4 >= 28 ? l23.a.b(l23VarH.a) : 0);
                            }
                        }
                    }
                } else {
                    if (z) {
                        xd5 xd5VarI2 = I();
                        xd5 xd5VarL2 = l();
                        return xd5.c(Math.max(xd5VarI2.a, xd5VarL2.a), 0, Math.max(xd5VarI2.c, xd5VarL2.c), Math.max(xd5VarI2.d, xd5VarL2.d));
                    }
                    if ((this.h & 2) == 0) {
                        xd5 xd5VarN2 = n();
                        umb umbVar2 = this.f;
                        xd5VarL = umbVar2 != null ? umbVar2.a.l() : null;
                        int iMin = xd5VarN2.d;
                        if (xd5VarL != null) {
                            iMin = Math.min(iMin, xd5VarL.d);
                        }
                        return xd5.c(xd5VarN2.a, 0, xd5VarN2.c, iMin);
                    }
                }
            } else {
                if (z) {
                    return xd5.c(0, Math.max(I().b, n().b), 0, 0);
                }
                if ((this.h & 4) == 0) {
                    return xd5.c(0, n().b, 0, 0);
                }
            }
            return xd5Var;
        }

        public boolean K(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !H(i, false).equals(xd5.e);
        }

        @Override // umb.q
        public void d(View view) {
            this.k = view.getWidth();
            this.j = view.getHeight();
            xd5 xd5VarJ = J(view);
            if (xd5VarJ == null) {
                xd5VarJ = xd5.e;
            }
            x(xd5VarJ);
        }

        @Override // umb.q
        public void e(umb umbVar) {
            umbVar.a.y(this.f);
            xd5 xd5Var = this.g;
            q qVar = umbVar.a;
            qVar.x(xd5Var);
            qVar.A(this.h);
            qVar.v(this.i);
            qVar.B(this.l);
            qVar.C(this.m);
        }

        @Override // umb.q
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.g, iVar.g) && M(this.h, iVar.h);
        }

        @Override // umb.q
        public List<Rect> f(int i) {
            return E(this.l, i);
        }

        @Override // umb.q
        public List<Rect> g(int i) {
            return E(this.m, i);
        }

        @Override // umb.q
        public xd5 i(int i) {
            return G(i, false);
        }

        @Override // umb.q
        public xd5 j(int i) {
            return G(i, true);
        }

        @Override // umb.q
        public final xd5 n() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = xd5.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // umb.q
        public void p(View view) {
            this.i = D(view);
        }

        @Override // umb.q
        public void q() {
            for (int i = 1; i <= 512; i <<= 1) {
                int iA = r.a(i);
                this.l[iA] = F(i(i));
                if (i != 8) {
                    this.m[iA] = F(j(i));
                }
            }
        }

        @Override // umb.q
        public umb r(int i, int i2, int i3, int i4) {
            h bVar;
            umb umbVarH = umb.h(this.c, null);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 36) {
                bVar = new g(umbVarH);
            } else if (i5 >= 35) {
                bVar = new f(umbVarH);
            } else if (i5 >= 34) {
                bVar = new e(umbVarH);
            } else if (i5 >= 31) {
                bVar = new d(umbVarH);
            } else if (i5 >= 30) {
                bVar = new c(umbVarH);
            } else {
                bVar = i5 >= 29 ? new b(umbVarH) : new a(umbVarH);
            }
            bVar.h(umb.e(n(), i, i2, i3, i4));
            bVar.f(umb.e(l(), i, i2, i3, i4));
            return bVar.b();
        }

        @Override // umb.q
        public boolean t() {
            return this.c.isRound();
        }

        @Override // umb.q
        public boolean u(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !K(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // umb.q
        public void v(q23 q23Var) {
            this.i = q23Var;
        }

        @Override // umb.q
        public void w(xd5[] xd5VarArr) {
            this.d = xd5VarArr;
        }

        @Override // umb.q
        public void x(xd5 xd5Var) {
            this.g = xd5Var;
        }

        @Override // umb.q
        public void y(umb umbVar) {
            this.f = umbVar;
        }

        public i(umb umbVar, i iVar) {
            this(umbVar, new WindowInsets(iVar.c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class q {
        public static final umb b;
        public final umb a;

        static {
            h bVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                bVar = new g();
            } else if (i >= 35) {
                bVar = new f();
            } else if (i >= 34) {
                bVar = new e();
            } else if (i >= 31) {
                bVar = new d();
            } else if (i >= 30) {
                bVar = new c();
            } else {
                bVar = i >= 29 ? new b() : new a();
            }
            b = bVar.b().a.a().a.b().a.c();
        }

        public q(umb umbVar) {
            this.a = umbVar;
        }

        public umb a() {
            return this.a;
        }

        public umb b() {
            return this.a;
        }

        public umb c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return t() == qVar.t() && s() == qVar.s() && Objects.equals(n(), qVar.n()) && Objects.equals(l(), qVar.l()) && Objects.equals(h(), qVar.h());
        }

        public List<Rect> f(int i) {
            return Collections.EMPTY_LIST;
        }

        public List<Rect> g(int i) {
            return Collections.EMPTY_LIST;
        }

        public l23 h() {
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        public xd5 i(int i) {
            return xd5.e;
        }

        public xd5 j(int i) {
            if ((i & 8) == 0) {
                return xd5.e;
            }
            z90.a("Unable to query the maximum insets for IME");
            return null;
        }

        public xd5 k() {
            return n();
        }

        public xd5 l() {
            return xd5.e;
        }

        public xd5 m() {
            return n();
        }

        public xd5 n() {
            return xd5.e;
        }

        public xd5 o() {
            return n();
        }

        public umb r(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean s() {
            return false;
        }

        public boolean t() {
            return false;
        }

        public boolean u(int i) {
            return true;
        }

        public void q() {
        }

        public void A(int i) {
        }

        public void B(Rect[][] rectArr) {
        }

        public void C(Rect[][] rectArr) {
        }

        public void d(View view) {
        }

        public void e(umb umbVar) {
        }

        public void p(View view) {
        }

        public void v(q23 q23Var) {
        }

        public void w(xd5[] xd5VarArr) {
        }

        public void x(xd5 xd5Var) {
        }

        public void y(umb umbVar) {
        }

        public void z(xd5 xd5Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends h {
        public final WindowInsets.Builder e;

        public b(umb umbVar) {
            super(umbVar);
            WindowInsets windowInsetsG = umbVar.g();
            this.e = windowInsetsG != null ? wmb.a(windowInsetsG) : vmb.a();
        }

        @Override // umb.h
        public umb b() {
            a();
            umb umbVarH = umb.h(this.e.build(), null);
            xd5[] xd5VarArr = this.b;
            q qVar = umbVarH.a;
            qVar.w(xd5VarArr);
            qVar.v(null);
            qVar.B(this.c);
            qVar.C(this.d);
            return umbVarH;
        }

        @Override // umb.h
        public void e(xd5 xd5Var) {
            this.e.setMandatorySystemGestureInsets(xd5Var.e());
        }

        @Override // umb.h
        public void f(xd5 xd5Var) {
            this.e.setStableInsets(xd5Var.e());
        }

        @Override // umb.h
        public void g(xd5 xd5Var) {
            this.e.setSystemGestureInsets(xd5Var.e());
        }

        @Override // umb.h
        public void h(xd5 xd5Var) {
            this.e.setSystemWindowInsets(xd5Var.e());
        }

        @Override // umb.h
        public void i(xd5 xd5Var) {
            this.e.setTappableElementInsets(xd5Var.e());
        }

        public b() {
            this.e = vmb.a();
        }
    }

    public umb(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.a = new p(this, windowInsets);
            return;
        }
        if (i2 >= 34) {
            this.a = new o(this, windowInsets);
            return;
        }
        if (i2 >= 31) {
            this.a = new n(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.a = new m(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new l(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new k(this, windowInsets);
        } else {
            this.a = new j(this, windowInsets);
        }
    }
}
