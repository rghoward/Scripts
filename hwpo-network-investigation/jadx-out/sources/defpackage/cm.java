package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import com.hwpo_training_app.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cm extends ViewGroup implements mn7, q08, ox8, zk6, as2, bm7, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, c94 {
    public static Class<?> g1;
    public static Method h1;
    public static Method i1;
    public static final t27<cm> j1 = new t27<>((Object) null);
    public static zl k1;
    public static Method l1;
    public lv8 A;
    public long A0;
    public final h30<mh4<g2b>> B;
    public final dt7 B0;
    public final wl C;
    public final my2 C0;
    public final dt7 D;
    public oh4<? super et1, g2b> D0;
    public final View E;
    public zha E0;
    public final h94 F;
    public xha F0;
    public h72 G;
    public final AtomicReference<bh9<cq>> G0;
    public final zn H;
    public vw2 H0;
    public final l26 I;
    public final pa4 I0;
    public final dt7 J;
    public final h37 J0;
    public final my2 K;
    public final dt7 K0;
    public final u41 L;
    public final st4 L0;
    public final ys M;
    public final sd5 M0;
    public final fe5 N;
    public final rx6 N0;
    public final qr5 O;
    public final os O0;
    public final e27<qr5> P;
    public MotionEvent P0;
    public final xk8 Q;
    public long Q0;
    public final yb9 R;
    public final kkb<ln7> R0;
    public final lm S;
    public final t27<mh4<g2b>> S0;
    public bn T;
    public float T0;
    public final ck U;
    public float U0;
    public final oo V;
    public final o V0;
    public final qf0 W;
    public final xl W0;
    public boolean X0;
    public final pb5 Y0;
    public final n Z0;
    public final t27<ln7> a0;
    public final x11 a1;
    public t27<ln7> b0;
    public boolean b1;
    public boolean c0;
    public boolean c1;
    public boolean d0;
    public final g69 d1;
    public final my6 e0;
    public View e1;
    public final e58 f0;
    public final m f1;
    public final dt7 g0;
    public final my2 h0;
    public final jk i0;
    public final nk j0;
    public boolean k0;
    public final tl l0;
    public final sl m0;
    public final un7 n0;
    public boolean o0;
    public kt p0;
    public xx1 q0;
    public boolean r0;
    public final dl6 s0;
    public final dt7 t;
    public long t0;
    public long u;
    public final int[] u0;
    public final boolean v;
    public final float[] v0;
    public ib5 w;
    public final float[] w0;
    public final tr5 x;
    public final float[] x0;
    public s76.a y;
    public long y0;
    public s76.b z;
    public boolean z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static boolean a() {
            try {
                if (cm.g1 == null) {
                    cm.g1 = Class.forName("android.os.SystemProperties");
                }
                if (cm.h1 == null) {
                    Class<?> cls = cm.g1;
                    cm.h1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = cm.h1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return xj5.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements mh4<yy1> {
        @Override // defpackage.mh4
        public final yy1 invoke() {
            ContentCaptureSession contentCaptureSessionA;
            View view = (View) this.receiver;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                fgb.c.a(view);
            }
            if (i < 29 || (contentCaptureSessionA = fgb.b.a(view)) == null) {
                return null;
            }
            return new xy1(contentCaptureSessionA, view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<Boolean> {
        public f() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mh4
        public final Boolean invoke() {
            Boolean bool = (Boolean) cm.this.J.getValue();
            bool.getClass();
            return bool;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<Boolean> {
        public final /* synthetic */ KeyEvent v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KeyEvent keyEvent) {
            super(0);
            this.v = keyEvent;
        }

        @Override // defpackage.mh4
        public final Boolean invoke() {
            return Boolean.valueOf(cm.super.dispatchKeyEvent(this.v));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class h extends pi4 implements ei4<l53, cr9, oh4<? super d73, ? extends g2b>, Boolean> {
        @Override // defpackage.ei4
        public final Boolean invoke(l53 l53Var, cr9 cr9Var, oh4<? super d73, ? extends g2b> oh4Var) {
            cm cmVar = (cm) this.receiver;
            Resources resources = cmVar.getContext().getResources();
            hs1 hs1Var = new hs1(new xx2(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), cr9Var.a, oh4Var);
            return Boolean.valueOf(tm.a.a(cmVar, l53Var, hs1Var));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements oh4<ba4, Boolean> {
        public final /* synthetic */ gl8<ba4> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(gl8<ba4> gl8Var) {
            super(1);
            this.u = gl8Var;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, ba4] */
        @Override // defpackage.oh4
        public final Boolean invoke(ba4 ba4Var) {
            this.u.t = ba4Var;
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends wp5 implements oh4<ba4, Boolean> {
        public static final j u = new j(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ Boolean invoke(ba4 ba4Var) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k extends wp5 implements oh4<l84, g2b> {
        public k() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(l84 l84Var) {
            cm.this.getFocusOwner().j(l84Var.a, false);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l extends wp5 implements mh4<ad6> {
        public l() {
            super(0);
        }

        @Override // defpackage.mh4
        public final ad6 invoke() {
            LocaleList locales = cm.this.getConfiguration().getLocales();
            bd6 bd6Var = new bd6(new dd6(locales));
            if (locales.isEmpty()) {
                bd6Var = new bd6(new dd6(LocaleList.getDefault()));
            }
            LocaleList localeList = bd6Var.a.a;
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                locale.getClass();
                arrayList.add(new yc6(locale));
            }
            return new ad6(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m implements x48 {
        public w48 a;

        public m() {
            w48.a.getClass();
        }

        @Override // defpackage.x48
        public final w48 a() {
            return this.a;
        }

        @Override // defpackage.x48
        public final void b(w48 w48Var) {
            if (w48Var == null) {
                w48.a.getClass();
                w48Var = y48.t;
            }
            wm.a.a(cm.this, w48Var);
        }

        @Override // defpackage.x48
        public final void c(w48 w48Var) {
            this.a = w48Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n extends wp5 implements mh4<g2b> {
        public n() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            int actionMasked;
            cm cmVar = cm.this;
            MotionEvent motionEvent = cmVar.P0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                cmVar.Q0 = SystemClock.uptimeMillis();
                cmVar.post(cmVar.V0);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int actionMasked;
            cm cmVar = cm.this;
            cmVar.removeCallbacks(this);
            MotionEvent motionEvent = cmVar.P0;
            if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            cmVar.h0(motionEvent, i, cmVar.Q0, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p extends vx6<b> {
        public p() {
        }

        @Override // defpackage.vx6
        public final ox6.c a() {
            return cm.this.new b();
        }

        @Override // defpackage.vx6
        public final /* bridge */ /* synthetic */ void b(ox6.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return cm.this.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q extends wp5 implements oh4<mh4<? extends g2b>, g2b> {
        public q() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(mh4<? extends g2b> mh4Var) {
            mh4<? extends g2b> mh4Var2 = mh4Var;
            cm cmVar = cm.this;
            cmVar.getUncaughtExceptionHandler$ui();
            Handler handler = cmVar.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                mh4Var2.invoke();
            } else {
                Handler handler2 = cmVar.getHandler();
                if (handler2 != null) {
                    handler2.post(new hm(0, mh4Var2));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r extends wp5 implements mh4<c> {
        public r() {
            super(0);
        }

        @Override // defpackage.mh4
        public final c invoke() {
            return cm.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [wl] */
    public cm(Context context, et1 et1Var) {
        nk nkVar;
        tq5 tq5Var;
        super(context);
        this.t = bl7.i(et1Var);
        this.u = 9205357640488583168L;
        this.v = true;
        this.x = et1Var.r;
        this.A = dc4.t;
        this.B = new h30<>();
        this.C = new Runnable() { // from class: wl
            @Override // java.lang.Runnable
            public final void run() {
                h30<mh4<g2b>> h30Var = this.t.B;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!h30Var.isEmpty()) {
                    try {
                        h30Var.removeLast().invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                g2b g2bVar = g2b.a;
                Trace.endSection();
            }
        };
        this.D = new dt7(u7d.f(context), jl8.u);
        this.F = new h94(this, this);
        this.G = et1Var.b.k();
        this.H = new zn(new h(3, this, cm.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.I = new l26();
        this.J = bl7.i(Boolean.FALSE);
        this.K = bl7.f(new f());
        this.L = et1Var.t;
        this.M = et1Var.q;
        this.N = new fe5();
        qr5 qr5Var = new qr5(3);
        qr5Var.c(px8.b);
        qr5Var.k0(getDensity());
        qr5Var.n0(getViewConfiguration());
        qr5Var.l(new p().H(getFocusOwner().b()).H(getDragAndDropManager().c));
        this.O = qr5Var;
        e27 e27Var = ag5.a;
        this.P = new e27<>();
        m5getLayoutNodes();
        this.Q = new xk8(this);
        this.R = new yb9(getRoot(), new mf3(), m5getLayoutNodes());
        lm lmVar = new lm(this);
        this.S = lmVar;
        this.T = new bn(this, new e(0, this, ym.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1));
        this.U = et1Var.j;
        this.V = new oo(this);
        this.W = new qf0();
        g69 g69Var = null;
        this.a0 = new t27<>(g69Var);
        this.e0 = new my6();
        this.f0 = new e58(getRoot());
        this.g0 = bl7.i(new Configuration(context.getResources().getConfiguration()));
        this.h0 = bl7.f(new l());
        this.i0 = P() ? new jk(this, getAutofillTree()) : null;
        if (P()) {
            AutofillManager autofillManagerA = vl.a(context.getSystemService(ul.a()));
            if (autofillManagerA == null) {
                throw ik.a("Autofill service could not be located.");
            }
            nkVar = new nk(new l08(autofillManagerA), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            nkVar = null;
        }
        this.j0 = nkVar;
        this.l0 = et1Var.l;
        this.m0 = et1Var.m;
        this.n0 = new un7(new q());
        this.s0 = new dl6(getRoot());
        this.t0 = 9223372034707292159L;
        this.u0 = new int[]{0, 0};
        float[] fArrA = xk6.a();
        this.v0 = fArrA;
        this.w0 = xk6.a();
        this.x0 = xk6.a();
        this.y0 = -1L;
        this.A0 = 9187343241974906880L;
        this.B0 = bl7.i(null);
        this.C0 = bl7.f(new r());
        this.G0 = new AtomicReference<>(null);
        this.I0 = et1Var.n;
        this.J0 = et1Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = z84.a;
        tq5 tq5Var2 = tq5.t;
        if (layoutDirection != 0) {
            tq5Var = layoutDirection != 1 ? null : tq5.u;
        } else {
            tq5Var = tq5Var2;
        }
        this.K0 = bl7.i(tq5Var != null ? tq5Var : tq5Var2);
        this.L0 = et1Var.p;
        this.M0 = new sd5(isInTouchMode() ? 1 : 2, new d());
        this.N0 = new rx6(this);
        os osVar = new os();
        new taa(new ns(osVar));
        this.O0 = osVar;
        this.R0 = new kkb<>();
        this.S0 = new t27<>(g69Var);
        this.V0 = new o();
        this.W0 = new xl(0, this);
        this.Y0 = new pb5(context, new k());
        this.Z0 = new n();
        int i2 = Build.VERSION.SDK_INT;
        this.a1 = i2 < 29 ? new y11(fArrA) : new z11();
        addOnAttachStateChangeListener(this.T);
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            xm.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        egb.o(this, lmVar);
        setOnDragListener(getDragAndDropManager());
        getRoot().n(this);
        if (i2 >= 29) {
            sm.a.a(this);
        }
        if (W()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.E = view;
            addView(view, -1);
        }
        this.d1 = i2 >= 31 ? new g69() : null;
        this.f1 = new m();
    }

    public static final void L(cm cmVar, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        lm lmVar = cmVar.S;
        if (xj5.a(str, lmVar.T)) {
            int iD2 = lmVar.R.d(i2);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!xj5.a(str, lmVar.U) || (iD = lmVar.S.d(i2)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static boolean P() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void Q(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof cm) {
                ((cm) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                Q((ViewGroup) childAt);
            }
        }
    }

    public static long R(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j2 = size;
            return j2 | (j2 << 32);
        }
        d43.c();
        return 0L;
    }

    public static View S(int i2, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (xj5.a(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewS = S(i2, viewGroup.getChildAt(i3));
                    if (viewS != null) {
                        return viewS;
                    }
                }
            }
        }
        return null;
    }

    public static void U(qr5 qr5Var) {
        qr5Var.P();
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i2 = k37VarL.v;
        for (int i3 = 0; i3 < i2; i3++) {
            U(qr5VarArr[i3]);
        }
    }

    public static boolean W() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean X(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ny6.a.a(motionEvent, i2));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    private final zha getLegacyTextInputServiceAndroid() {
        zha zhaVar = this.E0;
        if (zhaVar != null) {
            return zhaVar;
        }
        zha zhaVar2 = new zha(getView(), this);
        this.E0 = zhaVar2;
        return zhaVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final et1 get_composeViewContext() {
        return (et1) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final c get_viewTreeOwners() {
        return (c) this.B0.getValue();
    }

    private final void setAttached(boolean z) {
        this.J.setValue(Boolean.valueOf(z));
    }

    private void setDensity(tx2 tx2Var) {
        this.D.setValue(tx2Var);
    }

    private void setFontFamilyResolver(qa4.a aVar) {
        this.J0.setValue(aVar);
    }

    private void setLayoutDirection(tq5 tq5Var) {
        this.K0.setValue(tq5Var);
    }

    private final void set_composeViewContext(et1 et1Var) {
        this.t.setValue(et1Var);
    }

    private final void set_viewTreeOwners(c cVar) {
        this.B0.setValue(cVar);
    }

    @Override // defpackage.mn7
    public final void A() {
        lm lmVar = this.S;
        lmVar.N = true;
        Handler handler = lmVar.t.getHandler();
        if (lmVar.m() && !lmVar.Y && handler != null) {
            lmVar.Y = true;
            handler.post(lmVar.a0);
        }
        bn bnVar = this.T;
        bnVar.z = true;
        Handler handler2 = bnVar.t.getHandler();
        if (!bnVar.d() || bnVar.F || handler2 == null) {
            return;
        }
        bnVar.F = true;
        handler2.post(bnVar.G);
    }

    @Override // defpackage.mn7
    public final void B(qr5 qr5Var, boolean z) {
        this.s0.g(qr5Var, z);
    }

    @Override // defpackage.mn7
    public final void C(qr5 qr5Var) {
        nk nkVar;
        lb9 lb9VarR;
        if (!P() || (nkVar = this.j0) == null || (lb9VarR = qr5Var.r()) == null || !lb9VarR.t.a(ac9.r)) {
            return;
        }
        nkVar.A.a(qr5Var.u);
        nkVar.t.e(nkVar.v, qr5Var.u, true);
    }

    @Override // defpackage.mn7
    public final void D(qr5 qr5Var, boolean z, boolean z2, boolean z3) {
        qr5 qr5VarI;
        qr5 qr5VarI2;
        dl6 dl6Var = this.s0;
        if (!z) {
            if (dl6Var.r(qr5Var, z2) && z3) {
                f0(qr5Var);
                return;
            }
            return;
        }
        jy2 jy2Var = dl6Var.b;
        qr5 qr5Var2 = qr5Var.A;
        vr5 vr5Var = qr5Var.Z;
        if (qr5Var2 == null) {
            uc5.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = vr5Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    u.b();
                    return;
                }
                if (!vr5Var.e || z2) {
                    vr5Var.e = true;
                    vr5Var.p.O = true;
                    if (qr5Var.j0) {
                        return;
                    }
                    if ((xj5.a(qr5Var.T(), Boolean.TRUE) || dl6.i(qr5Var)) && ((qr5VarI = qr5Var.I()) == null || !qr5VarI.Z.e)) {
                        jy2Var.a(qr5Var, jk5.t);
                    } else if ((qr5Var.j() || dl6.j(qr5Var)) && ((qr5VarI2 = qr5Var.I()) == null || !qr5VarI2.E())) {
                        jy2Var.a(qr5Var, jk5.v);
                    }
                    if (dl6Var.d || !z3) {
                        return;
                    }
                    f0(qr5Var);
                    return;
                }
                return;
            }
        }
        dl6Var.h.d(new dl6.a(qr5Var, true, z2));
    }

    @Override // defpackage.as2
    public final void E(m76 m76Var) {
        i41 i41VarA;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a.a());
        }
        s76.b bVar = this.z;
        if (bVar != null) {
            s76.a aVar = this.y;
            aVar.getClass();
            r76 r76Var = bVar.a;
            fh6 fh6Var = (fh6) r76Var.t;
            if (!fh6Var.t || fh6Var.v) {
                return;
            }
            try {
                i41VarA = aVar.a(new t76(bVar));
            } catch (CancellationException unused) {
                fh6 fh6Var2 = (fh6) r76Var.t;
                if (!fh6Var2.u) {
                    if (fh6Var2.v) {
                        d78.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    fh6Var2.a();
                    fh6Var2.v = true;
                }
                i41VarA = null;
            }
            i41 i41Var = bVar.d;
            if (i41Var != null) {
                i41Var.cancel();
            }
            bVar.d = i41VarA;
        }
    }

    @Override // defpackage.mn7
    public final void F(qr5 qr5Var) {
        lm lmVar = this.S;
        lmVar.N = true;
        if (lmVar.m()) {
            lmVar.n(qr5Var);
        }
        bn bnVar = this.T;
        bnVar.z = true;
        if (bnVar.d()) {
            bnVar.A.n(g2b.a);
        }
    }

    @Override // defpackage.mn7
    public final void G(qr5 qr5Var) {
        nk nkVar;
        m5getLayoutNodes().g(qr5Var.u);
        dl6 dl6Var = this.s0;
        jy2 jy2Var = dl6Var.b;
        jy2Var.a.b(qr5Var);
        jy2Var.b.b(qr5Var);
        jy2Var.c.b(qr5Var);
        dl6Var.e.a.n(qr5Var);
        this.k0 = true;
        if (P() && (nkVar = this.j0) != null && nkVar.A.g(qr5Var.u)) {
            nkVar.t.e(nkVar.v, qr5Var.u, false);
        }
    }

    @Override // defpackage.mn7
    public final void I() {
        this.d0 = true;
    }

    @Override // defpackage.mn7
    public final void J() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            if (l1 == null) {
                Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                l1 = declaredMethod;
            }
            Method method = l1;
            if (method != null) {
                method.invoke(viewTreeObserver, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.mn7
    public final void K(qr5 qr5Var, boolean z, boolean z2) {
        vr5 vr5Var = qr5Var.Z;
        jk5 jk5Var = jk5.w;
        dl6 dl6Var = this.s0;
        if (!z) {
            dl6Var.getClass();
            int iOrdinal = vr5Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                u.b();
                return;
            }
            qr5 qr5VarI = qr5Var.I();
            boolean z3 = qr5VarI == null || qr5VarI.j();
            if (!z2) {
                if (qr5Var.E()) {
                    return;
                }
                if (qr5Var.D() && qr5Var.j() == z3 && qr5Var.j() == vr5Var.p.N) {
                    return;
                }
            }
            el6 el6Var = vr5Var.p;
            el6Var.P = true;
            el6Var.Q = true;
            if (!qr5Var.j0 && el6Var.N && z3) {
                if ((qr5VarI == null || !qr5VarI.D()) && (qr5VarI == null || !qr5VarI.E())) {
                    dl6Var.b.a(qr5Var, jk5Var);
                }
                if (dl6Var.d) {
                    return;
                }
                f0(null);
                return;
            }
            return;
        }
        jy2 jy2Var = dl6Var.b;
        int iOrdinal2 = vr5Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    u.b();
                    return;
                }
            }
        }
        if ((vr5Var.e || vr5Var.f) && !z2) {
            return;
        }
        vr5Var.f = true;
        vr5Var.g = true;
        el6 el6Var2 = vr5Var.p;
        el6Var2.P = true;
        el6Var2.Q = true;
        if (qr5Var.j0) {
            return;
        }
        qr5 qr5VarI2 = qr5Var.I();
        if (xj5.a(qr5Var.T(), Boolean.TRUE) && ((qr5VarI2 == null || !qr5VarI2.Z.e) && (qr5VarI2 == null || !qr5VarI2.Z.f))) {
            jy2Var.a(qr5Var, jk5.u);
        } else if (qr5Var.j() && ((qr5VarI2 == null || !qr5VarI2.D()) && (qr5VarI2 == null || !qr5VarI2.E()))) {
            jy2Var.a(qr5Var, jk5Var);
        }
        if (dl6Var.d) {
            return;
        }
        f0(null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int T(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        cm cmVar;
        removeCallbacks(this.V0);
        try {
            c0(motionEvent);
            this.z0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.P0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                e58 e58Var = this.f0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!e58Var.e) {
                                e58Var.c.a.a();
                                e58Var.b.c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            h0(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !Y(motionEvent)) {
                    cmVar = this;
                } else {
                    cmVar = this;
                    cmVar.h0(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = cmVar.P0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = cmVar.P0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    my6 my6Var = cmVar.e0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            my6Var.c.delete(pointerId);
                            my6Var.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = cmVar.P0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = cmVar.P0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = cmVar.P0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                my6Var.c.delete(pointerId);
                                my6Var.b.delete(pointerId);
                            }
                            uy4 uy4Var = e58Var.b;
                            if (uy4Var.d) {
                                uy4Var.d = true;
                            } else {
                                uy4Var.g.a.k();
                            }
                        }
                    }
                }
                cmVar.P0 = MotionEvent.obtainNoHistory(motionEvent);
                int iG0 = g0(motionEvent);
                Trace.endSection();
                cmVar.z0 = false;
                return iG0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.z0 = false;
            throw th3;
        }
    }

    public final void V(qr5 qr5Var) {
        this.s0.r(qr5Var, false);
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i2 = k37VarL.v;
        for (int i3 = 0; i3 < i2; i3++) {
            V(qr5VarArr[i3]);
        }
    }

    public final boolean Y(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean Z(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.P0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // defpackage.mn7
    public final void a(boolean z) {
        n nVar;
        dl6 dl6Var = this.s0;
        if (dl6Var.b.c() || dl6Var.e.a.v != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    nVar = this.Z0;
                } finally {
                    Trace.endSection();
                }
            } else {
                nVar = null;
            }
            if (dl6Var.l(nVar)) {
                requestLayout();
            }
            dl6Var.b(false);
            getRectManager().a();
            if (this.d0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.d0 = false;
            }
            g2b g2bVar = g2b.a;
        }
    }

    public final boolean a0(int i2) {
        if (i2 != 7 && i2 != 8) {
            Integer numC = z84.c(i2);
            if (numC == null) {
                throw ik.a("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            ba4 ba4VarV = getFocusOwner().v();
            if (ba4VarV == null) {
                aa0.c("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = z84.c(i2);
            if (numC2 == null) {
                throw ik.a("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            zgb zgbVar = ew2.f(ba4VarV).H;
            View interopView = zgbVar != null ? zgbVar.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !ym.b(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return z84.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getFocusOwner().k()) {
            super.addFocusables(arrayList, i2, i3);
            if (getFocusOwner().f() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        if (P()) {
            nk nkVar = this.j0;
            if (nkVar != null) {
                nkVar.c(sparseArray);
            }
            jk jkVar = this.i0;
            if (jkVar != null) {
                ok.a(jkVar, sparseArray);
            }
        }
    }

    @Override // defpackage.c94
    public final void b(aa4 aa4Var, ba4 ba4Var) {
        kb7 kb7Var;
        boolean z;
        kb7 kb7Var2;
        boolean z2;
        if (aa4Var != null) {
            if (!aa4Var.q().G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVarQ = aa4Var.q();
            qr5 qr5VarF = ew2.f(aa4Var);
            d37 d37Var = null;
            ArrayList arrayList = null;
            while (qr5VarF != null) {
                if ((qr5VarF.Y.f.w & 2097152) != 0) {
                    while (cVarQ != null) {
                        if ((cVarQ.v & 2097152) != 0) {
                            ox6.c cVarB = cVarQ;
                            k37 k37Var = null;
                            while (cVarB != null) {
                                if (cVarB instanceof nb5) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cVarB.v & 2097152) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar = ((gw2) cVarB).I; cVar != null; cVar = cVar.y) {
                                        if ((cVar.v & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar;
                                            } else {
                                                if (k37Var == null) {
                                                    k37Var = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var.d(cVar);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var);
                            }
                        }
                        cVarQ = cVarQ.x;
                    }
                }
                qr5VarF = qr5VarF.I();
                cVarQ = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (ba4Var != null) {
                if (!ba4Var.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                ox6.c cVar2 = ba4Var.t;
                qr5 qr5VarF2 = ew2.f(ba4Var);
                d37 d37VarA = null;
                while (qr5VarF2 != null) {
                    if ((qr5VarF2.Y.f.w & 2097152) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.v & 2097152) != 0) {
                                ox6.c cVarB2 = cVar2;
                                k37 k37Var2 = null;
                                while (cVarB2 != null) {
                                    if (cVarB2 instanceof nb5) {
                                        if (d37VarA == null) {
                                            d37VarA = a49.a();
                                        }
                                        d37VarA.a(cVarB2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cVarB2.v & 2097152) != 0 && (cVarB2 instanceof gw2)) {
                                        int i3 = 0;
                                        for (ox6.c cVar3 = ((gw2) cVarB2).I; cVar3 != null; cVar3 = cVar3.y) {
                                            if ((cVar3.v & 2097152) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVarB2 = cVar3;
                                                } else {
                                                    if (k37Var2 == null) {
                                                        k37Var2 = new k37(new ox6.c[16]);
                                                    }
                                                    if (cVarB2 != null) {
                                                        k37Var2.d(cVarB2);
                                                        cVarB2 = null;
                                                    }
                                                    k37Var2.d(cVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    cVarB2 = ew2.b(k37Var2);
                                }
                            }
                            cVar2 = cVar2.x;
                        }
                    }
                    qr5VarF2 = qr5VarF2.I();
                    cVar2 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
                }
                d37Var = d37VarA;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                nb5 nb5Var = (nb5) arrayList.get(i4);
                if (!(d37Var != null ? d37Var.c(nb5Var) : false)) {
                    nb5Var.X0();
                }
            }
        }
    }

    public final void b0() {
        if (this.z0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.y0) {
            this.y0 = jCurrentAnimationTimeMillis;
            x11 x11Var = this.a1;
            float[] fArr = this.w0;
            x11Var.a(this, fArr);
            gi0.d(fArr, this.x0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.u0;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            this.A0 = (((long) Float.floatToRawIntBits(f2 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f3 - iArr[1])) & 4294967295L);
        }
    }

    @Override // defpackage.mn7
    public final void c(qr5 qr5Var, long j2) {
        dl6 dl6Var = this.s0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            dl6Var.m(qr5Var, j2);
            if (!dl6Var.b.c()) {
                dl6Var.b(false);
                getRectManager().a();
                if (this.d0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.d0 = false;
                }
            }
            g2b g2bVar = g2b.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void c0(MotionEvent motionEvent) {
        this.y0 = AnimationUtils.currentAnimationTimeMillis();
        x11 x11Var = this.a1;
        float[] fArr = this.w0;
        x11Var.a(this, fArr);
        gi0.d(fArr, this.x0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = xk6.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.A0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.S.d(i2, this.u, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.S.d(i2, this.u, true);
    }

    @Override // defpackage.mn7
    public final long d(long j2) {
        b0();
        return xk6.b(j2, this.w0);
    }

    public final void d0(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        t27<ln7> t27Var = this.a0;
        if (!isAttachedToWindow()) {
            U(getRoot());
        }
        a(true);
        qu9.j().m();
        this.c0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            u41 u41Var = this.L;
            ol olVar = u41Var.a;
            Canvas canvas2 = olVar.a;
            olVar.a = canvas;
            getRoot().x(olVar, null);
            u41Var.a.a = canvas2;
            if (t27Var.e()) {
                int i2 = t27Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    t27Var.b(i3).k();
                }
            }
            if (jhb.y) {
                int iSave = canvas.save();
                canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(iSave);
            }
            t27Var.j();
            this.c0 = false;
            g2b g2bVar = g2b.a;
            Trace.endSection();
            t27<ln7> t27Var2 = this.b0;
            if (t27Var2 != null) {
                t27Var.h(t27Var2);
                t27Var2.j();
            }
            if (W()) {
                ox.a(this, this.T0);
                View view = this.E;
                if (view != null) {
                    ox.a(view, this.U0);
                    if (!Float.isNaN(this.U0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.T0 = Float.NaN;
                this.U0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int actionIndex;
        int i2;
        to toVar;
        long jValueAt;
        long j2;
        char c2;
        int i3;
        long jFloatToRawIntBits;
        boolean z;
        boolean z2;
        float fA;
        if (this.X0) {
            xl xlVar = this.W0;
            removeCallbacks(xlVar);
            if (motionEvent.getActionMasked() == 8) {
                this.X0 = false;
            } else {
                xlVar.run();
            }
        }
        if (X(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int i4 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (T(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f2 = -motionEvent.getAxisValue(26);
            Context context = getContext();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 26) {
                Method method = ngb.a;
                fA = ngb.a.b(viewConfiguration);
            } else {
                fA = ngb.a(viewConfiguration, context);
            }
            return getFocusOwner().s(new tx8(fA * f2, (i5 >= 26 ? ngb.a.a(viewConfiguration) : ngb.a(viewConfiguration, getContext())) * f2, motionEvent.getDeviceId(), motionEvent.getEventTime()), new em(this, motionEvent));
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        ib5 ib5Var = this.w;
        my6 my6Var = this.e0;
        we6<my6.a> we6Var = my6Var.e;
        SparseLongArray sparseLongArray = my6Var.b;
        int actionMasked = motionEvent.getActionMasked();
        my6Var.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            my6Var.c.clear();
            toVar = null;
        } else {
            my6Var.a(motionEvent);
            if (actionMasked != 1) {
                actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
            } else {
                actionIndex = 0;
            }
            boolean z3 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList = new ArrayList(pointerCount);
            int i6 = 0;
            while (i6 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i6);
                int i7 = i4;
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                } else {
                    jValueAt = my6Var.a;
                    my6Var.a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i6))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i6))) & 4294967295L);
                boolean z4 = i6 != actionIndex ? i7 : 0;
                my6.a aVarB = we6Var.b(jValueAt);
                if (i6 == actionIndex) {
                    we6Var.g(jValueAt);
                    j2 = jValueAt;
                    c2 = ' ';
                    actionIndex = actionIndex;
                    i3 = 65535;
                } else if (z3) {
                    c2 = ' ';
                    i3 = 65535;
                    j2 = jValueAt;
                    we6Var.f(j2, new my6.a(1 | ((motionEvent.getEventTime() & 2147483647L) << i7) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
                } else {
                    j2 = jValueAt;
                    c2 = ' ';
                    i3 = 65535;
                }
                char c3 = c2;
                long eventTime = motionEvent.getEventTime();
                float pressure = motionEvent.getPressure(i6);
                long eventTime2 = aVarB != null ? (aVarB.a >> i7) & 2147483647L : motionEvent.getEventTime();
                if (aVarB != null) {
                    int i8 = i3;
                    int i9 = (int) (aVarB.a >>> c3);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i9 >>> 16))) << c3) | (((long) Float.floatToRawIntBits((short) (i9 & i8))) & 4294967295L);
                } else {
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                if (aVarB != null) {
                    z = (aVarB.a & 1) != 0 ? i7 : 0;
                } else {
                    z = 0;
                }
                arrayList.add(new jb5(j2, eventTime, jFloatToRawIntBits2, z4, pressure, eventTime2, jFloatToRawIntBits, z));
                i6++;
                i4 = i7;
                ib5Var = ib5Var;
                actionIndex = actionIndex;
                my6Var = my6Var;
            }
            ib5 ib5Var2 = ib5Var;
            int i10 = i4;
            my6Var.e(motionEvent);
            if (ib5Var2 != null) {
                i2 = ib5Var2.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    z90.a("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i10);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                    i2 = 1;
                                } else if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                }
                            }
                            i2 = 0;
                        }
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            toVar = new to(arrayList, i2, motionEvent);
        }
        pb5 pb5Var = this.Y0;
        if (toVar == null) {
            getFocusOwner().d();
            pb5Var.b = 0;
            pb5Var.c = true;
            return true;
        }
        boolean zQ = getFocusOwner().q(toVar);
        pb5Var.getClass();
        MotionEvent motionEvent2 = toVar.c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z2 = true;
            if ((action == 1 || action == 2) && zQ) {
                pb5Var.b = 0;
                pb5Var.c = true;
            }
        } else {
            z2 = true;
            pb5Var.b = toVar.b;
            pb5Var.c = false;
        }
        pb5Var.d.onTouchEvent(motionEvent2);
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        boolean z = this.X0;
        xl xlVar = this.W0;
        if (z) {
            removeCallbacks(xlVar);
            xlVar.run();
        }
        if (!X(motionEvent) && isAttachedToWindow()) {
            lm lmVar = this.S;
            cm cmVar = lmVar.t;
            AccessibilityManager accessibilityManager = lmVar.w;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    cmVar.a(true);
                    vy4 vy4Var = new vy4();
                    qr5 root = cmVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    kb7 kb7Var = root.Y;
                    mb7 mb7Var = kb7Var.d;
                    sv8 sv8Var = mb7.i0;
                    kb7Var.d.A1(mb7.m0, mb7Var.a1(jFloatToRawIntBits), vy4Var, 1, true);
                    t27<Object> t27Var = vy4Var.t;
                    int i3 = t27Var.b - 1;
                    while (true) {
                        if (-1 < i3) {
                            Object objB = t27Var.b(i3);
                            objB.getClass();
                            qr5 qr5VarF = ew2.f((ox6.c) objB);
                            if (cmVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(qr5VarF) == null) {
                                if (qr5VarF.Y.d(8)) {
                                    int iR = lmVar.r(qr5VarF.u);
                                    ub9 ub9VarA = wb9.a(qr5VarF, false);
                                    if (zb9.h(ub9VarA)) {
                                        if (!ub9VarA.k().t.b(ac9.B)) {
                                            i2 = iR;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i3--;
                            }
                        }
                        i2 = Integer.MIN_VALUE;
                        break;
                    }
                    cmVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i4 = lmVar.u;
                    if (i4 != i2) {
                        lmVar.u = i2;
                        lm.v(lmVar, i2, 128, null, 12);
                        lm.v(lmVar, i4, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i5 = lmVar.u;
                    if (i5 == Integer.MIN_VALUE) {
                        cmVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i5 != Integer.MIN_VALUE) {
                        lmVar.u = Integer.MIN_VALUE;
                        lm.v(lmVar, Integer.MIN_VALUE, 128, null, 12);
                        lm.v(lmVar, i5, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && Y(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.P0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.P0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.X0 = true;
                        postDelayed(xlVar, 8L);
                        return false;
                    }
                } else if ((T(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (Z(motionEvent)) {
                if ((T(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().g(keyEvent, new g(keyEvent));
        }
        l26 l26Var = getComposeViewContext().s;
        int metaState = keyEvent.getMetaState();
        l26Var.getClass();
        nmb.a.setValue(new m58(metaState));
        return getFocusOwner().g(keyEvent, f94.u) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().t(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            rm.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object ua0Var;
        ba4 ba4VarV;
        if (this.X0) {
            xl xlVar = this.W0;
            removeCallbacks(xlVar);
            MotionEvent motionEvent2 = this.P0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.X0 = false;
            } else {
                xlVar.run();
            }
        }
        if (!X(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || Z(motionEvent))) {
            int iT = T(motionEvent);
            if ((iT & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ua0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    ua0Var = new ua0(1);
                }
                if (ua0Var.equals(new ua0(1)) && (ba4VarV = getFocusOwner().v()) != null) {
                    mb7 mb7VarE = ew2.e(ba4VarV);
                    if (!rq5.d(mb7VarE).Z(mb7VarE, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        getFocusOwner().w(false);
                    }
                }
            }
            if ((iT & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mn7
    public final long e(long j2) {
        b0();
        return xk6.b(j2, this.x0);
    }

    public final boolean e0() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // defpackage.n68
    public final long f(long j2) {
        b0();
        long jB = xk6.b(j2, this.w0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.A0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.A0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void f0(qr5 qr5Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (qr5Var != null) {
            while (qr5Var != null && qr5Var.F() == qr5.f.t) {
                if (!this.r0) {
                    qr5 qr5VarI = qr5Var.I();
                    if (qr5VarI == null) {
                        break;
                    }
                    long j2 = qr5VarI.Y.c.w;
                    if (xx1.f(j2) && xx1.e(j2)) {
                        break;
                    }
                }
                qr5Var = qr5Var.I();
            }
            if (qr5Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i2) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return S(i2, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        sk8 sk8VarA;
        if (view == null || this.s0.c) {
            return super.focusSearch(view, i2);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i2);
        if (viewFindNextFocus == null || !ym.b(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (sk8VarA = getFocusOwner().o()) == null) {
            sk8VarA = z84.a(view, this);
        }
        l84 l84VarD = z84.d(i2);
        int i3 = l84VarD != null ? l84VarD.a : 6;
        gl8 gl8Var = new gl8();
        if (getFocusOwner().c(i3, sk8VarA, new i(gl8Var)) == null) {
            return view;
        }
        T t = gl8Var.t;
        if (t == 0) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i2);
            }
        } else if (viewFindNextFocus == null || i3 == 1 || i3 == 2 || bza.h(fa4.b((ba4) t), z84.a(viewFindNextFocus, this), sk8VarA, i3)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // defpackage.mn7
    public final void g(qr5 qr5Var) {
        nk nkVar;
        if (!P() || (nkVar = this.j0) == null) {
            return;
        }
        nkVar.w.b.e(qr5Var.u, new mk(nkVar, qr5Var));
    }

    public final int g0(MotionEvent motionEvent) {
        d58 d58Var;
        if (this.b1) {
            this.b1 = false;
            l26 l26Var = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            l26Var.getClass();
            nmb.a.setValue(new m58(metaState));
        }
        my6 my6Var = this.e0;
        c58 c58VarC = my6Var.c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        e58 e58Var = this.f0;
        if (c58VarC == null) {
            if (!e58Var.e) {
                e58Var.c.a.a();
                e58Var.b.c();
            }
            return 0;
        }
        List<d58> list = c58VarC.a;
        int size = list.size() - 1;
        if (size < 0) {
            d58Var = null;
            break;
        }
        while (true) {
            int i2 = size - 1;
            d58Var = list.get(size);
            if (d58Var.e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i2 < 0) {
                d58Var = null;
                break;
            }
            size = i2;
        }
        d58 d58Var2 = d58Var;
        if (d58Var2 != null) {
            this.u = d58Var2.d;
        }
        int iA = e58Var.a(c58VarC, this, Y(motionEvent));
        c58VarC.b = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        my6Var.c.delete(pointerId);
        my6Var.b.delete(pointerId);
        return iA;
    }

    public final kt getAndroidViewsHandler$ui() {
        if (this.p0 == null) {
            kt ktVar = new kt(getContext());
            this.p0 = ktVar;
            addView(ktVar, -1);
            requestLayout();
        }
        kt ktVar2 = this.p0;
        ktVar2.getClass();
        return ktVar2;
    }

    @Override // defpackage.mn7
    public ff0 getAutofill() {
        return this.i0;
    }

    @Override // defpackage.mn7
    public of0 getAutofillManager() {
        return this.j0;
    }

    @Override // defpackage.mn7
    public qf0 getAutofillTree() {
        return this.W;
    }

    public final et1 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.c1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Configuration getConfiguration() {
        return (Configuration) this.g0.getValue();
    }

    public final bn getContentCaptureManager$ui() {
        return this.T;
    }

    @Override // defpackage.mn7
    public h72 getCoroutineContext() {
        return this.G;
    }

    @Override // defpackage.mn7
    public tx2 getDensity() {
        return (tx2) this.D.getValue();
    }

    @Override // defpackage.q08
    public sk8 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return z84.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // defpackage.mn7
    public g94 getFocusOwner() {
        return this.F;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        sk8 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (xj5.a(getFocusOwner().c(6, null, j.u), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.mn7
    public qa4.a getFontFamilyResolver() {
        return (qa4.a) this.J0.getValue();
    }

    @Override // defpackage.mn7
    public pa4 getFontLoader() {
        return this.I0;
    }

    public final s76.a getFrameEndScheduler$ui() {
        return this.y;
    }

    @Override // defpackage.mn7
    public jo4 getGraphicsContext() {
        return this.V;
    }

    @Override // defpackage.mn7
    public st4 getHapticFeedBack() {
        return this.L0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.s0.b.c() || !this.B.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.mn7
    public rd5 getInputModeManager() {
        return this.M0;
    }

    public final fe5 getInsetsListener() {
        return this.N;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, defpackage.mn7
    public tq5 getLayoutDirection() {
        return (tq5) this.K0.getValue();
    }

    @Override // defpackage.mn7
    public ad6 getLocaleList() {
        return (ad6) this.h0.getValue();
    }

    public long getMeasureIteration() {
        dl6 dl6Var = this.s0;
        if (!dl6Var.c) {
            uc5.a("measureIteration should be only used during the measure/layout pass");
        }
        return dl6Var.g;
    }

    @Override // defpackage.mn7
    public rx6 getModifierLocalManager() {
        return this.N0;
    }

    @Override // defpackage.mn7
    public cm getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // defpackage.mn7
    public jz7.a getPlacementScope() {
        int i2 = kz7.b;
        return new cm7(this);
    }

    @Override // defpackage.mn7
    public x48 getPointerIconService() {
        return this.f1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ib5 m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.w;
    }

    @Override // defpackage.mn7
    public xk8 getRectManager() {
        return this.Q;
    }

    @Override // defpackage.mn7
    public lv8 getRetainedValuesStore() {
        return this.A;
    }

    @Override // defpackage.mn7
    public qr5 getRoot() {
        return this.O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress$ui() {
        g69 g69Var;
        if (Build.VERSION.SDK_INT < 31 || (g69Var = this.d1) == null) {
            return false;
        }
        return ((Boolean) g69Var.a.getValue()).booleanValue();
    }

    @Override // defpackage.mn7
    public yb9 getSemanticsOwner() {
        return this.R;
    }

    @Override // defpackage.mn7
    public tr5 getSharedDrawScope() {
        return this.x;
    }

    @Override // defpackage.mn7
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? hx.a.a(this) : this.o0;
    }

    @Override // defpackage.mn7
    public un7 getSnapshotObserver() {
        return this.n0;
    }

    @Override // defpackage.mn7
    public xv9 getSoftwareKeyboardController() {
        vw2 vw2Var = this.H0;
        if (vw2Var != null) {
            return vw2Var;
        }
        vw2 vw2Var2 = new vw2(getTextInputService());
        this.H0 = vw2Var2;
        return vw2Var2;
    }

    @Override // defpackage.mn7
    public xha getTextInputService() {
        xha xhaVar = this.F0;
        if (xhaVar != null) {
            return xhaVar;
        }
        xha xhaVar2 = new xha(getLegacyTextInputServiceAndroid());
        this.F0 = xhaVar2;
        return xhaVar2;
    }

    @Override // defpackage.mn7
    public xja getTextToolbar() {
        return this.O0;
    }

    public final ox8.a getUncaughtExceptionHandler$ui() {
        return null;
    }

    @Override // defpackage.mn7
    public lgb getViewConfiguration() {
        return this.M;
    }

    public final c getViewTreeOwners() {
        return (c) this.C0.getValue();
    }

    @Override // defpackage.mn7
    public mmb getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final nk get_autofillManager$ui() {
        return this.j0;
    }

    public final void h0(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f2 = pointerCoords.x;
            long jF = f((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jF >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jF & 4294967295L));
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        c58 c58VarC = this.e0.c(this, motionEventObtain);
        c58VarC.getClass();
        this.f0.a(c58VarC, this, true);
        motionEventObtain.recycle();
    }

    @Override // defpackage.mn7
    public final void i(qi0.b bVar) {
        this.s0.f.d(bVar);
        f0(null);
    }

    public final void i0(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (xj5.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(u7d.f(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.I.getClass();
        }
    }

    @Override // defpackage.n68
    public final long j(long j2) {
        b0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.A0 >> 32));
        return xk6.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.A0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.x0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void j0() {
        boolean z;
        int i2;
        int[] iArr = this.u0;
        getLocationOnScreen(iArr);
        long j2 = this.t0;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j2 & 4294967295L);
        int i5 = iArr[0];
        if (i3 == i5 && i4 == iArr[1] && this.y0 >= 0) {
            z = false;
        } else {
            this.t0 = (4294967295L & ((long) iArr[1])) | (((long) i5) << 32);
            if (i3 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) {
                z = false;
            } else {
                k37<qr5> k37VarL = getRoot().L();
                qr5[] qr5VarArr = k37VarL.t;
                int i6 = k37VarL.v;
                for (int i7 = 0; i7 < i6; i7++) {
                    qr5VarArr[i7].Z.p.z0();
                }
                z = true;
            }
        }
        b0();
        View rootView = this.e1;
        if (rootView == null) {
            rootView = getRootView();
            this.e1 = rootView;
        }
        xk8 rectManager = getRectManager();
        long j3 = this.t0;
        long jC = cg5.c(this.A0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.w0;
        if (fArr.length < 16) {
            i2 = 0;
        } else {
            i2 = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        kla klaVar = rectManager.c;
        if ((i2 & 2) != 0) {
            fArr = null;
        }
        rectManager.f = klaVar.b(j3, jC, fArr, width, height) || rectManager.f;
        this.s0.b(z);
        getRectManager().a();
    }

    @Override // defpackage.mn7
    public final void k(float f2) {
        if (W()) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.T0) || f2 > this.T0) {
                    this.T0 = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.U0) || f2 < this.U0) {
                    this.U0 = f2;
                }
            }
        }
    }

    @Override // defpackage.mn7
    public final void l(qr5 qr5Var) {
        m5getLayoutNodes().i(qr5Var.u, qr5Var);
    }

    @Override // defpackage.mn7
    public final void m(mh4<g2b> mh4Var) {
        t27<mh4<g2b>> t27Var = this.S0;
        if (t27Var.c(mh4Var) >= 0) {
            return;
        }
        t27Var.g(mh4Var);
    }

    @Override // defpackage.mn7
    public final void n() {
        invalidate();
    }

    @Override // defpackage.mn7
    public final void o(int i2, qr5 qr5Var) {
        nk nkVar;
        if (!P() || (nkVar = this.j0) == null) {
            return;
        }
        cm cmVar = nkVar.v;
        l08 l08Var = nkVar.t;
        f27 f27Var = nkVar.A;
        if (f27Var.g(i2)) {
            l08Var.e(cmVar, i2, false);
        }
        lb9 lb9VarR = qr5Var.r();
        if (lb9VarR == null || !lb9VarR.t.a(ac9.r)) {
            return;
        }
        f27Var.a(qr5Var.u);
        l08Var.e(cmVar, qr5Var.u, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        lv8 lv8Var;
        Object obj;
        jk jkVar;
        super.onAttachedToWindow();
        setAttached(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(a.a());
        }
        this.N.onViewAttachedToWindow(this);
        int i3 = 0;
        if (i2 > 28) {
            if (k1 == null) {
                zl zlVar = new zl();
                k1 = zlVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (g1 == null) {
                        g1 = Class.forName("android.os.SystemProperties");
                    }
                    if (i1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class<?> cls = g1;
                        i1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = i1;
                    if (method != null) {
                        method.invoke(null, zlVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            t27<cm> t27Var = j1;
            synchronized (t27Var) {
                t27Var.g(this);
                g2b g2bVar = g2b.a;
            }
        }
        if (!this.c1) {
            getComposeViewContext().c();
        }
        this.c1 = false;
        V(getRoot());
        U(getRoot());
        getSnapshotObserver().a.e();
        if (P() && (jkVar = this.i0) != null) {
            jf0.a.a(jkVar);
        }
        m76 m76Var = getComposeViewContext().c;
        whb whbVar = getComposeViewContext().e;
        s76.a aVar = this.y;
        if (m76Var == null || whbVar == null || aVar == null) {
            lv8Var = null;
        } else {
            vhb viewModelStore = whbVar.getViewModelStore();
            thb.d dVar = new thb.d();
            lb2.a aVar2 = lb2.a.b;
            viewModelStore.getClass();
            aVar2.getClass();
            uhb uhbVar = new uhb(viewModelStore, dVar, aVar2);
            sd1 sd1VarA = ll8.a(s76.class);
            String strE = sd1VarA.e();
            if (strE == null) {
                z90.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            s76 s76Var = (s76) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            e27<t27<s76.b>> e27Var = s76Var.t;
            t27<s76.b> t27VarB = e27Var.b(id);
            if (t27VarB == null) {
                t27VarB = new t27<>(1);
                e27Var.i(id, t27VarB);
            }
            t27<s76.b> t27Var2 = t27VarB;
            Object[] objArr = t27Var2.a;
            int i4 = t27Var2.b;
            while (true) {
                if (i3 >= i4) {
                    obj = null;
                    break;
                }
                obj = objArr[i3];
                if (!((s76.b) obj).c) {
                    break;
                } else {
                    i3++;
                }
            }
            s76.b bVar = (s76.b) obj;
            if (bVar == null) {
                bVar = new s76.b();
                t27Var2.g(bVar);
            }
            bVar.c = true;
            this.z = bVar;
            lv8Var = bVar.b;
        }
        if (lv8Var == null) {
            lv8Var = dc4.t;
        }
        this.A = lv8Var;
        oh4<? super et1, g2b> oh4Var = this.D0;
        if (oh4Var != null) {
            oh4Var.invoke(getComposeViewContext());
            this.D0 = null;
        }
        s66 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.T);
        this.M0.a.setValue(new qd5(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            vm.a.b(this);
        }
        nk nkVar = this.j0;
        if (nkVar != null) {
            getFocusOwner().getListeners().g(nkVar);
            getSemanticsOwner().d.g(nkVar);
        }
        getFocusOwner().getListeners().g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bh9<cq> bh9Var = this.G0.get();
        cq cqVar = bh9Var != null ? bh9Var.b : null;
        if (cqVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        bh9<pd5> bh9Var2 = cqVar.w.get();
        pd5 pd5Var = bh9Var2 != null ? bh9Var2.b : null;
        return pd5Var != null && (pd5Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i0(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection ud7Var;
        int i2;
        bh9<cq> bh9Var = this.G0.get();
        cq cqVar = bh9Var != null ? bh9Var.b : null;
        if (cqVar == null) {
            zha legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                s85 s85Var = legacyTextInputServiceAndroid.h;
                kha khaVar = legacyTextInputServiceAndroid.g;
                int i3 = s85Var.e;
                boolean z = s85Var.a;
                if (i3 == 1) {
                    i2 = z ? 6 : 0;
                } else if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 2) {
                    i2 = 2;
                } else if (i3 == 6) {
                    i2 = 5;
                } else if (i3 == 5) {
                    i2 = 7;
                } else if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 4) {
                    i2 = 4;
                } else {
                    if (i3 != 7) {
                        aa0.c("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i2;
                int i4 = s85Var.d;
                if (i4 == 1) {
                    editorInfo.inputType = 1;
                } else if (i4 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i2;
                } else if (i4 == 3) {
                    editorInfo.inputType = 2;
                } else if (i4 == 4) {
                    editorInfo.inputType = 3;
                } else if (i4 == 5) {
                    editorInfo.inputType = 17;
                } else if (i4 == 6) {
                    editorInfo.inputType = 33;
                } else if (i4 == 7) {
                    editorInfo.inputType = 129;
                } else if (i4 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i4 != 9) {
                        aa0.c("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z) {
                    int i5 = editorInfo.inputType;
                    if ((i5 & 1) == 1) {
                        editorInfo.inputType = i5 | 131072;
                        if (i3 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i6 = editorInfo.inputType;
                if ((i6 & 1) == 1) {
                    int i7 = s85Var.b;
                    if (i7 == 1) {
                        editorInfo.inputType = i6 | 4096;
                    } else if (i7 == 2) {
                        editorInfo.inputType = i6 | 8192;
                    } else if (i7 == 3) {
                        editorInfo.inputType = i6 | 16384;
                    }
                    if (s85Var.c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j2 = khaVar.b;
                int i8 = lja.c;
                editorInfo.initialSelStart = (int) (j2 >> 32);
                editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                vd3.c(editorInfo, khaVar.a.u);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.d.d()) {
                    androidx.emoji2.text.d.a().i(editorInfo);
                }
                ok8 ok8Var = new ok8(legacyTextInputServiceAndroid.g, new bia(legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(ok8Var));
                return ok8Var;
            }
        } else {
            bh9<pd5> bh9Var2 = cqVar.w.get();
            pd5 pd5Var = bh9Var2 != null ? bh9Var2.b : null;
            if (pd5Var != null) {
                synchronized (pd5Var.c) {
                    if (pd5Var.e) {
                        return null;
                    }
                    pk8 pk8VarA = pd5Var.a.a(editorInfo);
                    od5 od5Var = new od5(pd5Var);
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 34) {
                        ud7Var = new vd7(pk8VarA, od5Var);
                    } else {
                        ud7Var = i9 >= 25 ? new ud7(pk8VarA, od5Var) : new td7(pk8VarA, od5Var);
                    }
                    pd5Var.d.d(new mkb(ud7Var));
                    return ud7Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        bn bnVar = this.T;
        bnVar.getClass();
        bn.b.b(bnVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jk jkVar;
        super.onDetachedFromWindow();
        setAttached(false);
        this.N.onViewDetachedFromWindow(this);
        View view = this.E;
        if (W() && view != null) {
            removeView(view);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            t27<cm> t27Var = j1;
            synchronized (t27Var) {
                t27Var.k(this);
                g2b g2bVar = g2b.a;
            }
        }
        getComposeViewContext().b();
        jv9 jv9Var = getSnapshotObserver().a;
        gu9 gu9Var = jv9Var.h;
        if (gu9Var != null) {
            gu9Var.a();
        }
        jv9Var.a();
        s66 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.c(this.T);
        lifecycle.c(this);
        if (P() && (jkVar = this.i0) != null) {
            jf0.a.b(jkVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        s76.b bVar = this.z;
        if (bVar != null) {
            bVar.c = false;
        }
        this.z = null;
        if (i2 >= 31) {
            vm.a.a(this);
        }
        nk nkVar = this.j0;
        if (nkVar != null) {
            getSemanticsOwner().d.k(nkVar);
            getFocusOwner().getListeners().k(nkVar);
        }
        xk8 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        xk8 rectManager2 = getRectManager();
        Object obj = rectManager2.h;
        if (obj != null) {
            rectManager2.a.d0(obj);
            rectManager2.h = null;
        }
        getFocusOwner().getListeners().k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().u();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.y0 = 0L;
        j0();
        int i2 = Build.VERSION.SDK_INT;
        if (32 > i2 || i2 >= 34) {
            return;
        }
        i0(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.y0 = 0L;
            this.s0.l(this.Z0);
            this.q0 = null;
            j0();
            if (this.p0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i4 - i2, i5 - i3);
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            g2b g2bVar2 = g2b.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        dl6 dl6Var = this.s0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                V(getRoot());
            }
            long jR = R(i2);
            long jR2 = R(i3);
            long jA = xx1.a.a((int) (jR >>> 32), (int) (jR & 4294967295L), (int) (jR2 >>> 32), (int) (4294967295L & jR2));
            xx1 xx1Var = this.q0;
            if (xx1Var == null) {
                this.q0 = new xx1(jA);
                this.r0 = false;
            } else if (!xx1.b(xx1Var.a, jA)) {
                this.r0 = true;
            }
            dl6Var.s(jA);
            dl6Var.n();
            setMeasuredDimension(getRoot().Z.p.t, getRoot().Z.p.u);
            if (this.p0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().Z.p.t, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().Z.p.u, 1073741824));
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            g2b g2bVar2 = g2b.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (!P() || viewStructure == null) {
            return;
        }
        nk nkVar = this.j0;
        if (nkVar != null) {
            qr5 qr5Var = nkVar.u.a;
            AutofillId autofillId = nkVar.z;
            String str = nkVar.x;
            xk8 xk8Var = nkVar.w;
            b68.a(viewStructure, qr5Var, autofillId, str, xk8Var);
            Object[] objArr = me7.a;
            t27 t27Var = new t27(2);
            t27Var.g(qr5Var);
            t27Var.g(viewStructure);
            while (t27Var.e()) {
                Object objL = t27Var.l(t27Var.b - 1);
                objL.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objL;
                Object objL2 = t27Var.l(t27Var.b - 1);
                objL2.getClass();
                List<mb9> listT = ((mb9) objL2).t();
                int size = listT.size();
                for (int i3 = 0; i3 < size; i3++) {
                    mb9 mb9Var = listT.get(i3);
                    if (!mb9Var.h() && mb9Var.e() && mb9Var.j()) {
                        lb9 lb9VarR = mb9Var.r();
                        if (lb9VarR != null) {
                            c37<gc9<?>, Object> c37Var = lb9VarR.t;
                            if (c37Var.a(kb9.g) || c37Var.a(kb9.h) || c37Var.a(ac9.r) || c37Var.a(ac9.s)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                b68.a(viewStructureNewChild, mb9Var, nkVar.z, str, xk8Var);
                                t27Var.g(mb9Var);
                                t27Var.g(viewStructureNewChild);
                            } else {
                                t27Var.g(mb9Var);
                                t27Var.g(viewStructure2);
                            }
                        } else {
                            t27Var.g(mb9Var);
                            t27Var.g(viewStructure2);
                        }
                    }
                }
            }
        }
        jk jkVar = this.i0;
        if (jkVar != null) {
            qf0 qf0Var = jkVar.b;
            LinkedHashMap linkedHashMap = qf0Var.a;
            LinkedHashMap linkedHashMap2 = qf0Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                pf0 pf0Var = (pf0) entry.getValue();
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                gf0.d(viewStructureNewChild2, jkVar.d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, jkVar.a.getContext().getPackageName(), null, null);
                gf0.e(viewStructureNewChild2, 1);
                pf0Var.getClass();
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        w48 w48VarA;
        int toolType = motionEvent.getToolType(i2);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (w48VarA = getPointerIconService().a()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        Context context = getContext();
        if (w48VarA instanceof dq) {
            return null;
        }
        return w48VarA instanceof eq ? PointerIcon.getSystemIcon(context, ((eq) w48VarA).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        tq5 tq5Var;
        if (this.v) {
            int[] iArr = z84.a;
            tq5 tq5Var2 = tq5.t;
            if (i2 != 0) {
                tq5Var = i2 != 1 ? null : tq5.u;
            } else {
                tq5Var = tq5Var2;
            }
            if (tq5Var != null) {
                tq5Var2 = tq5Var;
            }
            setLayoutDirection(tq5Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        g69 g69Var;
        if (Build.VERSION.SDK_INT < 31 || (g69Var = this.d1) == null) {
            return;
        }
        g69Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j0();
    }

    @Override // defpackage.as2
    public final void onStop(m76 m76Var) {
        s76.b bVar = this.z;
        if (bVar != null) {
            fh6 fh6Var = (fh6) bVar.a.t;
            if (fh6Var.t && !fh6Var.v) {
                i41 i41Var = bVar.d;
                if (i41Var != null) {
                    i41Var.cancel();
                }
                bVar.d = null;
                return;
            }
            if (fh6Var.u) {
                return;
            }
            if (!fh6Var.v) {
                d78.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!fh6Var.w.e()) {
                d78.a("Attempted to start retaining exited values with pending exited values");
            }
            fh6Var.v = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.M0.a.setValue(new qd5(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        bn bnVar = this.T;
        bnVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (xj5.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            bn.b.a(bnVar, longSparseArray);
        } else {
            bnVar.t.post(new cn(0, bnVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        this.b1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zA = a.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        U(getRoot());
    }

    @Override // defpackage.mn7
    public final void p(qr5 qr5Var) {
        nk nkVar;
        if (P() && (nkVar = this.j0) != null && nkVar.A.g(qr5Var.u)) {
            nkVar.t.e(nkVar.v, qr5Var.u, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mn7
    public final void q(ci4 ci4Var, u02 u02Var) throws Throwable {
        im imVar;
        if (u02Var instanceof im) {
            imVar = (im) u02Var;
            int i2 = imVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imVar.v = i2 - Integer.MIN_VALUE;
            } else {
                imVar = new im(this, u02Var);
            }
        } else {
            imVar = new im(this, u02Var);
        }
        Object obj = imVar.t;
        int i3 = imVar.v;
        if (i3 == 0) {
            dv8.b(obj);
            jm jmVar = new jm(this);
            imVar.v = 1;
            if (u72.d(new ch9(jmVar, this.G0, ci4Var, null), imVar) == v72.t) {
                return;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            dv8.b(obj);
        }
        fl.a();
    }

    @Override // defpackage.zk6
    public final void r(float[] fArr) {
        b0();
        xk6.e(fArr, this.w0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.A0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.A0 & 4294967295L));
        float[] fArr2 = this.v0;
        xk6.d(fArr2);
        xk6.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        ym.h(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (!isFocused()) {
            l84 l84VarD = z84.d(i2);
            int i3 = l84VarD != null ? l84VarD.a : 7;
            Boolean boolC = getFocusOwner().c(i3, rect != null ? new sk8(rect.left, rect.top, rect.right, rect.bottom) : null, new fm(i3));
            Boolean bool = Boolean.TRUE;
            if (!xj5.a(boolC, bool) && !xj5.a(getFocusOwner().c(i3, null, new gm(i3)), bool)) {
                if (!hasFocus()) {
                    return false;
                }
                if (i3 == 1 || i3 == 2) {
                    return getFocusOwner().n(i3);
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mn7
    public final void s(qr5 qr5Var) {
        vh7 vh7Var = this.s0.e;
        vh7Var.getClass();
        if (qr5Var.i0 > 0) {
            vh7Var.a.d(qr5Var);
            qr5Var.h0 = true;
        }
        f0(null);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.S.x = j2;
    }

    public final void setComposeViewContext(et1 et1Var) {
        if (getCoroutineContext() != et1Var.b.k() && !((k37.a) getRoot().B()).isEmpty()) {
            uc5.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            et1 et1Var2 = get_composeViewContext();
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            if (et1Var != et1Var2) {
                if (isAttachedToWindow()) {
                    et1Var2.b();
                    et1Var.c();
                }
                set_composeViewContext(et1Var);
                setCoroutineContext(et1Var.b.k());
            }
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.c1 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.g0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(bn bnVar) {
        this.T = bnVar;
    }

    public void setCoroutineContext(h72 h72Var) {
        this.G = h72Var;
    }

    public final void setFrameEndScheduler$ui(s76.a aVar) {
        this.y = aVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j2) {
        this.y0 = j2;
    }

    public final void setOnReadyForComposition(oh4<? super et1, g2b> oh4Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.c1) {
            oh4Var.invoke(getComposeViewContext());
        } else {
            this.D0 = oh4Var;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ib5 ib5Var) {
        this.w = ib5Var;
    }

    @Override // defpackage.mn7
    public void setShowLayoutBounds(boolean z) {
        this.o0 = z;
    }

    public void setUncaughtExceptionHandler(ox8.a aVar) {
        this.s0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mn7
    public final ln7 w(ci4 ci4Var, mb7.f fVar, ko4 ko4Var) {
        k37<Reference<ln7>> k37Var;
        Reference<? extends ln7> referencePoll;
        Object obj;
        if (ko4Var != null) {
            return new qo4(ko4Var, null, this, ci4Var, fVar);
        }
        do {
            kkb<ln7> kkbVar = this.R0;
            ReferenceQueue<ln7> referenceQueue = kkbVar.b;
            k37Var = kkbVar.a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                k37Var.n(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i2 = k37Var.v;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) k37Var.o(i2 - 1)).get();
        } while (obj == null);
        ln7 ln7Var = (ln7) obj;
        if (ln7Var == null) {
            return new qo4(getGraphicsContext().b(), getGraphicsContext(), this, ci4Var, fVar);
        }
        ln7Var.g(ci4Var, fVar);
        return ln7Var;
    }

    @Override // defpackage.mn7
    public final void x(int i2, qr5 qr5Var) {
        m5getLayoutNodes().g(i2);
        m5getLayoutNodes().i(qr5Var.u, qr5Var);
    }

    @Override // defpackage.mn7
    public final void y() {
        t27<mh4<g2b>> t27Var;
        nk nkVar;
        jv9.a[] aVarArr;
        if (this.k0) {
            jv9 jv9Var = getSnapshotObserver().a;
            synchronized (jv9Var.g) {
                try {
                    k37<jv9.a> k37Var = jv9Var.f;
                    int i2 = k37Var.v;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        aVarArr = k37Var.t;
                        if (i3 >= i2) {
                            break;
                        }
                        jv9.a aVar = aVarArr[i3];
                        aVar.d();
                        if (!aVar.f.f()) {
                            i4++;
                        } else if (i4 > 0) {
                            jv9.a[] aVarArr2 = k37Var.t;
                            aVarArr2[i3 - i4] = aVarArr2[i3];
                        }
                        i3++;
                    }
                    int i5 = i2 - i4;
                    Arrays.fill(aVarArr, i5, i2, (Object) null);
                    k37Var.v = i5;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.k0 = false;
        }
        kt ktVar = this.p0;
        if (ktVar != null) {
            Q(ktVar);
        }
        if (P() && (nkVar = this.j0) != null) {
            f27 f27Var = nkVar.A;
            if (f27Var.d == 0 && nkVar.B) {
                nkVar.t.a();
                nkVar.B = false;
            }
            if (f27Var.d != 0) {
                nkVar.B = true;
            }
        }
        while (this.S0.e() && this.S0.b(0) != null) {
            int i6 = this.S0.b;
            int i7 = 0;
            while (true) {
                t27Var = this.S0;
                if (i7 < i6) {
                    mh4<g2b> mh4VarB = t27Var.b(i7);
                    this.S0.o(i7, null);
                    if (mh4VarB != null) {
                        mh4VarB.invoke();
                    }
                    i7++;
                }
            }
            t27Var.m(0, i6);
        }
    }

    @Override // defpackage.bm7
    public final void z(zr5 zr5Var) {
        h30<mh4<g2b>> h30Var = this.B;
        boolean zIsEmpty = h30Var.isEmpty();
        h30Var.addLast(zr5Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.C);
            } else {
                z90.a("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    @Override // defpackage.mn7
    public ck getAccessibilityManager() {
        return this.U;
    }

    @Override // defpackage.mn7
    public sl getClipboard() {
        return this.m0;
    }

    @Override // defpackage.mn7
    public tl getClipboardManager() {
        return this.l0;
    }

    @Override // defpackage.mn7
    public zn getDragAndDropManager() {
        return this.H;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public e27<qr5> m5getLayoutNodes() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i2;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        g2b g2bVar = g2b.a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @gy2
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @gy2
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public ox8 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends ox6.c implements xv0, qb9, sx8, so5, lr5, txa {
        public final c H = new c();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends wp5 implements oh4<jz7.a, g2b> {
            public final /* synthetic */ jz7 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jz7 jz7Var) {
                super(1);
                this.u = jz7Var;
            }

            @Override // defpackage.oh4
            public final g2b invoke(jz7.a aVar) {
                aVar.l(this.u, 0, 0, 0.0f);
                return g2b.a;
            }
        }

        /* JADX INFO: renamed from: cm$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0043b extends wp5 implements oh4<ba4, Boolean> {
            public final /* synthetic */ l84 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0043b(l84 l84Var) {
                super(1);
                this.u = l84Var;
            }

            @Override // defpackage.oh4
            public final Boolean invoke(ba4 ba4Var) {
                return Boolean.valueOf(ba4Var.y(this.u.a));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends wp5 implements oh4<wy8, g2b> {
            public c() {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oh4
            public final g2b invoke(wy8 wy8Var) {
                wy8 wy8Var2 = wy8Var;
                cm cmVar = cm.this;
                if (cmVar.getInsetsListener().z.k() > 0) {
                    e27 e27Var = lnb.a;
                    long jA = wy8Var2.j0().a();
                    c37 c37Var = cmVar.getInsetsListener().y;
                    int i = (int) (jA >> 32);
                    int i2 = (int) (jA & 4294967295L);
                    for (jnb jnbVar : lnb.b) {
                        V vD = c37Var.d(jnbVar);
                        vD.getClass();
                        eob eobVar = (eob) vD;
                        lnb.a(wy8Var2, jnbVar.a(), eobVar.h, i, i2);
                        if (((Boolean) eobVar.b.getValue()).booleanValue()) {
                            lnb.a(wy8Var2, eobVar.f, eobVar.j, i, i2);
                            lnb.a(wy8Var2, eobVar.g, eobVar.k, i, i2);
                        }
                        lnb.a(wy8Var2, jnbVar.b(), eobVar.i, i, i2);
                    }
                    t27<h37<Rect>> t27Var = cmVar.getInsetsListener().A;
                    if (t27Var.e()) {
                        fv9<yk8> fv9Var = cmVar.getInsetsListener().B;
                        Object[] objArr = t27Var.a;
                        int i3 = t27Var.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            h37 h37Var = (h37) objArr[i4];
                            yk8 yk8Var = fv9Var.get(i4);
                            Rect rect = (Rect) h37Var.getValue();
                            wy8Var2.j1(yk8Var.b(), rect.left);
                            wy8Var2.j1(yk8Var.c(), rect.top);
                            wy8Var2.j1(yk8Var.d(), rect.right);
                            wy8Var2.j1(yk8Var.a(), rect.bottom);
                        }
                    }
                }
                return g2b.a;
            }
        }

        public b() {
        }

        @Override // defpackage.so5
        public final boolean C(KeyEvent keyEvent) {
            return false;
        }

        @Override // defpackage.xv0
        public final Object E0(mb7 mb7Var, yv0 yv0Var, u02 u02Var) {
            long jA0 = mb7Var.a0(0L);
            sk8 sk8Var = (sk8) yv0Var.invoke();
            sk8 sk8VarI = sk8Var != null ? sk8Var.i(jA0) : null;
            if (sk8VarI != null) {
                cm.this.requestRectangleOnScreen(new Rect((int) sk8VarI.a, (int) sk8VarI.b, (int) sk8VarI.c, (int) sk8VarI.d), false);
            }
            return g2b.a;
        }

        @Override // defpackage.txa
        public final Object G() {
            return "androidx.compose.ui.layout.WindowInsetsRulers";
        }

        @Override // defpackage.lr5
        public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
            jz7 jz7VarE = cl6Var.E(j);
            return hl6Var.i1(jz7VarE.t, jz7VarE.u, if3.t, this.H, new a(jz7VarE));
        }

        @Override // defpackage.so5
        public final boolean l0(KeyEvent keyEvent) {
            l84 l84Var;
            int[] iArr = z84.a;
            long jA = db7.a(keyEvent);
            if (lo5.a(jA, lo5.b)) {
                l84Var = new l84(2);
            } else if (lo5.a(jA, lo5.c)) {
                l84Var = new l84(1);
            } else if (lo5.a(jA, lo5.p)) {
                l84Var = new l84(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (lo5.a(jA, lo5.g)) {
                l84Var = new l84(4);
            } else if (lo5.a(jA, lo5.f)) {
                l84Var = new l84(3);
            } else if (lo5.a(jA, lo5.d) || lo5.a(jA, lo5.C)) {
                l84Var = new l84(5);
            } else if (lo5.a(jA, lo5.e) || lo5.a(jA, lo5.D)) {
                l84Var = new l84(6);
            } else if (lo5.a(jA, lo5.h) || lo5.a(jA, lo5.r) || lo5.a(jA, lo5.E)) {
                l84Var = new l84(7);
            } else {
                l84Var = (lo5.a(jA, lo5.a) || lo5.a(jA, lo5.u)) ? new l84(8) : null;
            }
            if (l84Var != null) {
                int i = l84Var.a;
                if (db7.b(keyEvent) == 2) {
                    cm cmVar = cm.this;
                    ba4 ba4VarV = cmVar.getFocusOwner().v();
                    if (ba4VarV == null || !ba4VarV.H || !cmVar.a0(i)) {
                        Boolean boolC = cmVar.getFocusOwner().c(i, cmVar.getEmbeddedViewFocusRect(), new C0043b(l84Var));
                        if (!(boolC != null ? boolC.booleanValue() : true)) {
                            if (i == 1 || i == 2) {
                                Integer numC = z84.c(i);
                                int iIntValue = numC != null ? numC.intValue() : 2;
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = cmVar.getRootView();
                                rootView.getClass();
                                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, cmVar.getView(), iIntValue);
                                if (viewFindNextFocus == null || viewFindNextFocus.equals(cmVar)) {
                                    return cmVar.getFocusOwner().n(i);
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.qb9
        public final void E1(hc9 hc9Var) {
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(ox8.a aVar) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
