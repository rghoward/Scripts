package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dy9 {
    public final b a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final HostActivity a;
        public final o7a b = new o7a(new cy9(0, this));

        public b(HostActivity hostActivity) {
            this.a = hostActivity;
        }

        public void a() {
            View rootView = ((ViewGroup) this.a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView((ViewGroup) this.b.getValue());
            }
        }

        public ViewGroup b() {
            return (ViewGroup) this.b.getValue();
        }

        public void c() {
            ViewParent parent = b().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(b());
            }
        }
    }

    public dy9(HostActivity hostActivity) {
        b aVar = Build.VERSION.SDK_INT >= 31 ? new a(hostActivity) : new b(hostActivity);
        aVar.a();
        this.a = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends b {
        public SplashScreenView c;

        @Override // dy9.b
        public final ViewGroup b() {
            SplashScreenView splashScreenView = this.c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            xj5.e("platformView");
            throw null;
        }

        @Override // dy9.b
        public final void c() {
            SplashScreenView splashScreenView = this.c;
            if (splashScreenView == null) {
                xj5.e("platformView");
                throw null;
            }
            splashScreenView.remove();
            if (Build.VERSION.SDK_INT < 33) {
                HostActivity hostActivity = this.a;
                Resources.Theme theme = hostActivity.getTheme();
                theme.getClass();
                View decorView = hostActivity.getWindow().getDecorView();
                decorView.getClass();
                wka.a(theme, decorView, new TypedValue());
            }
        }

        @Override // dy9.b
        public final void a() {
        }
    }
}
