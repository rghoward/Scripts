package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pmb {
    public e a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends e {
        public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        public static final ot3 f = new ot3();
        public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
        public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a implements View.OnApplyWindowInsetsListener {
            public final b a;
            public umb b;

            /* JADX INFO: renamed from: pmb$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public class C0221a implements ValueAnimator.AnimatorUpdateListener {
                public final /* synthetic */ pmb a;
                public final /* synthetic */ umb b;
                public final /* synthetic */ umb c;
                public final /* synthetic */ int d;
                public final /* synthetic */ View e;

                public C0221a(pmb pmbVar, umb umbVar, umb umbVar2, int i, View view) {
                    this.a = pmbVar;
                    this.b = umbVar;
                    this.c = umbVar2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    umb.h bVar;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    pmb pmbVar = this.a;
                    e eVar = pmbVar.a;
                    eVar.e(animatedFraction);
                    float fC = eVar.c();
                    PathInterpolator pathInterpolator = c.e;
                    int i = Build.VERSION.SDK_INT;
                    umb umbVar = this.b;
                    if (i >= 36) {
                        bVar = new umb.g(umbVar);
                    } else if (i >= 35) {
                        bVar = new umb.f(umbVar);
                    } else if (i >= 34) {
                        bVar = new umb.e(umbVar);
                    } else if (i >= 31) {
                        bVar = new umb.d(umbVar);
                    } else if (i >= 30) {
                        bVar = new umb.c(umbVar);
                    } else {
                        bVar = i >= 29 ? new umb.b(umbVar) : new umb.a(umbVar);
                    }
                    for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                        int i3 = this.d & i2;
                        umb.q qVar = umbVar.a;
                        if (i3 == 0) {
                            bVar.d(i2, qVar.i(i2));
                        } else {
                            xd5 xd5VarI = qVar.i(i2);
                            xd5 xd5VarI2 = this.c.a.i(i2);
                            float f = 1.0f - fC;
                            bVar.d(i2, umb.e(xd5VarI, (int) (((double) ((xd5VarI.a - xd5VarI2.a) * f)) + 0.5d), (int) (((double) ((xd5VarI.b - xd5VarI2.b) * f)) + 0.5d), (int) (((double) ((xd5VarI.c - xd5VarI2.c) * f)) + 0.5d), (int) (((double) ((xd5VarI.d - xd5VarI2.d) * f)) + 0.5d)));
                        }
                    }
                    c.h(this.e, bVar.b(), Collections.singletonList(pmbVar));
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public class b extends AnimatorListenerAdapter {
                public final /* synthetic */ pmb a;
                public final /* synthetic */ View b;

                public b(pmb pmbVar, View view) {
                    this.a = pmbVar;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    pmb pmbVar = this.a;
                    pmbVar.a.e(1.0f);
                    c.f(pmbVar, this.b);
                }
            }

            /* JADX INFO: renamed from: pmb$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public class RunnableC0222c implements Runnable {
                public final /* synthetic */ View t;
                public final /* synthetic */ pmb u;
                public final /* synthetic */ a v;
                public final /* synthetic */ ValueAnimator w;

                public RunnableC0222c(View view, pmb pmbVar, a aVar, ValueAnimator valueAnimator) {
                    this.t = view;
                    this.u = pmbVar;
                    this.v = aVar;
                    this.w = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.i(this.t, this.u, this.v);
                    this.w.start();
                }
            }

            public a(View view, b bVar) {
                umb umbVarB;
                this.a = bVar;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                umb umbVarA = egb.e.a(view);
                if (umbVarA != null) {
                    int i = Build.VERSION.SDK_INT;
                    umbVarB = (i >= 36 ? new umb.g(umbVarA) : i >= 35 ? new umb.f(umbVarA) : i >= 34 ? new umb.e(umbVarA) : i >= 31 ? new umb.d(umbVarA) : i >= 30 ? new umb.c(umbVarA) : i >= 29 ? new umb.b(umbVarA) : new umb.a(umbVarA)).b();
                } else {
                    umbVarB = null;
                }
                this.b = umbVarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.b = umb.h(windowInsets, view);
                    PathInterpolator pathInterpolator = c.e;
                    return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
                }
                umb umbVarH = umb.h(windowInsets, view);
                umb.q qVar = umbVarH.a;
                if (this.b == null) {
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    this.b = egb.e.a(view);
                }
                if (this.b == null) {
                    this.b = umbVarH;
                    PathInterpolator pathInterpolator2 = c.e;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    b bVarJ = c.j(view);
                    if (bVarJ == null || !Objects.equals(bVarJ.t, umbVarH)) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[1];
                        umb umbVar = this.b;
                        int i = 1;
                        while (i <= 512) {
                            xd5 xd5VarI = qVar.i(i);
                            xd5 xd5VarI2 = umbVar.a.i(i);
                            int i2 = xd5VarI.a;
                            int i3 = xd5VarI.d;
                            int i4 = xd5VarI.c;
                            int i5 = xd5VarI.b;
                            int i6 = xd5VarI2.a;
                            int i7 = xd5VarI2.d;
                            int[] iArr3 = iArr;
                            int i8 = xd5VarI2.c;
                            int i9 = xd5VarI2.b;
                            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                                if (z) {
                                    iArr3[0] = iArr3[0] | i;
                                } else {
                                    iArr2[0] = iArr2[0] | i;
                                }
                            }
                            i <<= 1;
                            iArr = iArr3;
                            iArr2 = iArr2;
                        }
                        int i10 = iArr[0];
                        int i11 = iArr2[0];
                        int i12 = i10 | i11;
                        if (i12 == 0) {
                            this.b = umbVarH;
                            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                                return view.onApplyWindowInsets(windowInsets);
                            }
                        } else {
                            umb umbVar2 = this.b;
                            if ((i10 & 8) != 0) {
                                interpolator = c.e;
                            } else if ((i11 & 8) != 0) {
                                interpolator = c.f;
                            } else if ((i10 & 519) != 0) {
                                interpolator = c.g;
                            } else {
                                interpolator = (i11 & 519) != 0 ? c.h : null;
                            }
                            pmb pmbVar = new pmb(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                            pmbVar.a.e(0.0f);
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(pmbVar.a.b());
                            xd5 xd5VarI3 = qVar.i(i12);
                            xd5 xd5VarI4 = umbVar2.a.i(i12);
                            int iMin = Math.min(xd5VarI3.a, xd5VarI4.a);
                            int i13 = xd5VarI3.b;
                            int i14 = xd5VarI4.b;
                            int iMin2 = Math.min(i13, i14);
                            int i15 = xd5VarI3.c;
                            int i16 = xd5VarI4.c;
                            int iMin3 = Math.min(i15, i16);
                            int i17 = xd5VarI3.d;
                            int i18 = xd5VarI4.d;
                            a aVar = new a(xd5.c(iMin, iMin2, iMin3, Math.min(i17, i18)), xd5.c(Math.max(xd5VarI3.a, xd5VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                            c.g(view, pmbVar, umbVarH, false);
                            duration.addUpdateListener(new C0221a(pmbVar, umbVarH, umbVar2, i12, view));
                            duration.addListener(new b(pmbVar, view));
                            ek7.a(view, new RunnableC0222c(view, pmbVar, aVar, duration));
                            this.b = umbVarH;
                            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                                return view.onApplyWindowInsets(windowInsets);
                            }
                        }
                    } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
                return windowInsets;
            }
        }

        public static void f(pmb pmbVar, View view) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a(pmbVar);
                if (bVarJ.u == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(pmbVar, viewGroup.getChildAt(i));
                }
            }
        }

        public static void g(View view, pmb pmbVar, umb umbVar, boolean z) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.t = umbVar;
                if (!z) {
                    bVarJ.c(pmbVar);
                    z = bVarJ.u == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), pmbVar, umbVar, z);
                }
            }
        }

        public static void h(View view, umb umbVar, List<pmb> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                umbVar = bVarJ.d(umbVar, list);
                if (bVarJ.u == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), umbVar, list);
                }
            }
        }

        public static void i(View view, pmb pmbVar, a aVar) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.e(pmbVar, aVar);
                if (bVarJ.u == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), pmbVar, aVar);
                }
            }
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends e {
        public final WindowInsetsAnimation e;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a extends WindowInsetsAnimation$Callback {
            public final b a;
            public List<pmb> b;
            public ArrayList<pmb> c;
            public final HashMap<WindowInsetsAnimation, pmb> d;

            public a(b bVar) {
                super(bVar.u);
                this.d = new HashMap<>();
                this.a = bVar;
            }

            public final pmb a(WindowInsetsAnimation windowInsetsAnimation) {
                HashMap<WindowInsetsAnimation, pmb> map = this.d;
                pmb pmbVar = map.get(windowInsetsAnimation);
                if (pmbVar != null) {
                    return pmbVar;
                }
                pmb pmbVar2 = new pmb(0, null, 0L);
                pmbVar2.a = new d(windowInsetsAnimation);
                map.put(windowInsetsAnimation, pmbVar2);
                return pmbVar2;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<pmb> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<pmb> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    pmb pmbVarA = a(windowInsetsAnimation);
                    pmbVarA.a.e(windowInsetsAnimation.getFraction());
                    this.c.add(pmbVarA);
                }
                return this.a.d(umb.h(windowInsets, null), this.b).g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a aVarE = this.a.e(a(windowInsetsAnimation), new a(bounds));
                aVarE.getClass();
                smb.a();
                return rmb.a(aVarE.a.e(), aVarE.b.e());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static xd5 f(WindowInsetsAnimation.Bounds bounds) {
            return xd5.d(bounds.getUpperBound());
        }

        public static xd5 g(WindowInsetsAnimation.Bounds bounds) {
            return xd5.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // pmb.e
        public final float a() {
            return this.e.getAlpha();
        }

        @Override // pmb.e
        public final long b() {
            return this.e.getDurationMillis();
        }

        @Override // pmb.e
        public final float c() {
            return this.e.getInterpolatedFraction();
        }

        @Override // pmb.e
        public final int d() {
            return this.e.getTypeMask();
        }

        @Override // pmb.e
        public final void e(float f) {
            this.e.setFraction(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return 1.0f;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            float f = this.b;
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        public int d() {
            return this.a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    public pmb(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(qmb.a(i, interpolator, j));
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final xd5 a;
        public final xd5 b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public a(xd5 xd5Var, xd5 xd5Var2) {
            this.a = xd5Var;
            this.b = xd5Var2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b {
        public umb t;
        public final int u;

        public b(int i) {
            this.u = i;
        }

        public abstract umb d(umb umbVar, List<pmb> list);

        public abstract a e(pmb pmbVar, a aVar);

        public void a(pmb pmbVar) {
        }

        public void c(pmb pmbVar) {
        }
    }
}
