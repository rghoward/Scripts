package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk0 extends f {
    public boolean t;
    public final Stack<mh4<g2b>> u;

    public hk0(int i) {
        super(i);
        this.u = new Stack<>();
    }

    public static void l(hk0 hk0Var, e eVar) {
        String simpleName = eVar.getClass().getSimpleName();
        hk0Var.getClass();
        eVar.getClass();
        f fVarE = hk0Var.getChildFragmentManager().E(simpleName);
        e eVar2 = fVarE instanceof e ? (e) fVarE : null;
        if (eVar2 != null) {
            eVar2.j();
        }
        eVar.o(hk0Var.getChildFragmentManager(), simpleName);
    }

    public final void k(final mh4<g2b> mh4Var) {
        if (!this.t) {
            mh4Var.invoke();
        } else {
            this.u.add(new mh4() { // from class: gk0
                @Override // defpackage.mh4
                public final Object invoke() {
                    mh4Var.invoke();
                    return g2b.a;
                }
            });
        }
    }

    public final void m(String str) {
        str.getClass();
        rh7 activity = getActivity();
        zn9 zn9Var = activity instanceof zn9 ? (zn9) activity : null;
        if (zn9Var != null) {
            zn9Var.c(null, str);
        }
    }

    public final void n(String str) {
        str.getClass();
        rh7 activity = getActivity();
        zn9 zn9Var = activity instanceof zn9 ? (zn9) activity : null;
        if (zn9Var != null) {
            zn9Var.b(str);
        }
    }

    @Override // androidx.fragment.app.f
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 == 0) {
            return null;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), i2);
        animationLoadAnimation.setAnimationListener(new a(z));
        return animationLoadAnimation;
    }

    @Override // androidx.fragment.app.f
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        i();
    }

    public void i() {
    }

    public void j() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Animation.AnimationListener {
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            hk0 hk0Var = hk0.this;
            Stack<mh4<g2b>> stack = hk0Var.u;
            hk0Var.t = false;
            if (!this.b || stack.isEmpty()) {
                return;
            }
            while (!stack.isEmpty()) {
                stack.pop().invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            hk0.this.t = true;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
