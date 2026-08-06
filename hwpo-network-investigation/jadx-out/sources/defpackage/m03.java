package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.hwpo_training_app.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m03 extends oq1 {
    public final yz2 A;
    public boolean B;
    public mh4<g2b> x;
    public f03 y;
    public final View z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<vg7, g2b> {
        public b() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(vg7 vg7Var) {
            m03 m03Var = m03.this;
            if (m03Var.y.a) {
                m03Var.x.invoke();
            }
            return g2b.a;
        }
    }

    public m03(mh4<g2b> mh4Var, f03 f03Var, View view, tq5 tq5Var, tx2 tx2Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), f03Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.x = mh4Var;
        this.y = f03Var;
        this.z = view;
        Window window = getWindow();
        if (window == null) {
            aa0.c("Dialog has no window");
            throw null;
        }
        f03 f03Var2 = this.y;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = f03Var2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        jmb.a(window, this.y.e);
        window.setGravity(17);
        if (!this.y.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                ex.a.a(attributes2);
            }
            if (i >= 30) {
                gx gxVar = gx.a;
                gxVar.b(attributes2, 0);
                gxVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        yz2 yz2Var = new yz2(getContext(), window);
        setTitle(this.y.f);
        yz2Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        yz2Var.setClipChildren(false);
        yz2Var.setElevation(tx2Var.U0(8.0f));
        yz2Var.setOutlineProvider(new a());
        this.A = yz2Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(yz2Var);
        yz2Var.setTag(R.id.view_tree_lifecycle_owner, vib.a(view));
        yz2Var.setTag(R.id.view_tree_view_model_store_owner, ty.e(view));
        yz2Var.setTag(R.id.view_tree_saved_state_registry_owner, sy.a(view));
        e(this.x, this.y, tq5Var);
        zg7 onBackPressedDispatcher = getOnBackPressedDispatcher();
        b bVar = new b();
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.a(this, new ah7(bVar));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof yz2) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(mh4<g2b> mh4Var, f03 f03Var, tq5 tq5Var) {
        int i;
        this.x = mh4Var;
        this.y = f03Var;
        s89 s89Var = f03Var.c;
        boolean zB = fq.b(this.z);
        int iOrdinal = s89Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = tq5Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                u.b();
                return;
            }
            i = 1;
        }
        yz2 yz2Var = this.A;
        yz2Var.setLayoutDirection(i);
        boolean z = f03Var.e;
        boolean z2 = f03Var.d;
        Window window2 = yz2Var.t;
        boolean z3 = (yz2Var.x && z2 == yz2Var.v && z == yz2Var.w) ? false : true;
        yz2Var.v = z2;
        yz2Var.w = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !yz2Var.x) {
                window2.setLayout(i3, -2);
                yz2Var.x = true;
            }
        }
        setCanceledOnTouchOutside(f03Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.y.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.x.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iB;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.y.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.B = false;
            return zOnTouchEvent;
        }
        yz2 yz2Var = this.A;
        yz2Var.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = yz2Var.getChildAt(0)) != null) {
            int left = childAt.getLeft() + yz2Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + yz2Var.getTop();
            int height = childAt.getHeight() + top;
            int iB2 = wk6.b(motionEvent.getX());
            if (left <= iB2 && iB2 <= width && top <= (iB = wk6.b(motionEvent.getY())) && iB <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.B = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.B = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.B = false;
                return zOnTouchEvent;
            }
        } else if (this.B) {
            this.x.invoke();
            this.B = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
