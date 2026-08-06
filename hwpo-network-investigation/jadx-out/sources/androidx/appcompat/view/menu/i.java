package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.hwpo_training_app.R;
import defpackage.yr6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public j.a h;
    public yr6 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final a k = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(Context context, f fVar, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = fVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final yr6 a() {
        yr6 lVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                lVar = new b(context2, this.e, this.d, this.c);
            } else {
                lVar = new l(context2, this.b, this.e, this.d, this.c);
            }
            lVar.n(this.b);
            lVar.t(this.k);
            lVar.p(this.e);
            lVar.f(this.h);
            lVar.q(this.g);
            lVar.r(this.f);
            this.i = lVar;
        }
        return this.i;
    }

    public final boolean b() {
        yr6 yr6Var = this.i;
        return yr6Var != null && yr6Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        yr6 yr6VarA = a();
        yr6VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            yr6VarA.s(i);
            yr6VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            yr6VarA.t = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        yr6VarA.b();
    }
}
