package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.core.widget.performance_view.PerformanceView;
import com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fb8 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ fb8(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        float f;
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ho5<Object>[] ho5VarArr = db8.D;
                ((db8) hk0Var).p().k.setVisible(zBooleanValue);
                break;
            default:
                rv7 rv7Var = (rv7) obj;
                bf9.a aVar = bf9.Companion;
                final PerformanceExpandableLayout performanceExpandableLayout = ((bf9) hk0Var).p().i;
                rv7Var.getClass();
                boolean z = rv7Var.a;
                fs5 fs5Var = performanceExpandableLayout.O;
                View view = fs5Var.a;
                AppCompatImageButton appCompatImageButton = fs5Var.c;
                ExpandableLayout expandableLayout = fs5Var.g;
                view.getClass();
                view.setVisibility(z ? 0 : 8);
                js7<Boolean, Boolean> js7Var = rv7Var.c;
                boolean zBooleanValue2 = js7Var.t.booleanValue();
                boolean zBooleanValue3 = js7Var.u.booleanValue();
                if (expandableLayout.a() != zBooleanValue2) {
                    if (expandableLayout.a()) {
                        expandableLayout.b(false, zBooleanValue3);
                    } else {
                        expandableLayout.b(true, zBooleanValue3);
                    }
                    if (zBooleanValue3) {
                        float f2 = zBooleanValue2 ? 0.0f : 1.0f;
                        float f3 = zBooleanValue2 ? 1.0f : 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
                        valueAnimatorOfFloat.getClass();
                        valueAnimatorOfFloat.addListener(new lv7(performanceExpandableLayout, f3));
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jv7
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i2 = PerformanceExpandableLayout.P;
                                valueAnimator.getClass();
                                AppCompatImageView appCompatImageView = performanceExpandableLayout.O.e;
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                appCompatImageView.setRotation(((Float) animatedValue).floatValue() * (-180.0f));
                            }
                        });
                        valueAnimatorOfFloat.start();
                        float f4 = zBooleanValue2 ? 0.0f : 1.0f;
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f4, Math.abs(f4 - 1.0f));
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kv7
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i2 = PerformanceExpandableLayout.P;
                                valueAnimator.getClass();
                                MaterialButton materialButton = performanceExpandableLayout.O.b;
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                materialButton.setAlpha(((Float) animatedValue).floatValue());
                            }
                        });
                        valueAnimatorOfFloat2.start();
                    }
                }
                appCompatImageButton.setEnabled(rv7Var.d);
                boolean z2 = rv7Var.j;
                MaterialButton materialButton = fs5Var.b;
                appCompatImageButton.setSelected(z2);
                AppCompatImageView appCompatImageView = fs5Var.e;
                if (expandableLayout.a()) {
                    f = 180.0f;
                } else {
                    f = z2 ? 0.0f : -90.0f;
                }
                appCompatImageView.setRotation(f);
                materialButton.setVisibility(!expandableLayout.a() ? 4 : 0);
                materialButton.setAlpha(!expandableLayout.a() ? 0.0f : 1.0f);
                PerformanceView performanceView = fs5Var.d;
                gs5 gs5Var = performanceView.y;
                gs5Var.h.setVisibility(rv7Var.e ? 0 : 8);
                gs5Var.f.setVisibility(rv7Var.f ? 0 : 8);
                gs5Var.e.setVisibility(rv7Var.g ? 0 : 8);
                gs5Var.c.setVisibility(rv7Var.h ? 0 : 8);
                gs5Var.b.setVisibility(rv7Var.i ? 0 : 8);
                String str = rv7Var.l;
                str.getClass();
                gs5Var.e.setText(str);
                performanceView.e(rv7Var.k);
                zc8 zc8Var = rv7Var.o;
                if (zc8Var.B) {
                    performanceView.f(zc8Var);
                }
                performanceView.d(rv7Var.m);
                performanceView.c(rv7Var.n);
                break;
        }
        return g2b.a;
    }
}
