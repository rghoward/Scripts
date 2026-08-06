package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import com.hwpo_training_app.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d68 extends v0 {
    public final WindowManager.LayoutParams A;
    public l68 B;
    public tq5 C;
    public final dt7 D;
    public final dt7 E;
    public gg5 F;
    public final my2 G;
    public final Rect H;
    public final jv9 I;
    public jx J;
    public final dt7 K;
    public boolean L;
    public final int[] M;
    public mh4<g2b> t;
    public m68 u;
    public String v;
    public final View w;
    public final boolean x;
    public final k68 y;
    public final WindowManager z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<d68, g2b> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final g2b invoke(d68 d68Var) {
            d68 d68Var2 = d68Var;
            if (d68Var2.isAttachedToWindow()) {
                d68Var2.h();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.v = i;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            int iS = gz3.s(this.v | 1);
            d68.this.Content(jt1Var, iS);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public final /* synthetic */ fl8 u;
        public final /* synthetic */ d68 v;
        public final /* synthetic */ gg5 w;
        public final /* synthetic */ long x;
        public final /* synthetic */ long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fl8 fl8Var, d68 d68Var, gg5 gg5Var, long j, long j2) {
            super(0);
            this.u = fl8Var;
            this.v = d68Var;
            this.w = gg5Var;
            this.x = j;
            this.y = j2;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            d68 d68Var = this.v;
            this.u.t = d68Var.getPositionProvider().a(this.w, this.x, d68Var.getParentLayoutDirection(), this.y);
            return g2b.a;
        }
    }

    public d68() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d68(mh4 mh4Var, m68 m68Var, String str, View view, tx2 tx2Var, l68 l68Var, UUID uuid, boolean z) {
        super(view.getContext(), null, 0, 6, null);
        int i = Build.VERSION.SDK_INT;
        k68 j68Var = i >= 30 ? new j68() : i >= 29 ? new i68() : new k68();
        this.t = mh4Var;
        this.u = m68Var;
        this.v = str;
        this.w = view;
        this.x = z;
        this.y = j68Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.z = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        m68 m68Var2 = this.u;
        boolean zB = fq.b(view);
        boolean z2 = m68Var2.b;
        int i2 = m68Var2.a;
        if (z2 && zB) {
            i2 |= 8192;
        } else if (z2 && !zB) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.u.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.A = layoutParams;
        this.B = l68Var;
        this.C = tq5.t;
        this.D = bl7.i(null);
        this.E = bl7.i(null);
        this.G = bl7.f(new e68(this));
        this.H = new Rect();
        this.I = new jv9(new g68(this));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, vib.a(view));
        setTag(R.id.view_tree_view_model_store_owner, ty.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, sy.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(tx2Var.U0(8.0f));
        setOutlineProvider(new c68());
        this.K = bl7.i(ir1.a);
        this.M = new int[2];
    }

    private final ci4<jt1, Integer, g2b> getContent() {
        return (ci4) this.K.getValue();
    }

    private final gg5 getDisplayBounds() {
        int i = this.u.a & 512;
        View view = this.w;
        Rect rect = this.H;
        k68 k68Var = this.y;
        if (i == 0) {
            k68Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            k68Var.a(rect, view);
        }
        u93 u93Var = fq.a;
        return new gg5(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qq5 getParentLayoutCoordinates() {
        return (qq5) this.E.getValue();
    }

    private final void setContent(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.K.setValue(ci4Var);
    }

    private final void setParentLayoutCoordinates(qq5 qq5Var) {
        this.E.setValue(qq5Var);
    }

    @Override // defpackage.v0
    public final void Content(jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-857613600);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new b(i);
        }
    }

    public final void d(yt1 yt1Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        setParentCompositionContext(yt1Var);
        setContent(ci4Var);
        this.L = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                mh4<g2b> mh4Var = this.t;
                if (mh4Var != null) {
                    mh4Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(mh4<g2b> mh4Var, m68 m68Var, String str, tq5 tq5Var) {
        int i;
        this.t = mh4Var;
        this.v = str;
        if (!xj5.a(this.u, m68Var)) {
            m68Var.getClass();
            this.u = m68Var;
            boolean zB = fq.b(this.w);
            boolean z = m68Var.b;
            int i2 = m68Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.A;
            layoutParams.flags = i2;
            this.y.getClass();
            this.z.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = tq5Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                u.b();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void f() {
        qq5 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.e()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jF = this.x ? parentLayoutCoordinates.f(0L) : parentLayoutCoordinates.q(0L);
            gg5 gg5VarA = qk1.a((((long) Math.round(Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jF & 4294967295L))))), jA);
            if (gg5VarA.equals(this.F)) {
                return;
            }
            this.F = gg5VarA;
            h();
        }
    }

    public final void g(qq5 qq5Var) {
        setParentLayoutCoordinates(qq5Var);
        f();
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.A;
    }

    public final tq5 getParentLayoutDirection() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final kg5 m7getPopupContentSizebOM6tXw() {
        return (kg5) this.D.getValue();
    }

    public final l68 getPositionProvider() {
        return this.B;
    }

    @Override // defpackage.v0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    public final String getTestTag() {
        return this.v;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h() {
        kg5 kg5VarM7getPopupContentSizebOM6tXw;
        gg5 gg5Var = this.F;
        if (gg5Var == null || (kg5VarM7getPopupContentSizebOM6tXw = m7getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = kg5VarM7getPopupContentSizebOM6tXw.a;
        gg5 displayBounds = getDisplayBounds();
        long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        fl8 fl8Var = new fl8();
        fl8Var.t = 0L;
        this.I.d(this, a.u, new c(fl8Var, this, gg5Var, jB, j));
        long j2 = fl8Var.t;
        WindowManager.LayoutParams layoutParams = this.A;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.u.e;
        k68 k68Var = this.y;
        if (z) {
            k68Var.b(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        k68Var.getClass();
        this.z.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.v0
    public final void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui(z, i, i2, i3, i4);
        this.u.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.A;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.y.getClass();
        this.z.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.v0
    public final void internalOnMeasure$ui(int i, int i2) {
        this.u.getClass();
        gg5 displayBounds = getDisplayBounds();
        super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jx] */
    @Override // defpackage.v0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.e();
        if (!this.u.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.J == null) {
            final mh4<g2b> mh4Var = this.t;
            this.J = new OnBackInvokedCallback() { // from class: jx
                public final void onBackInvoked() {
                    mh4 mh4Var2 = mh4Var;
                    if (mh4Var2 != null) {
                        mh4Var2.invoke();
                    }
                }
            };
        }
        kx.a(this, this.J);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jv9 jv9Var = this.I;
        gu9 gu9Var = jv9Var.h;
        if (gu9Var != null) {
            gu9Var.a();
        }
        jv9Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            kx.b(this, this.J);
        }
        this.J = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.u.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            mh4<g2b> mh4Var = this.t;
            if (mh4Var != null) {
                mh4Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            mh4<g2b> mh4Var2 = this.t;
            if (mh4Var2 != null) {
                mh4Var2.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(tq5 tq5Var) {
        this.C = tq5Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m8setPopupContentSizefhxjrPA(kg5 kg5Var) {
        this.D.setValue(kg5Var);
    }

    public final void setPositionProvider(l68 l68Var) {
        this.B = l68Var;
    }

    public final void setTestTag(String str) {
        this.v = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public v0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
