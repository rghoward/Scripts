package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 extends fg3 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ie1 j;
    public final je1 k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v0, types: [ie1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [je1] */
    public pe1(a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: ie1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pe1 pe1Var = this.t;
                EditText editText = pe1Var.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    pe1Var.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                pe1Var.p();
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: je1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                pe1 pe1Var = this.a;
                pe1Var.s(pe1Var.t());
            }
        };
        this.e = az6.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = az6.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = az6.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, aw.a);
        this.h = az6.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.d);
    }

    @Override // defpackage.fg3
    public final void a() {
        if (this.b.I != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.fg3
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.fg3
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.fg3
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.fg3
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.fg3
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.fg3
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.fg3
    public final void o(boolean z) {
        if (this.b.I == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.fg3
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: me1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = this.a.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ke1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new ne1(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ke1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new oe1(this));
    }

    @Override // defpackage.fg3
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: le1
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.s(true);
                }
            });
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.b.I != null));
    }
}
