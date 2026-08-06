package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface mib<T extends View> extends lr9 {
    static s03 c(int i, int i2, int i3) {
        if (i == -2) {
            return s03.b.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new s03.a(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new s03.a(i5);
        }
        return null;
    }

    T a();

    @Override // defpackage.lr9
    default Object b(wi8 wi8Var) {
        br9 size = getSize();
        if (size != null) {
            return size;
        }
        e41 e41Var = new e41(1, th0.e(wi8Var));
        e41Var.t();
        ViewTreeObserver viewTreeObserver = a().getViewTreeObserver();
        lib libVar = new lib(this, viewTreeObserver, e41Var);
        viewTreeObserver.addOnPreDrawListener(libVar);
        e41Var.v(new kib(this, viewTreeObserver, libVar));
        return e41Var.r();
    }

    default void d(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean g() {
        return true;
    }

    default br9 getSize() {
        int paddingRight;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        int i = layoutParams != null ? layoutParams.width : -1;
        int width = a().getWidth();
        if (g()) {
            paddingRight = a().getPaddingRight() + a().getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        s03 s03VarC = c(i, width, paddingRight);
        if (s03VarC == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = a().getLayoutParams();
        s03 s03VarC2 = c(layoutParams2 != null ? layoutParams2.height : -1, a().getHeight(), g() ? a().getPaddingBottom() + a().getPaddingTop() : 0);
        if (s03VarC2 == null) {
            return null;
        }
        return new br9(s03VarC, s03VarC2);
    }
}
