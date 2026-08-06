package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia3 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static pa3 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends View {
        public final /* synthetic */ ha3 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ha3 ha3Var, Context context) {
            super(context);
            this.t = ha3Var;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            configuration.getClass();
            this.t.run();
        }
    }

    public static final void a(dq1 dq1Var, w7a w7aVar, w7a w7aVar2) {
        View decorView = dq1Var.getWindow().getDecorView();
        decorView.getClass();
        pa3 ka3Var = c;
        if (ka3Var == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                ka3Var = new oa3();
            } else if (i >= 30) {
                ka3Var = new na3();
            } else if (i >= 29) {
                ka3Var = new ma3();
            } else if (i >= 28) {
                ka3Var = new la3();
            } else {
                ka3Var = i >= 26 ? new ka3() : new ja3();
            }
            c = ka3Var;
        }
        pa3 pa3Var = ka3Var;
        ha3 ha3Var = new ha3(pa3Var, w7aVar, w7aVar2, dq1Var, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                a aVar = new a(ha3Var, viewGroup.getContext());
                aVar.setTag(pa3Var);
                aVar.setVisibility(8);
                aVar.setWillNotDraw(true);
                viewGroup.addView(aVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof pa3) {
                break;
            } else {
                i2 = i3;
            }
        }
        ha3Var.run();
        Window window = dq1Var.getWindow();
        window.getClass();
        pa3Var.a(window);
    }

    public static void b(dq1 dq1Var) {
        a(dq1Var, new w7a(0, 0, 0, new vx3(1)), new w7a(a, b, 0, new vx3(1)));
    }
}
