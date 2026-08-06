package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z25 {
    public static final a Companion = new a();
    public final int a;
    public final int b;
    public ViewGroup c;
    public float d;
    public float e;
    public ViewGroup f;
    public TextView g;
    public b35 h;
    public c35 i;
    public ObjectAnimator j;
    public ObjectAnimator k;
    public boolean l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public z25(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final ViewGroup a() {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            return viewGroup;
        }
        xj5.e("messageLayout");
        throw null;
    }

    public final TextView b() {
        TextView textView = this.g;
        if (textView != null) {
            return textView;
        }
        xj5.e("messageTextView");
        throw null;
    }

    public final void c(String str, ViewGroup viewGroup) {
        str.getClass();
        if (!this.l && (this.f == null || a().getParent() == null)) {
            this.c = viewGroup;
            this.f = (ViewGroup) xgb.e(viewGroup, R.layout.layout_message);
            View viewFindViewById = a().findViewById(R.id.messageTextView);
            viewFindViewById.getClass();
            this.g = (TextView) viewFindViewById;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof Toolbar) {
                    if (!childAt.isLaidOut() || childAt.isLayoutRequested()) {
                        childAt.addOnLayoutChangeListener(new f35(this));
                    } else {
                        b().setMinHeight(childAt.getHeight());
                    }
                }
            }
            Drawable drawable = b().getContext().getDrawable(R.drawable.bg_message_layout);
            if (drawable != null) {
                drawable.setTint(this.a);
                b().setBackground(drawable);
            }
            b().setTextColor(this.b);
            this.e = viewGroup.getResources().getDimension(R.dimen.default_margin);
            if (viewGroup.isAttachedToWindow()) {
                viewGroup.addOnAttachStateChangeListener(new a35(viewGroup, this, viewGroup));
            } else {
                this.l = false;
                viewGroup.removeView(a());
                this.c = null;
            }
            ee5.b(a(), new ei4() { // from class: y25
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    umb umbVar = (umb) obj2;
                    ((View) obj).getClass();
                    umbVar.getClass();
                    ((ec5) obj3).getClass();
                    this.t.d = umbVar.a.i(1).b;
                    return g2b.a;
                }
            });
            this.h = new b35(this);
            this.i = new c35(this);
            qt3 qt3Var = new qt3();
            ViewGroup viewGroupA = a();
            Property property = View.Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupA, (Property<ViewGroup, Float>) property, 0.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(qt3Var);
            b35 b35Var = this.h;
            if (b35Var == null) {
                xj5.e("startAnimationListener");
                throw null;
            }
            objectAnimatorOfFloat.addListener(b35Var);
            this.j = objectAnimatorOfFloat;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(a(), (Property<ViewGroup, Float>) property, 0.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat2.setInterpolator(qt3Var);
            c35 c35Var = this.i;
            if (c35Var == null) {
                xj5.e("endAnimationListener");
                throw null;
            }
            objectAnimatorOfFloat2.addListener(c35Var);
            this.k = objectAnimatorOfFloat2;
        }
        if (this.c == null || this.l || a().getParent() != null) {
            return;
        }
        b().setText(str);
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.addView(a());
        }
        ViewGroup viewGroupA2 = a();
        if (!viewGroupA2.isLaidOut() || viewGroupA2.isLayoutRequested()) {
            viewGroupA2.addOnLayoutChangeListener(new d35(this));
            return;
        }
        float f = -viewGroupA2.getHeight();
        float f2 = this.d + this.e;
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator == null) {
            xj5.e("startAnimator");
            throw null;
        }
        objectAnimator.setFloatValues(f, f2);
        ObjectAnimator objectAnimator2 = this.k;
        if (objectAnimator2 == null) {
            xj5.e("endAnimator");
            throw null;
        }
        objectAnimator2.setFloatValues(f2, f);
        ObjectAnimator objectAnimator3 = this.j;
        if (objectAnimator3 == null) {
            xj5.e("startAnimator");
            throw null;
        }
        objectAnimator3.start();
        xgb.b(viewGroupA2, new e35(this));
        this.l = true;
    }
}
