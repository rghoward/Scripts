package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.aa0;
import defpackage.da3;
import defpackage.egb;
import defpackage.ep9;
import defpackage.f04;
import defpackage.fib;
import defpackage.gh6;
import defpackage.j4;
import defpackage.l97;
import defpackage.m3;
import defpackage.m97;
import defpackage.mh8;
import defpackage.ngb;
import defpackage.p03;
import defpackage.p51;
import defpackage.pi1;
import defpackage.q03;
import defpackage.ru3;
import defpackage.sa1;
import defpackage.sp2;
import defpackage.t43;
import defpackage.tn2;
import defpackage.u43;
import defpackage.u58;
import defpackage.uy5;
import defpackage.vr0;
import defpackage.we6;
import defpackage.ws0;
import defpackage.wx5;
import defpackage.yra;
import defpackage.z90;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements l97 {
    public static boolean W0 = false;
    public static boolean X0 = false;
    public static final int[] Y0 = {R.attr.nestedScrollingEnabled};
    public static final float Z0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a1 = true;
    public static final boolean b1 = true;
    public static final Class<?>[] c1;
    public static final c d1;
    public static final b0 e1;
    public boolean A;
    public final androidx.recyclerview.widget.o.b A0;
    public final a B;
    public final a0 B0;
    public final Rect C;
    public t C0;
    public final Rect D;
    public ArrayList D0;
    public final RectF E;
    public boolean E0;
    public f F;
    public boolean F0;
    public o G;
    public final m G0;
    public w H;
    public boolean H0;
    public final ArrayList I;
    public androidx.recyclerview.widget.d0 I0;
    public final ArrayList<n> J;
    public final int[] J0;
    public final ArrayList<s> K;
    public m97 K0;
    public s L;
    public final int[] L0;
    public boolean M;
    public final int[] M0;
    public boolean N;
    public final int[] N0;
    public boolean O;
    public final ArrayList O0;
    public int P;
    public final b P0;
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public int S0;
    public int T;
    public final boolean T0;
    public boolean U;
    public final d U0;
    public final AccessibilityManager V;
    public final p03 V0;
    public ArrayList W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public k e0;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public EdgeEffect h0;
    public EdgeEffect i0;
    public l j0;
    public int k0;
    public int l0;
    public VelocityTracker m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public r s0;
    public final float t;
    public final int t0;
    public final x u;
    public final int u0;
    public final v v;
    public final float v0;
    public y w;
    public final float w0;
    public final androidx.recyclerview.widget.a x;
    public boolean x0;
    public final androidx.recyclerview.widget.f y;
    public final d0 y0;
    public final j0 z;
    public androidx.recyclerview.widget.o z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.O || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.M) {
                recyclerView.requestLayout();
            } else if (recyclerView.R) {
                recyclerView.Q = true;
            } else {
                recyclerView.o();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a0 {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            f04.b("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return pi1.a(sb, this.k, '}');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            l lVar = recyclerView.j0;
            if (lVar != null) {
                lVar.l();
            }
            recyclerView.H0 = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b0 extends k {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c0 {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d {
        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d0 implements Runnable {
        public int t;
        public int u;
        public OverScroller v;
        public Interpolator w;
        public boolean x;
        public boolean y;

        public d0() {
            c cVar = RecyclerView.d1;
            this.w = cVar;
            this.x = false;
            this.y = false;
            this.v = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.u = 0;
            this.t = 0;
            Interpolator interpolator = this.w;
            c cVar = RecyclerView.d1;
            if (interpolator != cVar) {
                this.w = cVar;
                this.v = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.v.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.x) {
                this.y = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, fib> weakHashMap = egb.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, int i3, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.d1;
            }
            if (this.w != interpolator) {
                this.w = interpolator;
                this.v = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.u = 0;
            this.t = 0;
            recyclerView.setScrollState(2);
            this.v.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.N0;
            if (recyclerView.G == null) {
                recyclerView.removeCallbacks(this);
                this.v.abortAnimation();
                return;
            }
            this.y = false;
            this.x = true;
            recyclerView.o();
            OverScroller overScroller = this.v;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.t;
                int i7 = currY - this.u;
                this.t = currX;
                this.u = currY;
                int iN = RecyclerView.n(i6, recyclerView.f0, recyclerView.h0, recyclerView.getWidth());
                int iN2 = RecyclerView.n(i7, recyclerView.g0, recyclerView.i0, recyclerView.getHeight());
                int[] iArr2 = recyclerView.N0;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.u(iN, iN2, 1, iArr2, null)) {
                    iN -= iArr[0];
                    iN2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m(iN, iN2);
                }
                if (recyclerView.F != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.i0(iN, iN2, iArr);
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    int i10 = iN - i8;
                    int i11 = iN2 - i9;
                    z zVar = recyclerView.G.e;
                    if (zVar != null && !zVar.d && zVar.e) {
                        int iB = recyclerView.B0.b();
                        if (iB == 0) {
                            zVar.f();
                        } else if (zVar.a >= iB) {
                            zVar.a = iB - 1;
                            zVar.b(i8, i9);
                        } else {
                            zVar.b(i8, i9);
                        }
                    }
                    i = i10;
                    i3 = i8;
                    i2 = i11;
                    i4 = i9;
                } else {
                    i = iN;
                    i2 = iN2;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.J.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.N0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.v(i3, i4, i, i2, null, 1, iArr3);
                int i12 = i - iArr[0];
                int i13 = i2 - iArr[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.w(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                z zVar2 = recyclerView.G.e;
                if ((zVar2 == null || !zVar2.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.y();
                            if (recyclerView.f0.isFinished()) {
                                recyclerView.f0.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.z();
                            if (recyclerView.h0.isFinished()) {
                                recyclerView.h0.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.A();
                            if (recyclerView.g0.isFinished()) {
                                recyclerView.g0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.x();
                            if (recyclerView.i0.isFinished()) {
                                recyclerView.i0.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.b1) {
                        androidx.recyclerview.widget.o.b bVar = recyclerView.A0;
                        int[] iArr4 = bVar.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.o oVar = recyclerView.z0;
                    if (oVar != null) {
                        oVar.a(recyclerView, i3, i4);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    i.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            z zVar3 = recyclerView.G.e;
            if (zVar3 != null && zVar3.d) {
                zVar3.b(0, 0);
            }
            this.x = false;
            if (!this.y) {
                recyclerView.setScrollState(0);
                recyclerView.q0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, fib> weakHashMap = egb.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements q03 {
        public e() {
        }

        @Override // defpackage.q03
        public final boolean a(float f) {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.G.f()) {
                i2 = (int) f;
                i = 0;
            } else if (recyclerView.G.e()) {
                i = (int) f;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            recyclerView.r0();
            return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
        }

        @Override // defpackage.q03
        public final float b() {
            float f;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.G.f()) {
                f = recyclerView.w0;
            } else {
                if (!recyclerView.G.e()) {
                    return 0.0f;
                }
                f = recyclerView.v0;
            }
            return -f;
        }

        @Override // defpackage.q03
        public final void c() {
            RecyclerView.this.r0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e0 {
        public static final List<Object> t = Collections.EMPTY_LIST;
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public f<? extends e0> s;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public e0 h = null;
        public e0 i = null;
        public final ArrayList k = null;
        public final List<Object> l = null;
        public int m = 0;
        public v n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public e0(View view) {
            if (view != null) {
                this.a = view;
            } else {
                z90.a("itemView may not be null");
                throw null;
            }
        }

        public final void a(int i) {
            this.j = i | this.j;
        }

        public final int b() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.K(this);
        }

        public final int c() {
            RecyclerView recyclerView;
            f<? extends e0> adapter;
            int iK;
            if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (iK = this.r.K(this)) == -1 || this.s != adapter) {
                return -1;
            }
            return iK;
        }

        public final int d() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final List<Object> e() {
            ArrayList arrayList;
            return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
        }

        public final boolean f() {
            View view = this.a;
            return (view.getParent() == null || view.getParent() == this.r) ? false : true;
        }

        public final boolean g() {
            return (this.j & 1) != 0;
        }

        public final boolean h() {
            return (this.j & 4) != 0;
        }

        public final boolean i() {
            if ((this.j & 16) != 0) {
                return false;
            }
            WeakHashMap<View, fib> weakHashMap = egb.a;
            return !this.a.hasTransientState();
        }

        public final boolean j() {
            return (this.j & 8) != 0;
        }

        public final boolean k() {
            return this.n != null;
        }

        public final boolean l() {
            return (this.j & 256) != 0;
        }

        public final boolean m() {
            return (this.j & 2) != 0;
        }

        public final void n(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            View view = this.a;
            if (view.getLayoutParams() != null) {
                ((p) view.getLayoutParams()).c = true;
            }
        }

        public final void o() {
            if (RecyclerView.W0 && l()) {
                sp2.b(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
                return;
            }
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            ArrayList arrayList = this.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.k(this);
        }

        public final void p(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                if (RecyclerView.W0) {
                    gh6.a(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                } else {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public final boolean q() {
            return (this.j & 128) != 0;
        }

        public final boolean r() {
            return (this.j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sbB = tn2.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbB.append(Integer.toHexString(hashCode()));
            sbB.append(" position=");
            sbB.append(this.c);
            sbB.append(" id=");
            sbB.append(this.e);
            sbB.append(", oldPos=");
            sbB.append(this.d);
            sbB.append(", pLpos:");
            sbB.append(this.g);
            StringBuilder sb = new StringBuilder(sbB.toString());
            if (k()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (h()) {
                sb.append(" invalid");
            }
            if (!g()) {
                sb.append(" unbound");
            }
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (j()) {
                sb.append(" removed");
            }
            if (q()) {
                sb.append(" ignored");
            }
            if (l()) {
                sb.append(" tmpDetached");
            }
            if (!i()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if ((this.j & 512) != 0 || h()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends Observable<h> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public final void d(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).c(i, i2);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i {
        public static void a(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface j {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class k {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class l {
        public m a = null;
        public final ArrayList<a> b = new ArrayList<>();
        public final long c = 120;
        public final long d = 120;
        public final long e = 250;
        public final long f = 250;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface a {
            void a();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class b {
            public int a;
            public int b;

            public final void a(e0 e0Var) {
                View view = e0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(e0 e0Var) {
            int i = e0Var.j;
            if (!e0Var.h() && (i & 4) == 0) {
                e0Var.b();
            }
        }

        public abstract boolean a(e0 e0Var, b bVar, b bVar2);

        public abstract boolean b(e0 e0Var, e0 e0Var2, b bVar, b bVar2);

        public abstract boolean c(e0 e0Var, b bVar, b bVar2);

        public abstract boolean d(e0 e0Var, b bVar, b bVar2);

        public abstract boolean f(e0 e0Var);

        public boolean g(e0 e0Var, List<Object> list) {
            return f(e0Var);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0068  */
        /* JADX WARN: Code duplicated, block: B:35:0x0076  */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x0076, please report this as an issue */
        public final void h(e0 e0Var) {
            m mVar = this.a;
            if (mVar != null) {
                RecyclerView recyclerView = RecyclerView.this;
                boolean z = true;
                e0Var.p(true);
                View view = e0Var.a;
                if (e0Var.h != null && e0Var.i == null) {
                    e0Var.h = null;
                }
                e0Var.i = null;
                if ((e0Var.j & 16) != 0) {
                    return;
                }
                v vVar = recyclerView.v;
                recyclerView.n0();
                androidx.recyclerview.widget.f fVar = recyclerView.y;
                androidx.recyclerview.widget.f.a aVar = fVar.b;
                androidx.recyclerview.widget.b0 b0Var = fVar.a;
                int i = fVar.d;
                if (i != 1) {
                    if (i == 2) {
                        aa0.c("Cannot call removeViewIfHidden within removeViewIfHidden");
                        return;
                    }
                    try {
                        fVar.d = 2;
                        int iIndexOfChild = b0Var.a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            fVar.j(view);
                        } else if (aVar.d(iIndexOfChild)) {
                            aVar.f(iIndexOfChild);
                            fVar.j(view);
                            b0Var.a(iIndexOfChild);
                        } else {
                            fVar.d = 0;
                        }
                        fVar.d = 0;
                        if (z) {
                            e0 e0VarO = RecyclerView.O(view);
                            vVar.m(e0VarO);
                            vVar.j(e0VarO);
                            if (RecyclerView.X0) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.p0(!z);
                        if (z && e0Var.l()) {
                            recyclerView.removeDetachedView(view, false);
                            return;
                        }
                    } catch (Throwable th) {
                        fVar.d = 0;
                        throw th;
                    }
                }
                if (fVar.e != view) {
                    aa0.c("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    return;
                }
                z = false;
                if (z) {
                    e0 e0VarO2 = RecyclerView.O(view);
                    vVar.m(e0VarO2);
                    vVar.j(e0VarO2);
                    if (RecyclerView.X0) {
                        Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                    }
                }
                recyclerView.p0(!z);
                if (z) {
                }
            }
        }

        public abstract void i(e0 e0Var);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class m {
        public m() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface q {
        void b(View view);

        void c(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class r {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface s {
        void a(MotionEvent motionEvent);

        boolean d(MotionEvent motionEvent);

        void e(boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class u {
        public final SparseArray<a> a = new SparseArray<>();
        public int b = 0;
        public final Set<f<?>> c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a {
            public final ArrayList<e0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class v {
        public final ArrayList<e0> a;
        public ArrayList<e0> b;
        public final ArrayList<e0> c;
        public final List<e0> d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(e0 e0Var, boolean z) {
            RecyclerView.k(e0Var);
            View view = e0Var.a;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.d0 d0Var = recyclerView.I0;
            if (d0Var != null) {
                androidx.recyclerview.widget.d0.a aVar = d0Var.u;
                egb.o(view, aVar != null ? (m3) aVar.u.remove(view) : null);
            }
            if (z) {
                w wVar = recyclerView.H;
                ArrayList arrayList = recyclerView.I;
                if (wVar != null) {
                    wVar.a();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((w) arrayList.get(i)).a();
                }
                f fVar = recyclerView.F;
                if (fVar != null) {
                    fVar.q(e0Var);
                }
                if (recyclerView.B0 != null) {
                    recyclerView.z.d(e0Var);
                }
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + e0Var);
                }
            }
            e0Var.s = null;
            e0Var.r = null;
            u uVarC = c();
            uVarC.getClass();
            int i2 = e0Var.f;
            ArrayList<e0> arrayList2 = uVarC.a(i2).a;
            if (uVarC.a.get(i2).b <= arrayList2.size()) {
                uy5.b(view);
            } else if (RecyclerView.W0 && arrayList2.contains(e0Var)) {
                z90.a("this scrap item already exists");
            } else {
                e0Var.o();
                arrayList2.add(e0Var);
            }
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            a0 a0Var = recyclerView.B0;
            if (i >= 0 && i < a0Var.b()) {
                return !a0Var.g ? i : recyclerView.x.f(i, 0);
            }
            StringBuilder sbB = t43.b(i, "invalid position ", ". State item count is ");
            sbB.append(a0Var.b());
            sbB.append(recyclerView.B());
            throw new IndexOutOfBoundsException(sbB.toString());
        }

        public final u c() {
            if (this.g == null) {
                this.g = new u();
                e();
            }
            return this.g;
        }

        public final View d(int i) {
            return l(i, Long.MAX_VALUE).a;
        }

        public final void e() {
            RecyclerView recyclerView;
            f<?> fVar;
            u uVar = this.g;
            if (uVar == null || (fVar = (recyclerView = RecyclerView.this).F) == null || !recyclerView.M) {
                return;
            }
            uVar.c.add(fVar);
        }

        public final void f(f<?> fVar, boolean z) {
            u uVar = this.g;
            if (uVar != null) {
                SparseArray<u.a> sparseArray = uVar.a;
                Set<f<?>> set = uVar.c;
                set.remove(fVar);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList<e0> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        uy5.b(arrayList.get(i2).a);
                    }
                }
            }
        }

        public final void g() {
            ArrayList<e0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h(size);
            }
            arrayList.clear();
            if (RecyclerView.b1) {
                androidx.recyclerview.widget.o.b bVar = RecyclerView.this.A0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void h(int i) {
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i);
            }
            ArrayList<e0> arrayList = this.c;
            e0 e0Var = arrayList.get(i);
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + e0Var);
            }
            a(e0Var, true);
            arrayList.remove(i);
        }

        public final void i(View view) {
            e0 e0VarO = RecyclerView.O(view);
            boolean zL = e0VarO.l();
            RecyclerView recyclerView = RecyclerView.this;
            if (zL) {
                recyclerView.removeDetachedView(view, false);
            }
            if (e0VarO.k()) {
                e0VarO.n.m(e0VarO);
            } else if (e0VarO.r()) {
                e0VarO.j &= -33;
            }
            j(e0VarO);
            if (recyclerView.j0 == null || e0VarO.i()) {
                return;
            }
            recyclerView.j0.i(e0VarO);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[LOOP:2: B:64:0x00cc->B:68:0x00d7, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:93:0x00da A[EDGE_INSN: B:93:0x00da->B:69:0x00da BREAK  A[LOOP:1: B:60:0x00b9->B:67:0x00d4, LOOP_LABEL: LOOP:1: B:60:0x00b9->B:67:0x00d4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00da A[EDGE_INSN: B:95:0x00da->B:69:0x00da BREAK  A[LOOP:1: B:60:0x00b9->B:67:0x00d4], SYNTHETIC] */
        public final void j(e0 e0Var) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.o.b bVar = recyclerView.A0;
            boolean zK = e0Var.k();
            View view = e0Var.a;
            boolean z3 = false;
            boolean z4 = true;
            if (zK || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.k());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(recyclerView.B());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e0Var.l()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(e0Var);
                sa1.a(sb2, recyclerView.B());
                return;
            }
            if (e0Var.q()) {
                z90.a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.B()));
                return;
            }
            if ((e0Var.j & 16) == 0) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                if (view.hasTransientState()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            f fVar = recyclerView.F;
            boolean z5 = fVar != null && z && fVar.n(e0Var);
            boolean z6 = RecyclerView.W0;
            ArrayList<e0> arrayList = this.c;
            if (z6 && arrayList.contains(e0Var)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(e0Var);
                sa1.a(sb3, recyclerView.B());
                return;
            }
            if (z5 || e0Var.i()) {
                if (this.f <= 0 || (e0Var.j & 526) != 0) {
                    z2 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f && size > 0) {
                        h(0);
                        size--;
                    }
                    if (RecyclerView.b1 && size > 0) {
                        int i5 = e0Var.c;
                        if (bVar.c != null) {
                            int i6 = bVar.d * 2;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    i = size - 1;
                                    loop1: while (i >= 0) {
                                        i2 = arrayList.get(i).c;
                                        if (bVar.c != null) {
                                            break;
                                        }
                                        i3 = bVar.d * 2;
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < i3) {
                                                break loop1;
                                            } else if (bVar.c[i4] == i2) {
                                                break;
                                            } else {
                                                i4 += 2;
                                            }
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                } else if (bVar.c[i7] != i5) {
                                    i7 += 2;
                                }
                            }
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                                i2 = arrayList.get(i).c;
                                if (bVar.c != null) {
                                    break;
                                    break;
                                }
                                i3 = bVar.d * 2;
                                i4 = 0;
                                while (true) {
                                    if (i4 < i3) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.c[i4] == i2) {
                                        break;
                                    } else {
                                        i4 += 2;
                                    }
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, e0Var);
                    z2 = true;
                }
                if (z2) {
                    z4 = false;
                } else {
                    a(e0Var, true);
                }
                z3 = z2;
            } else {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.B()));
                }
                z4 = false;
            }
            recyclerView.z.d(e0Var);
            if (z3 || z4 || !z) {
                return;
            }
            uy5.b(view);
            e0Var.s = null;
            e0Var.r = null;
        }

        public final void k(View view) {
            l lVar;
            e0 e0VarO = RecyclerView.O(view);
            int i = e0VarO.j & 12;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 0 && e0VarO.m() && (lVar = recyclerView.j0) != null && !lVar.g(e0VarO, e0VarO.e())) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                e0VarO.n = this;
                e0VarO.o = true;
                this.b.add(e0VarO);
                return;
            }
            if (e0VarO.h() && !e0VarO.j() && !recyclerView.F.b) {
                z90.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
                return;
            }
            e0VarO.n = this;
            e0VarO.o = false;
            this.a.add(e0VarO);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:112:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:120:0x01de  */
        /* JADX WARN: Code duplicated, block: B:127:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:129:0x0200  */
        /* JADX WARN: Code duplicated, block: B:130:0x020b  */
        /* JADX WARN: Code duplicated, block: B:132:0x0211  */
        /* JADX WARN: Code duplicated, block: B:134:0x021c  */
        /* JADX WARN: Code duplicated, block: B:137:0x023a  */
        /* JADX WARN: Code duplicated, block: B:140:0x0245  */
        /* JADX WARN: Code duplicated, block: B:142:0x024d  */
        /* JADX WARN: Code duplicated, block: B:144:0x0257  */
        /* JADX WARN: Code duplicated, block: B:146:0x0265  */
        /* JADX WARN: Code duplicated, block: B:148:0x0271  */
        /* JADX WARN: Code duplicated, block: B:161:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:165:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:176:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:178:0x0300  */
        /* JADX WARN: Code duplicated, block: B:180:0x0304  */
        /* JADX WARN: Code duplicated, block: B:183:0x0328  */
        /* JADX WARN: Code duplicated, block: B:185:0x0330  */
        /* JADX WARN: Code duplicated, block: B:187:0x0338  */
        /* JADX WARN: Code duplicated, block: B:190:0x034b A[LOOP:4: B:186:0x0336->B:190:0x034b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:191:0x034e A[EDGE_INSN: B:191:0x034e->B:192:0x034f BREAK  A[LOOP:4: B:186:0x0336->B:190:0x034b]] */
        /* JADX WARN: Code duplicated, block: B:193:0x0351  */
        /* JADX WARN: Code duplicated, block: B:196:0x0359  */
        /* JADX WARN: Code duplicated, block: B:198:0x0361  */
        /* JADX WARN: Code duplicated, block: B:213:0x03a1  */
        /* JADX WARN: Code duplicated, block: B:216:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:219:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:226:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:228:0x03f0  */
        /* JADX WARN: Code duplicated, block: B:234:0x0413  */
        /* JADX WARN: Code duplicated, block: B:236:0x0419  */
        /* JADX WARN: Code duplicated, block: B:245:0x0432  */
        /* JADX WARN: Code duplicated, block: B:252:0x0462  */
        /* JADX WARN: Code duplicated, block: B:254:0x046e  */
        /* JADX WARN: Code duplicated, block: B:258:0x0479  */
        /* JADX WARN: Code duplicated, block: B:260:0x047f  */
        /* JADX WARN: Code duplicated, block: B:261:0x048d  */
        /* JADX WARN: Code duplicated, block: B:264:0x0497  */
        /* JADX WARN: Code duplicated, block: B:265:0x049a  */
        /* JADX WARN: Code duplicated, block: B:267:0x049d  */
        /* JADX WARN: Code duplicated, block: B:269:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:272:0x04b7  */
        /* JADX WARN: Code duplicated, block: B:275:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:277:0x04d6  */
        /* JADX WARN: Code duplicated, block: B:284:0x0513  */
        /* JADX WARN: Code duplicated, block: B:291:0x052d  */
        /* JADX WARN: Code duplicated, block: B:293:0x0531  */
        /* JADX WARN: Code duplicated, block: B:296:0x0542  */
        /* JADX WARN: Code duplicated, block: B:299:0x054d  */
        /* JADX WARN: Code duplicated, block: B:303:0x0564  */
        /* JADX WARN: Code duplicated, block: B:306:0x0571  */
        /* JADX WARN: Code duplicated, block: B:327:0x05af  */
        /* JADX WARN: Code duplicated, block: B:330:0x05b4  */
        /* JADX WARN: Code duplicated, block: B:335:0x05bf  */
        /* JADX WARN: Code duplicated, block: B:336:0x05c9  */
        /* JADX WARN: Code duplicated, block: B:338:0x05cf  */
        /* JADX WARN: Code duplicated, block: B:339:0x05d9  */
        /* JADX WARN: Code duplicated, block: B:342:0x05df A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:344:0x05e3  */
        /* JADX WARN: Code duplicated, block: B:355:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
        /* JADX WARN: Code duplicated, block: B:360:0x02ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:364:0x02f3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:368:0x034e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:369:0x0344 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:370:0x00ec A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:375:0x019f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x008b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0092  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:70:0x0103  */
        /* JADX WARN: Code duplicated, block: B:72:0x0109  */
        /* JADX WARN: Code duplicated, block: B:77:0x0125  */
        /* JADX WARN: Code duplicated, block: B:80:0x012e A[EDGE_INSN: B:80:0x012e->B:101:0x01a0 BREAK  A[LOOP:1: B:43:0x0090->B:55:0x00bc]] */
        /* JADX WARN: Code duplicated, block: B:81:0x013d  */
        /* JADX WARN: Code duplicated, block: B:83:0x014f  */
        /* JADX WARN: Code duplicated, block: B:85:0x0155  */
        /* JADX WARN: Code duplicated, block: B:87:0x015b  */
        /* JADX WARN: Code duplicated, block: B:89:0x0162  */
        /* JADX WARN: Instruction removed from duplicated block: B:180:0x0304, please report this as an issue */
        public final e0 l(int i, long j) {
            e0 e0VarE;
            boolean z;
            ArrayList<e0> arrayList;
            ArrayList<e0> arrayList2;
            boolean z2;
            long j2;
            long j3;
            View view;
            boolean z3;
            int iF;
            int i2;
            long nanoTime;
            boolean z4;
            f<? extends e0> fVar;
            boolean z5;
            long nanoTime2;
            long j4;
            AccessibilityManager accessibilityManager;
            boolean z6;
            boolean z7;
            m3 m3Var;
            ArrayList arrayList3;
            ViewGroup.LayoutParams layoutParams;
            boolean z8;
            long j5;
            ViewGroup.LayoutParams layoutParams2;
            p pVar;
            boolean z9;
            int i3;
            int iF2;
            int iH;
            f fVar2;
            long nanoTime3;
            long j6;
            RecyclerView recyclerViewG;
            long j7;
            u.a aVar;
            e0 e0VarRemove;
            ArrayList<e0> arrayList4;
            int size;
            long jG;
            int size2;
            int size3;
            e0 e0Var;
            ArrayList<e0> arrayList5;
            long j8;
            ArrayList<e0> arrayList6;
            int size4;
            int i4;
            ArrayList arrayList7;
            int size5;
            int i5;
            View view2;
            int size6;
            int i6;
            e0 e0Var2;
            e0 e0VarO;
            androidx.recyclerview.widget.f fVar3;
            androidx.recyclerview.widget.f.a aVar2;
            int iIndexOfChild;
            androidx.recyclerview.widget.f.a aVar3;
            int iIndexOfChild2;
            int iB;
            e0 e0VarO2;
            int i7;
            boolean z10;
            e0 e0Var3;
            int size7;
            int iF3;
            RecyclerView recyclerView = RecyclerView.this;
            a0 a0Var = recyclerView.B0;
            if (i < 0 || i >= a0Var.b()) {
                StringBuilder sbB = u43.b("Invalid item position ", "(", "). Item count:", i, i);
                sbB.append(a0Var.b());
                sbB.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbB.toString());
            }
            if (a0Var.g) {
                ArrayList<e0> arrayList8 = this.b;
                if (arrayList8 != null && (size7 = arrayList8.size()) != 0) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            if (recyclerView.F.b && (iF3 = recyclerView.x.f(i, 0)) > 0 && iF3 < recyclerView.F.f()) {
                                long jG2 = recyclerView.F.g(iF3);
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size7) {
                                        e0VarE = null;
                                        break;
                                    }
                                    e0 e0Var4 = this.b.get(i9);
                                    if (!e0Var4.r() && e0Var4.e == jG2) {
                                        e0Var4.a(32);
                                        e0VarE = e0Var4;
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                e0VarE = null;
                                break;
                            }
                        } else {
                            e0VarE = this.b.get(i8);
                            if (!e0VarE.r() && e0VarE.d() == i) {
                                e0VarE.a(32);
                                break;
                            }
                            i8++;
                        }
                    }
                } else {
                    e0VarE = null;
                    break;
                }
                if (e0VarE != null) {
                    z = true;
                }
                arrayList = this.a;
                arrayList2 = this.c;
                if (e0VarE == null) {
                    size4 = arrayList.size();
                    i4 = 0;
                    while (true) {
                        if (i4 < size4) {
                            arrayList7 = recyclerView.y.c;
                            size5 = arrayList7.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size5) {
                                    z2 = true;
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) arrayList7.get(i5);
                                e0VarO2 = RecyclerView.O(view2);
                                z2 = true;
                                if (e0VarO2.d() != i && !e0VarO2.h() && !e0VarO2.j()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view2 != null) {
                                size6 = arrayList2.size();
                                i6 = 0;
                                while (true) {
                                    if (i6 < size6) {
                                        e0VarE = null;
                                        break;
                                    }
                                    e0Var2 = arrayList2.get(i6);
                                    if (e0Var2.h() && e0Var2.d() == i && !e0Var2.f()) {
                                        arrayList2.remove(i6);
                                        if (RecyclerView.X0) {
                                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + e0Var2);
                                        }
                                        e0VarE = e0Var2;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                e0VarO = RecyclerView.O(view2);
                                fVar3 = recyclerView.y;
                                aVar2 = fVar3.b;
                                iIndexOfChild = fVar3.a.a.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    defpackage.u.c(view2, "view is not a child, cannot hide ");
                                    return null;
                                }
                                if (aVar2.d(iIndexOfChild)) {
                                    gh6.a(view2, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                aVar2.a(iIndexOfChild);
                                fVar3.j(view2);
                                androidx.recyclerview.widget.f fVar4 = recyclerView.y;
                                aVar3 = fVar4.b;
                                iIndexOfChild2 = fVar4.a.a.indexOfChild(view2);
                                if (iIndexOfChild2 == -1 && !aVar3.d(iIndexOfChild2)) {
                                    iB = iIndexOfChild2 - aVar3.b(iIndexOfChild2);
                                } else {
                                    iB = -1;
                                }
                                if (iB != -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(e0VarO);
                                    ru3.e(sb, recyclerView.B());
                                    return null;
                                }
                                recyclerView.y.c(iB);
                                k(view2);
                                e0VarO.a(8224);
                                e0VarE = e0VarO;
                                break;
                            }
                        } else {
                            e0Var3 = arrayList.get(i4);
                            if (e0Var3.r() && e0Var3.d() == i && !e0Var3.h() && (a0Var.g || !e0Var3.j())) {
                                e0Var3.a(32);
                                e0VarE = e0Var3;
                                z2 = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (e0VarE != null) {
                        if (e0VarE.j()) {
                            i7 = e0VarE.c;
                            if (i7 >= 0 || i7 >= recyclerView.F.f()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0VarE + recyclerView.B());
                            }
                            if (a0Var.g || recyclerView.F.h(e0VarE.c) == e0VarE.f) {
                                f fVar5 = recyclerView.F;
                                if (!fVar5.b || e0VarE.e == fVar5.g(e0VarE.c)) {
                                    z10 = z2;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                        } else {
                            if (!RecyclerView.W0 && !a0Var.g) {
                                aa0.c("should not receive a removed view unless it is pre layout".concat(recyclerView.B()));
                                return null;
                            }
                            z10 = a0Var.g;
                        }
                        if (z10) {
                            z = z2;
                        } else {
                            e0VarE.a(4);
                            if (e0VarE.k()) {
                                recyclerView.removeDetachedView(e0VarE.a, false);
                                e0VarE.n.m(e0VarE);
                            } else if (e0VarE.r()) {
                                e0VarE.j &= -33;
                            }
                            j(e0VarE);
                            e0VarE = null;
                        }
                    }
                } else {
                    z2 = true;
                }
                if (e0VarE == null) {
                    iF2 = recyclerView.x.f(i, 0);
                    if (iF2 >= 0) {
                        j2 = 3;
                        if (iF2 < recyclerView.F.f()) {
                            iH = recyclerView.F.h(iF2);
                            fVar2 = recyclerView.F;
                            j3 = 4;
                            if (fVar2.b) {
                                jG = fVar2.g(iF2);
                                size2 = arrayList.size() - 1;
                                while (true) {
                                    if (size2 >= 0) {
                                        size3 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size3 >= 0) {
                                                e0Var = arrayList2.get(size3);
                                                if (e0Var.e == jG || e0Var.f()) {
                                                    size3--;
                                                } else if (iH == e0Var.f) {
                                                    arrayList2.remove(size3);
                                                } else {
                                                    h(size3);
                                                }
                                            }
                                            e0VarE = null;
                                            break;
                                        }
                                    }
                                    e0Var = arrayList.get(size2);
                                    arrayList5 = arrayList;
                                    j8 = e0Var.e;
                                    View view3 = e0Var.a;
                                    if (j8 == jG || e0Var.r()) {
                                        arrayList6 = arrayList5;
                                    } else if (iH == e0Var.f) {
                                        e0Var.a(32);
                                        if (e0Var.j() && !a0Var.g) {
                                            e0Var.j = (e0Var.j & (-15)) | 2;
                                        }
                                    } else {
                                        arrayList6 = arrayList5;
                                        arrayList6.remove(size2);
                                        recyclerView.removeDetachedView(view3, false);
                                        e0 e0VarO3 = RecyclerView.O(view3);
                                        e0VarO3.n = null;
                                        e0VarO3.o = false;
                                        e0VarO3.j &= -33;
                                        j(e0VarO3);
                                    }
                                    size2--;
                                    arrayList = arrayList6;
                                    e0VarE = e0Var;
                                    break;
                                }
                                if (e0VarE != null) {
                                    e0VarE.c = iF2;
                                    z = z2;
                                }
                            }
                            if (e0VarE == null) {
                                if (RecyclerView.X0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                                }
                                aVar = c().a.get(iH);
                                if (aVar != null) {
                                    e0VarRemove = null;
                                    break;
                                }
                                arrayList4 = aVar.a;
                                if (arrayList4.isEmpty()) {
                                    size = arrayList4.size() - 1;
                                    while (true) {
                                        if (size >= 0) {
                                            e0VarRemove = null;
                                            break;
                                        }
                                        if (!arrayList4.get(size).f()) {
                                            e0VarRemove = arrayList4.remove(size);
                                            break;
                                        }
                                        size--;
                                    }
                                } else {
                                    e0VarRemove = null;
                                    break;
                                }
                                if (e0VarRemove != null) {
                                    e0VarRemove.o();
                                    boolean z11 = RecyclerView.W0;
                                }
                                e0VarE = e0VarRemove;
                            }
                            if (e0VarE == null) {
                                long nanoTime4 = recyclerView.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    j7 = this.g.a(iH).c;
                                    if (j7 != 0 && j7 + nanoTime4 >= j) {
                                        return null;
                                    }
                                }
                                e0VarE = recyclerView.F.e(recyclerView, iH);
                                if (RecyclerView.b1 && (recyclerViewG = RecyclerView.G(e0VarE.a)) != null) {
                                    e0VarE.b = new WeakReference<>(recyclerViewG);
                                }
                                nanoTime3 = recyclerView.getNanoTime() - nanoTime4;
                                u.a aVarA = this.g.a(iH);
                                j6 = aVarA.c;
                                if (j6 != 0) {
                                    nanoTime3 = (nanoTime3 / 4) + ((j6 / 4) * 3);
                                }
                                aVarA.c = nanoTime3;
                                if (RecyclerView.X0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            }
                        }
                    }
                    StringBuilder sbB2 = u43.b("Inconsistency detected. Invalid item position ", "(offset:", ").state:", i, iF2);
                    sbB2.append(a0Var.b());
                    sbB2.append(recyclerView.B());
                    throw new IndexOutOfBoundsException(sbB2.toString());
                }
                j2 = 3;
                j3 = 4;
                view = e0VarE.a;
                if (z && !a0Var.g) {
                    i3 = e0VarE.j;
                    if ((i3 & 8192) != 0) {
                        e0VarE.j = i3 & (-8193);
                        if (a0Var.j) {
                            l.e(e0VarE);
                            l lVar = recyclerView.j0;
                            e0VarE.e();
                            lVar.getClass();
                            l.b bVar = new l.b();
                            bVar.a(e0VarE);
                            recyclerView.b0(e0VarE, bVar);
                        }
                    }
                }
                if (a0Var.g || !e0VarE.g()) {
                    if (e0VarE.g() || (e0VarE.j & 2) != 0 || e0VarE.h()) {
                        if (!RecyclerView.W0 && e0VarE.j()) {
                            StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb2.append(e0VarE);
                            ru3.e(sb2, recyclerView.B());
                            return null;
                        }
                        z3 = false;
                        iF = recyclerView.x.f(i, 0);
                        e0VarE.s = null;
                        e0VarE.r = recyclerView;
                        i2 = e0VarE.f;
                        nanoTime = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j5 = this.g.a(i2).d;
                            if (j5 != 0 || j5 + nanoTime < j) {
                                if (e0VarE.l()) {
                                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                    z4 = z2;
                                } else {
                                    z4 = false;
                                }
                                fVar = recyclerView.F;
                                fVar.getClass();
                                if (e0VarE.s == null) {
                                    z5 = z2;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    e0VarE.c = iF;
                                    if (fVar.b) {
                                        e0VarE.e = fVar.g(iF);
                                    }
                                    e0VarE.j = (e0VarE.j & (-520)) | 1;
                                    if (yra.a()) {
                                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                                    }
                                }
                                e0VarE.s = fVar;
                                if (RecyclerView.W0) {
                                    if (view.getParent() != null && view.isAttachedToWindow() != e0VarE.l()) {
                                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + e0VarE.l() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + e0VarE);
                                    }
                                    if (view.getParent() == null && view.isAttachedToWindow()) {
                                        p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                        return null;
                                    }
                                }
                                fVar.k(e0VarE, iF, e0VarE.e());
                                if (z5) {
                                    arrayList3 = e0VarE.k;
                                    if (arrayList3 != null) {
                                        arrayList3.clear();
                                    }
                                    e0VarE.j &= -1025;
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams instanceof p) {
                                        ((p) layoutParams).c = z2;
                                    }
                                    Trace.endSection();
                                }
                                if (z4) {
                                    recyclerView.detachViewFromParent(view);
                                }
                                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                u.a aVarA2 = this.g.a(e0VarE.f);
                                j4 = aVarA2.d;
                                if (j4 != 0) {
                                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                                }
                                aVarA2.d = nanoTime2;
                                accessibilityManager = recyclerView.V;
                                if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                    z6 = true;
                                    if (view.getImportantForAccessibility() == 0) {
                                        view.setImportantForAccessibility(1);
                                    }
                                    androidx.recyclerview.widget.d0 d0Var = recyclerView.I0;
                                    if (d0Var != null) {
                                        androidx.recyclerview.widget.d0.a aVar4 = d0Var.u;
                                        if (aVar4 != null) {
                                            View.AccessibilityDelegate accessibilityDelegateE = egb.e(view);
                                            if (accessibilityDelegateE == null) {
                                                m3Var = null;
                                            } else {
                                                m3Var = accessibilityDelegateE instanceof m3.a ? ((m3.a) accessibilityDelegateE).a : new m3(accessibilityDelegateE);
                                            }
                                            if (m3Var != null && m3Var != aVar4) {
                                                aVar4.u.put(view, m3Var);
                                            }
                                        }
                                        egb.o(view, aVar4);
                                    }
                                } else {
                                    z6 = true;
                                }
                                if (a0Var.g) {
                                    e0VarE.g = i;
                                }
                                z7 = z6;
                            } else {
                                z7 = false;
                                z6 = z2;
                            }
                        } else {
                            if (e0VarE.l()) {
                                recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            fVar = recyclerView.F;
                            fVar.getClass();
                            if (e0VarE.s == null) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                e0VarE.c = iF;
                                if (fVar.b) {
                                    e0VarE.e = fVar.g(iF);
                                }
                                e0VarE.j = (e0VarE.j & (-520)) | 1;
                                if (yra.a()) {
                                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                                }
                            }
                            e0VarE.s = fVar;
                            if (RecyclerView.W0) {
                                if (view.getParent() != null) {
                                }
                                if (view.getParent() == null) {
                                    p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                    return null;
                                }
                            }
                            fVar.k(e0VarE, iF, e0VarE.e());
                            if (z5) {
                                arrayList3 = e0VarE.k;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                e0VarE.j &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof p) {
                                    ((p) layoutParams).c = z2;
                                }
                                Trace.endSection();
                            }
                            if (z4) {
                                recyclerView.detachViewFromParent(view);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            u.a aVarA3 = this.g.a(e0VarE.f);
                            j4 = aVarA3.d;
                            if (j4 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
                            aVarA3.d = nanoTime2;
                            accessibilityManager = recyclerView.V;
                            if (accessibilityManager == null) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (a0Var.g) {
                                e0VarE.g = i;
                            }
                            z7 = z6;
                        }
                        z8 = z7;
                    }
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        pVar = (p) recyclerView.generateDefaultLayoutParams();
                        view.setLayoutParams(pVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                        pVar = (p) layoutParams2;
                    } else {
                        pVar = (p) recyclerView.generateLayoutParams(layoutParams2);
                        view.setLayoutParams(pVar);
                    }
                    pVar.a = e0VarE;
                    if (z || !z8) {
                        z9 = z3;
                    } else {
                        z9 = z6;
                    }
                    pVar.d = z9;
                    return e0VarE;
                }
                e0VarE.g = i;
                z6 = z2;
                z3 = false;
                z8 = false;
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    pVar = (p) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(pVar);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    pVar = (p) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(pVar);
                } else {
                    pVar = (p) layoutParams2;
                }
                pVar.a = e0VarE;
                if (z) {
                    z9 = z3;
                } else {
                    z9 = z3;
                }
                pVar.d = z9;
                return e0VarE;
            }
            e0VarE = null;
            z = false;
            arrayList = this.a;
            arrayList2 = this.c;
            if (e0VarE == null) {
                size4 = arrayList.size();
                i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        arrayList7 = recyclerView.y.c;
                        size5 = arrayList7.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size5) {
                                z2 = true;
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList7.get(i5);
                            e0VarO2 = RecyclerView.O(view2);
                            z2 = true;
                            if (e0VarO2.d() != i) {
                            }
                            i5++;
                        }
                        if (view2 != null) {
                            size6 = arrayList2.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size6) {
                                    e0VarE = null;
                                    break;
                                }
                                e0Var2 = arrayList2.get(i6);
                                if (e0Var2.h()) {
                                }
                                i6++;
                            }
                        } else {
                            e0VarO = RecyclerView.O(view2);
                            fVar3 = recyclerView.y;
                            aVar2 = fVar3.b;
                            iIndexOfChild = fVar3.a.a.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                defpackage.u.c(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (aVar2.d(iIndexOfChild)) {
                                gh6.a(view2, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            aVar2.a(iIndexOfChild);
                            fVar3.j(view2);
                            androidx.recyclerview.widget.f fVar6 = recyclerView.y;
                            aVar3 = fVar6.b;
                            iIndexOfChild2 = fVar6.a.a.indexOfChild(view2);
                            if (iIndexOfChild2 == -1) {
                                iB = -1;
                            } else {
                                iB = iIndexOfChild2 - aVar3.b(iIndexOfChild2);
                            }
                            if (iB != -1) {
                                StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb3.append(e0VarO);
                                ru3.e(sb3, recyclerView.B());
                                return null;
                            }
                            recyclerView.y.c(iB);
                            k(view2);
                            e0VarO.a(8224);
                            e0VarE = e0VarO;
                            break;
                        }
                    } else {
                        e0Var3 = arrayList.get(i4);
                        if (e0Var3.r()) {
                        }
                        i4++;
                    }
                }
                if (e0VarE != null) {
                    if (e0VarE.j()) {
                        i7 = e0VarE.c;
                        if (i7 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0VarE + recyclerView.B());
                    }
                    if (!RecyclerView.W0) {
                    }
                    z10 = a0Var.g;
                    if (z10) {
                        e0VarE.a(4);
                        if (e0VarE.k()) {
                            recyclerView.removeDetachedView(e0VarE.a, false);
                            e0VarE.n.m(e0VarE);
                        } else if (e0VarE.r()) {
                            e0VarE.j &= -33;
                        }
                        j(e0VarE);
                        e0VarE = null;
                    } else {
                        z = z2;
                    }
                }
            } else {
                z2 = true;
            }
            if (e0VarE == null) {
                iF2 = recyclerView.x.f(i, 0);
                if (iF2 >= 0) {
                    j2 = 3;
                    if (iF2 < recyclerView.F.f()) {
                        iH = recyclerView.F.h(iF2);
                        fVar2 = recyclerView.F;
                        j3 = 4;
                        if (fVar2.b) {
                            jG = fVar2.g(iF2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            e0Var = arrayList2.get(size3);
                                            if (e0Var.e == jG) {
                                            }
                                            size3--;
                                        }
                                        e0VarE = null;
                                        break;
                                    }
                                }
                                e0Var = arrayList.get(size2);
                                arrayList5 = arrayList;
                                j8 = e0Var.e;
                                View view4 = e0Var.a;
                                if (j8 == jG) {
                                    arrayList6 = arrayList5;
                                } else {
                                    arrayList6 = arrayList5;
                                }
                                size2--;
                                arrayList = arrayList6;
                                e0VarE = e0Var;
                                break;
                            }
                            if (e0VarE != null) {
                                e0VarE.c = iF2;
                                z = z2;
                            }
                        }
                        if (e0VarE == null) {
                            if (RecyclerView.X0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            aVar = c().a.get(iH);
                            if (aVar != null) {
                                e0VarRemove = null;
                                break;
                            }
                            arrayList4 = aVar.a;
                            if (arrayList4.isEmpty()) {
                                e0VarRemove = null;
                                break;
                            }
                            size = arrayList4.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    e0VarRemove = null;
                                    break;
                                }
                                if (!arrayList4.get(size).f()) {
                                    e0VarRemove = arrayList4.remove(size);
                                    break;
                                }
                                size--;
                            }
                            if (e0VarRemove != null) {
                                e0VarRemove.o();
                                boolean z12 = RecyclerView.W0;
                            }
                            e0VarE = e0VarRemove;
                        }
                        if (e0VarE == null) {
                            long nanoTime5 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.a(iH).c;
                                if (j7 != 0) {
                                    return null;
                                }
                            }
                            e0VarE = recyclerView.F.e(recyclerView, iH);
                            if (RecyclerView.b1) {
                                e0VarE.b = new WeakReference<>(recyclerViewG);
                            }
                            nanoTime3 = recyclerView.getNanoTime() - nanoTime5;
                            u.a aVarA4 = this.g.a(iH);
                            j6 = aVarA4.c;
                            if (j6 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j6 / 4) * 3);
                            }
                            aVarA4.c = nanoTime3;
                            if (RecyclerView.X0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        }
                    }
                }
                StringBuilder sbB3 = u43.b("Inconsistency detected. Invalid item position ", "(offset:", ").state:", i, iF2);
                sbB3.append(a0Var.b());
                sbB3.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbB3.toString());
            }
            j2 = 3;
            j3 = 4;
            view = e0VarE.a;
            if (z) {
                i3 = e0VarE.j;
                if ((i3 & 8192) != 0) {
                    e0VarE.j = i3 & (-8193);
                    if (a0Var.j) {
                        l.e(e0VarE);
                        l lVar2 = recyclerView.j0;
                        e0VarE.e();
                        lVar2.getClass();
                        l.b bVar2 = new l.b();
                        bVar2.a(e0VarE);
                        recyclerView.b0(e0VarE, bVar2);
                    }
                }
            }
            if (a0Var.g) {
                if (e0VarE.g()) {
                }
                if (!RecyclerView.W0) {
                }
                z3 = false;
                iF = recyclerView.x.f(i, 0);
                e0VarE.s = null;
                e0VarE.r = recyclerView;
                i2 = e0VarE.f;
                nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                        if (e0VarE.l()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        fVar = recyclerView.F;
                        fVar.getClass();
                        if (e0VarE.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            e0VarE.c = iF;
                            if (fVar.b) {
                                e0VarE.e = fVar.g(iF);
                            }
                            e0VarE.j = (e0VarE.j & (-520)) | 1;
                            if (yra.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                            }
                        }
                        e0VarE.s = fVar;
                        if (RecyclerView.W0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        fVar.k(e0VarE, iF, e0VarE.e());
                        if (z5) {
                            arrayList3 = e0VarE.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            e0VarE.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof p) {
                                ((p) layoutParams).c = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        u.a aVarA5 = this.g.a(e0VarE.f);
                        j4 = aVarA5.d;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        aVarA5.d = nanoTime2;
                        accessibilityManager = recyclerView.V;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (a0Var.g) {
                            e0VarE.g = i;
                        }
                        z7 = z6;
                    } else {
                        if (e0VarE.l()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        fVar = recyclerView.F;
                        fVar.getClass();
                        if (e0VarE.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            e0VarE.c = iF;
                            if (fVar.b) {
                                e0VarE.e = fVar.g(iF);
                            }
                            e0VarE.j = (e0VarE.j & (-520)) | 1;
                            if (yra.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                            }
                        }
                        e0VarE.s = fVar;
                        if (RecyclerView.W0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        fVar.k(e0VarE, iF, e0VarE.e());
                        if (z5) {
                            arrayList3 = e0VarE.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            e0VarE.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof p) {
                                ((p) layoutParams).c = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        u.a aVarA6 = this.g.a(e0VarE.f);
                        j4 = aVarA6.d;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        aVarA6.d = nanoTime2;
                        accessibilityManager = recyclerView.V;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (a0Var.g) {
                            e0VarE.g = i;
                        }
                        z7 = z6;
                    }
                } else {
                    if (e0VarE.l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.F;
                    fVar.getClass();
                    if (e0VarE.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        e0VarE.c = iF;
                        if (fVar.b) {
                            e0VarE.e = fVar.g(iF);
                        }
                        e0VarE.j = (e0VarE.j & (-520)) | 1;
                        if (yra.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                        }
                    }
                    e0VarE.s = fVar;
                    if (RecyclerView.W0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.k(e0VarE, iF, e0VarE.e());
                    if (z5) {
                        arrayList3 = e0VarE.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        e0VarE.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof p) {
                            ((p) layoutParams).c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    u.a aVarA7 = this.g.a(e0VarE.f);
                    j4 = aVarA7.d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    aVarA7.d = nanoTime2;
                    accessibilityManager = recyclerView.V;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (a0Var.g) {
                        e0VarE.g = i;
                    }
                    z7 = z6;
                }
                z8 = z7;
            } else {
                if (e0VarE.g()) {
                }
                if (!RecyclerView.W0) {
                }
                z3 = false;
                iF = recyclerView.x.f(i, 0);
                e0VarE.s = null;
                e0VarE.r = recyclerView;
                i2 = e0VarE.f;
                nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j5 = this.g.a(i2).d;
                    if (j5 != 0) {
                        if (e0VarE.l()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        fVar = recyclerView.F;
                        fVar.getClass();
                        if (e0VarE.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            e0VarE.c = iF;
                            if (fVar.b) {
                                e0VarE.e = fVar.g(iF);
                            }
                            e0VarE.j = (e0VarE.j & (-520)) | 1;
                            if (yra.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                            }
                        }
                        e0VarE.s = fVar;
                        if (RecyclerView.W0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        fVar.k(e0VarE, iF, e0VarE.e());
                        if (z5) {
                            arrayList3 = e0VarE.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            e0VarE.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof p) {
                                ((p) layoutParams).c = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        u.a aVarA8 = this.g.a(e0VarE.f);
                        j4 = aVarA8.d;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        aVarA8.d = nanoTime2;
                        accessibilityManager = recyclerView.V;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (a0Var.g) {
                            e0VarE.g = i;
                        }
                        z7 = z6;
                    } else {
                        if (e0VarE.l()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        fVar = recyclerView.F;
                        fVar.getClass();
                        if (e0VarE.s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            e0VarE.c = iF;
                            if (fVar.b) {
                                e0VarE.e = fVar.g(iF);
                            }
                            e0VarE.j = (e0VarE.j & (-520)) | 1;
                            if (yra.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                            }
                        }
                        e0VarE.s = fVar;
                        if (RecyclerView.W0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        fVar.k(e0VarE, iF, e0VarE.e());
                        if (z5) {
                            arrayList3 = e0VarE.k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            e0VarE.j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof p) {
                                ((p) layoutParams).c = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        u.a aVarA9 = this.g.a(e0VarE.f);
                        j4 = aVarA9.d;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        aVarA9.d = nanoTime2;
                        accessibilityManager = recyclerView.V;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (a0Var.g) {
                            e0VarE.g = i;
                        }
                        z7 = z6;
                    }
                } else {
                    if (e0VarE.l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    fVar = recyclerView.F;
                    fVar.getClass();
                    if (e0VarE.s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        e0VarE.c = iF;
                        if (fVar.b) {
                            e0VarE.e = fVar.g(iF);
                        }
                        e0VarE.j = (e0VarE.j & (-520)) | 1;
                        if (yra.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(e0VarE.f)));
                        }
                    }
                    e0VarE.s = fVar;
                    if (RecyclerView.W0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            p51.c(e0VarE, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    fVar.k(e0VarE, iF, e0VarE.e());
                    if (z5) {
                        arrayList3 = e0VarE.k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        e0VarE.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof p) {
                            ((p) layoutParams).c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    u.a aVarA10 = this.g.a(e0VarE.f);
                    j4 = aVarA10.d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    aVarA10.d = nanoTime2;
                    accessibilityManager = recyclerView.V;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (a0Var.g) {
                        e0VarE.g = i;
                    }
                    z7 = z6;
                }
                z8 = z7;
            }
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                pVar = (p) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(pVar);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                pVar = (p) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(pVar);
            } else {
                pVar = (p) layoutParams2;
            }
            pVar.a = e0VarE;
            if (z) {
                z9 = z3;
            } else {
                z9 = z3;
            }
            pVar.d = z9;
            return e0VarE;
        }

        public final void m(e0 e0Var) {
            if (e0Var.o) {
                this.b.remove(e0Var);
            } else {
                this.a.remove(e0Var);
            }
            e0Var.n = null;
            e0Var.o = false;
            e0Var.j &= -33;
        }

        public final void n() {
            o oVar = RecyclerView.this.G;
            this.f = this.e + (oVar != null ? oVar.j : 0);
            ArrayList<e0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                h(size);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface w {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class x extends h {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            recyclerView.B0.f = true;
            recyclerView.a0(true);
            if (recyclerView.x.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.x;
            ArrayList<androidx.recyclerview.widget.a.C0026a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(4, i, i2));
            aVar.f |= 4;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.x;
            ArrayList<androidx.recyclerview.widget.a.C0026a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(1, i, i2));
            aVar.f |= 1;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.x;
            ArrayList<androidx.recyclerview.widget.a.C0026a> arrayList = aVar.b;
            if (i == i2) {
                return;
            }
            arrayList.add(aVar.h(8, i, i2));
            aVar.f |= 8;
            if (arrayList.size() == 1) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.x;
            ArrayList<androidx.recyclerview.widget.a.C0026a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(2, i, i2));
            aVar.f |= 2;
            if (arrayList.size() == 1) {
                g();
            }
        }

        public final void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.N || !recyclerView.M) {
                recyclerView.U = true;
                recyclerView.requestLayout();
            } else {
                a aVar = recyclerView.B;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                recyclerView.postOnAnimation(aVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class z {
        public int a = -1;
        public RecyclerView b;
        public o c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g;
        public boolean h;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.S(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    aa0.c("If you provide an interpolator, you must set a positive duration");
                    return;
                }
                int i2 = this.c;
                if (i2 < 1) {
                    aa0.c("Scroll duration must be a positive number");
                    return;
                }
                recyclerView.y0.c(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface b {
            PointF a(int i);
        }

        public z() {
            a aVar = new a();
            aVar.d = -1;
            aVar.f = false;
            aVar.g = 0;
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = Integer.MIN_VALUE;
            aVar.e = null;
            this.g = aVar;
        }

        public PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof b) {
                return ((b) obj).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                f();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.i0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            a aVar = this.g;
            if (view != null) {
                this.b.getClass();
                e0 e0VarO = RecyclerView.O(view);
                if ((e0VarO != null ? e0VarO.d() : -1) == this.a) {
                    View view2 = this.f;
                    a0 a0Var = recyclerView.B0;
                    e(view2, aVar);
                    aVar.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a0 a0Var2 = recyclerView.B0;
                c(i, i2, aVar);
                boolean z = aVar.d >= 0;
                aVar.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.y0.b();
                }
            }
        }

        public abstract void c(int i, int i2, a aVar);

        public abstract void d();

        public abstract void e(View view, a aVar);

        public final void f() {
            if (this.e) {
                this.e = false;
                d();
                this.b.B0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                o oVar = this.c;
                if (oVar.e == this) {
                    oVar.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        c1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        d1 = new c();
        e1 = new b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        float fA;
        char c2;
        int i3;
        Throwable th;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i2);
        this.u = new x();
        this.v = new v();
        this.z = new j0();
        this.B = new a();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        this.I = new ArrayList();
        this.J = new ArrayList<>();
        this.K = new ArrayList<>();
        this.P = 0;
        this.a0 = false;
        this.b0 = false;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = e1;
        this.j0 = new androidx.recyclerview.widget.g();
        this.k0 = 0;
        this.l0 = -1;
        this.v0 = Float.MIN_VALUE;
        this.w0 = Float.MIN_VALUE;
        this.x0 = true;
        this.y0 = new d0();
        this.A0 = b1 ? new androidx.recyclerview.widget.o.b() : null;
        a0 a0Var = new a0();
        a0Var.a = -1;
        a0Var.b = 0;
        a0Var.c = 0;
        a0Var.d = 1;
        a0Var.e = 0;
        a0Var.f = false;
        a0Var.g = false;
        a0Var.h = false;
        a0Var.i = false;
        a0Var.j = false;
        a0Var.k = false;
        this.B0 = a0Var;
        this.E0 = false;
        this.F0 = false;
        m mVar = new m();
        this.G0 = mVar;
        this.H0 = false;
        this.J0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new int[2];
        this.N0 = new int[2];
        this.O0 = new ArrayList();
        this.P0 = new b();
        this.R0 = 0;
        this.S0 = 0;
        this.U0 = new d();
        this.V0 = new p03(getContext(), new e());
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.r0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = ngb.a;
            fA = ngb.a.a(viewConfiguration);
        } else {
            fA = ngb.a(viewConfiguration, context);
        }
        this.v0 = fA;
        this.w0 = i4 >= 26 ? ngb.a.b(viewConfiguration) : ngb.a(viewConfiguration, context);
        this.t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.t = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.j0.a = mVar;
        this.x = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.c0(this));
        this.y = new androidx.recyclerview.widget.f(new androidx.recyclerview.widget.b0(this));
        WeakHashMap<View, fib> weakHashMap = egb.a;
        if ((i4 >= 26 ? egb.g.a(this) : 0) == 0 && i4 >= 26) {
            egb.g.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.V = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.d0(this));
        int[] iArr = mh8.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        egb.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.A = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                z90.a("Trying to set fast scroller without both required drawables.".concat(B()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            i3 = 4;
            th = null;
            new androidx.recyclerview.widget.n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.hwpo_training_app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.hwpo_training_app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.hwpo_training_app.R.dimen.fastscroll_margin));
        } else {
            c2 = 3;
            i3 = 4;
            th = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.T0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                                th = null;
                                vr0.c(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                th = null;
                                vr0.c(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e4) {
                                e = e4;
                                th = null;
                                vr0.c(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                th = null;
                                vr0.c(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(o.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(c1);
                            objArr = new Object[i3];
                            objArr[0] = context;
                            objArr[r10] = attributeSet;
                            objArr[2] = Integer.valueOf(i2);
                            objArr[c2] = 0;
                        } catch (NoSuchMethodException e6) {
                            try {
                                constructor = clsAsSubclass.getConstructor(th);
                                objArr = null;
                            } catch (NoSuchMethodException e7) {
                                e7.initCause(e6);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((o) constructor.newInstance(objArr));
                    } catch (ClassCastException e8) {
                        vr0.c(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e8);
                        throw null;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                } catch (IllegalAccessException e10) {
                    e = e10;
                } catch (InstantiationException e11) {
                    e = e11;
                } catch (InvocationTargetException e12) {
                    e = e12;
                }
            }
        }
        int[] iArr2 = Y0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        egb.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.hwpo_training_app.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewG = G(viewGroup.getChildAt(i2));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static int M(View view) {
        e0 e0VarO = O(view);
        if (e0VarO != null) {
            return e0VarO.b();
        }
        return -1;
    }

    public static e0 O(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    private m97 getScrollingChildHelper() {
        if (this.K0 == null) {
            this.K0 = new m97(this);
        }
        return this.K0;
    }

    public static void k(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e0Var.a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e0Var.b = null;
        }
    }

    public static int n(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && da3.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(da3.b(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || da3.a(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round(da3.b(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        W0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        X0 = z2;
    }

    public final void A() {
        if (this.g0 != null) {
            return;
        }
        ((b0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.g0 = edgeEffect;
        if (this.A) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.F + ", layout:" + this.G + ", context:" + getContext();
    }

    public final void C(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.getClass();
            return;
        }
        OverScroller overScroller = this.y0.v;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<s> arrayList = this.K;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = arrayList.get(i2);
            if (sVar.d(motionEvent) && action != 3) {
                this.L = sVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        androidx.recyclerview.widget.f fVar = this.y;
        int iE = fVar.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iE; i4++) {
            e0 e0VarO = O(fVar.d(i4));
            if (!e0VarO.q()) {
                int iD = e0VarO.d();
                if (iD < i2) {
                    i2 = iD;
                }
                if (iD > i3) {
                    i3 = iD;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final e0 H(int i2) {
        e0 e0Var = null;
        if (this.a0) {
            return null;
        }
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        for (int i3 = 0; i3 < iH; i3++) {
            e0 e0VarO = O(fVar.g(i3));
            if (e0VarO != null && !e0VarO.j() && K(e0VarO) == i2) {
                if (!fVar.c.contains(e0VarO.a)) {
                    return e0VarO;
                }
                e0Var = e0VarO;
            }
        }
        return e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[SYNTHETIC] */
    public final e0 I(int i2, boolean z2) {
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        e0 e0Var = null;
        for (int i3 = 0; i3 < iH; i3++) {
            e0 e0VarO = O(fVar.g(i3));
            if (e0VarO != null && !e0VarO.j()) {
                if (z2) {
                    if (e0VarO.c != i2) {
                        continue;
                    } else {
                        if (fVar.c.contains(e0VarO.a)) {
                            return e0VarO;
                        }
                        e0Var = e0VarO;
                    }
                } else if (e0VarO.d() != i2) {
                    continue;
                } else {
                    if (fVar.c.contains(e0VarO.a)) {
                        return e0VarO;
                    }
                    e0Var = e0VarO;
                }
            }
        }
        return e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean J(int i2, int i3, int i4, int i5) {
        int iMax;
        int i6;
        int minFlingVelocity;
        z zVarC;
        int iE;
        o oVar = this.G;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.R) {
            boolean zE = oVar.e();
            boolean zF = this.G.f();
            if (!zE || Math.abs(i2) < i4) {
                i2 = 0;
            }
            if (!zF || Math.abs(i3) < i4) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i2 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f0;
                    if (edgeEffect == null || da3.a(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.h0;
                        if (edgeEffect2 == null || da3.a(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (k0(this.h0, i2, getWidth())) {
                            this.h0.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (k0(this.f0, i7, getWidth())) {
                            this.f0.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    iMax = i2;
                    i2 = 0;
                }
                if (i3 == 0) {
                    i6 = i3;
                    i3 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.g0;
                    if (edgeEffect3 == null || da3.a(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.i0;
                        if (edgeEffect4 == null || da3.a(edgeEffect4) == 0.0f) {
                            i6 = i3;
                            i3 = 0;
                        } else if (k0(this.i0, i3, getHeight())) {
                            this.i0.onAbsorb(i3);
                            i3 = 0;
                        }
                    } else {
                        int i8 = -i3;
                        if (k0(this.g0, i8, getHeight())) {
                            this.g0.onAbsorb(i8);
                            i3 = 0;
                        }
                    }
                    i6 = 0;
                }
                d0 d0Var = this.y0;
                if (iMax != 0 || i3 != 0) {
                    int i9 = -i5;
                    iMax = Math.max(i9, Math.min(iMax, i5));
                    i3 = Math.max(i9, Math.min(i3, i5));
                    o0(1);
                    d0Var.a(iMax, i3);
                }
                if (i2 != 0 || i6 != 0) {
                    float f2 = i2;
                    float f3 = i6;
                    if (!dispatchNestedPreFling(f2, f3)) {
                        boolean z2 = zE || zF;
                        dispatchNestedFling(f2, f3, z2);
                        r rVar = this.s0;
                        if (rVar != null) {
                            g0 g0Var = (g0) rVar;
                            o layoutManager = g0Var.a.getLayoutManager();
                            if (layoutManager != null && g0Var.a.getAdapter() != null && ((Math.abs(i6) > (minFlingVelocity = g0Var.a.getMinFlingVelocity()) || Math.abs(i2) > minFlingVelocity) && (layoutManager instanceof z.b) && (zVarC = g0Var.c(layoutManager)) != null && (iE = g0Var.e(layoutManager, i2, i6)) != -1)) {
                                zVarC.a = iE;
                                layoutManager.I0(zVarC);
                                return true;
                            }
                        }
                        if (z2) {
                            o0(1);
                            int i10 = -i5;
                            d0Var.a(Math.max(i10, Math.min(i2, i5)), Math.max(i10, Math.min(i6, i5)));
                            return true;
                        }
                    }
                } else if (iMax != 0 || i3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int K(e0 e0Var) {
        if ((e0Var.j & 524) == 0 && e0Var.g()) {
            int i2 = e0Var.c;
            ArrayList<androidx.recyclerview.widget.a.C0026a> arrayList = this.x.b;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.recyclerview.widget.a.C0026a c0026a = arrayList.get(i3);
                int i4 = c0026a.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = c0026a.b;
                        if (i5 <= i2) {
                            int i6 = c0026a.c;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = c0026a.b;
                        if (i7 == i2) {
                            i2 = c0026a.c;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (c0026a.c <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (c0026a.b <= i2) {
                    i2 += c0026a.c;
                }
            }
            return i2;
        }
        return -1;
    }

    public final long L(e0 e0Var) {
        return this.F.b ? e0Var.e : e0Var.c;
    }

    public final e0 N(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return O(view);
        }
        f04.c("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect P(View view) {
        p pVar = (p) view.getLayoutParams();
        boolean z2 = pVar.c;
        Rect rect = pVar.b;
        if (z2) {
            a0 a0Var = this.B0;
            if (!a0Var.g || (!pVar.a.m() && !pVar.a.h())) {
                rect.set(0, 0, 0, 0);
                ArrayList<n> arrayList = this.J;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Rect rect2 = this.C;
                    rect2.set(0, 0, 0, 0);
                    arrayList.get(i2).f(rect2, view, this, a0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                pVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        return !this.O || this.a0 || this.x.g();
    }

    public final boolean R() {
        return this.c0 > 0;
    }

    public final void S(int i2) {
        if (this.G == null) {
            return;
        }
        setScrollState(2);
        this.G.x0(i2);
        awakenScrollBars();
    }

    public final void T() {
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ((p) fVar.g(i2).getLayoutParams()).c = true;
        }
        ArrayList<e0> arrayList = this.v.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3).a.getLayoutParams();
            if (pVar != null) {
                pVar.c = true;
            }
        }
    }

    public final void U(int i2, boolean z2, int i3) {
        int i4 = i2 + i3;
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        for (int i5 = 0; i5 < iH; i5++) {
            e0 e0VarO = O(fVar.g(i5));
            if (e0VarO != null && !e0VarO.q()) {
                int i6 = e0VarO.c;
                a0 a0Var = this.B0;
                if (i6 >= i4) {
                    if (X0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + e0VarO + " now at position " + (e0VarO.c - i3));
                    }
                    e0VarO.n(-i3, z2);
                    a0Var.f = true;
                } else if (i6 >= i2) {
                    if (X0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + e0VarO + " now REMOVED");
                    }
                    e0VarO.a(8);
                    e0VarO.n(-i3, z2);
                    e0VarO.c = i2 - 1;
                    a0Var.f = true;
                }
            }
        }
        v vVar = this.v;
        ArrayList<e0> arrayList = vVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = arrayList.get(size);
            if (e0Var != null) {
                int i7 = e0Var.c;
                if (i7 >= i4) {
                    if (X0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + e0Var + " now at position " + (e0Var.c - i3));
                    }
                    e0Var.n(-i3, z2);
                } else if (i7 >= i2) {
                    e0Var.a(8);
                    vVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.c0++;
    }

    public final void W(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.c0 - 1;
        this.c0 = i3;
        if (i3 < 1) {
            if (W0 && i3 < 0) {
                aa0.c("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
                return;
            }
            this.c0 = 0;
            if (z2) {
                int i4 = this.T;
                this.T = 0;
                if (i4 != 0 && (accessibilityManager = this.V) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(AudioConstants.AUDIO_FILE_BUFFER_SIZE);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.O0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e0 e0Var = (e0) arrayList.get(size);
                    if (e0Var.a.getParent() == this && !e0Var.q() && (i2 = e0Var.q) != -1) {
                        e0Var.a.setImportantForAccessibility(i2);
                        e0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.l0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.l0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.p0 = x2;
            this.n0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.q0 = y2;
            this.o0 = y2;
        }
    }

    public final void Y() {
        if (this.H0 || !this.M) {
            return;
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        postOnAnimation(this.P0);
        this.H0 = true;
    }

    public final void Z() {
        boolean z2;
        boolean z3 = this.a0;
        androidx.recyclerview.widget.a aVar = this.x;
        boolean z4 = false;
        if (z3) {
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.b0) {
                this.G.f0();
            }
        }
        if (this.j0 != null && this.G.J0()) {
            aVar.j();
        } else {
            aVar.c();
        }
        boolean z5 = this.E0 || this.F0;
        boolean z6 = this.O && this.j0 != null && ((z2 = this.a0) || z5 || this.G.f) && (!z2 || this.F.b);
        a0 a0Var = this.B0;
        a0Var.j = z6;
        if (z6 && z5 && !this.a0 && this.j0 != null && this.G.J0()) {
            z4 = true;
        }
        a0Var.k = z4;
    }

    public final void a0(boolean z2) {
        this.b0 = z2 | this.b0;
        this.a0 = true;
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            e0 e0VarO = O(fVar.g(i2));
            if (e0VarO != null && !e0VarO.q()) {
                e0VarO.a(6);
            }
        }
        T();
        v vVar = this.v;
        ArrayList<e0> arrayList = vVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0 e0Var = arrayList.get(i3);
            if (e0Var != null) {
                e0Var.a(6);
                e0Var.a(1024);
            }
        }
        f fVar2 = RecyclerView.this.F;
        if (fVar2 == null || !fVar2.b) {
            vVar.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.G;
        if (oVar != null) {
            oVar.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(e0 e0Var, l.b bVar) {
        e0Var.j &= -8193;
        boolean z2 = this.B0.h;
        j0 j0Var = this.z;
        if (z2 && e0Var.m() && !e0Var.j() && !e0Var.q()) {
            j0Var.b.f(L(e0Var), e0Var);
        }
        ep9<e0, j0.a> ep9Var = j0Var.a;
        j0.a aVarA = ep9Var.get(e0Var);
        if (aVarA == null) {
            aVarA = j0.a.a();
            ep9Var.put(e0Var, aVarA);
        }
        aVarA.b = bVar;
        aVarA.a |= 4;
    }

    public final void c0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.g0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.i0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.G.g((p) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o oVar = this.G;
        if (oVar != null && oVar.e()) {
            return this.G.k(this.B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o oVar = this.G;
        if (oVar != null && oVar.e()) {
            return this.G.l(this.B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o oVar = this.G;
        if (oVar != null && oVar.e()) {
            return this.G.m(this.B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        o oVar = this.G;
        if (oVar != null && oVar.f()) {
            return this.G.n(this.B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        o oVar = this.G;
        if (oVar != null && oVar.f()) {
            return this.G.o(this.B0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        o oVar = this.G;
        if (oVar != null && oVar.f()) {
            return this.G.p(this.B0);
        }
        return 0;
    }

    public final int d0(float f2, int i2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.f0;
        float f3 = 0.0f;
        if (edgeEffect == null || da3.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.h0;
            if (edgeEffect2 != null && da3.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.h0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = da3.b(edgeEffect3, width, height);
                    if (da3.a(this.h0) == 0.0f) {
                        this.h0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -da3.b(edgeEffect4, -width, 1.0f - height);
                if (da3.a(this.f0) == 0.0f) {
                    this.f0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        o layoutManager = getLayoutManager();
        int iF = 0;
        if (layoutManager != null) {
            if (layoutManager.f()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        l0(0, false, measuredHeight);
                        return true;
                    }
                    l0(0, false, -measuredHeight);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zR = layoutManager.R();
                    if (keyCode == 122) {
                        if (zR) {
                            iF = getAdapter().f();
                        }
                    } else if (!zR) {
                        iF = getAdapter().f();
                    }
                    m0(iF);
                    return true;
                }
            } else if (layoutManager.e()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        l0(measuredWidth, false, 0);
                        return true;
                    }
                    l0(-measuredWidth, false, 0);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zR2 = layoutManager.R();
                    if (keyCode2 == 122) {
                        if (zR2) {
                            iF = getAdapter().f();
                        }
                    } else if (!zR2) {
                        iF = getAdapter().f();
                    }
                    m0(iF);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList<n> arrayList = this.J;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).h(canvas, this, this.B0);
        }
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.A ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.A) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.g0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.A ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.h0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.j0 == null || arrayList.size() <= 0 || !this.j0.k()) ? z2 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final int e0(float f2, int i2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.g0;
        float f3 = 0.0f;
        if (edgeEffect == null || da3.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.i0;
            if (edgeEffect2 != null && da3.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.i0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = da3.b(edgeEffect3, height, 1.0f - width);
                    if (da3.a(this.i0) == 0.0f) {
                        this.i0.onRelease();
                    }
                    f3 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.g0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -da3.b(edgeEffect4, -height, width);
                if (da3.a(this.g0) == 0.0f) {
                    this.g0.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void f0(n nVar) {
        o oVar = this.G;
        if (oVar != null) {
            oVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<n> arrayList = this.J;
        arrayList.remove(nVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0166, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0187, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018a, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0192, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019a, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x0169, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(e0 e0Var) {
        View view = e0Var.a;
        boolean z2 = view.getParent() == this;
        this.v.m(N(view));
        boolean zL = e0Var.l();
        androidx.recyclerview.widget.f fVar = this.y;
        if (zL) {
            fVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            fVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = fVar.a.a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            defpackage.u.c(view, "view is not a child, cannot hide ");
        } else {
            fVar.b.h(iIndexOfChild);
            fVar.i(view);
        }
    }

    public final void g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.C;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect2 = pVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.G.u0(this, view, this.C, !this.O, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.G;
        if (oVar != null) {
            return oVar.s();
        }
        aa0.c("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.G;
        if (oVar != null) {
            return oVar.t(getContext(), attributeSet);
        }
        aa0.c("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f getAdapter() {
        return this.F;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.G;
        if (oVar == null) {
            return super.getBaseline();
        }
        oVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A;
    }

    public androidx.recyclerview.widget.d0 getCompatAccessibilityDelegate() {
        return this.I0;
    }

    public k getEdgeEffectFactory() {
        return this.e0;
    }

    public l getItemAnimator() {
        return this.j0;
    }

    public int getItemDecorationCount() {
        return this.J.size();
    }

    public o getLayoutManager() {
        return this.G;
    }

    public int getMaxFlingVelocity() {
        return this.u0;
    }

    public int getMinFlingVelocity() {
        return this.t0;
    }

    public long getNanoTime() {
        if (b1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.s0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.x0;
    }

    public u getRecycledViewPool() {
        return this.v.c();
    }

    public int getScrollState() {
        return this.k0;
    }

    public final void h(n nVar) {
        o oVar = this.G;
        if (oVar != null) {
            oVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<n> arrayList = this.J;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(nVar);
        T();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean h0(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        o();
        f fVar = this.F;
        int[] iArr = this.N0;
        if (fVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            i0(i2, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i2 - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.J.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i5, i6, i7, i8, this.L0, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z5 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.p0;
        int[] iArr2 = this.L0;
        int i14 = iArr2[0];
        this.p0 = i13 - i14;
        int i15 = this.q0;
        int i16 = iArr2[1];
        this.q0 = i15 - i16;
        int[] iArr3 = this.M0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || wx5.b(motionEvent, 8194)) {
                z2 = true;
                z3 = false;
            } else {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    y();
                    z2 = true;
                    z3 = false;
                    da3.b(this.f0, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z2 = true;
                    z3 = false;
                    if (f2 > 0.0f) {
                        z();
                        da3.b(this.h0, f2 / getWidth(), y2 / getHeight());
                    } else {
                        z4 = false;
                    }
                    if (f3 < 0.0f) {
                        A();
                        da3.b(this.g0, (-f3) / getHeight(), x2 / getWidth());
                    } else if (f3 > 0.0f) {
                        x();
                        da3.b(this.i0, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else {
                        if (z4 || f2 != 0.0f || f3 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && wx5.b(motionEvent, 4194304)) {
                            c0();
                        }
                    }
                    z4 = z2;
                    if (z4) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z4 = z2;
                if (f3 < 0.0f) {
                    A();
                    da3.b(this.g0, (-f3) / getHeight(), x2 / getWidth());
                } else if (f3 > 0.0f) {
                    x();
                    da3.b(this.i0, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                } else {
                    if (z4) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z4 = z2;
                if (z4) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    c0();
                }
            }
            m(i2, i3);
        } else {
            z2 = true;
            z3 = false;
        }
        if (i5 != 0 || i6 != 0) {
            w(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i5 == 0 && i6 == 0) ? z3 : z2;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(t tVar) {
        if (this.D0 == null) {
            this.D0 = new ArrayList();
        }
        this.D0.add(tVar);
    }

    public final void i0(int i2, int i3, int[] iArr) {
        e0 e0Var;
        n0();
        V();
        Trace.beginSection("RV Scroll");
        a0 a0Var = this.B0;
        C(a0Var);
        v vVar = this.v;
        int iW0 = i2 != 0 ? this.G.w0(i2, vVar, a0Var) : 0;
        int iY0 = i3 != 0 ? this.G.y0(i3, vVar, a0Var) : 0;
        Trace.endSection();
        androidx.recyclerview.widget.f fVar = this.y;
        int iE = fVar.e();
        for (int i4 = 0; i4 < iE; i4++) {
            View viewD = fVar.d(i4);
            e0 e0VarN = N(viewD);
            if (e0VarN != null && (e0Var = e0VarN.i) != null) {
                View view = e0Var.a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        p0(false);
        if (iArr != null) {
            iArr[0] = iW0;
            iArr[1] = iY0;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.M;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.R;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(String str) {
        if (!R()) {
            if (this.d0 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B()));
            }
        } else if (str == null) {
            aa0.c("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
        } else {
            aa0.c(str);
        }
    }

    public final void j0(int i2) {
        if (this.R) {
            return;
        }
        r0();
        o oVar = this.G;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.x0(i2);
            awakenScrollBars();
        }
    }

    public final boolean k0(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float fA = da3.a(edgeEffect) * i3;
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.t * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = Z0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    public final void l() {
        androidx.recyclerview.widget.f fVar = this.y;
        int iH = fVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            e0 e0VarO = O(fVar.g(i2));
            if (!e0VarO.q()) {
                e0VarO.d = -1;
                e0VarO.g = -1;
            }
        }
        v vVar = this.v;
        ArrayList<e0> arrayList = vVar.a;
        ArrayList<e0> arrayList2 = vVar.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0 e0Var = arrayList2.get(i3);
            e0Var.d = -1;
            e0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            e0 e0Var2 = arrayList.get(i4);
            e0Var2.d = -1;
            e0Var2.g = -1;
        }
        ArrayList<e0> arrayList3 = vVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                e0 e0Var3 = vVar.b.get(i5);
                e0Var3.d = -1;
                e0Var3.g = -1;
            }
        }
    }

    public final void l0(int i2, boolean z2, int i3) {
        o oVar = this.G;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.R) {
            return;
        }
        if (!oVar.e()) {
            i2 = 0;
        }
        if (!this.G.f()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.y0.c(i2, i3, Integer.MIN_VALUE, null);
    }

    public final void m(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.f0.onRelease();
            zIsFinished = this.f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.h0.onRelease();
            zIsFinished |= this.h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.g0.onRelease();
            zIsFinished |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.i0.onRelease();
            zIsFinished |= this.i0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void m0(int i2) {
        if (this.R) {
            return;
        }
        o oVar = this.G;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.H0(this, i2);
        }
    }

    public final void n0() {
        int i2 = this.P + 1;
        this.P = i2;
        if (i2 != 1 || this.R) {
            return;
        }
        this.Q = false;
    }

    public final void o() {
        if (!this.O || this.a0) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        androidx.recyclerview.widget.a aVar = this.x;
        if (aVar.g()) {
            int i2 = aVar.f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (aVar.g()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            n0();
            V();
            aVar.j();
            if (!this.Q) {
                androidx.recyclerview.widget.f fVar = this.y;
                int iE = fVar.e();
                for (int i3 = 0; i3 < iE; i3++) {
                    e0 e0VarO = O(fVar.d(i3));
                    if (e0VarO != null && !e0VarO.q() && e0VarO.m()) {
                        r();
                    }
                }
                aVar.b();
            }
            p0(true);
            W(true);
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i2) {
        boolean zE = this.G.e();
        int i3 = zE;
        if (this.G.f()) {
            i3 = (zE ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i3, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.c0 = 0;
        this.M = true;
        this.O = this.O && !isLayoutRequested();
        this.v.e();
        o oVar = this.G;
        if (oVar != null) {
            oVar.g = true;
            oVar.X(this);
        }
        this.H0 = false;
        if (b1) {
            ThreadLocal<androidx.recyclerview.widget.o> threadLocal = androidx.recyclerview.widget.o.x;
            androidx.recyclerview.widget.o oVar2 = threadLocal.get();
            this.z0 = oVar2;
            if (oVar2 == null) {
                this.z0 = new androidx.recyclerview.widget.o();
                WeakHashMap<View, fib> weakHashMap = egb.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.o oVar3 = this.z0;
                oVar3.v = (long) (1.0E9f / refreshRate);
                threadLocal.set(oVar3);
            }
            ArrayList<RecyclerView> arrayList = this.z0.t;
            if (W0 && arrayList.contains(this)) {
                aa0.c("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.o oVar;
        super.onDetachedFromWindow();
        l lVar = this.j0;
        if (lVar != null) {
            lVar.j();
        }
        r0();
        int i2 = 0;
        this.M = false;
        o oVar2 = this.G;
        if (oVar2 != null) {
            oVar2.g = false;
            oVar2.Y(this);
        }
        this.O0.clear();
        removeCallbacks(this.P0);
        this.z.getClass();
        while (j0.a.d.b() != null) {
        }
        v vVar = this.v;
        ArrayList<e0> arrayList = vVar.c;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            uy5.b(arrayList.get(i3).a);
        }
        vVar.f(RecyclerView.this.F, false);
        while (i2 < getChildCount()) {
            int i4 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList<u58> arrayList2 = uy5.c(childAt).a;
            for (int iG = ws0.g(arrayList2); -1 < iG; iG--) {
                arrayList2.get(iG).a();
            }
            i2 = i4;
        }
        if (!b1 || (oVar = this.z0) == null) {
            return;
        }
        boolean zRemove = oVar.t.remove(this);
        if (!W0 || zRemove) {
            this.z0 = null;
        } else {
            aa0.c("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<n> arrayList = this.J;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).g(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i2;
        boolean z2;
        if (this.G != null && !this.R && motionEvent.getAction() == 8) {
            float f2 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.G.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.G.e() ? motionEvent.getAxisValue(10) : 0.0f;
                i2 = 0;
                z2 = false;
                f2 = f3;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.G.f()) {
                    float f4 = -axisValue;
                    axisValue = 0.0f;
                    f2 = f4;
                } else if (!this.G.e()) {
                    axisValue = 0.0f;
                }
                i2 = 26;
                z2 = this.T0;
            } else {
                axisValue = 0.0f;
                i2 = 0;
                z2 = false;
            }
            int i3 = (int) (f2 * this.w0);
            int i4 = (int) (axisValue * this.v0);
            if (z2) {
                OverScroller overScroller = this.y0.v;
                l0((overScroller.getFinalX() - overScroller.getCurrX()) + i4, true, (overScroller.getFinalY() - overScroller.getCurrY()) + i3);
            } else {
                o oVar = this.G;
                if (oVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.R) {
                    int[] iArr = this.N0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zE = oVar.e();
                    boolean zF = this.G.f();
                    int i5 = zF ? (zE ? 1 : 0) | 2 : zE ? 1 : 0;
                    float y2 = motionEvent.getY();
                    float x2 = motionEvent.getX();
                    int iD0 = i4 - d0(y2, i4);
                    int iE0 = i3 - e0(x2, i3);
                    getScrollingChildHelper().g(i5, 1);
                    if (u(zE ? iD0 : 0, zF ? iE0 : 0, 1, this.N0, this.L0)) {
                        iD0 -= iArr[0];
                        iE0 -= iArr[1];
                    }
                    h0(zE ? iD0 : 0, zF ? iE0 : 0, motionEvent, 1);
                    androidx.recyclerview.widget.o oVar2 = this.z0;
                    if (oVar2 != null && (iD0 != 0 || iE0 != 0)) {
                        oVar2.a(this, iD0, iE0);
                    }
                    q0(1);
                }
            }
            if (i2 != 0 && !z2) {
                this.V0.a(motionEvent, i2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.R) {
            this.L = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.m0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            o oVar = this.G;
            if (oVar != null) {
                boolean zE = oVar.e();
                boolean zF = this.G.f();
                if (this.m0 == null) {
                    this.m0 = VelocityTracker.obtain();
                }
                this.m0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.S) {
                        this.S = false;
                    }
                    this.l0 = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.p0 = x2;
                    this.n0 = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.q0 = y2;
                    this.o0 = y2;
                    EdgeEffect edgeEffect = this.f0;
                    if (edgeEffect == null || da3.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        da3.b(this.f0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.h0;
                    if (edgeEffect2 != null && da3.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        da3.b(this.h0, 0.0f, motionEvent.getY() / getHeight());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect3 = this.g0;
                    if (edgeEffect3 != null && da3.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        da3.b(this.g0, 0.0f, motionEvent.getX() / getWidth());
                        z2 = true;
                    }
                    EdgeEffect edgeEffect4 = this.i0;
                    if (edgeEffect4 != null && da3.a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        da3.b(this.i0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z2 = true;
                    }
                    if (z2 || this.k0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        q0(1);
                    }
                    int[] iArr = this.M0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    o0(0);
                } else if (actionMasked == 1) {
                    this.m0.clear();
                    q0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.l0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.l0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.k0 != 1) {
                        int i2 = x3 - this.n0;
                        int i3 = y3 - this.o0;
                        if (!zE || Math.abs(i2) <= this.r0) {
                            z3 = false;
                        } else {
                            this.p0 = x3;
                            z3 = true;
                        }
                        if (zF && Math.abs(i3) > this.r0) {
                            this.q0 = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.m0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    q0(0);
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.l0 = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.p0 = x4;
                    this.n0 = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.q0 = y4;
                    this.o0 = y4;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.k0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.O = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.G;
        if (oVar == null) {
            p(i2, i3);
            return;
        }
        boolean zQ = oVar.Q();
        boolean z2 = false;
        a0 a0Var = this.B0;
        if (zQ) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.G.b.p(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.Q0 = z2;
            if (z2 || this.F == null) {
                return;
            }
            if (a0Var.d == 1) {
                s();
            }
            this.G.A0(i2, i3);
            a0Var.i = true;
            t();
            this.G.C0(i2, i3);
            if (this.G.F0()) {
                this.G.A0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                a0Var.i = true;
                t();
                this.G.C0(i2, i3);
            }
            this.R0 = getMeasuredWidth();
            this.S0 = getMeasuredHeight();
            return;
        }
        if (this.N) {
            this.G.b.p(i2, i3);
            return;
        }
        if (this.U) {
            n0();
            V();
            Z();
            W(true);
            if (a0Var.k) {
                a0Var.g = true;
            } else {
                this.x.c();
                a0Var.g = false;
            }
            this.U = false;
            p0(false);
        } else if (a0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        f fVar = this.F;
        if (fVar != null) {
            a0Var.e = fVar.f();
        } else {
            a0Var.e = 0;
        }
        n0();
        this.G.b.p(i2, i3);
        p0(false);
        a0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.w = yVar;
        super.onRestoreInstanceState(yVar.t);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.w;
        if (yVar2 != null) {
            yVar.v = yVar2.v;
            return yVar;
        }
        o oVar = this.G;
        if (oVar != null) {
            yVar.v = oVar.m0();
            return yVar;
        }
        yVar.v = null;
        return yVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.i0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zE;
        boolean z2;
        if (!this.R && !this.S) {
            s sVar = this.L;
            if (sVar == null) {
                zE = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                sVar.a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.L = null;
                }
                zE = true;
            }
            if (zE) {
                VelocityTracker velocityTracker = this.m0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            o oVar = this.G;
            if (oVar != null) {
                boolean zE2 = oVar.e();
                boolean zF = this.G.f();
                if (this.m0 == null) {
                    this.m0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.M0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.m0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.m0;
                        int i2 = this.u0;
                        velocityTracker2.computeCurrentVelocity(1000, i2);
                        float f2 = zE2 ? -this.m0.getXVelocity(this.l0) : 0.0f;
                        float f3 = zF ? -this.m0.getYVelocity(this.l0) : 0.0f;
                        if ((f2 == 0.0f && f3 == 0.0f) || !J((int) f2, (int) f3, this.t0, i2)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.m0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        q0(0);
                        c0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.l0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.l0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.p0 - x2;
                        int iMax2 = this.q0 - y2;
                        if (this.k0 != 1) {
                            if (zE2) {
                                int i3 = this.r0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i3) : Math.min(0, iMax + i3);
                                if (iMax != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            if (zF) {
                                int i4 = this.r0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i4) : Math.min(0, iMax2 + i4);
                                if (iMax2 != 0) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.k0 == 1) {
                            int[] iArr2 = this.N0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iD0 = iMax - d0(motionEvent.getY(), iMax);
                            int iE0 = iMax2 - e0(motionEvent.getX(), iMax2);
                            boolean zU = u(zE2 ? iD0 : 0, zF ? iE0 : 0, 0, this.N0, this.L0);
                            int[] iArr3 = this.L0;
                            if (zU) {
                                iD0 -= iArr2[0];
                                iE0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i5 = iD0;
                            int i6 = iE0;
                            this.p0 = x2 - iArr3[0];
                            this.q0 = y2 - iArr3[1];
                            if (h0(zE2 ? i5 : 0, zF ? i6 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.o oVar2 = this.z0;
                            if (oVar2 != null && (i5 != 0 || i6 != 0)) {
                                oVar2.a(this, i5, i6);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.m0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        q0(0);
                        c0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.l0 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.p0 = x3;
                        this.n0 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.q0 = y3;
                        this.o0 = y3;
                    } else if (actionMasked == 6) {
                        X(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.l0 = motionEvent.getPointerId(0);
                int x4 = (int) (motionEvent.getX() + 0.5f);
                this.p0 = x4;
                this.n0 = x4;
                int y4 = (int) (motionEvent.getY() + 0.5f);
                this.q0 = y4;
                this.o0 = y4;
                o0(0);
                this.m0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        setMeasuredDimension(o.h(i2, paddingRight, getMinimumWidth()), o.h(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void p0(boolean z2) {
        if (this.P < 1) {
            if (W0) {
                aa0.c("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
                return;
            }
            this.P = 1;
        }
        if (!z2 && !this.R) {
            this.Q = false;
        }
        if (this.P == 1) {
            if (z2 && this.Q && !this.R && this.G != null && this.F != null) {
                r();
            }
            if (!this.R) {
                this.Q = false;
            }
        }
        this.P--;
    }

    public final void q(View view) {
        e0 e0VarO = O(view);
        f fVar = this.F;
        if (fVar != null && e0VarO != null) {
            fVar.p(e0VarO);
        }
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) this.W.get(size)).b(view);
            }
        }
    }

    public final void q0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0349  */
    /* JADX WARN: Code duplicated, block: B:181:0x0387  */
    /* JADX WARN: Code duplicated, block: B:183:0x038a  */
    /* JADX WARN: Code duplicated, block: B:189:0x039d  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:194:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:200:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c0 A[LOOP:4: B:196:0x03ae->B:203:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:209:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:212:0x03dd A[LOOP:5: B:205:0x03cb->B:212:0x03dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:246:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        boolean z2;
        long j2;
        e0 e0Var;
        View view;
        int i2;
        int iB;
        int i3;
        int iMin;
        e0 e0VarH;
        View view2;
        e0 e0VarH2;
        int i4;
        View viewFindViewById;
        boolean z3;
        int i5;
        boolean z4;
        if (this.F == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.G == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        a0 a0Var = this.B0;
        boolean z5 = false;
        a0Var.i = false;
        boolean z6 = true;
        Object[] objArr = this.Q0 && !(this.R0 == getWidth() && this.S0 == getHeight());
        this.R0 = 0;
        this.S0 = 0;
        this.Q0 = false;
        if (a0Var.d == 1) {
            s();
            this.G.z0(this);
            t();
        } else {
            androidx.recyclerview.widget.a aVar = this.x;
            if ((aVar.c.isEmpty() || aVar.b.isEmpty()) && !objArr == true && this.G.n == getWidth() && this.G.o == getHeight()) {
                this.G.z0(this);
            } else {
                this.G.z0(this);
                t();
            }
        }
        a0Var.a(4);
        n0();
        V();
        a0Var.d = 1;
        boolean z7 = a0Var.j;
        androidx.recyclerview.widget.f fVar = this.y;
        v vVar = this.v;
        j0 j0Var = this.z;
        if (z7) {
            int iE = fVar.e() - 1;
            while (iE >= 0) {
                e0 e0VarO = O(fVar.d(iE));
                if (e0VarO.q()) {
                    z4 = z6;
                } else {
                    long jL = L(e0VarO);
                    this.j0.getClass();
                    l.b bVar = new l.b();
                    bVar.a(e0VarO);
                    we6<e0> we6Var = j0Var.b;
                    z4 = z6;
                    ep9<e0, j0.a> ep9Var = j0Var.a;
                    e0 e0VarB = we6Var.b(jL);
                    if (e0VarB == null || e0VarB.q()) {
                        j0Var.a(e0VarO, bVar);
                    } else {
                        j0.a aVar2 = ep9Var.get(e0VarB);
                        boolean z8 = (aVar2 == null || (aVar2.a & 1) == 0) ? z5 : z4;
                        j0.a aVar3 = ep9Var.get(e0VarO);
                        boolean z9 = (aVar3 == null || (aVar3.a & 1) == 0) ? z5 : z4;
                        if (z8 && e0VarB == e0VarO) {
                            j0Var.a(e0VarO, bVar);
                        } else {
                            l.b bVarB = j0Var.b(e0VarB, 4);
                            j0Var.a(e0VarO, bVar);
                            l.b bVarB2 = j0Var.b(e0VarO, 8);
                            if (bVarB == null) {
                                int iE2 = fVar.e();
                                for (int i6 = 0; i6 < iE2; i6++) {
                                    e0 e0VarO2 = O(fVar.d(i6));
                                    if (e0VarO2 != e0VarO && L(e0VarO2) == jL) {
                                        f fVar2 = this.F;
                                        if (fVar2 == null || !fVar2.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(e0VarO2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(e0VarO);
                                            ru3.e(sb, B());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(e0VarO2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(e0VarO);
                                        ru3.e(sb2, B());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0VarB + " cannot be found but it is necessary for " + e0VarO + B());
                            } else {
                                e0VarB.p(false);
                                if (z8) {
                                    g(e0VarB);
                                }
                                if (e0VarB != e0VarO) {
                                    if (z9) {
                                        g(e0VarO);
                                    }
                                    e0VarB.h = e0VarO;
                                    g(e0VarB);
                                    vVar.m(e0VarB);
                                    e0VarO.p(false);
                                    e0VarO.i = e0VarB;
                                }
                                if (this.j0.b(e0VarB, e0VarO, bVarB, bVarB2)) {
                                    Y();
                                }
                            }
                        }
                    }
                }
                iE--;
                z6 = z4;
                z5 = false;
            }
            z2 = z6;
            ep9<e0, j0.a> ep9Var2 = j0Var.a;
            for (int i7 = ep9Var2.v - 1; i7 >= 0; i7--) {
                e0 e0VarF = ep9Var2.f(i7);
                j0.a aVarH = ep9Var2.h(i7);
                int i8 = aVarH.a;
                int i9 = i8 & 3;
                d dVar = this.U0;
                if (i9 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.G.s0(e0VarF.a, recyclerView.v);
                } else if ((i8 & 1) != 0) {
                    l.b bVar2 = aVarH.b;
                    if (bVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.G.s0(e0VarF.a, recyclerView2.v);
                    } else {
                        l.b bVar3 = aVarH.c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.v.m(e0VarF);
                        recyclerView3.g(e0VarF);
                        e0VarF.p(false);
                        if (recyclerView3.j0.c(e0VarF, bVar2, bVar3)) {
                            recyclerView3.Y();
                        }
                    }
                } else if ((i8 & 14) == 14) {
                    l.b bVar4 = aVarH.b;
                    l.b bVar5 = aVarH.c;
                    RecyclerView recyclerView4 = RecyclerView.this;
                    e0VarF.p(false);
                    if (recyclerView4.j0.a(e0VarF, bVar4, bVar5)) {
                        recyclerView4.Y();
                    }
                } else if ((i8 & 12) == 12) {
                    l.b bVar6 = aVarH.b;
                    l.b bVar7 = aVarH.c;
                    dVar.getClass();
                    e0VarF.p(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    boolean z10 = recyclerView5.a0;
                    l lVar = recyclerView5.j0;
                    if (z10) {
                        if (lVar.b(e0VarF, e0VarF, bVar6, bVar7)) {
                            recyclerView5.Y();
                        }
                    } else if (lVar.d(e0VarF, bVar6, bVar7)) {
                        recyclerView5.Y();
                    }
                } else if ((i8 & 4) != 0) {
                    l.b bVar8 = aVarH.b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.v.m(e0VarF);
                    recyclerView6.g(e0VarF);
                    e0VarF.p(false);
                    if (recyclerView6.j0.c(e0VarF, bVar8, null)) {
                        recyclerView6.Y();
                    }
                } else {
                    if ((i8 & 8) != 0) {
                        l.b bVar9 = aVarH.b;
                        l.b bVar10 = aVarH.c;
                        RecyclerView recyclerView7 = RecyclerView.this;
                        i5 = 0;
                        e0VarF.p(false);
                        if (recyclerView7.j0.a(e0VarF, bVar9, bVar10)) {
                            recyclerView7.Y();
                        }
                    }
                    aVarH.a = i5;
                    aVarH.b = null;
                    aVarH.c = null;
                    j0.a.d.a(aVarH);
                }
                i5 = 0;
                aVarH.a = i5;
                aVarH.b = null;
                aVarH.c = null;
                j0.a.d.a(aVarH);
            }
        } else {
            z2 = true;
        }
        this.G.r0(vVar);
        a0Var.b = a0Var.e;
        this.a0 = false;
        this.b0 = false;
        a0Var.j = false;
        a0Var.k = false;
        this.G.f = false;
        ArrayList<e0> arrayList = vVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.G;
        if (oVar.k) {
            oVar.j = 0;
            oVar.k = false;
            vVar.n();
        }
        this.G.k0(a0Var);
        boolean z11 = z2;
        W(z11);
        p0(false);
        j0Var.a.clear();
        j0Var.b.a();
        int[] iArr = this.J0;
        int i10 = iArr[0];
        int i11 = iArr[z11 ? 1 : 0];
        F(iArr);
        if (iArr[0] != i10 || iArr[z11 ? 1 : 0] != i11) {
            w(0, 0);
        }
        if (this.x0 && this.F != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j2 = a0Var.m;
                if (j2 == -1) {
                    e0Var = null;
                } else {
                    e0Var = null;
                }
                if (e0Var != null) {
                    view2 = e0Var.a;
                    if (!fVar.c.contains(view2)) {
                        if (fVar.e() <= 0) {
                            view = null;
                        } else {
                            i2 = a0Var.l;
                            if (i2 == -1) {
                                i2 = 0;
                            }
                            iB = a0Var.b();
                            i3 = i2;
                            while (true) {
                                if (i3 < iB) {
                                    e0VarH2 = H(i3);
                                    if (e0VarH2 != null) {
                                        view = e0VarH2.a;
                                        if (!view.hasFocusable()) {
                                            i3++;
                                        }
                                    }
                                }
                                iMin = Math.min(iB, i2) - 1;
                                while (true) {
                                    if (iMin >= 0) {
                                        e0VarH = H(iMin);
                                        if (e0VarH != null) {
                                            view2 = e0VarH.a;
                                            if (view2.hasFocusable()) {
                                                view = view2;
                                            } else {
                                                iMin--;
                                            }
                                        }
                                    }
                                    view = null;
                                }
                            }
                        }
                    } else if (fVar.e() <= 0) {
                        view = null;
                    } else {
                        i2 = a0Var.l;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        iB = a0Var.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                e0VarH2 = H(i3);
                                if (e0VarH2 != null) {
                                    view = e0VarH2.a;
                                    if (!view.hasFocusable()) {
                                        i3++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i2) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    e0VarH = H(iMin);
                                    if (e0VarH != null) {
                                        view2 = e0VarH.a;
                                        if (view2.hasFocusable()) {
                                            view = view2;
                                        } else {
                                            iMin--;
                                        }
                                    }
                                }
                                view = null;
                            }
                        }
                    }
                } else if (fVar.e() <= 0) {
                    view = null;
                } else {
                    i2 = a0Var.l;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = a0Var.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            e0VarH2 = H(i3);
                            if (e0VarH2 != null) {
                                view = e0VarH2.a;
                                if (!view.hasFocusable()) {
                                    i3++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i2) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                e0VarH = H(iMin);
                                if (e0VarH != null) {
                                    view2 = e0VarH.a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                    } else {
                                        iMin--;
                                    }
                                }
                            }
                            view = null;
                        }
                    }
                }
                if (view != null) {
                    i4 = a0Var.n;
                    if (i4 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (fVar.c.contains(getFocusedChild())) {
                j2 = a0Var.m;
                if (j2 == -1 && (z3 = this.F.b) && z3) {
                    int iH = fVar.h();
                    e0Var = null;
                    for (int i12 = 0; i12 < iH; i12++) {
                        e0 e0VarO3 = O(fVar.g(i12));
                        if (e0VarO3 != null && !e0VarO3.j() && e0VarO3.e == j2) {
                            if (!fVar.c.contains(e0VarO3.a)) {
                                e0Var = e0VarO3;
                                break;
                            }
                            e0Var = e0VarO3;
                        }
                    }
                } else {
                    e0Var = null;
                }
                if (e0Var != null) {
                    view2 = e0Var.a;
                    if (!fVar.c.contains(view2) && view2.hasFocusable()) {
                        view = view2;
                    } else if (fVar.e() <= 0) {
                        view = null;
                    } else {
                        i2 = a0Var.l;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                        iB = a0Var.b();
                        i3 = i2;
                        while (true) {
                            if (i3 < iB) {
                                e0VarH2 = H(i3);
                                if (e0VarH2 != null) {
                                    view = e0VarH2.a;
                                    if (!view.hasFocusable()) {
                                        i3++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i2) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    e0VarH = H(iMin);
                                    if (e0VarH != null) {
                                        view2 = e0VarH.a;
                                        if (view2.hasFocusable()) {
                                            view = view2;
                                        } else {
                                            iMin--;
                                        }
                                    }
                                }
                                view = null;
                            }
                        }
                    }
                } else if (fVar.e() <= 0) {
                    view = null;
                } else {
                    i2 = a0Var.l;
                    if (i2 == -1) {
                        i2 = 0;
                    }
                    iB = a0Var.b();
                    i3 = i2;
                    while (true) {
                        if (i3 < iB) {
                            e0VarH2 = H(i3);
                            if (e0VarH2 != null) {
                                view = e0VarH2.a;
                                if (!view.hasFocusable()) {
                                    i3++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i2) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                e0VarH = H(iMin);
                                if (e0VarH != null) {
                                    view2 = e0VarH.a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                    } else {
                                        iMin--;
                                    }
                                }
                            }
                            view = null;
                        }
                    }
                }
                if (view != null) {
                    i4 = a0Var.n;
                    if (i4 != -1 && (viewFindViewById = view.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        a0Var.m = -1L;
        a0Var.l = -1;
        a0Var.n = -1;
    }

    public final void r0() {
        z zVar;
        setScrollState(0);
        d0 d0Var = this.y0;
        RecyclerView.this.removeCallbacks(d0Var);
        d0Var.v.abortAnimation();
        o oVar = this.G;
        if (oVar == null || (zVar = oVar.e) == null) {
            return;
        }
        zVar.f();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        e0 e0VarO = O(view);
        if (e0VarO != null) {
            if (e0VarO.l()) {
                e0VarO.j &= -257;
            } else if (!e0VarO.q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(e0VarO);
                sa1.a(sb, B());
                return;
            }
        } else if (W0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sa1.a(sb2, B());
            return;
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        z zVar = this.G.e;
        if ((zVar == null || !zVar.e) && !R() && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.G.u0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList<s> arrayList = this.K;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.P != 0 || this.R) {
            this.Q = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        j0.a aVar;
        View viewD;
        a0 a0Var = this.B0;
        a0Var.a(1);
        C(a0Var);
        a0Var.i = false;
        n0();
        j0 j0Var = this.z;
        ep9<e0, j0.a> ep9Var = j0Var.a;
        ep9<e0, j0.a> ep9Var2 = j0Var.a;
        ep9Var.clear();
        we6<e0> we6Var = j0Var.b;
        we6Var.a();
        V();
        Z();
        e0 e0VarN = null;
        View focusedChild = (this.x0 && hasFocus() && this.F != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewD = D(focusedChild)) != null) {
            e0VarN = N(viewD);
        }
        if (e0VarN == null) {
            a0Var.m = -1L;
            a0Var.l = -1;
            a0Var.n = -1;
        } else {
            a0Var.m = this.F.b ? e0VarN.e : -1L;
            a0Var.l = this.a0 ? -1 : e0VarN.j() ? e0VarN.d : e0VarN.b();
            View focusedChild2 = e0VarN.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            a0Var.n = id;
        }
        a0Var.h = a0Var.j && this.F0;
        this.F0 = false;
        this.E0 = false;
        a0Var.g = a0Var.k;
        a0Var.e = this.F.f();
        F(this.J0);
        boolean z2 = a0Var.j;
        androidx.recyclerview.widget.f fVar = this.y;
        if (z2) {
            int iE = fVar.e();
            for (int i2 = 0; i2 < iE; i2++) {
                e0 e0VarO = O(fVar.d(i2));
                if (!e0VarO.q() && (!e0VarO.h() || this.F.b)) {
                    l lVar = this.j0;
                    l.e(e0VarO);
                    e0VarO.e();
                    lVar.getClass();
                    l.b bVar = new l.b();
                    bVar.a(e0VarO);
                    j0.a aVarA = ep9Var2.get(e0VarO);
                    if (aVarA == null) {
                        aVarA = j0.a.a();
                        ep9Var2.put(e0VarO, aVarA);
                    }
                    aVarA.b = bVar;
                    aVarA.a |= 4;
                    if (a0Var.h && e0VarO.m() && !e0VarO.j() && !e0VarO.q() && !e0VarO.h()) {
                        we6Var.f(L(e0VarO), e0VarO);
                    }
                }
            }
        }
        if (a0Var.k) {
            int iH = fVar.h();
            for (int i3 = 0; i3 < iH; i3++) {
                e0 e0VarO2 = O(fVar.g(i3));
                if (W0 && e0VarO2.c == -1 && !e0VarO2.j()) {
                    aa0.c("view holder cannot have position -1 unless it is removed".concat(B()));
                    return;
                }
                if (!e0VarO2.q() && e0VarO2.d == -1) {
                    e0VarO2.d = e0VarO2.c;
                }
            }
            boolean z3 = a0Var.f;
            a0Var.f = false;
            this.G.j0(this.v, a0Var);
            a0Var.f = z3;
            for (int i4 = 0; i4 < fVar.e(); i4++) {
                e0 e0VarO3 = O(fVar.d(i4));
                if (!e0VarO3.q() && ((aVar = ep9Var2.get(e0VarO3)) == null || (aVar.a & 4) == 0)) {
                    l.e(e0VarO3);
                    boolean z4 = (e0VarO3.j & 8192) != 0;
                    l lVar2 = this.j0;
                    e0VarO3.e();
                    lVar2.getClass();
                    l.b bVar2 = new l.b();
                    bVar2.a(e0VarO3);
                    if (z4) {
                        b0(e0VarO3, bVar2);
                    } else {
                        j0.a aVarA2 = ep9Var2.get(e0VarO3);
                        if (aVarA2 == null) {
                            aVarA2 = j0.a.a();
                            ep9Var2.put(e0VarO3, aVarA2);
                        }
                        aVarA2.a |= 2;
                        aVarA2.b = bVar2;
                    }
                }
            }
            l();
        } else {
            l();
        }
        W(true);
        p0(false);
        a0Var.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        o oVar = this.G;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.R) {
            return;
        }
        boolean zE = oVar.e();
        boolean zF = this.G.f();
        if (zE || zF) {
            if (!zE) {
                i2 = 0;
            }
            if (!zF) {
                i3 = 0;
            }
            h0(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.T |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.d0 d0Var) {
        this.I0 = d0Var;
        egb.o(this, d0Var);
    }

    public void setAdapter(f fVar) {
        setLayoutFrozen(false);
        f fVar2 = this.F;
        x xVar = this.u;
        if (fVar2 != null) {
            fVar2.t(xVar);
            this.F.m(this);
        }
        l lVar = this.j0;
        if (lVar != null) {
            lVar.j();
        }
        o oVar = this.G;
        v vVar = this.v;
        if (oVar != null) {
            oVar.q0(vVar);
            this.G.r0(vVar);
        }
        vVar.a.clear();
        vVar.g();
        androidx.recyclerview.widget.a aVar = this.x;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        f<?> fVar3 = this.F;
        this.F = fVar;
        if (fVar != null) {
            fVar.r(xVar);
            fVar.i(this);
        }
        o oVar2 = this.G;
        if (oVar2 != null) {
            oVar2.W();
        }
        f fVar4 = this.F;
        vVar.a.clear();
        vVar.g();
        vVar.f(fVar3, true);
        u uVarC = vVar.c();
        if (fVar3 != null) {
            uVarC.b--;
        }
        if (uVarC.b == 0) {
            SparseArray<u.a> sparseArray = uVarC.a;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                u.a aVarValueAt = sparseArray.valueAt(i2);
                ArrayList<e0> arrayList = aVarValueAt.a;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    e0 e0Var = arrayList.get(i3);
                    i3++;
                    uy5.b(e0Var.a);
                }
                aVarValueAt.a.clear();
            }
        }
        if (fVar4 != null) {
            uVarC.b++;
        }
        vVar.e();
        this.B0.f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.A) {
            this.i0 = null;
            this.g0 = null;
            this.h0 = null;
            this.f0 = null;
        }
        this.A = z2;
        super.setClipToPadding(z2);
        if (this.O) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        kVar.getClass();
        this.e0 = kVar;
        this.i0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f0 = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.N = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.j0;
        if (lVar2 != null) {
            lVar2.j();
            this.j0.a = null;
        }
        this.j0 = lVar;
        if (lVar != null) {
            lVar.a = this.G0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        v vVar = this.v;
        vVar.e = i2;
        vVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        RecyclerView recyclerView;
        if (oVar == this.G) {
            return;
        }
        r0();
        o oVar2 = this.G;
        v vVar = this.v;
        if (oVar2 != null) {
            l lVar = this.j0;
            if (lVar != null) {
                lVar.j();
            }
            this.G.q0(vVar);
            this.G.r0(vVar);
            vVar.a.clear();
            vVar.g();
            if (this.M) {
                o oVar3 = this.G;
                oVar3.g = false;
                oVar3.Y(this);
            }
            this.G.D0(null);
            this.G = null;
        } else {
            vVar.a.clear();
            vVar.g();
        }
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.b.g();
        ArrayList arrayList = fVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = fVar.a.a;
            if (size < 0) {
                break;
            }
            e0 e0VarO = O((View) arrayList.get(size));
            if (e0VarO != null) {
                int i2 = e0VarO.p;
                if (recyclerView.R()) {
                    e0VarO.q = i2;
                    recyclerView.O0.add(e0VarO);
                } else {
                    e0VarO.a.setImportantForAccessibility(i2);
                }
                e0VarO.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.G = oVar;
        if (oVar != null) {
            if (oVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oVar);
                vr0.d(sb, " is already attached to a RecyclerView:", oVar.b.B());
                return;
            } else {
                oVar.D0(this);
                if (this.M) {
                    o oVar4 = this.G;
                    oVar4.g = true;
                    oVar4.X(this);
                }
            }
        }
        vVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            z90.a("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        m97 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(r rVar) {
        this.s0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.C0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.x0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        v vVar = this.v;
        RecyclerView recyclerView = RecyclerView.this;
        vVar.f(recyclerView.F, false);
        u uVar2 = vVar.g;
        if (uVar2 != null) {
            uVar2.b--;
        }
        vVar.g = uVar;
        if (uVar != null && recyclerView.getAdapter() != null) {
            vVar.g.b++;
        }
        vVar.e();
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
        this.H = wVar;
    }

    public void setScrollState(int i2) {
        z zVar;
        if (i2 == this.k0) {
            return;
        }
        if (X0) {
            StringBuilder sbB = t43.b(i2, "setting scroll state to ", " from ");
            sbB.append(this.k0);
            Log.d("RecyclerView", sbB.toString(), new Exception());
        }
        this.k0 = i2;
        if (i2 != 2) {
            d0 d0Var = this.y0;
            RecyclerView.this.removeCallbacks(d0Var);
            d0Var.v.abortAnimation();
            o oVar = this.G;
            if (oVar != null && (zVar = oVar.e) != null) {
                zVar.f();
            }
        }
        o oVar2 = this.G;
        if (oVar2 != null) {
            oVar2.n0(i2);
        }
        t tVar = this.C0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t) this.D0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.r0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.r0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.v.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.R) {
            j("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.R = true;
                this.S = true;
                r0();
                return;
            }
            this.R = false;
            if (this.Q && this.G != null && this.F != null) {
                requestLayout();
            }
            this.Q = false;
        }
    }

    public final void t() {
        n0();
        V();
        a0 a0Var = this.B0;
        a0Var.a(6);
        this.x.c();
        a0Var.e = this.F.f();
        a0Var.c = 0;
        if (this.w != null) {
            f fVar = this.F;
            int iOrdinal = fVar.c.ordinal();
            if (iOrdinal == 1 ? fVar.f() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.w.v;
                if (parcelable != null) {
                    this.G.l0(parcelable);
                }
                this.w = null;
            }
        }
        a0Var.g = false;
        this.G.j0(this.v, a0Var);
        a0Var.f = false;
        a0Var.j = a0Var.j && this.j0 != null;
        a0Var.d = 4;
        W(true);
        p0(false);
    }

    public final boolean u(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, i4, iArr, iArr2);
    }

    public final void v(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void w(int i2, int i3) {
        this.d0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        t tVar = this.C0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t) this.D0.get(size)).b(this, i2, i3);
            }
        }
        this.d0--;
    }

    public final void x() {
        if (this.i0 != null) {
            return;
        }
        ((b0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.i0 = edgeEffect;
        if (this.A) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f0 != null) {
            return;
        }
        ((b0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f0 = edgeEffect;
        if (this.A) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.h0 != null) {
            return;
        }
        ((b0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.h0 = edgeEffect;
        if (this.A) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class y extends defpackage.e0 {
        public static final Parcelable.Creator<y> CREATOR = new a();
        public Parcelable v;

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.v, 0);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<y> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new y[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class p extends ViewGroup.MarginLayoutParams {
        public e0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class h {
        public void c(int i, int i2) {
            b();
        }

        public void a() {
        }

        public void b() {
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2) {
        }

        public void f(int i, int i2) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class o {
        public androidx.recyclerview.widget.f a;
        public RecyclerView b;
        public final i0 c;
        public final i0 d;
        public z e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements i0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int a(View view) {
                return o.C(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int b() {
                return o.this.J();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int c() {
                o oVar = o.this;
                return oVar.n - oVar.K();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final View d(int i) {
                return o.this.v(i);
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int e(View view) {
                return o.F(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements i0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int a(View view) {
                return o.G(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int b() {
                return o.this.L();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int c() {
                o oVar = o.this;
                return oVar.o - oVar.I();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final View d(int i) {
                return o.this.v(i);
            }

            @Override // androidx.recyclerview.widget.i0.b
            public final int e(View view) {
                return o.A(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class c {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            b bVar = new b();
            this.c = new i0(aVar);
            this.d = new i0(bVar);
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = true;
        }

        public static int A(View view) {
            return view.getBottom() + ((p) view.getLayoutParams()).b.bottom;
        }

        public static int C(View view) {
            return view.getLeft() - ((p) view.getLayoutParams()).b.left;
        }

        public static int D(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int E(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int F(View view) {
            return view.getRight() + ((p) view.getLayoutParams()).b.right;
        }

        public static int G(View view) {
            return view.getTop() - ((p) view.getLayoutParams()).b.top;
        }

        public static int M(View view) {
            return ((p) view.getLayoutParams()).a.d();
        }

        public static c N(Context context, AttributeSet attributeSet, int i, int i2) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mh8.a, i, i2);
            cVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean S(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void T(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public static int h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int x(boolean z, int i, int i2, int i3, int i4) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public final void A0(int i, int i2) {
            this.n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0 && !RecyclerView.a1) {
                this.n = 0;
            }
            this.o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m = mode2;
            if (mode2 != 0 || RecyclerView.a1) {
                return;
            }
            this.o = 0;
        }

        public void B(Rect rect, View view) {
            boolean z = RecyclerView.W0;
            p pVar = (p) view.getLayoutParams();
            Rect rect2 = pVar.b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void B0(Rect rect, int i, int i2) {
            int iK = K() + J() + rect.width();
            int I = I() + L() + rect.height();
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            this.b.setMeasuredDimension(h(i, iK, recyclerView.getMinimumWidth()), h(i2, I, this.b.getMinimumHeight()));
        }

        public final void C0(int i, int i2) {
            int iW = w();
            if (iW == 0) {
                this.b.p(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iW; i7++) {
                View viewV = v(i7);
                Rect rect = this.b.C;
                B(rect, viewV);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.C.set(i6, i4, i3, i5);
            B0(this.b.C, i, i2);
        }

        public final void D0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.n = 0;
                this.o = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.y;
                this.n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.m = 1073741824;
        }

        public final boolean E0(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.h && S(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && S(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public boolean F0() {
            return false;
        }

        public final boolean G0(View view, int i, int i2, p pVar) {
            return (this.h && S(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && S(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public final int H() {
            RecyclerView recyclerView = this.b;
            f adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.f();
            }
            return 0;
        }

        public void H0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int I() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final void I0(z zVar) {
            z zVar2 = this.e;
            if (zVar2 != null && zVar != zVar2 && zVar2.e) {
                zVar2.f();
            }
            this.e = zVar;
            RecyclerView recyclerView = this.b;
            d0 d0Var = recyclerView.y0;
            RecyclerView.this.removeCallbacks(d0Var);
            d0Var.v.abortAnimation();
            if (zVar.h) {
                Log.w("RecyclerView", "An instance of " + zVar.getClass().getSimpleName() + " was started more than once. Each instance of" + zVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            zVar.b = recyclerView;
            zVar.c = this;
            int i = zVar.a;
            if (i == -1) {
                z90.a("Invalid target position");
                return;
            }
            recyclerView.B0.a = i;
            zVar.e = true;
            zVar.d = true;
            zVar.f = recyclerView.G.r(i);
            zVar.b.y0.b();
            zVar.h = true;
        }

        public final int J() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public boolean J0() {
            return false;
        }

        public final int K() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int L() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int O(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.F == null || !f()) {
                return 1;
            }
            return this.b.F.f();
        }

        public final void P(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((p) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.E;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean Q() {
            return false;
        }

        public boolean R() {
            return false;
        }

        public void U(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.y.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.y.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void V(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.y.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.y.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public View Z(View view, int i, v vVar, a0 a0Var) {
            return null;
        }

        public void a0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            v vVar = recyclerView.v;
            a0 a0Var = recyclerView.B0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            f fVar = this.b.F;
            if (fVar != null) {
                accessibilityEvent.setItemCount(fVar.f());
            }
        }

        public final void b(View view, int i, boolean z) {
            e0 e0VarO = RecyclerView.O(view);
            if (z || e0VarO.j()) {
                ep9<e0, j0.a> ep9Var = this.b.z.a;
                j0.a aVarA = ep9Var.get(e0VarO);
                if (aVarA == null) {
                    aVarA = j0.a.a();
                    ep9Var.put(e0VarO, aVarA);
                }
                aVarA.a |= 1;
            } else {
                this.b.z.c(e0VarO);
            }
            p pVar = (p) view.getLayoutParams();
            if (e0VarO.r() || e0VarO.k()) {
                if (e0VarO.k()) {
                    e0VarO.n.m(e0VarO);
                } else {
                    e0VarO.j &= -33;
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.b;
                androidx.recyclerview.widget.f fVar = this.a;
                if (parent == recyclerView) {
                    androidx.recyclerview.widget.f.a aVar = fVar.b;
                    int iIndexOfChild = fVar.a.a.indexOfChild(view);
                    int iB = (iIndexOfChild == -1 || aVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - aVar.b(iIndexOfChild);
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (iB == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.B());
                    }
                    if (iB != i) {
                        o oVar = this.b.G;
                        View viewV = oVar.v(iB);
                        if (viewV == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + oVar.b.toString());
                        }
                        oVar.v(iB);
                        oVar.a.c(iB);
                        p pVar2 = (p) viewV.getLayoutParams();
                        e0 e0VarO2 = RecyclerView.O(viewV);
                        boolean zJ = e0VarO2.j();
                        RecyclerView recyclerView2 = oVar.b;
                        if (zJ) {
                            ep9<e0, j0.a> ep9Var2 = recyclerView2.z.a;
                            j0.a aVarA2 = ep9Var2.get(e0VarO2);
                            if (aVarA2 == null) {
                                aVarA2 = j0.a.a();
                                ep9Var2.put(e0VarO2, aVarA2);
                            }
                            aVarA2.a = 1 | aVarA2.a;
                        } else {
                            recyclerView2.z.c(e0VarO2);
                        }
                        oVar.a.b(viewV, i, pVar2, e0VarO2.j());
                    }
                } else {
                    fVar.a(view, i, false);
                    pVar.c = true;
                    z zVar = this.e;
                    if (zVar != null && zVar.e) {
                        zVar.b.getClass();
                        e0 e0VarO3 = RecyclerView.O(view);
                        if ((e0VarO3 != null ? e0VarO3.d() : -1) == zVar.a) {
                            zVar.f = view;
                            if (RecyclerView.X0) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (pVar.d) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + pVar.a);
                }
                e0VarO.a.invalidate();
                pVar.d = false;
            }
        }

        public void b0(v vVar, a0 a0Var, j4 j4Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                j4Var.a(8192);
                j4Var.q(true);
                j4Var.i(67108864, true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                j4Var.a(4096);
                j4Var.q(true);
                j4Var.i(67108864, true);
            }
            j4Var.k(j4.g.a(O(vVar, a0Var), z(vVar, a0Var), 0));
        }

        public void c(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.j(str);
            }
        }

        public final void c0(View view, j4 j4Var) {
            e0 e0VarO = RecyclerView.O(view);
            if (e0VarO == null || e0VarO.j()) {
                return;
            }
            androidx.recyclerview.widget.f fVar = this.a;
            if (fVar.c.contains(e0VarO.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            d0(recyclerView.v, recyclerView.B0, view, j4Var);
        }

        public final void d(Rect rect, View view) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.P(view));
            }
        }

        public void d0(v vVar, a0 a0Var, View view, j4 j4Var) {
            j4Var.l(j4.h.a(false, f() ? M(view) : 0, 1, e() ? M(view) : 0, 1));
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public boolean g(p pVar) {
            return pVar != null;
        }

        public void j0(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int k(a0 a0Var) {
            return 0;
        }

        public int l(a0 a0Var) {
            return 0;
        }

        public int m(a0 a0Var) {
            return 0;
        }

        public Parcelable m0() {
            return null;
        }

        public int n(a0 a0Var) {
            return 0;
        }

        public int o(a0 a0Var) {
            return 0;
        }

        public boolean o0(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return p0(recyclerView.v, recyclerView.B0, i, bundle);
        }

        public int p(a0 a0Var) {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
          0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean p0(v vVar, a0 a0Var, int i, Bundle bundle) {
            int iL;
            int iJ;
            float f;
            if (this.b != null) {
                int iHeight = this.o;
                int iWidth = this.n;
                Rect rect = new Rect();
                if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                    iHeight = rect.height();
                    iWidth = rect.width();
                }
                if (i == 4096) {
                    iL = this.b.canScrollVertically(1) ? (iHeight - L()) - I() : 0;
                    if (this.b.canScrollHorizontally(1)) {
                        iJ = (iWidth - J()) - K();
                    } else {
                        iJ = 0;
                    }
                } else if (i != 8192) {
                    iL = 0;
                    iJ = 0;
                } else {
                    iL = this.b.canScrollVertically(-1) ? -((iHeight - L()) - I()) : 0;
                    if (this.b.canScrollHorizontally(-1)) {
                        iJ = -((iWidth - J()) - K());
                    } else {
                        iJ = 0;
                    }
                }
                if (iL != 0 || iJ != 0) {
                    if (bundle != null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.W0) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            iJ = (int) (iJ * f);
                            iL = (int) (iL * f);
                        }
                        this.b.l0(iJ, true, iL);
                        return true;
                    }
                    RecyclerView recyclerView = this.b;
                    f fVar = recyclerView.F;
                    if (fVar != null) {
                        if (i == 4096) {
                            recyclerView.m0(fVar.f() - 1);
                            return true;
                        }
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.m0(0);
                        return true;
                    }
                }
            }
            return false;
        }

        public final void q(v vVar) {
            for (int iW = w() - 1; iW >= 0; iW--) {
                View viewV = v(iW);
                e0 e0VarO = RecyclerView.O(viewV);
                if (e0VarO.q()) {
                    if (RecyclerView.X0) {
                        Log.d("RecyclerView", "ignoring view " + e0VarO);
                    }
                } else if (!e0VarO.h() || e0VarO.j() || this.b.F.b) {
                    v(iW);
                    this.a.c(iW);
                    vVar.k(viewV);
                    this.b.z.c(e0VarO);
                } else {
                    t0(iW);
                    vVar.j(e0VarO);
                }
            }
        }

        public void q0(v vVar) {
            for (int iW = w() - 1; iW >= 0; iW--) {
                if (!RecyclerView.O(v(iW)).q()) {
                    View viewV = v(iW);
                    t0(iW);
                    vVar.i(viewV);
                }
            }
        }

        public View r(int i) {
            int iW = w();
            for (int i2 = 0; i2 < iW; i2++) {
                View viewV = v(i2);
                e0 e0VarO = RecyclerView.O(viewV);
                if (e0VarO != null && e0VarO.d() == i && !e0VarO.q() && (this.b.B0.g || !e0VarO.j())) {
                    return viewV;
                }
            }
            return null;
        }

        public final void r0(v vVar) {
            ArrayList<e0> arrayList;
            int size = vVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = vVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).a;
                e0 e0VarO = RecyclerView.O(view);
                if (!e0VarO.q()) {
                    e0VarO.p(false);
                    if (e0VarO.l()) {
                        this.b.removeDetachedView(view, false);
                    }
                    l lVar = this.b.j0;
                    if (lVar != null) {
                        lVar.i(e0VarO);
                    }
                    e0VarO.p(true);
                    e0 e0VarO2 = RecyclerView.O(view);
                    e0VarO2.n = null;
                    e0VarO2.o = false;
                    e0VarO2.j &= -33;
                    vVar.j(e0VarO2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<e0> arrayList2 = vVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public abstract p s();

        public final void s0(View view, v vVar) {
            androidx.recyclerview.widget.f fVar = this.a;
            androidx.recyclerview.widget.b0 b0Var = fVar.a;
            int i = fVar.d;
            if (i == 1) {
                aa0.c("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                aa0.c("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                fVar.d = 1;
                fVar.e = view;
                int iIndexOfChild = b0Var.a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (fVar.b.f(iIndexOfChild)) {
                        fVar.j(view);
                    }
                    b0Var.a(iIndexOfChild);
                }
                fVar.d = 0;
                fVar.e = null;
                vVar.i(view);
            } catch (Throwable th) {
                fVar.d = 0;
                fVar.e = null;
                throw th;
            }
        }

        public p t(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public final void t0(int i) {
            if (v(i) != null) {
                androidx.recyclerview.widget.f fVar = this.a;
                androidx.recyclerview.widget.b0 b0Var = fVar.a;
                int i2 = fVar.d;
                if (i2 == 1) {
                    aa0.c("Cannot call removeView(At) within removeView(At)");
                    return;
                }
                if (i2 == 2) {
                    aa0.c("Cannot call removeView(At) within removeViewIfHidden");
                    return;
                }
                try {
                    int iF = fVar.f(i);
                    View childAt = b0Var.a.getChildAt(iF);
                    if (childAt == null) {
                        return;
                    }
                    fVar.d = 1;
                    fVar.e = childAt;
                    if (fVar.b.f(iF)) {
                        fVar.j(childAt);
                    }
                    b0Var.a(iF);
                } finally {
                    fVar.d = 0;
                    fVar.e = null;
                }
            }
        }

        public p u(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
        public boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int iJ = J();
            int iL = L();
            int iK = this.n - K();
            int I = this.o - I();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iJ;
            int iMin = Math.min(0, i);
            int i2 = top - iL;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iK;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - I);
            if (this.b.getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int iJ2 = J();
                    int iL2 = L();
                    int iK2 = this.n - K();
                    int I2 = this.o - I();
                    Rect rect2 = this.b.C;
                    B(rect2, focusedChild);
                    if (rect2.left - i4 < iK2 && rect2.right - i4 > iJ2 && rect2.top - i5 < I2 && rect2.bottom - i5 > iL2) {
                        if (i4 == 0) {
                        }
                        if (z) {
                            recyclerView.scrollBy(i4, i5);
                            return true;
                        }
                        recyclerView.l0(i4, false, i5);
                        return true;
                    }
                }
            } else if (i4 == 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.l0(i4, false, i5);
                return true;
            }
            return false;
        }

        public final View v(int i) {
            androidx.recyclerview.widget.f fVar = this.a;
            if (fVar != null) {
                return fVar.d(i);
            }
            return null;
        }

        public final void v0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final int w() {
            androidx.recyclerview.widget.f fVar = this.a;
            if (fVar != null) {
                return fVar.e();
            }
            return 0;
        }

        public int w0(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public void x0(int i) {
            if (RecyclerView.X0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public final boolean y() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.A;
        }

        public int y0(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public int z(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.F == null || !e()) {
                return 1;
            }
            return this.b.F.f();
        }

        public final void z0(RecyclerView recyclerView) {
            A0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void W() {
        }

        public void f0() {
        }

        public void X(RecyclerView recyclerView) {
        }

        public void Y(RecyclerView recyclerView) {
        }

        public void k0(a0 a0Var) {
        }

        public void l0(Parcelable parcelable) {
        }

        public void n0(int i) {
        }

        public void e0(int i, int i2) {
        }

        public void g0(int i, int i2) {
        }

        public void h0(int i, int i2) {
        }

        public void i0(int i, int i2) {
        }

        public void j(int i, androidx.recyclerview.widget.o.b bVar) {
        }

        public void i(int i, int i2, a0 a0Var, androidx.recyclerview.widget.o.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class f<VH extends e0> {
        public final g a = new g();
        public boolean b = false;
        public final a c = a.t;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public static final a t;
            public static final /* synthetic */ a[] u;

            static {
                a aVar = new a("ALLOW", 0);
                t = aVar;
                u = new a[]{aVar, new a("PREVENT_WHEN_EMPTY", 1), new a("PREVENT", 2)};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) u.clone();
            }
        }

        public final VH e(ViewGroup viewGroup, int i) {
            try {
                if (yra.a()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                VH vh = (VH) l(viewGroup, i);
                if (vh.a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.f = i;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public abstract int f();

        public long g(int i) {
            return -1L;
        }

        public int h(int i) {
            return 0;
        }

        public abstract void j(VH vh, int i);

        public void k(VH vh, int i, List<Object> list) {
            j(vh, i);
        }

        public abstract VH l(ViewGroup viewGroup, int i);

        public boolean n(VH vh) {
            return false;
        }

        public final void r(h hVar) {
            this.a.registerObserver(hVar);
        }

        public final void s() {
            if (this.a.a()) {
                aa0.c("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.b = true;
            }
        }

        public final void t(h hVar) {
            this.a.unregisterObserver(hVar);
        }

        public void i(RecyclerView recyclerView) {
        }

        public void m(RecyclerView recyclerView) {
        }

        public void o(VH vh) {
        }

        public void p(VH vh) {
        }

        public void q(VH vh) {
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.G;
        if (oVar != null) {
            return oVar.u(layoutParams);
        }
        aa0.c("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class n {
        public void f(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            ((p) view.getLayoutParams()).a.d();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
