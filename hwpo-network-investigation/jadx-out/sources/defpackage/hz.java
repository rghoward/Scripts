package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.hwpo_training_app.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz implements pg7 {
    public final /* synthetic */ gz t;

    public hz(gz gzVar) {
        this.t = gzVar;
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        boolean z;
        boolean z2;
        int iD = umbVar.d();
        gz gzVar = this.t;
        Context context = gzVar.D;
        int iD2 = umbVar.d();
        ActionBarContextView actionBarContextView = gzVar.O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gzVar.O.getLayoutParams();
            boolean z3 = true;
            if (gzVar.O.isShown()) {
                if (gzVar.w0 == null) {
                    gzVar.w0 = new Rect();
                    gzVar.x0 = new Rect();
                }
                Rect rect = gzVar.w0;
                Rect rect2 = gzVar.x0;
                rect.set(umbVar.b(), umbVar.d(), umbVar.c(), umbVar.a());
                ViewGroup viewGroup = gzVar.U;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = yib.a;
                    yib.a.a(viewGroup, rect, rect2);
                } else {
                    if (!yib.a) {
                        yib.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            yib.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                yib.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = yib.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = gzVar.U;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                umb umbVarA = egb.e.a(viewGroup2);
                int iB = umbVarA == null ? 0 : umbVarA.b();
                int iC = umbVarA == null ? 0 : umbVarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || gzVar.W != null) {
                    View view2 = gzVar.W;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            gzVar.W.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    gzVar.W = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    gzVar.U.addView(gzVar.W, -1, layoutParams);
                }
                View view4 = gzVar.W;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = gzVar.W;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!gzVar.b0 && z3) {
                    iD2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                gzVar.O.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = gzVar.W;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return egb.j(view, iD != iD2 ? umbVar.f(umbVar.b(), iD2, umbVar.c(), umbVar.a()) : umbVar);
    }
}
