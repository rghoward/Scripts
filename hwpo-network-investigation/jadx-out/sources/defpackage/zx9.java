package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zx9 extends ay9 {
    public yx9 i;
    public boolean j;
    public final xx9 k;

    public zx9(HostActivity hostActivity) {
        super(hostActivity);
        this.j = true;
        this.k = new xx9(this, hostActivity);
    }

    public static void d(zx9 zx9Var, mp2 mp2Var, SplashScreenView splashScreenView) {
        HostActivity hostActivity = zx9Var.a;
        splashScreenView.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = hostActivity.getTheme();
            Window window = hostActivity.getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            decorView.getClass();
            ViewGroup viewGroup = (ViewGroup) decorView;
            wka.a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(zx9Var.j);
        }
        dy9.b aVar = i >= 31 ? new dy9.a(hostActivity) : new dy9.b(hostActivity);
        aVar.a();
        ((dy9.a) aVar).c = splashScreenView;
        ho5<Object>[] ho5VarArr = HostActivity.K;
        aVar.c();
    }

    @Override // defpackage.ay9
    public final void a() {
        int i;
        HostActivity hostActivity = this.a;
        Resources.Theme theme = hostActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(com.hwpo_training_app.R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            hostActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = hostActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.k);
        }
    }

    @Override // defpackage.ay9
    public final void b(w15 w15Var) {
        this.f = w15Var;
        View viewFindViewById = this.a.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.i);
        }
        yx9 yx9Var = new yx9(this, viewFindViewById);
        this.i = yx9Var;
        viewTreeObserver.addOnPreDrawListener(yx9Var);
    }

    @Override // defpackage.ay9
    public final void c(final mp2 mp2Var) {
        this.a.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: vx9
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                zx9.d(this.a, mp2Var, splashScreenView);
            }
        });
    }
}
