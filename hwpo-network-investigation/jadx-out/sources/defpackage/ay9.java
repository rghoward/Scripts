package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.host.presentation.HostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ay9 {
    public final HostActivity a;
    public Integer b;
    public Integer c;
    public Drawable d;
    public boolean e;
    public by9 f = new rx9();
    public mp2 g;
    public dy9 h;

    public ay9(HostActivity hostActivity) {
        this.a = hostActivity;
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        HostActivity hostActivity = this.a;
        Resources.Theme theme = hostActivity.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.b = Integer.valueOf(typedValue.resourceId);
            this.c = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.d = e00.b(hostActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.e = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        hostActivity.setTheme(i);
    }

    public void b(w15 w15Var) {
        this.f = w15Var;
        View viewFindViewById = this.a.findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new tx9(this, viewFindViewById));
    }

    public void c(mp2 mp2Var) {
        float dimension;
        this.g = mp2Var;
        HostActivity hostActivity = this.a;
        dy9 dy9Var = new dy9(hostActivity);
        Integer num = this.b;
        Integer num2 = this.c;
        ViewGroup viewGroupB = dy9Var.a.b();
        if (num != null && num.intValue() != 0) {
            viewGroupB.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            viewGroupB.setBackgroundColor(num2.intValue());
        } else {
            viewGroupB.setBackground(hostActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            ImageView imageView = (ImageView) viewGroupB.findViewById(R.id.splashscreen_icon_view);
            if (this.e) {
                Drawable drawableB = e00.b(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawableB != null) {
                    imageView.setBackground(new ui6(drawableB, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new ui6(drawable, dimension));
        }
        viewGroupB.addOnLayoutChangeListener(new ux9(this, dy9Var));
    }
}
