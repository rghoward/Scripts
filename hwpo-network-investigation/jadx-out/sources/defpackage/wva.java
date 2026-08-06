package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wva implements Cloneable {
    public static final Animator[] U = new Animator[0];
    public static final int[] V = {2, 1, 3, 4};
    public static final a W = new a(18);
    public static final ThreadLocal<n30<Animator, b>> X = new ThreadLocal<>();
    public ArrayList<wwa> E;
    public ArrayList<wwa> F;
    public f[] G;
    public c P;
    public long R;
    public e S;
    public long T;
    public final String t = getClass().getName();
    public long u = -1;
    public long v = -1;
    public TimeInterpolator w = null;
    public final ArrayList<Integer> x = new ArrayList<>();
    public final ArrayList<View> y = new ArrayList<>();
    public ArrayList<Class<?>> z = null;
    public xwa A = new xwa();
    public xwa B = new xwa();
    public twa C = null;
    public final int[] D = V;
    public final ArrayList<Animator> H = new ArrayList<>();
    public Animator[] I = U;
    public int J = 0;
    public boolean K = false;
    public boolean L = false;
    public wva M = null;
    public ArrayList<f> N = null;
    public ArrayList<Animator> O = new ArrayList<>();
    public ln4 Q = W;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ln4 {
        @Override // defpackage.ln4
        public final Path N0(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public View a;
        public String b;
        public wwa c;
        public WindowId d;
        public wva e;
        public Animator f;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public static void a(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends pwa implements swa, t93.j {
        public boolean b;
        public boolean c;
        public qy9 e;
        public final udb f;
        public Runnable g;
        public final /* synthetic */ twa h;
        public long a = -1;
        public int d = 0;

        public e(twa twaVar) {
            this.h = twaVar;
            udb udbVar = new udb();
            long[] jArr = new long[20];
            udbVar.a = jArr;
            udbVar.b = new float[20];
            udbVar.c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.f = udbVar;
        }

        @Override // defpackage.swa
        public final boolean b() {
            return this.b;
        }

        @Override // defpackage.swa
        public final long c() {
            return this.h.R;
        }

        @Override // defpackage.swa
        public final void f(long j) {
            if (this.e != null) {
                aa0.c("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j2 = this.a;
            if (j == j2 || !this.b) {
                return;
            }
            if (!this.c) {
                twa twaVar = this.h;
                if (j != 0 || j2 <= 0) {
                    long j3 = twaVar.R;
                    if (j == j3 && j2 < j3) {
                        j = 1 + j3;
                    }
                } else {
                    j = -1;
                }
                if (j != j2) {
                    twaVar.F(j, j2);
                    this.a = j;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            udb udbVar = this.f;
            int i = (udbVar.c + 1) % 20;
            udbVar.c = i;
            udbVar.a[i] = jCurrentAnimationTimeMillis;
            udbVar.b[i] = j;
        }

        @Override // defpackage.swa
        public final void h() {
            if (this.b) {
                n();
                this.e.d(this.h.R + 1);
            } else {
                this.d = 1;
                this.g = null;
            }
        }

        @Override // defpackage.swa
        public final void i(Runnable runnable) {
            this.g = runnable;
            if (!this.b) {
                this.d = 2;
            } else {
                n();
                this.e.d(0.0f);
            }
        }

        @Override // defpackage.pwa, wva.f
        public final void l(wva wvaVar) {
            this.c = true;
        }

        @Override // t93.j
        public final void m(float f) {
            twa twaVar = this.h;
            long jMax = Math.max(-1L, Math.min(twaVar.R + 1, Math.round(f)));
            twaVar.F(jMax, this.a);
            this.a = jMax;
        }

        public final void n() {
            if (this.e != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.a;
            udb udbVar = this.f;
            int i = udbVar.c;
            float[] fArr = udbVar.b;
            long[] jArr = udbVar.a;
            char c = 20;
            int i2 = (i + 1) % 20;
            udbVar.c = i2;
            jArr[i2] = jCurrentAnimationTimeMillis;
            fArr[i2] = f;
            a54 a54Var = new a54();
            float fSqrt = 0.0f;
            a54Var.a = 0.0f;
            qy9 qy9Var = new qy9(a54Var);
            qy9Var.s = null;
            qy9Var.t = Float.MAX_VALUE;
            int i3 = 0;
            qy9Var.u = false;
            this.e = qy9Var;
            ry9 ry9Var = new ry9();
            ry9Var.a(1.0f);
            ry9Var.b(200.0f);
            qy9 qy9Var2 = this.e;
            qy9Var2.s = ry9Var;
            qy9Var2.b = this.a;
            qy9Var2.c = true;
            ArrayList<t93.j> arrayList = qy9Var2.l;
            if (qy9Var2.f) {
                ru3.f("Error: Update listeners must be added beforethe animation.");
                return;
            }
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            qy9 qy9Var3 = this.e;
            int i4 = udbVar.c;
            long j = Long.MIN_VALUE;
            if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
                long j2 = jArr[i4];
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i4];
                    if (j4 == j) {
                        break;
                    }
                    float f2 = j2 - j4;
                    float fAbs = Math.abs(j4 - j3);
                    if (f2 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    i4--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    j3 = j4;
                    j = Long.MIN_VALUE;
                }
                if (i3 >= 2) {
                    int i5 = udbVar.c;
                    float f3 = 1000.0f;
                    if (i3 == 2) {
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f4 = jArr[i5] - jArr[i6];
                        if (f4 != 0.0f) {
                            fSqrt = ((fArr[i5] - fArr[i6]) / f4) * 1000.0f;
                        }
                    } else {
                        int i7 = ((i5 - i3) + 21) % 20;
                        int i8 = (i5 + 21) % 20;
                        long j5 = jArr[i7];
                        float f5 = fArr[i7];
                        int i9 = i7 + 1;
                        int i10 = i9 % 20;
                        float f6 = 0.0f;
                        while (i10 != i8) {
                            long j6 = jArr[i10];
                            float f7 = fSqrt;
                            int i11 = i8;
                            float f8 = j6 - j5;
                            if (f8 != f7) {
                                float f9 = fArr[i10];
                                float f10 = (f9 - f5) / f8;
                                float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                                if (i10 == i9) {
                                    fAbs2 *= 0.5f;
                                }
                                f6 = fAbs2;
                                f5 = f9;
                                j5 = j6;
                            }
                            i10 = (i10 + 1) % 20;
                            fSqrt = f7;
                            i8 = i11;
                            c = c;
                            f3 = f3;
                        }
                        fSqrt = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)))) * f3;
                    }
                }
            }
            qy9Var3.a = fSqrt;
            qy9 qy9Var4 = this.e;
            qy9Var4.g = this.h.R + 1;
            qy9Var4.h = -1.0f;
            qy9Var4.j = 4.0f;
            t93.i iVar = new t93.i() { // from class: uva
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // t93.i
                public final void a(float f11) {
                    wva.e eVar = this.a;
                    twa twaVar = eVar.h;
                    wva.g gVar = wva.g.h;
                    if (f11 >= 1.0f) {
                        twaVar.y(twaVar, gVar, false);
                        return;
                    }
                    long j7 = twaVar.R;
                    wva wvaVarP = twaVar.P(0);
                    wva wvaVar = wvaVarP.M;
                    wvaVarP.M = null;
                    twaVar.F(-1L, eVar.a);
                    twaVar.F(j7, -1L);
                    eVar.a = j7;
                    Runnable runnable = eVar.g;
                    if (runnable != null) {
                        runnable.run();
                    }
                    twaVar.O.clear();
                    if (wvaVar != null) {
                        wvaVar.y(wvaVar, gVar, true);
                    }
                }
            };
            ArrayList<t93.i> arrayList2 = qy9Var4.k;
            if (arrayList2.contains(iVar)) {
                return;
            }
            arrayList2.add(iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface f {
        void a(wva wvaVar);

        void d();

        void e(wva wvaVar);

        default void g(wva wvaVar) {
            e(wvaVar);
        }

        default void j(wva wvaVar) {
            a(wvaVar);
        }

        void k();

        void l(wva wvaVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface g {
        public static final fh0 g = new fh0();
        public static final wa8 h = new wa8();
        public static final xa8 i = new xa8();
        public static final ro2 j = new ro2();
        public static final so2 k = new so2();

        void a(f fVar, wva wvaVar, boolean z);
    }

    public static void c(xwa xwaVar, View view, wwa wwaVar) {
        n30<View, wwa> n30Var = xwaVar.a;
        n30<String, View> n30Var2 = xwaVar.d;
        SparseArray<View> sparseArray = xwaVar.b;
        we6<View> we6Var = xwaVar.c;
        n30Var.put(view, wwaVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (n30Var2.containsKey(transitionName)) {
                n30Var2.put(transitionName, null);
            } else {
                n30Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (we6Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    we6Var.f(itemIdAtPosition, view);
                    return;
                }
                View viewB = we6Var.b(itemIdAtPosition);
                if (viewB != null) {
                    viewB.setHasTransientState(false);
                    we6Var.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static n30<Animator, b> r() {
        ThreadLocal<n30<Animator, b>> threadLocal = X;
        n30<Animator, b> n30Var = threadLocal.get();
        if (n30Var != null) {
            return n30Var;
        }
        n30<Animator, b> n30Var2 = new n30<>();
        threadLocal.set(n30Var2);
        return n30Var2;
    }

    public void A() {
        n30<Animator, b> n30VarR = r();
        this.R = 0L;
        int i = 0;
        while (true) {
            int size = this.O.size();
            ArrayList<Animator> arrayList = this.O;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = arrayList.get(i);
            b bVar = n30VarR.get(animator);
            if (animator != null && bVar != null) {
                Animator animator2 = bVar.f;
                long j = this.v;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.u;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.w;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.H.add(animator);
                this.R = Math.max(this.R, animator.getTotalDuration());
            }
            i++;
        }
    }

    public wva B(f fVar) {
        wva wvaVar;
        ArrayList<f> arrayList = this.N;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (wvaVar = this.M) != null) {
                wvaVar.B(fVar);
            }
            if (this.N.size() == 0) {
                this.N = null;
            }
        }
        return this;
    }

    public void C(View view) {
        this.y.remove(view);
    }

    public void D(View view) {
        if (this.K) {
            if (!this.L) {
                ArrayList<Animator> arrayList = this.H;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.I);
                this.I = U;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.I = animatorArr;
                y(this, g.k, false);
            }
            this.K = false;
        }
    }

    public void E() {
        M();
        n30<Animator, b> n30VarR = r();
        ArrayList<Animator> arrayList = this.O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = arrayList.get(i);
            i++;
            Animator animator2 = animator;
            if (n30VarR.containsKey(animator2)) {
                M();
                if (animator2 != null) {
                    animator2.addListener(new rva(this, n30VarR));
                    long j = this.v;
                    if (j >= 0) {
                        animator2.setDuration(j);
                    }
                    long j2 = this.u;
                    if (j2 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.w;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    animator2.addListener(new sva(this));
                    animator2.start();
                }
            }
        }
        this.O.clear();
        n();
    }

    public void F(long j, long j2) {
        long j3 = this.R;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.L = false;
            y(this, g.g, z);
        }
        ArrayList<Animator> arrayList = this.H;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.I);
        this.I = U;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            d.a(animator, Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.I = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.L = true;
        }
        y(this, g.h, z);
    }

    public void G(long j) {
        this.v = j;
    }

    public void H(c cVar) {
        this.P = cVar;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.w = timeInterpolator;
    }

    public void J(ln4 ln4Var) {
        if (ln4Var == null) {
            this.Q = W;
        } else {
            this.Q = ln4Var;
        }
    }

    public void L(long j) {
        this.u = j;
    }

    public final void M() {
        if (this.J == 0) {
            y(this, g.g, false);
            this.L = false;
        }
        this.J++;
    }

    public String N(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.v != -1) {
            sb.append("dur(");
            sb.append(this.v);
            sb.append(") ");
        }
        if (this.u != -1) {
            sb.append("dly(");
            sb.append(this.u);
            sb.append(") ");
        }
        if (this.w != null) {
            sb.append("interp(");
            sb.append(this.w);
            sb.append(") ");
        }
        ArrayList<Integer> arrayList = this.x;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(f fVar) {
        if (this.N == null) {
            this.N = new ArrayList<>();
        }
        this.N.add(fVar);
    }

    public void b(View view) {
        this.y.add(view);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.H;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.I);
        this.I = U;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.I = animatorArr;
        y(this, g.i, false);
    }

    public abstract void d(wwa wwaVar);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList<Class<?>> arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (this.z.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            wwa wwaVar = new wwa(view);
            if (z) {
                g(wwaVar);
            } else {
                d(wwaVar);
            }
            wwaVar.c.add(this);
            f(wwaVar);
            if (z) {
                c(this.A, view, wwaVar);
            } else {
                c(this.B, view, wwaVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z);
            }
        }
    }

    public abstract void g(wwa wwaVar);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList<Integer> arrayList = this.x;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.y;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                wwa wwaVar = new wwa(viewFindViewById);
                if (z) {
                    g(wwaVar);
                } else {
                    d(wwaVar);
                }
                wwaVar.c.add(this);
                f(wwaVar);
                if (z) {
                    c(this.A, viewFindViewById, wwaVar);
                } else {
                    c(this.B, viewFindViewById, wwaVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            wwa wwaVar2 = new wwa(view);
            if (z) {
                g(wwaVar2);
            } else {
                d(wwaVar2);
            }
            wwaVar2.c.add(this);
            f(wwaVar2);
            if (z) {
                c(this.A, view, wwaVar2);
            } else {
                c(this.B, view, wwaVar2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            this.A.a.clear();
            this.A.b.clear();
            this.A.c.a();
        } else {
            this.B.a.clear();
            this.B.b.clear();
            this.B.c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public wva clone() {
        try {
            wva wvaVar = (wva) super.clone();
            wvaVar.O = new ArrayList<>();
            wvaVar.A = new xwa();
            wvaVar.B = new xwa();
            wvaVar.E = null;
            wvaVar.F = null;
            wvaVar.S = null;
            wvaVar.M = this;
            wvaVar.N = null;
            return wvaVar;
        } catch (CloneNotSupportedException e2) {
            d55.a(e2);
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, wwa wwaVar, wwa wwaVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, xwa xwaVar, xwa xwaVar2, ArrayList<wwa> arrayList, ArrayList<wwa> arrayList2) {
        int i;
        boolean z;
        View view;
        wwa wwaVar;
        Animator animator;
        Animator animator2;
        Animator animator3;
        wwa wwaVar2;
        n30<Animator, b> n30VarR = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = q().S != null;
        int i2 = 0;
        while (i2 < size) {
            wwa wwaVar3 = arrayList.get(i2);
            wwa wwaVar4 = arrayList2.get(i2);
            if (wwaVar3 != null && !wwaVar3.c.contains(this)) {
                wwaVar3 = null;
            }
            if (wwaVar4 != null && !wwaVar4.c.contains(this)) {
                wwaVar4 = null;
            }
            if ((wwaVar3 != null || wwaVar4 != null) && (wwaVar3 == null || wwaVar4 == null || w(wwaVar3, wwaVar4))) {
                Animator animatorL = l(viewGroup, wwaVar3, wwaVar4);
                if (animatorL != null) {
                    String str = this.t;
                    if (wwaVar4 != null) {
                        view = wwaVar4.b;
                        String[] strArrS = s();
                        if (strArrS != null && strArrS.length > 0) {
                            wwaVar2 = new wwa(view);
                            wwa wwaVar5 = xwaVar2.a.get(view);
                            i = size;
                            z = z2;
                            if (wwaVar5 != null) {
                                for (String str2 : strArrS) {
                                    wwaVar2.a.put(str2, wwaVar5.a.get(str2));
                                }
                            }
                            int i3 = n30VarR.v;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    animator3 = animatorL;
                                    break;
                                }
                                b bVar = n30VarR.get(n30VarR.f(i4));
                                if (bVar.c != null && bVar.a == view && bVar.b.equals(str) && bVar.c.equals(wwaVar2)) {
                                    animator3 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i = size;
                            z = z2;
                            animator3 = animatorL;
                            wwaVar2 = null;
                        }
                        animator = animator3;
                        wwaVar = wwaVar2;
                    } else {
                        i = size;
                        z = z2;
                        view = wwaVar3.b;
                        wwaVar = null;
                    }
                    if (animator != null) {
                        animator = animatorL;
                        WindowId windowId = viewGroup.getWindowId();
                        b bVar2 = new b();
                        bVar2.a = view;
                        bVar2.b = str;
                        bVar2.c = wwaVar;
                        bVar2.d = windowId;
                        bVar2.e = this;
                        bVar2.f = animator;
                        if (z) {
                            animator2 = animator;
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            animator2 = animatorSet;
                        }
                        animator2 = animator;
                        n30VarR.put(animator2, bVar2);
                        this.O.add(animator2);
                    } else {
                        animator = animatorL;
                    }
                }
                i2++;
                size = i;
                z2 = z;
            }
            i = size;
            z = z2;
            i2++;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                b bVar3 = n30VarR.get(this.O.get(sparseIntArray.keyAt(i5)));
                bVar3.f.setStartDelay(bVar3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i = this.J - 1;
        this.J = i;
        if (i == 0) {
            y(this, g.h, false);
            for (int i2 = 0; i2 < this.A.c.h(); i2++) {
                View viewI = this.A.c.i(i2);
                if (viewI != null) {
                    viewI.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.B.c.h(); i3++) {
                View viewI2 = this.B.c.i(i3);
                if (viewI2 != null) {
                    viewI2.setHasTransientState(false);
                }
            }
            this.L = true;
        }
    }

    public void o() {
        ArrayList<Class<?>> arrayList = this.z;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.z = arrayList;
    }

    public final wwa p(View view, boolean z) {
        twa twaVar = this.C;
        if (twaVar != null) {
            return twaVar.p(view, z);
        }
        ArrayList<wwa> arrayList = z ? this.E : this.F;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            wwa wwaVar = arrayList.get(i);
            if (wwaVar == null) {
                return null;
            }
            if (wwaVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.F : this.E).get(i);
        }
        return null;
    }

    public final wva q() {
        twa twaVar = this.C;
        return twaVar != null ? twaVar.q() : this;
    }

    public String[] s() {
        return null;
    }

    public final wwa t(View view, boolean z) {
        twa twaVar = this.C;
        if (twaVar != null) {
            return twaVar.t(view, z);
        }
        return (z ? this.A : this.B).a.get(view);
    }

    public final String toString() {
        return N(BuildConfig.FLAVOR);
    }

    public boolean u() {
        return !this.H.isEmpty();
    }

    public boolean v() {
        return this instanceof h81;
    }

    public boolean w(wwa wwaVar, wwa wwaVar2) {
        if (wwaVar != null) {
            HashMap map = wwaVar.a;
            if (wwaVar2 != null) {
                HashMap map2 = wwaVar2.a;
                String[] strArrS = s();
                if (strArrS != null) {
                    for (String str : strArrS) {
                        Object obj = map.get(str);
                        Object obj2 = map2.get(str);
                        if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                            return true;
                        }
                    }
                } else {
                    for (String str2 : map.keySet()) {
                        Object obj3 = map.get(str2);
                        Object obj4 = map2.get(str2);
                        if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList<Class<?>> arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (this.z.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList<Integer> arrayList2 = this.x;
        int size2 = arrayList2.size();
        ArrayList<View> arrayList3 = this.y;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void y(wva wvaVar, g gVar, boolean z) {
        wva wvaVar2 = this.M;
        if (wvaVar2 != null) {
            wvaVar2.y(wvaVar, gVar, z);
        }
        ArrayList<f> arrayList = this.N;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.N.size();
        f[] fVarArr = this.G;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.G = null;
        f[] fVarArr2 = (f[]) this.N.toArray(fVarArr);
        for (int i = 0; i < size; i++) {
            gVar.a(fVarArr2[i], wvaVar, z);
            fVarArr2[i] = null;
        }
        this.G = fVarArr2;
    }

    public void z(View view) {
        if (this.L) {
            return;
        }
        ArrayList<Animator> arrayList = this.H;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.I);
        this.I = U;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.I = animatorArr;
        y(this, g.j, false);
        this.K = true;
    }

    public void K() {
    }

    public void f(wwa wwaVar) {
    }
}
