package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.m83;
import defpackage.yr6;
import defpackage.zr6;
import defpackage.zz;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends yr6 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final zr6 A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public j.a G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;
    public final Context u;
    public final f v;
    public final e w;
    public final boolean x;
    public final int y;
    public final int z;
    public final a B = new a();
    public final b C = new b();
    public int L = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            zr6 zr6Var = lVar.A;
            if (!lVar.a() || zr6Var.R) {
                return;
            }
            View view = lVar.F;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                zr6Var.b();
            }
        }
    }

    public l(Context context, f fVar, View view, int i, boolean z) {
        this.u = context;
        this.v = fVar;
        this.x = z;
        this.w = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.z = i;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new zr6(context, null, i, 0);
        fVar.b(this, context);
    }

    @Override // defpackage.ao9
    public final boolean a() {
        return !this.I && this.A.S.isShowing();
    }

    @Override // defpackage.ao9
    public final void b() {
        View view;
        if (a()) {
            return;
        }
        if (this.I || (view = this.E) == null) {
            aa0.c("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.F = view;
        zr6 zr6Var = this.A;
        zz zzVar = zr6Var.S;
        zz zzVar2 = zr6Var.S;
        zzVar.setOnDismissListener(this);
        zr6Var.I = this;
        zr6Var.R = true;
        zzVar2.setFocusable(true);
        View view2 = this.F;
        boolean z = this.H == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.H = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.B);
        }
        view2.addOnAttachStateChangeListener(this.C);
        zr6Var.H = view2;
        zr6Var.E = this.L;
        boolean z2 = this.J;
        Context context = this.u;
        e eVar = this.w;
        if (!z2) {
            this.K = yr6.o(eVar, context, this.y);
            this.J = true;
        }
        zr6Var.r(this.K);
        zzVar2.setInputMethodMode(2);
        Rect rect = this.t;
        zr6Var.Q = rect != null ? new Rect(rect) : null;
        zr6Var.b();
        m83 m83Var = zr6Var.v;
        m83Var.setOnKeyListener(this);
        if (this.M) {
            f fVar = this.v;
            if (fVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m83Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.m);
                }
                frameLayout.setEnabled(false);
                m83Var.addHeaderView(frameLayout, null, false);
            }
        }
        zr6Var.p(eVar);
        zr6Var.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        if (fVar != this.v) {
            return;
        }
        dismiss();
        j.a aVar = this.G;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        this.J = false;
        e eVar = this.w;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ao9
    public final void dismiss() {
        if (a()) {
            this.A.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.G = aVar;
    }

    @Override // defpackage.ao9
    public final m83 j() {
        return this.A.v;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.u, mVar, this.F, this.x, this.z, 0);
            j.a aVar = this.G;
            iVar.h = aVar;
            yr6 yr6Var = iVar.i;
            if (yr6Var != null) {
                yr6Var.f(aVar);
            }
            int size = mVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            iVar.g = z;
            yr6 yr6Var2 = iVar.i;
            if (yr6Var2 != null) {
                yr6Var2.q(z);
            }
            iVar.j = this.D;
            this.D = null;
            this.v.c(false);
            zr6 zr6Var = this.A;
            int width = zr6Var.y;
            int iO = zr6Var.o();
            if ((Gravity.getAbsoluteGravity(this.L, this.E.getLayoutDirection()) & 7) == 5) {
                width += this.E.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.e != null) {
                    iVar.d(width, iO, true, true);
                }
            }
            j.a aVar2 = this.G;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.v.c(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.yr6
    public final void p(View view) {
        this.E = view;
    }

    @Override // defpackage.yr6
    public final void q(boolean z) {
        this.w.v = z;
    }

    @Override // defpackage.yr6
    public final void r(int i) {
        this.L = i;
    }

    @Override // defpackage.yr6
    public final void s(int i) {
        this.A.y = i;
    }

    @Override // defpackage.yr6
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // defpackage.yr6
    public final void u(boolean z) {
        this.M = z;
    }

    @Override // defpackage.yr6
    public final void v(int i) {
        this.A.l(i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.H = view.getViewTreeObserver();
                }
                lVar.H.removeGlobalOnLayoutListener(lVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // defpackage.yr6
    public final void n(f fVar) {
    }
}
